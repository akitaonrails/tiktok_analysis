package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01U9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepo$bannerFlow$1", f = "SearchCSIProfileBannerRepo.kt", l = {}, m = "invokeSuspend")
public final class C01U9 extends C09AX implements Function2<C2193061AsK, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C01U9(InterfaceC1364105Vn<? super C01U9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01U9 c01u9 = new C01U9(interfaceC1364105Vn);
        c01u9.LL = obj;
        return c01u9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepo@2d36.bannerFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfileBannerRepo@2d36.bannerFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C2193061AsK c2193061AsK, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c2193061AsK, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
