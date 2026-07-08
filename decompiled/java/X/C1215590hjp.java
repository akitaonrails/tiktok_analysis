package X;

import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileNamesViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0hjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215590hjp extends C1235030iFB {
    public final /* synthetic */ EditProfileNamesViewModel LIZ;

    @Override // X.C1235030iFB
    public final void LIZIZ() {
    }

    public C1215590hjp(EditProfileNamesViewModel editProfileNamesViewModel) {
        this.LIZ = editProfileNamesViewModel;
    }

    @Override // X.C1235030iFB
    public final void LIZJ(VerificationResponse verificationResponse) {
        if (verificationResponse.isEmpty()) {
            EditProfileNamesViewModel editProfileNamesViewModel = this.LIZ;
            editProfileNamesViewModel.getClass();
            editProfileNamesViewModel.setState(AFwS257S0000000_19.get$arr$(721));
            return;
        }
        if (!verificationResponse.isCerting() && !verificationResponse.isCertedAgain()) {
            if (!verificationResponse.isCerted()) {
                if (!verificationResponse.isUpdating()) {
                    return;
                }
                C1233040iBy c1233040iBy = new C1233040iBy(GlobalContext.getApplicationContext());
                c1233040iBy.LIZJ(C1216270hkv.LIZJ(2131846437));
                c1233040iBy.LIZLLL();
                return;
            }
            try {
                if (C0CLW.LIZIZ.LIZ.getMtcertSettings().getEnableChangeHandleNotice().booleanValue()) {
                    String strLIZJ = C1216270hkv.LIZJ(2131846432);
                    String strLIZJ2 = C1216270hkv.LIZJ(2131846431);
                    if (strLIZJ != null && strLIZJ2 != null) {
                        C21566919al c21566919al = new C21566919al(GlobalContext.getApplicationContext());
                        c21566919al.LIZJ = strLIZJ2;
                        c21566919al.LIZIZ = strLIZJ;
                        c21566919al.LJIIJ(2131846435, new DialogInterfaceOnClickListenerC1265940j32(this.LIZ, 5), false);
                        c21566919al.LJII(R.string.f1_, null, false);
                        new C21566519ah(c21566919al).LIZLLL();
                        return;
                    }
                }
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
            }
            EditProfileNamesViewModel editProfileNamesViewModel2 = this.LIZ;
            editProfileNamesViewModel2.getClass();
            editProfileNamesViewModel2.setState(AFwS257S0000000_19.get$arr$(721));
            return;
        }
        C1233040iBy c1233040iBy2 = new C1233040iBy(GlobalContext.getApplicationContext());
        c1233040iBy2.LIZJ(C1216270hkv.LIZJ(2131846436));
        c1233040iBy2.LIZLLL();
    }
}
