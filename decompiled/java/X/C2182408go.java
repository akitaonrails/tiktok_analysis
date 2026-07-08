package X;

import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$onUserInteraction$1", f = "SearchCSIProfileBannerRepoV3.kt", l = {2043}, m = "invokeSuspend")
public final class C2182408go extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchCSIProfileBannerRepoV3 LLILLJJLI;
    public final /* synthetic */ EnumC2193241Asc LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2182408go(SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3, EnumC2193241Asc enumC2193241Asc, InterfaceC1364105Vn<? super C2182408go> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchCSIProfileBannerRepoV3;
        this.LLILLL = enumC2193241Asc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2182408go(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.onUserInteraction$1");
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
            this.LLILLJJLI.LJIIJ = System.currentTimeMillis();
            if (!this.LLILLJJLI.LJJIII(this.LLILLL)) {
                this.LLILLJJLI.LJFF.setValue(new C2182708gr("client_close_freq_control"));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.onUserInteraction$1");
                return unit;
            }
            SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3 = this.LLILLJJLI;
            EnumC2193241Asc enumC2193241Asc = this.LLILLL;
            C2158508cx c2158508cx = new C2158508cx(searchCSIProfileBannerRepoV3, enumC2193241Asc, null);
            this.LL = 1;
            if (searchCSIProfileBannerRepoV3.LJIL(enumC2193241Asc, c2158508cx, this) == objLJFF) {
                C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.onUserInteraction$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.onUserInteraction$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
