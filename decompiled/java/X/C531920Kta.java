package X;

import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$15", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531920Kta extends C09AX implements Function2<InterfaceC532370KuJ<C531970Ktf>, InterfaceC1364105Vn<? super C526790KlJ>, Object> {
    public /* synthetic */ Object LL;

    public C531920Kta(InterfaceC1364105Vn<? super C531920Kta> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531920Kta c531920Kta = new C531920Kta(interfaceC1364105Vn);
        c531920Kta.LL = obj;
        return c531920Kta;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$15");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        TemplateConsumeCoreParam templateConsumeCoreParamLIZ = (TemplateConsumeCoreParam) interfaceC532370KuJ.LIZ(C531750KtJ.LIZ);
        if (templateConsumeCoreParamLIZ == null) {
            templateConsumeCoreParamLIZ = C531990Kth.LIZ((C531970Ktf) interfaceC532370KuJ.getContext());
        }
        C526790KlJ c526790KlJ = new C526790KlJ(templateConsumeCoreParamLIZ, ((C531970Ktf) interfaceC532370KuJ.getContext()).LIZLLL, ((C531970Ktf) interfaceC532370KuJ.getContext()).LJ);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$15");
        return c526790KlJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C531970Ktf> interfaceC532370KuJ, InterfaceC1364105Vn<? super C526790KlJ> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
