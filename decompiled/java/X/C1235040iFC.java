package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.verification.MtCertStatusEnum;
import com.ss.android.ugc.aweme.setting.verification.MtCertingActionEnum;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;

/* JADX INFO: renamed from: X.0iFC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235040iFC {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C11NJ LIZ = new C11NJ();

    public final void LIZIZ(User user, C1235030iFB c1235030iFB) {
        boolean z = false;
        try {
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C0CLW.LIZIZ.LIZ.getMtcertSettings().getEnableChangeHandleNotice().booleanValue()) {
            if (C1215600hjq.LIZ()) {
            }
            LIZ(z, user, c1235030iFB);
        }
        z = true;
        LIZ(z, user, c1235030iFB);
    }

    public final void LIZ(boolean z, User user, final C1235030iFB c1235030iFB) {
        if (z) {
            InterfaceC1235060iFE.LIZ.getClass();
            ((InterfaceC1235060iFE) C1235070iFF.LIZIZ.createNewRetrofit(C312910COj.LIZ).create(InterfaceC1235060iFE.class)).LIZ(user.getSecUid()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<VerificationResponse>() { // from class: X.0iFD
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                    c1235030iFB.LIZ();
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZ("VerificationPresenter", C13SZ.LIZIZ(th));
                    c1235030iFB.LIZIZ();
                    c1235030iFB.LIZ();
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(VerificationResponse verificationResponse) {
                    c1235030iFB.LIZJ(verificationResponse);
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    this.LIZ.LIZ(interfaceC420801kM);
                }
            });
            return;
        }
        VerificationResponse verificationResponse = new VerificationResponse();
        verificationResponse.setMtCertStatusEnum(MtCertStatusEnum.CS_EMPTY);
        verificationResponse.setMtCertingActionEnum(MtCertingActionEnum.CA_EMPTY);
        c1235030iFB.LIZJ(verificationResponse);
        c1235030iFB.LIZ();
    }
}
