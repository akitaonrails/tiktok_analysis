package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05UJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.FullscreenMediaPreviewPageKt$FullyTransformableMedia$1", f = "FullscreenMediaPreviewPage.kt", l = {}, m = "invokeSuspend")
public final class C05UJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Float, Unit> LL;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UJ(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05UJ(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI.element.LIZLLL());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
