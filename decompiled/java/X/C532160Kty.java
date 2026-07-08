package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartTemplateApplyKt$TEMPLATE_APPLY_GRAPH$1$12", f = "StartTemplateApply.kt", l = {}, m = "invokeSuspend")
public final class C532160Kty extends C09AX implements Function2<InterfaceC532370KuJ<C532240Ku6>, InterfaceC1364105Vn<? super C0FQE>, Object> {
    public /* synthetic */ Object LL;

    public C532160Kty(InterfaceC1364105Vn<? super C532160Kty> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532160Kty c532160Kty = new C532160Kty(interfaceC1364105Vn);
        c532160Kty.LL = obj;
        return c532160Kty;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$12");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        NLETemplateModel nLETemplateModel = (NLETemplateModel) interfaceC532370KuJ.LIZ(C0FQG.LIZJ);
        if (nLETemplateModel != null) {
            C0FQE c0fqe = new C0FQE(nLETemplateModel, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZLLL, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZJ);
            C1C7U.LIZIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$12");
            return c0fqe;
        }
        "StartTemplateApply model missing after freeze".toString();
        throw new IllegalStateException("StartTemplateApply model missing after freeze");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C532240Ku6> interfaceC532370KuJ, InterfaceC1364105Vn<? super C0FQE> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
