package X;

import Y.AgS0S1231100_18;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0h4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel$like$1", f = "PoiReviewsListViewModel.kt", l = {1198}, m = "invokeSuspend")
public final class C1190130h4l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ PoiReviewsApi.PoiReviewModel LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ PoiReviewsListViewModel LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190130h4l(int i, int i2, long j, PoiReviewsApi.PoiReviewModel poiReviewModel, PoiReviewsListViewModel poiReviewsListViewModel, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = poiReviewModel;
        this.LLILZLL = j;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
        this.LLJI = poiReviewsListViewModel;
        this.LLJIJIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        int i = this.LLILZ;
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLILZIL;
        long j = this.LLILZLL;
        boolean z = this.LLIZ;
        boolean z2 = this.LLIZLLLIL;
        boolean z3 = this.LLJ;
        return new C1190130h4l(i, this.LLJIJIL, j, poiReviewModel, this.LLJI, str, str2, interfaceC1364105Vn, z, z2, z3);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiReviewsListViewModel@e0d9.like$1");
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
            InterfaceC346201Wa interfaceC346201WaLIZ = C614380O7w.LIZ(this.LLILZ, this.LLILLJJLI, this.LLILLL, this.LLILZIL.getServerParam());
            AgS0S1231100_18 agS0S1231100_18 = new AgS0S1231100_18(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLILLJJLI, this.LLJI, this.LLJIJIL, 2);
            this.LL = 1;
            if (interfaceC346201WaLIZ.collect(agS0S1231100_18, this) == objLJFF) {
                C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.like$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.like$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
