package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartTemplateApplyKt$TEMPLATE_APPLY_GRAPH$1$6", f = "StartTemplateApply.kt", l = {}, m = "invokeSuspend")
public final class C532170Ktz extends C09AX implements Function2<InterfaceC532370KuJ<C532240Ku6>, InterfaceC1364105Vn<? super C353730Dtr>, Object> {
    public /* synthetic */ Object LL;

    public C532170Ktz(InterfaceC1364105Vn<? super C532170Ktz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532170Ktz c532170Ktz = new C532170Ktz(interfaceC1364105Vn);
        c532170Ktz.LL = obj;
        return c532170Ktz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        NLETemplateModel nLETemplateModel = (NLETemplateModel) interfaceC532370KuJ.LIZ(C0FQA.LIZ);
        if (nLETemplateModel != null) {
            C353730Dtr c353730Dtr = new C353730Dtr(nLETemplateModel, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZLLL);
            C1C7U.LIZIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$6");
            return c353730Dtr;
        }
        "StartTemplateApply model missing after assemble".toString();
        throw new IllegalStateException("StartTemplateApply model missing after assemble");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C532240Ku6> interfaceC532370KuJ, InterfaceC1364105Vn<? super C353730Dtr> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
