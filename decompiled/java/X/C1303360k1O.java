package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k1O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendeffect.compose.HorizontalCarouselKt$Panel$5$1", f = "HorizontalCarousel.kt", l = {}, m = "invokeSuspend")
public final class C1303360k1O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1303440k1W LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ C05P0<EnumC994870bzp> LLILLL;
    public final /* synthetic */ C1690080u58 LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ C05P0<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303360k1O(C1303440k1W c1303440k1W, InterfaceC497601wk interfaceC497601wk, C05P0<EnumC994870bzp> c05p0, C1690080u58 c1690080u58, int i, Function0<Unit> function0, C05P0<String> c05p02, InterfaceC1364105Vn<? super C1303360k1O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1303440k1W;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = c05p0;
        this.LLILZ = c1690080u58;
        this.LLILZIL = i;
        this.LLILZLL = function0;
        this.LLIZ = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303360k1O(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalCarouselKt@558d.Panel$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZLLL != 0 && (!r1.LIZ.isEmpty())) {
            C1303440k1W c1303440k1W = this.LL;
            int i = c1303440k1W.LIZIZ + c1303440k1W.LIZLLL;
            if (i >= 0 && i < c1303440k1W.LIZ.size()) {
                this.LLILLL.setValue(EnumC994870bzp.SHOW);
                C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C1303370k1P(this.LLILZ, i, this.LLILZIL, this.LL, this.LLILZLL, this.LLIZ, null), 3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
