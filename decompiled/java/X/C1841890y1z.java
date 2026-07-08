package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.saf.shell.SafTikTokShellActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.marketing.widget.pip.BonusWidgetPipTutorialFragment;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS201S1100000_27;

/* JADX INFO: renamed from: X.0y1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841890y1z extends AbstractC1841900y20 {
    public static final AtomicReference<Function2<String, Boolean, Unit>> LLILLL = new AtomicReference<>(null);
    public static final AtomicReference<Runnable> LLILZ = new AtomicReference<>(null);
    public static final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Context context;
        InterfaceC1841940y24 interfaceC1841940y24 = (InterfaceC1841940y24) xBaseParamModel;
        String videoUrl = interfaceC1841940y24.getVideoUrl();
        if (videoUrl == null) {
            videoUrl = "";
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            context = interfaceC634840OvC2.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            LIZJ(containerID, completionBlock, "unsupported_api", false);
            return;
        }
        if (videoUrl.length() == 0) {
            LIZJ(containerID, completionBlock, "missing_video_url", false);
            return;
        }
        C1840680y02 c1840680y02 = C1840680y02.LIZ;
        String installTrackInfo = interfaceC1841940y24.getInstallTrackInfo();
        c1840680y02.getClass();
        C1840680y02.LIZLLL(installTrackInfo, "tutorial_install");
        AwS201S1100000_27 awS201S1100000_27 = new AwS201S1100000_27(completionBlock, containerID, 5);
        AtomicReference<Function2<String, Boolean, Unit>> atomicReference = LLILLL;
        while (!atomicReference.compareAndSet(null, awS201S1100000_27)) {
            if (atomicReference.get() != null) {
                LIZJ(containerID, completionBlock, "busy", false);
                return;
            }
        }
        RunnableC1841910y21 runnableC1841910y21 = new Runnable() { // from class: X.0y21
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EcEnterPipModeMethod@39f6.handle$timeout$1");
                try {
                    AtomicReference<Function2<String, Boolean, Unit>> atomicReference2 = C1841890y1z.LLILLL;
                    C1841920y22.LIZ("timeout", false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EcEnterPipModeMethod@39f6.handle$timeout$1");
            }
        };
        LLILZ.set(runnableC1841910y21);
        C786410Ut5.LJLIIL(3000L, LLILZIL, runnableC1841910y21);
        try {
            Intent intent = new Intent(context, (Class<?>) SafTikTokShellActivity.class);
            intent.putExtra("rootFragmentClassName", BonusWidgetPipTutorialFragment.class.getName());
            intent.putExtra("video_url", videoUrl);
            intent.addFlags(268435456);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnupb/VWr7cRjfRy17ogN+n4HD7MnhaPBBKC0disG9DEFaOS", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error:");
            sbLIZ.append(th.getClass().getSimpleName());
            sbLIZ.append(':');
            String message = th.getMessage();
            if (message == null) {
                message = "unknown";
            }
            sbLIZ.append(message);
            C1841920y22.LIZ(C2188811AlT.LIZIZ(sbLIZ), false);
        }
    }

    public static final void LIZJ(String str, CompletionBlock<InterfaceC1841930y23> completionBlock, String str2, boolean z) {
        InterfaceC1841930y23 interfaceC1841930y23 = (InterfaceC1841930y23) C1909107dp.LIZJ(InterfaceC1841930y23.class, str);
        interfaceC1841930y23.setStatus(str2);
        interfaceC1841930y23.setSupported(Boolean.valueOf(z));
        completionBlock.onSuccess(interfaceC1841930y23, "");
    }
}
