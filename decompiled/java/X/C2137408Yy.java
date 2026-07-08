package X;

import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$triggerBannerUpdate$1$1", f = "SearchCSIProfileBannerRepoV3.kt", l = {627, 629}, m = "invokeSuspend")
public final class C2137408Yy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchCSIProfileBannerRepoV3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2137408Yy(SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3, InterfaceC1364105Vn<? super C2137408Yy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchCSIProfileBannerRepoV3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2137408Yy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.triggerBannerUpdate$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.LJJ = null;
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.triggerBannerUpdate$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1500L, this) == objLJFF) {
                C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.triggerBannerUpdate$1$1");
                return objLJFF;
            }
        }
        SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3 = this.LLILLJJLI;
        this.LL = 2;
        if (searchCSIProfileBannerRepoV3.LJIJ(this) == objLJFF) {
            C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.triggerBannerUpdate$1$1");
            return objLJFF;
        }
        this.LLILLJJLI.LJJ = null;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.triggerBannerUpdate$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
