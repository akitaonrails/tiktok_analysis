package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.tiktok.kmp.nuj.IKMPNewUserJourneyService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10RP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10RP {
    public static final C10RP LIZ = new C10RP();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C19247210Rq());
    public static boolean LIZJ;
    public static Integer LIZLLL;

    public static final String LIZLLL() {
        String strLIZIZ = C19254610Um.LIZIZ.LJJIL().LIZIZ();
        return C123100dR.LIZ(strLIZIZ) ? strLIZIZ : LJFF("") ? LJ().getString("birthday", "") : "";
    }

    public static Keva LJ() {
        return (Keva) LIZIZ.getValue();
    }

    public final boolean LIZIZ() {
        if (((Boolean) C0ABN.LIZ.getValue()).booleanValue()) {
            return LIZ("1p_sign_up");
        }
        return false;
    }

    public static final boolean LIZ(String str) {
        String strLIZIZ;
        INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
        if (iNewUserJourneyAppDiffService != null) {
            iNewUserJourneyAppDiffService.LIZJ();
        }
        if (Intrinsics.LJFF(str, "1p_sign_up") || Intrinsics.LJFF(str, "3p_sign_up")) {
            C19254610Um c19254610Um = C19254610Um.LIZIZ;
            if (c19254610Um.LJJIL().LJIIIIZZ() && (strLIZIZ = c19254610Um.LJJIL().LIZIZ()) != null && strLIZIZ.length() != 0) {
                return true;
            }
        }
        String string = LJ().getString("birthday", "");
        if (string == null || string.length() == 0) {
            return false;
        }
        if (Intrinsics.LJFF(str, "PNUJ") || Intrinsics.LJFF(str, "login_and_consent")) {
            int i = LJ().getInt("age_gate_mode", 0);
            IGuestModeService iGuestModeService = (IGuestModeService) PluggableExtentionKt.pluggableSpi$default(IGuestModeService.class, false, false, false, 14, null);
            if (iGuestModeService != null) {
                iGuestModeService.LJIIJ(Integer.valueOf(i));
            }
        }
        return true;
    }

    public static boolean LJFF(String str) {
        if (LIZLLL == null || Intrinsics.LJFF(str, "hybrid_response")) {
            LIZLLL = Integer.valueOf(C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "prevent_duplicate_age_gate_switch", false));
        }
        Integer num = LIZLLL;
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    public static final void LJI(String str) {
        AccountUserService accountUserServiceLJIIJ;
        if (LIZJ) {
            return;
        }
        if (!LJFF(str)) {
            if (Intrinsics.LJFF(str, "hybrid_response")) {
                LJ().storeString("birthday", "");
            }
        } else {
            LIZJ = true;
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
                accountUserServiceLJIIJ.LJJIFFI(new InterfaceC427710Gpt() { // from class: X.10RZ
                    @Override // X.InterfaceC427710Gpt
                    public final void LLLLLLZZ(int i, User user, User user2) {
                        INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
                        if (iNewUserJourneyAppDiffService != null) {
                            iNewUserJourneyAppDiffService.LJ();
                        }
                        C10RP.LIZ.getClass();
                        C10RP.LJ().clear();
                    }
                });
            }
        }
    }

    public static final void LIZJ(int i, String str) {
        if (C282080B3u.LIZ()) {
            IKMPNewUserJourneyService iKMPNewUserJourneyService = (IKMPNewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(IKMPNewUserJourneyService.class, false, false, false, 14, null);
            if (iKMPNewUserJourneyService != null) {
                iKMPNewUserJourneyService.LIZ();
                C19245010Qu.LIZIZ = true;
            }
        } else {
            C19240710Pd.LIZ = true;
        }
        LIZ.getClass();
        if (LJFF("")) {
            LJ().storeString("birthday", str);
            LJ().storeInt("age_gate_mode", i);
        }
    }
}
