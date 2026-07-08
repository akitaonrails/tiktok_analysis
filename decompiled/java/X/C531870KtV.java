package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$4", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531870KtV extends C09AX implements Function2<C531970Ktf, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>>, Object> {
    public /* synthetic */ Object LL;

    public C531870KtV(InterfaceC1364105Vn<? super C531870KtV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531870KtV c531870KtV = new C531870KtV(interfaceC1364105Vn);
        c531870KtV.LL = obj;
        return c531870KtV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C531970Ktf c531970Ktf = (C531970Ktf) this.LL;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.add(C531540Ksy.LIZ);
        if (c531970Ktf.LIZJ == null) {
            c13dvLIZIZ.add(C531750KtJ.LIZ);
        }
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$4");
        return listLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C531970Ktf c531970Ktf, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>> interfaceC1364105Vn) {
        return ((a) create(c531970Ktf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
