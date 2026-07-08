package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514320pVe extends AbstractC1514280pVa {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        IMallLandingPerfTracker iMallLandingPerfTracker;
        InterfaceC1514310pVd interfaceC1514310pVd = (InterfaceC1514310pVd) xBaseParamModel;
        String step = interfaceC1514310pVd.getStep();
        String enterFrom = interfaceC1514310pVd.getEnterFrom();
        Number time = interfaceC1514310pVd.getTime();
        String schema = interfaceC1514310pVd.getSchema();
        boolean z2 = true;
        if (step.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String containerID = null;
        if (!z) {
            for (Object obj : EnumC1704040uRe.getEntries().toArray(new EnumC1704040uRe[0])) {
                if (Intrinsics.LJFF(((EnumC1704040uRe) obj).getValue(), step)) {
                    if (Intrinsics.LJFF(step, EnumC1704040uRe.USER_CLICK_ENTRY.getValue())) {
                        IMallLandingPerfTracker iMallLandingPerfTracker2 = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
                        if (iMallLandingPerfTracker2 != null) {
                            iMallLandingPerfTracker2.onClickMallEntry(enterFrom, Long.valueOf(time.longValue()));
                        }
                    } else if (Intrinsics.LJFF(step, EnumC1704040uRe.JUMP_TO_MALL.getValue()) && (iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null)) != null) {
                        Long lValueOf = Long.valueOf(time.longValue());
                        if (schema == null || !u.LJJIIJZLJL(schema, "aweme://ec/mall", false)) {
                            z2 = false;
                        }
                        iMallLandingPerfTracker.onStartJumpToMall(schema, lValueOf, z2);
                    }
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        containerID = interfaceC634840OvC.getContainerID();
                    }
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1514290pVb.class, containerID), "");
                    return;
                }
            }
        }
        completionBlock.onFailure(1, "invalid step", null);
    }
}
