package X;

import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$10", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531910KtZ extends C09AX implements Function2<InterfaceC532370KuJ<C531970Ktf>, InterfaceC1364105Vn<? super C526670Kl7>, Object> {
    public /* synthetic */ Object LL;

    public C531910KtZ(InterfaceC1364105Vn<? super C531910KtZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531910KtZ c531910KtZ = new C531910KtZ(interfaceC1364105Vn);
        c531910KtZ.LL = obj;
        return c531910KtZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$10");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        TemplateConsumeCoreParam templateConsumeCoreParamLIZ = (TemplateConsumeCoreParam) interfaceC532370KuJ.LIZ(C531750KtJ.LIZ);
        if (templateConsumeCoreParamLIZ == null) {
            templateConsumeCoreParamLIZ = C531990Kth.LIZ((C531970Ktf) interfaceC532370KuJ.getContext());
        }
        C526670Kl7 c526670Kl7 = new C526670Kl7(templateConsumeCoreParamLIZ, ((C531970Ktf) interfaceC532370KuJ.getContext()).LIZLLL, ((C531970Ktf) interfaceC532370KuJ.getContext()).LJ);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$10");
        return c526670Kl7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C531970Ktf> interfaceC532370KuJ, InterfaceC1364105Vn<? super C526670Kl7> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
