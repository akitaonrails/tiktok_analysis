package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartTemplateApplyKt$TEMPLATE_APPLY_GRAPH$1$4", f = "StartTemplateApply.kt", l = {}, m = "invokeSuspend")
public final class C532110Ktt extends C09AX implements Function2<InterfaceC532370KuJ<C532240Ku6>, InterfaceC1364105Vn<? super C0FQ8>, Object> {
    public /* synthetic */ Object LL;

    public C532110Ktt(InterfaceC1364105Vn<? super C532110Ktt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532110Ktt c532110Ktt = new C532110Ktt(interfaceC1364105Vn);
        c532110Ktt.LL = obj;
        return c532110Ktt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        NLETemplateModel nLETemplateModel = (NLETemplateModel) interfaceC532370KuJ.LIZ(C532060Kto.LIZ);
        if (nLETemplateModel != null) {
            C0FQ8 c0fq8 = new C0FQ8(nLETemplateModel, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZIZ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZJ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZLLL, ((C532240Ku6) interfaceC532370KuJ.getContext()).LJ);
            C1C7U.LIZIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$4");
            return c0fq8;
        }
        "StartTemplateApply model missing after download".toString();
        throw new IllegalStateException("StartTemplateApply model missing after download");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C532240Ku6> interfaceC532370KuJ, InterfaceC1364105Vn<? super C0FQ8> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
