package X;

import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$handleDeletePostTrigger$2", f = "SearchCSIProfileBannerRepoV3.kt", l = {1509}, m = "invokeSuspend")
public final class C2158408cw extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SearchCSIProfileBannerRepoV3 LLILLL;
    public final /* synthetic */ EnumC2193241Asc LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2158408cw(SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3, EnumC2193241Asc enumC2193241Asc, InterfaceC1364105Vn<? super C2158408cw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = searchCSIProfileBannerRepoV3;
        this.LLILZ = enumC2193241Asc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2158408cw c2158408cw = new C2158408cw(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2158408cw.LLILLJJLI = obj;
        return c2158408cw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.handleDeletePostTrigger$2");
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
            String str = (String) this.LLILLJJLI;
            SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3 = this.LLILLL;
            EnumC2193241Asc enumC2193241Asc = this.LLILZ;
            this.LL = 1;
            if (searchCSIProfileBannerRepoV3.LJJII(enumC2193241Asc, str, this) == objLJFF) {
                C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.handleDeletePostTrigger$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.handleDeletePostTrigger$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
