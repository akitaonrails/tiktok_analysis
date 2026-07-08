package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Y3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.framework.FlowGraphBuilder$node$3", f = "FlowGraphDsl.kt", l = {}, m = "invokeSuspend")
public final class C01Y3 extends C09AX implements Function2<InterfaceC532370KuJ<Object>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C01Y3(InterfaceC1364105Vn<? super C01Y3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01Y3(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowGraphBuilder@5de6.node$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1C7U.LIZIZ("FlowGraphBuilder@5de6.node$3");
        return false;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532370KuJ<Object> interfaceC532370KuJ, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C01Y3(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
