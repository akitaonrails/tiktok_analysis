package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartTemplateApplyKt$TEMPLATE_APPLY_GRAPH$1$2", f = "StartTemplateApply.kt", l = {}, m = "invokeSuspend")
public final class C532100Kts extends C09AX implements Function2<InterfaceC532370KuJ<C532240Ku6>, InterfaceC1364105Vn<? super C531490Kst>, Object> {
    public /* synthetic */ Object LL;

    public C532100Kts(InterfaceC1364105Vn<? super C532100Kts> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532100Kts c532100Kts = new C532100Kts(interfaceC1364105Vn);
        c532100Kts.LL = obj;
        return c532100Kts;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        C531490Kst c531490Kst = new C531490Kst(((C532240Ku6) interfaceC532370KuJ.getContext()).LIZ.templateId, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZJ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LJ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZLLL.getCreationId());
        C1C7U.LIZIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$2");
        return c531490Kst;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C532240Ku6> interfaceC532370KuJ, InterfaceC1364105Vn<? super C531490Kst> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
