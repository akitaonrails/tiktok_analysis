package X;

import com.bytedance.android.live.wallet.IWalletService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x3A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804180x3A {
    public static final /* synthetic */ int LIZ = 0;

    public static Long LIZ() {
        return C0U53.Ud.LIZ();
    }

    public static boolean LIZIZ() {
        int iLIZJ = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ();
        C1804190x3B c1804190x3B = EnumC1804200x3C.Companion;
        Integer numValueOf = Integer.valueOf(iLIZJ);
        c1804190x3B.getClass();
        return numValueOf != null && numValueOf.intValue() == EnumC1804200x3C.RECHARGE_V3_VERSION_PHASE_2_2_V2.getVersion();
    }

    public static boolean LIZJ() {
        return LIZIZ() && Intrinsics.LJFF(C0U53.Td.LIZ(), Boolean.TRUE);
    }

    public static void LIZLLL(boolean z) {
        if (!LIZIZ()) {
            return;
        }
        C0U53.Td.LIZJ(Boolean.valueOf(z));
    }
}
