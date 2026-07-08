package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartTemplateApplyKt$TEMPLATE_APPLY_GRAPH$1$10", f = "StartTemplateApply.kt", l = {}, m = "invokeSuspend")
public final class C532150Ktx extends C09AX implements Function2<InterfaceC532370KuJ<C532240Ku6>, InterfaceC1364105Vn<? super C0FQI>, Object> {
    public /* synthetic */ Object LL;

    public C532150Ktx(InterfaceC1364105Vn<? super C532150Ktx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532150Ktx c532150Ktx = new C532150Ktx(interfaceC1364105Vn);
        c532150Ktx.LL = obj;
        return c532150Ktx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$10");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        C0FQF c0fqf = (C0FQF) interfaceC532370KuJ.LIZ(C0FQG.LIZIZ);
        if (c0fqf != null) {
            C0FQI c0fqi = new C0FQI(c0fqf.LIZ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZLLL, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZJ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LJ, c0fqf.LIZIZ, c0fqf.LIZJ, c0fqf.LIZLLL);
            C1C7U.LIZIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$10");
            return c0fqi;
        }
        "StartTemplateApply magic out missing after magic".toString();
        throw new IllegalStateException("StartTemplateApply magic out missing after magic");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C532240Ku6> interfaceC532370KuJ, InterfaceC1364105Vn<? super C0FQI> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
