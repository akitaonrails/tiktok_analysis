package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarMainActivity;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarTaskStatusResponse;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HEG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarMainActivity$checkEntrance$1", f = "SocialAvatarMainActivity.kt", l = {69, 81}, m = "invokeSuspend")
public final class C0HEG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarMainActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HEG(SocialAvatarMainActivity socialAvatarMainActivity, InterfaceC1364105Vn<? super C0HEG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarMainActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HEG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer numLJ;
        boolean z;
        AnonymousClass0951 anonymousClass0951LIZ;
        C437560HDu c437560HDu;
        Object objLJ = obj;
        C1C7U.LIZ("SocialAvatarMainActivity@e4a3.checkEntrance$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SocialAvatarMainActivity@e4a3.checkEntrance$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJ);
        } else {
            C155000ia.LIZIZ(objLJ);
            C0HMR.LIZ.getClass();
            C0HEN c0henLIZ = C0HMR.LIZ();
            this.LL = 1;
            objLJ = c0henLIZ.LJ(null, this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarMainActivity@e4a3.checkEntrance$1");
                return objLJFF;
            }
        }
        SocialAvatarTaskStatusResponse socialAvatarTaskStatusResponse = (SocialAvatarTaskStatusResponse) objLJ;
        if (socialAvatarTaskStatusResponse != null) {
            numLJ = C2286608xc.LJ(socialAvatarTaskStatusResponse.status);
        } else {
            numLJ = null;
        }
        if (numLJ == null || (numLJ.intValue() != 4 && numLJ.intValue() != 3 && numLJ.intValue() != 8 && numLJ.intValue() != -1)) {
            z = true;
        } else {
            z = false;
        }
        ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarCreationStatusService.class, false, false, false, 14, null);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (numLJ != null && ((numLJ.intValue() == 4 || numLJ.intValue() == 8) && iSocialAvatarCreationStatusService != null && ((anonymousClass0951LIZ = iSocialAvatarCreationStatusService.LIZ(curUserId)) == null || (c437560HDu = (C437560HDu) anonymousClass0951LIZ.getValue()) == null || !c437560HDu.LJ))) {
            iSocialAvatarCreationStatusService.LIZJ(curUserId, new C438920HJa(numLJ.intValue(), null, null, false, null, null, null, null, 254));
        }
        SocialAvatarMainActivity socialAvatarMainActivity = this.LLILLJJLI;
        this.LL = 2;
        socialAvatarMainActivity.getClass();
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C0HFB(socialAvatarMainActivity, z, numLJ, null));
        if (objLJI != C099R.LJFF()) {
            objLJI = Unit.LIZ;
        }
        if (objLJI == objLJFF) {
            C1C7U.LIZIZ("SocialAvatarMainActivity@e4a3.checkEntrance$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarMainActivity@e4a3.checkEntrance$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
