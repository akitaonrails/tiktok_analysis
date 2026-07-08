package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarManagementAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarTaskHandler$postAvatarStatusUpdate$1", f = "SocialAvatarTaskHandler.kt", l = {233}, m = "invokeSuspend")
public final class C0HDT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDT(int i, InterfaceC1364105Vn<? super C0HDT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarTaskHandler@9d1f.postAvatarStatusUpdate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1910890zpH c1910890zpHLIZ = C0HDU.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Update avatar status error ");
            sbLIZ.append(e.getMessage());
            c1910890zpHLIZ.LIZ("SocialAvatarTaskHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C437480HDm c437480HDm = C437480HDm.LIZ;
            C01GW c01gw = C0HDU.LIZIZ;
            String str = (String) c01gw.getValue();
            c437480HDm.getClass();
            if (!C437480HDm.LIZ(str)) {
                ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) C0HDU.LIZLLL.getValue();
                if (iSocialAvatarCreationStatusService != null) {
                    iSocialAvatarCreationStatusService.LIZJ((String) c01gw.getValue(), new C438920HJa(this.LLILLJJLI, null, null, false, null, null, null, null, 254));
                }
                SocialAvatarManagementAPI.LIZ.getClass();
                SocialAvatarManagementAPI socialAvatarManagementAPILIZ = C0HDF.LIZ();
                int i2 = this.LLILLJJLI;
                this.LL = 1;
                if (socialAvatarManagementAPILIZ.socialAvatarStatusUpdate(i2, this) == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarTaskHandler@9d1f.postAvatarStatusUpdate$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialAvatarTaskHandler@9d1f.postAvatarStatusUpdate$1");
            return unit;
        }
        C1910890zpH c1910890zpHLIZ2 = C0HDU.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Update avatar status successfully: ");
        sbLIZ2.append(this.LLILLJJLI);
        c1910890zpHLIZ2.LIZ("SocialAvatarTaskHandler", C2188811AlT.LIZIZ(sbLIZ2));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarTaskHandler@9d1f.postAvatarStatusUpdate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
