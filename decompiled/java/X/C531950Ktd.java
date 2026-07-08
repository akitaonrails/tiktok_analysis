package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartUseTemplateKt$START_USE_TEMPLATE_GRAPH$1$12", f = "StartUseTemplate.kt", l = {}, m = "invokeSuspend")
public final class C531950Ktd extends C09AX implements Function2<InterfaceC532370KuJ<C531970Ktf>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C531950Ktd(InterfaceC1364105Vn<? super C531950Ktd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531950Ktd c531950Ktd = new C531950Ktd(interfaceC1364105Vn);
        c531950Ktd.LL = obj;
        return c531950Ktd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$12");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C531550Ksz c531550KszLIZ = C0FQK.LIZ(((C531970Ktf) ((InterfaceC532370KuJ) this.LL).getContext()).LIZ);
        boolean z = true;
        if (c531550KszLIZ != null && (str = c531550KszLIZ.LIZJ.LIZ) != null && str.length() != 0 && (str2 = c531550KszLIZ.LIZJ.LIZIZ) != null && str2.length() != 0) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("StartUseTemplateKt@11a7.START_USE_TEMPLATE_GRAPH$1$12");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<C531970Ktf> interfaceC532370KuJ, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC532370KuJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
