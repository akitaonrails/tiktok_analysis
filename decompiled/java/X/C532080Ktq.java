package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ktq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartTemplateApplyKt$TEMPLATE_APPLY_GRAPH$1$13", f = "StartTemplateApply.kt", l = {}, m = "invokeSuspend")
public final class C532080Ktq extends C09AX implements Function2<C532240Ku6, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>>, Object> {
    public C532080Ktq(InterfaceC1364105Vn<? super C532080Ktq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532080Ktq(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$13");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLJIIJJI = C1697810uHb.LJIIJJI(C0FQG.LIZLLL, C531500Ksu.LIZ);
        C1C7U.LIZIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$13");
        return listLJIIJJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C532240Ku6 c532240Ku6, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>> interfaceC1364105Vn) {
        return new C532080Ktq(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
