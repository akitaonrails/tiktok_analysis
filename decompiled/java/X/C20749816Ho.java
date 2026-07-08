package X;

import Y.ARunnableS131S0100000_31;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragment;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;

/* JADX INFO: renamed from: X.16Ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20749816Ho implements InterfaceC1143790fs1 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1143790fs1
    public final void onFinish(boolean z) {
        switch (this.$t) {
            case 0:
                onFinish$0(this, z);
                break;
            case 1:
                onFinish$1(this, z);
                break;
            case 2:
                onFinish$2(this, z);
                break;
            case 3:
                onFinish$3(this, z);
                break;
            case 4:
                onFinish$4(this, z);
                break;
        }
    }

    public C20749816Ho(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFinish$0(C20749816Ho c20749816Ho, boolean z) {
        ((C1668220tVs) c20749816Ho.l0).setShowStaticImage(false);
    }

    public static final void onFinish$1(C20749816Ho c20749816Ho, boolean z) {
        ((InterfaceC1106470etp) c20749816Ho.l0).onFinish(z);
    }

    public static final void onFinish$2(C20749816Ho c20749816Ho, boolean z) {
        if (z) {
            ((EndIncentiveSettlementFragmentV2) c20749816Ho.l0).ZR();
            ((EndIncentiveSettlementFragmentV2) c20749816Ho.l0).aS(true);
        } else {
            C20441214yg.LJ("EndIncentiveSettlementFragmentV2", "Lottie file load failed: ttlive_finish_encourage_lop_ongoing.zip");
        }
    }

    public static final void onFinish$3(C20749816Ho c20749816Ho, boolean z) {
        if (z) {
            ((EndIncentiveSettlementFragmentV2) c20749816Ho.l0).aS(true);
        } else {
            C20441214yg.LJ("EndIncentiveSettlementFragmentV2", "Lottie file load failed: ttlive_finish_encourage_lop_ongoing.zip");
        }
    }

    public static final void onFinish$4(C20749816Ho c20749816Ho, boolean z) {
        if (z) {
            EndIncentiveSettlementFragment endIncentiveSettlementFragment = (EndIncentiveSettlementFragment) c20749816Ho.l0;
            endIncentiveSettlementFragment.bS(endIncentiveSettlementFragment.UR(), true);
            C786410Ut5.LJLIIL(1100L, ((EndIncentiveSettlementFragment) c20749816Ho.l0).PR(), new ARunnableS131S0100000_31((EndIncentiveSettlementFragment) c20749816Ho.l0, 136));
        }
    }
}
