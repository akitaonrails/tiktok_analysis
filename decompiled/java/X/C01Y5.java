package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Y5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.framework.FlowGraphBuilder$node$2", f = "FlowGraphDsl.kt", l = {}, m = "invokeSuspend")
public final class C01Y5 extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>>, Object> {
    public C01Y5(InterfaceC1364105Vn<? super C01Y5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01Y5(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowGraphBuilder@5de6.node$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C13BV c13bv = C13BV.INSTANCE;
        C1C7U.LIZIZ("FlowGraphBuilder@5de6.node$2");
        return c13bv;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super List<? extends InterfaceC532490KuV<?, ?>>> interfaceC1364105Vn) {
        return new C01Y5(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
