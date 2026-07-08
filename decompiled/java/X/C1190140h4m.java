package X;

import Y.AgS0S0231100_18;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0h4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM$like$1", f = "PoiCommentReviewListVM.kt", l = {448}, m = "invokeSuspend")
public final class C1190140h4m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ PoiReviewsApi.PoiReviewModel LLILZIL;
    public final /* synthetic */ PoiCommentReviewListVM LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ boolean LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190140h4m(String str, String str2, int i, PoiReviewsApi.PoiReviewModel poiReviewModel, PoiCommentReviewListVM poiCommentReviewListVM, int i2, long j, boolean z, boolean z2, boolean z3, InterfaceC1364105Vn<? super C1190140h4m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = poiReviewModel;
        this.LLILZLL = poiCommentReviewListVM;
        this.LLIZ = i2;
        this.LLIZLLLIL = j;
        this.LLJ = z;
        this.LLJI = z2;
        this.LLJIJIL = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1190140h4m(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiCommentReviewListVM@4feb.like$1");
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
            AgS0S0231100_18 agS0S0231100_18 = new AgS0S0231100_18(this.LLILZLL, this.LLIZ, this.LLILZIL, this.LLJ, this.LLJI, this.LLIZLLLIL, this.LLJIJIL, 2);
            this.LL = 1;
            if (interfaceC346201WaLIZ.collect(agS0S0231100_18, this) == objLJFF) {
                C1C7U.LIZIZ("PoiCommentReviewListVM@4feb.like$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiCommentReviewListVM@4feb.like$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
