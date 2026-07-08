package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletVipAgreement2025Q3Experiment;

/* JADX INFO: renamed from: X.0JkS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500780JkS implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 102;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        if (LiveWalletVipAgreement2025Q3Experiment.INSTANCE.getValue().isEnable) {
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c759360TqY));
            if (!((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).showVipAgreementIfNeeded(c500840JkY.LIZ, EnumC500800JkU.LIVE_BROADCAST, new DialogInterfaceOnDismissListenerC512701zB(c23260099m, 8))) {
                C189200o6.m2constructorimpl(false);
                c23260099m.resumeWith(false);
            }
            Object objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(c759360TqY);
            }
            return objLIZ;
        }
        return false;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
