package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ku2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.StartTemplateApplyKt$TEMPLATE_APPLY_GRAPH$1$7", f = "StartTemplateApply.kt", l = {}, m = "invokeSuspend")
public final class C532200Ku2 extends C09AX implements Function2<C532240Ku6, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>>, Object> {
    public C532200Ku2(InterfaceC1364105Vn<? super C532200Ku2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532200Ku2(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$7");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listSingletonList = Collections.singletonList(C0FQG.LIZ);
        C1C7U.LIZIZ("StartTemplateApplyKt@691c.TEMPLATE_APPLY_GRAPH$1$7");
        return listSingletonList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C532240Ku6 c532240Ku6, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>> interfaceC1364105Vn) {
        return new C532200Ku2(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
