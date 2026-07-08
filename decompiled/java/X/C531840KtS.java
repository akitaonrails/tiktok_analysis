package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$7", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531840KtS extends C09AX implements Function2<C531970Ktf, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>>, Object> {
    public C531840KtS(InterfaceC1364105Vn<? super C531840KtS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C531840KtS(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$7");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLJIIJJI = C1697810uHb.LJIIJJI(C531680KtC.LIZ, C531750KtJ.LIZ);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$7");
        return listLJIIJJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C531970Ktf c531970Ktf, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>> interfaceC1364105Vn) {
        return new C531840KtS(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
