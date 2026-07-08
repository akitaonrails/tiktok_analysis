package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartTemplateApplyKt$TEMPLATE_APPLY_GRAPH$1$14", f = "StartTemplateApply.kt", l = {}, m = "invokeSuspend")
public final class C532140Ktw extends C09AX implements Function2<InterfaceC532370KuJ<C532240Ku6>, InterfaceC1364105Vn<? super C532220Ku4>, Object> {
    public /* synthetic */ Object LL;

    public C532140Ktw(InterfaceC1364105Vn<? super C532140Ktw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532140Ktw c532140Ktw = new C532140Ktw(interfaceC1364105Vn);
        c532140Ktw.LL = obj;
        return c532140Ktw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$14");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        NLETemplateModel nLETemplateModel = (NLETemplateModel) interfaceC532370KuJ.LIZ(C0FQG.LIZLLL);
        if (nLETemplateModel != null) {
            List list = (List) interfaceC532370KuJ.LIZ(C531500Ksu.LIZ);
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            C532220Ku4 c532220Ku4 = new C532220Ku4(nLETemplateModel, list, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LIZJ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LJ, ((C532240Ku6) interfaceC532370KuJ.getContext()).LJFF);
            C1C7U.LIZIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$14");
            return c532220Ku4;
        }
        "StartTemplateApply model missing after matting".toString();
        throw new IllegalStateException("StartTemplateApply model missing after matting");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C532240Ku6> interfaceC532370KuJ, InterfaceC1364105Vn<? super C532220Ku4> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
