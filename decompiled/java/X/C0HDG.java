package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarManagementAPI;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQuotaResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment$triggerRegenerate$1", f = "SocialAvatarReviewFragment.kt", l = {759, 760, 805}, m = "invokeSuspend")
public final class C0HDG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ SocialAvatarReviewFragment LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDG(boolean z, SocialAvatarReviewFragment socialAvatarReviewFragment, Context context, InterfaceC1364105Vn<? super C0HDG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = socialAvatarReviewFragment;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objSocialAvatarQuota = obj;
        C1C7U.LIZ("SocialAvatarReviewFragment@1d80.triggerRegenerate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Enter generation flow error ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            if (!(e instanceof C1494450ozb)) {
                e = null;
            }
            if (e != null) {
                SocialAvatarReviewFragment socialAvatarReviewFragment = this.LLILLL;
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C0HDH c0hdh = new C0HDH(socialAvatarReviewFragment, null);
                this.LL = 3;
                if (C23250099c.LJI(this, abstractC2238408pq, c0hdh) == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.triggerRegenerate$1");
                    return objLJFF;
                }
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C155000ia.LIZIZ(objSocialAvatarQuota);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.triggerRegenerate$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objSocialAvatarQuota);
        } else {
            C155000ia.LIZIZ(objSocialAvatarQuota);
            SocialAvatarManagementAPI.LIZ.getClass();
            SocialAvatarManagementAPI socialAvatarManagementAPILIZ = C0HDF.LIZ();
            this.LL = 1;
            objSocialAvatarQuota = socialAvatarManagementAPILIZ.socialAvatarQuota(this);
            if (objSocialAvatarQuota == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.triggerRegenerate$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C0HDJ c0hdj = new C0HDJ((SocialAvatarQuotaResponse) objSocialAvatarQuota, this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c0hdj) == objLJFF) {
            C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.triggerRegenerate$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.triggerRegenerate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
