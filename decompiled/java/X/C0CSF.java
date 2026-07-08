package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CSF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.toolbar.TextToImageTitleBarComponent$clickNext$2$genImageJob$1$2$1", f = "TextToImageTitleBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C0CSF extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public C0CSF(InterfaceC1364105Vn<? super C0CSF> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CSF(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0CSF(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$2$1");
        return unit;
    }
}
