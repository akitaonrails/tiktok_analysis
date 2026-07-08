package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartTemplateApplyKt$TEMPLATE_APPLY_GRAPH$1$1", f = "StartTemplateApply.kt", l = {}, m = "invokeSuspend")
public final class C532090Ktr extends C09AX implements Function2<InterfaceC532370KuJ<C532240Ku6>, InterfaceC1364105Vn<? super C532050Ktn>, Object> {
    public /* synthetic */ Object LL;

    public C532090Ktr(InterfaceC1364105Vn<? super C532090Ktr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532090Ktr c532090Ktr = new C532090Ktr(interfaceC1364105Vn);
        c532090Ktr.LL = obj;
        return c532090Ktr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        C844470XAv.LIZ.getClass();
        C532050Ktn c532050Ktn = new C532050Ktn(C844470XAv.LIZ(), ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZ.templateId, ((C532240Ku6) interfaceC532370KuJ.getContext()).LJ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZLLL.getCreationId(), false);
        C1C7U.LIZIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$1");
        return c532050Ktn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C532240Ku6> interfaceC532370KuJ, InterfaceC1364105Vn<? super C532050Ktn> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
