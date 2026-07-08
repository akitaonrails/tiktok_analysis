package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KtW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$1", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531880KtW extends C09AX implements Function2<InterfaceC532370KuJ<C531970Ktf>, InterfaceC1364105Vn<? super C531780KtM>, Object> {
    public /* synthetic */ Object LL;

    public C531880KtW(InterfaceC1364105Vn<? super C531880KtW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531880KtW c531880KtW = new C531880KtW(interfaceC1364105Vn);
        c531880KtW.LL = obj;
        return c531880KtW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC532370KuJ interfaceC532370KuJ = (InterfaceC532370KuJ) this.LL;
        C531780KtM c531780KtM = new C531780KtM(((C531970Ktf) interfaceC532370KuJ.getContext()).LIZLLL, ((C531970Ktf) interfaceC532370KuJ.getContext()).LIZJ);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$1");
        return c531780KtM;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C531970Ktf> interfaceC532370KuJ, InterfaceC1364105Vn<? super C531780KtM> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
