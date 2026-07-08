package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarManagementAPI;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQuotaResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel$fetchSocialAvatarQuota$1", f = "SocialAvatarEditViewModel.kt", l = {359}, m = "invokeSuspend")
public final class C437260HCq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SocialAvatarEditViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437260HCq(SocialAvatarEditViewModel socialAvatarEditViewModel, InterfaceC1364105Vn<? super C437260HCq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = socialAvatarEditViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C437260HCq c437260HCq = new C437260HCq(this.LLILLL, interfaceC1364105Vn);
        c437260HCq.LLILLJJLI = obj;
        return c437260HCq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SocialAvatarEditViewModel@c2d3.fetchSocialAvatarQuota$1");
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
                obj = socialAvatarManagementAPILIZ.socialAvatarQuota(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.fetchSocialAvatarQuota$1");
                    return objLJFF;
                }
            }
            c098200Yq = (SocialAvatarQuotaResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        SocialAvatarEditViewModel socialAvatarEditViewModel = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            socialAvatarEditViewModel.setState(new AwS585S0100000_6((SocialAvatarQuotaResponse) c098200Yq, 7));
        }
        SocialAvatarEditViewModel socialAvatarEditViewModel2 = this.LLILLL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            socialAvatarEditViewModel2.setState(AFwS236S0000000_6.get$arr$(0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.fetchSocialAvatarQuota$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
