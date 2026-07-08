package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarManagementAPI;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQuotaResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment$setUpCellsInSocialAvatar$2$1$1$1$1", f = "SocialAvatarBottomSheetActionFragment.kt", l = {243, 244, 265}, m = "invokeSuspend")
public final class C0HDC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ SocialAvatarBottomSheetActionFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDC(View view, SocialAvatarBottomSheetActionFragment socialAvatarBottomSheetActionFragment, InterfaceC1364105Vn<? super C0HDC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = socialAvatarBottomSheetActionFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Exception exc;
        C1C7U.LIZ("SocialAvatarBottomSheetActionFragment@c983.setUpCellsInSocialAvatar$2$1$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Enter generation flow error ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            if (e instanceof C1494450ozb) {
                exc = e;
            } else {
                exc = null;
            }
            if (exc != null) {
                SocialAvatarBottomSheetActionFragment socialAvatarBottomSheetActionFragment = this.LLILLL;
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C0HDD c0hdd = new C0HDD(socialAvatarBottomSheetActionFragment, e, null);
                this.LL = 3;
                if (C23250099c.LJI(this, abstractC2238408pq, c0hdd) == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarBottomSheetActionFragment@c983.setUpCellsInSocialAvatar$2$1$1$1$1");
                    return objLJFF;
                }
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("SocialAvatarBottomSheetActionFragment@c983.setUpCellsInSocialAvatar$2$1$1$1$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SocialAvatarBottomSheetActionFragment@c983.setUpCellsInSocialAvatar$2$1$1$1$1");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SocialAvatarManagementAPI.LIZ.getClass();
            SocialAvatarManagementAPI socialAvatarManagementAPILIZ = C0HDF.LIZ();
            this.LL = 1;
            obj = socialAvatarManagementAPILIZ.socialAvatarQuota(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarBottomSheetActionFragment@c983.setUpCellsInSocialAvatar$2$1$1$1$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C0HDE c0hde = new C0HDE((SocialAvatarQuotaResponse) obj, this.LLILLJJLI, this.LLILLL, null);
        this.LL = 2;
        obj = C23250099c.LJI(this, abstractC2238408pq2, c0hde);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("SocialAvatarBottomSheetActionFragment@c983.setUpCellsInSocialAvatar$2$1$1$1$1");
            return objLJFF;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarBottomSheetActionFragment@c983.setUpCellsInSocialAvatar$2$1$1$1$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
