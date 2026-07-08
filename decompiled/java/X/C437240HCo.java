package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarDeleteResponse;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarManagementAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel$deleteSocialAvatar$2", f = "SocialAvatarEditViewModel.kt", l = {340}, m = "invokeSuspend")
public final class C437240HCo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SocialAvatarDeleteResponse>, Object> {
    public int LL;

    public C437240HCo(InterfaceC1364105Vn<? super C437240HCo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437240HCo(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarEditViewModel@c2d3.deleteSocialAvatar$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                SocialAvatarManagementAPI.LIZ.getClass();
                SocialAvatarManagementAPI socialAvatarManagementAPILIZ = C0HDF.LIZ();
                this.LL = 1;
                obj = socialAvatarManagementAPILIZ.deleteSocialAvatar(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.deleteSocialAvatar$2");
                    return objLJFF;
                }
            }
            SocialAvatarDeleteResponse socialAvatarDeleteResponse = (SocialAvatarDeleteResponse) obj;
            Integer num = socialAvatarDeleteResponse.statusCode;
            if (num != null && num.intValue() == 0) {
                C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.deleteSocialAvatar$2");
                return socialAvatarDeleteResponse;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete social avatar API return status code: ");
            sbLIZ.append(socialAvatarDeleteResponse.statusCode);
            throw new C437250HCp(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C437250HCp(e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SocialAvatarDeleteResponse> interfaceC1364105Vn) {
        return new C437240HCo(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
