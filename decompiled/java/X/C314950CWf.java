package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.toolbar.TextToImageTitleBarComponent$clickNext$2$genImageJob$1$3$1", f = "TextToImageTitleBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C314950CWf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1390150mHN LL;
    public final /* synthetic */ C571990Mc1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314950CWf(DialogC1390150mHN dialogC1390150mHN, C571990Mc1 c571990Mc1, InterfaceC1364105Vn<? super C314950CWf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1390150mHN;
        this.LLILLJJLI = c571990Mc1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314950CWf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.LJIIJJI(this.LL);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI.getActivity());
        c1389890mGx.LJIIIZ(2131821537);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3$1");
        return unit;
    }
}
