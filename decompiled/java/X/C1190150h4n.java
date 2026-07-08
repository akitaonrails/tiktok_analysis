package X;

import Y.AgS0S0330100_18;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.uiwidget.PoiReviewHelpfulVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0h4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.uiwidget.PoiReviewHelpfulVM$like$1", f = "PoiReviewHelpfulAssem.kt", l = {301}, m = "invokeSuspend")
public final class C1190150h4n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ PoiReviewsApi.PoiReviewModel LLILZIL;
    public final /* synthetic */ PoiReviewHelpfulVM LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ Function1<PoiReviewsApi.PoiReviewModel, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1190150h4n(String str, String str2, int i, PoiReviewsApi.PoiReviewModel poiReviewModel, PoiReviewHelpfulVM poiReviewHelpfulVM, long j, boolean z, boolean z2, boolean z3, Function1<? super PoiReviewsApi.PoiReviewModel, Unit> function1, InterfaceC1364105Vn<? super C1190150h4n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = poiReviewModel;
        this.LLILZLL = poiReviewHelpfulVM;
        this.LLIZ = j;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = z3;
        this.LLJIJIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1190150h4n(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiReviewHelpfulVM@6e3a.like$1");
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
            AgS0S0330100_18 agS0S0330100_18 = new AgS0S0330100_18(this.LLILZLL, this.LLILZIL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, 0);
            this.LL = 1;
            if (interfaceC346201WaLIZ.collect(agS0S0330100_18, this) == objLJFF) {
                C1C7U.LIZIZ("PoiReviewHelpfulVM@6e3a.like$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiReviewHelpfulVM@6e3a.like$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
