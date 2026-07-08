package X;

import com.ss.android.ugc.ur.socialavatar.SocialAvatarManagementAPI;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarResultResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel$onRefresh$2$response$1", f = "SocialAvatarEditViewModel.kt", l = {100}, m = "invokeSuspend")
public final class C437210HCl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SocialAvatarResultResponse>, Object> {
    public int LL;

    public C437210HCl(InterfaceC1364105Vn<? super C437210HCl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437210HCl(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarEditViewModel@c2d3.onRefresh$2$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            SocialAvatarManagementAPI.LIZ.getClass();
            SocialAvatarManagementAPI socialAvatarManagementAPILIZ = C0HDF.LIZ();
            this.LL = 1;
            obj = socialAvatarManagementAPILIZ.querySocialAvatarResponse(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.onRefresh$2$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.onRefresh$2$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SocialAvatarResultResponse> interfaceC1364105Vn) {
        return new C437210HCl(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
