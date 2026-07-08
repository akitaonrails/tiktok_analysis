package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.ui.ImageInspirationTextStickerPresenter$fetchTemplateResource$1$2", f = "ImageInspirationTextStickerPresenter.kt", l = {}, m = "invokeSuspend")
public final class C0FMJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0FMP LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C259800zU<C0FMO> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FMJ(C0FMP c0fmp, int i, C259800zU<C0FMO> c259800zU, InterfaceC1364105Vn<? super C0FMJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0fmp;
        this.LLILLJJLI = i;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FMJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationTextStickerPresenter@ecb3.fetchTemplateResource$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ(this.LLILLJJLI, this.LLILLL.element);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageInspirationTextStickerPresenter@ecb3.fetchTemplateResource$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
