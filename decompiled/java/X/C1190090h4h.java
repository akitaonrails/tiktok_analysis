package X;

import Y.AgS0S0231100_18;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0h4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel$dislike$1", f = "PoiDetailReviewsViewModel.kt", l = {437}, m = "invokeSuspend")
public final class C1190090h4h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ PoiReviewsApi.PoiReviewModel LLILZIL;
    public final /* synthetic */ PoiDetailReviewsViewModel LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ boolean LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190090h4h(int i, int i2, long j, PoiDetailReviewsViewModel poiDetailReviewsViewModel, PoiReviewsApi.PoiReviewModel poiReviewModel, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = poiReviewModel;
        this.LLILZLL = poiDetailReviewsViewModel;
        this.LLIZ = i2;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = j;
        this.LLJIJIL = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        int i = this.LLILZ;
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLILZIL;
        PoiDetailReviewsViewModel poiDetailReviewsViewModel = this.LLILZLL;
        return new C1190090h4h(i, this.LLIZ, this.LLJI, poiDetailReviewsViewModel, poiReviewModel, str, str2, interfaceC1364105Vn, this.LLIZLLLIL, this.LLJ, this.LLJIJIL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiDetailReviewsViewModel@8a8c.dislike$1");
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
            AgS0S0231100_18 agS0S0231100_18 = new AgS0S0231100_18(this.LLILZLL, this.LLIZ, this.LLILZIL, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, 0);
            this.LL = 1;
            if (interfaceC346201WaLIZ.collect(agS0S0231100_18, this) == objLJFF) {
                C1C7U.LIZIZ("PoiDetailReviewsViewModel@8a8c.dislike$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailReviewsViewModel@8a8c.dislike$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
