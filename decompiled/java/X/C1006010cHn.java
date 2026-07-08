package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.view.recommendv2.RecommendMusicItemViewHolderV2$bindUiState$1", f = "RecommendMusicItemViewHolderV2.kt", l = {}, m = "invokeSuspend")
public final class C1006010cHn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RecommendMusicV2ViewModel LLILLJJLI;
    public final /* synthetic */ C1839140xxY LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006010cHn(RecommendMusicV2ViewModel recommendMusicV2ViewModel, C1839140xxY c1839140xxY, InterfaceC1364105Vn<? super C1006010cHn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recommendMusicV2ViewModel;
        this.LLILLL = c1839140xxY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1006010cHn c1006010cHn = new C1006010cHn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1006010cHn.LL = obj;
        return c1006010cHn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendMusicItemViewHolderV2@a069.bindUiState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C05RH(new C414301jJ(C09IC.LIZIZ(this.LLILLJJLI.LLILZIL), this.LLILLL.LLJILJIL, new C1005980cHk(null))));
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1005950cHh(interfaceC346201WaLJIILL, this.LLILLL, this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1005930cHf(interfaceC346201WaLJIILL, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecommendMusicItemViewHolderV2@a069.bindUiState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
