package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1EA2, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EA2 extends AbstractC2276841E9y {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Long lValueOf;
        C1EA5 c1ea5Zr2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Zr2();
        Number number = null;
        C1EA1 c1ea1 = (C1EA1) C1909107dp.LIZJ(C1EA1.class, null);
        if (c1ea5Zr2 != null) {
            numValueOf = Integer.valueOf(Intrinsics.LJFF(Boolean.valueOf(c1ea5Zr2.LIZ), Boolean.TRUE) ? 1 : 0);
        } else {
            numValueOf = null;
        }
        c1ea1.setAutoMatchWaitingToConnect(numValueOf);
        if (c1ea5Zr2 != null) {
            numValueOf2 = Integer.valueOf(Intrinsics.LJFF(Boolean.valueOf(c1ea5Zr2.LIZIZ), Boolean.TRUE) ? 1 : 0);
        } else {
            numValueOf2 = null;
        }
        c1ea1.setAutoMatch(numValueOf2);
        if (c1ea5Zr2 != null) {
            numValueOf3 = Integer.valueOf(Intrinsics.LJFF(Boolean.valueOf(c1ea5Zr2.LIZJ), Boolean.TRUE) ? 1 : 0);
        } else {
            numValueOf3 = null;
        }
        c1ea1.setAutoMatchRequesting(numValueOf3);
        if (c1ea5Zr2 != null) {
            lValueOf = Long.valueOf(c1ea5Zr2.LIZLLL);
        } else {
            lValueOf = null;
        }
        c1ea1.setCountdown(lValueOf);
        if (c1ea5Zr2 != null) {
            number = c1ea5Zr2.LJ;
        }
        c1ea1.setAutoMatchEntrance(number);
        completionBlock.onSuccess(c1ea1, "");
    }
}
