package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KtU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$14", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531860KtU extends C09AX implements Function2<C531970Ktf, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>>, Object> {
    public C531860KtU(InterfaceC1364105Vn<? super C531860KtU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C531860KtU(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$14");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listSingletonList = Collections.singletonList(C531750KtJ.LIZ);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$14");
        return listSingletonList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C531970Ktf c531970Ktf, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>> interfaceC1364105Vn) {
        return new C531860KtU(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
