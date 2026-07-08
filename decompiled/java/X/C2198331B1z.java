package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.user.creator.product.hybrid.activity.AuthTransitActivity;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.1B1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198331B1z extends AbstractC2198301B1w {
    public CompletionBlock<InterfaceC2198321B1y> LLILLL;

    public C2198331B1z() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void handleAuthEvent(C1B21 c1b21) {
        String containerID;
        String containerID2;
        CompletionBlock<InterfaceC2198321B1y> completionBlock = this.LLILLL;
        if (completionBlock == null) {
            return;
        }
        int i = c1b21.LIZ;
        if (i != -7) {
            if (i != 0) {
                if (i != 1) {
                    C2382909Vj.LIZ(completionBlock, 0, "it should never happen", null, 4);
                    return;
                }
                try {
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        containerID2 = interfaceC634840OvC.getContainerID();
                    } else {
                        containerID2 = null;
                    }
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2198321B1y.class, containerID2);
                    InterfaceC2198321B1y interfaceC2198321B1y = (InterfaceC2198321B1y) xBaseModelLIZJ;
                    interfaceC2198321B1y.setCode(null);
                    interfaceC2198321B1y.setStatus(c1b21.LIZIZ);
                    interfaceC2198321B1y.setAccessToken(c1b21.LJ);
                    interfaceC2198321B1y.setClientId(c1b21.LJII);
                    interfaceC2198321B1y.setRefreshToken(c1b21.LIZLLL);
                    interfaceC2198321B1y.setRefreshTokenType(c1b21.LJFF);
                    interfaceC2198321B1y.setExpried(c1b21.LJI);
                    interfaceC2198321B1y.setErrorMsg(c1b21.LIZJ);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    CompletionBlock<InterfaceC2198321B1y> completionBlock2 = this.LLILLL;
                    if (completionBlock2 == null) {
                        completionBlock2 = null;
                    }
                    C2382909Vj.LIZ(completionBlock2, 0, "error in callback", null, 4);
                    return;
                }
            }
            String str = c1b21.LIZJ;
            if (str == null) {
                str = "handleAuthEvent failed";
            }
            C2382909Vj.LIZ(completionBlock, 0, str, null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC2198321B1y.class, containerID);
        InterfaceC2198321B1y interfaceC2198321B1y2 = (InterfaceC2198321B1y) xBaseModelLIZJ2;
        interfaceC2198321B1y2.setCode(null);
        interfaceC2198321B1y2.setStatus("cancel");
        interfaceC2198321B1y2.setAccessToken(null);
        interfaceC2198321B1y2.setClientId("");
        interfaceC2198321B1y2.setRefreshToken(null);
        interfaceC2198321B1y2.setRefreshTokenType(null);
        interfaceC2198321B1y2.setExpried(null);
        String str2 = c1b21.LIZJ;
        if (str2 == null) {
            str2 = "user cancelled";
        }
        interfaceC2198321B1y2.setErrorMsg(str2);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C1B20 c1b20 = (C1B20) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        this.LLILLL = completionBlock;
        if (activityLIZLLL != null) {
            String platform = c1b20.getPlatform();
            if (Intrinsics.LJFF(platform, "youtube")) {
                if (C0XV0.LIZ(activityLIZLLL)) {
                    Intent intent = new Intent(activityLIZLLL, (Class<?>) AuthTransitActivity.class);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZLLL, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, activityLIZLLL);
                    C2204961BRm.LJIILLIIL(activityLIZLLL, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vozoIjKMg0+ICU7aSPr8FpLpaSBYdP7i6Y9+FaYEOl3KRXR2mvVkJ1NEwR5dWwn5NJ8v9", null));
                    return;
                }
                C2382909Vj.LIZ(completionBlock, 0, "play service not available", null, 4);
                return;
            }
            if (Intrinsics.LJFF(platform, "instagram")) {
                C2382909Vj.LIZ(completionBlock, 0, "Instagram auth is not supported", null, 4);
                return;
            } else {
                C2382909Vj.LIZ(completionBlock, 0, "no matching platform", null, 4);
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, 0, "sdk error", null, 4);
    }
}
