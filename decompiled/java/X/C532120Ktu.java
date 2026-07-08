package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartTemplateApplyKt$TEMPLATE_APPLY_GRAPH$1$8", f = "StartTemplateApply.kt", l = {}, m = "invokeSuspend")
public final class C532120Ktu extends C09AX implements Function2<InterfaceC532370KuJ<C532240Ku6>, InterfaceC1364105Vn<? super C0FQD>, Object> {
    public /* synthetic */ Object LL;

    public C532120Ktu(InterfaceC1364105Vn<? super C532120Ktu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532120Ktu c532120Ktu = new C532120Ktu(interfaceC1364105Vn);
        c532120Ktu.LL = obj;
        return c532120Ktu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$8");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        NLETemplateModel nLETemplateModel = (NLETemplateModel) interfaceC532370KuJ.LIZ(C0FQG.LIZ);
        if (nLETemplateModel != null) {
            C0FQD c0fqd = new C0FQD(nLETemplateModel, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZLLL, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZJ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LJ);
            C1C7U.LIZIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$8");
            return c0fqd;
        }
        "StartTemplateApply model missing after reverse".toString();
        throw new IllegalStateException("StartTemplateApply model missing after reverse");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C532240Ku6> interfaceC532370KuJ, InterfaceC1364105Vn<? super C0FQD> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
