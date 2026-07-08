package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.framework.FlowGraph$awaitAnySuccess$2$1$1", f = "FlowGraph.kt", l = {}, m = "invokeSuspend")
public final class C332590D2b extends C09AX implements Function2<InterfaceC532390KuL<? extends Object>, InterfaceC1364105Vn<? super Pair<? extends C05XL<InterfaceC532390KuL<? extends Object>>, ? extends InterfaceC532390KuL<? extends Object>>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C05XL<InterfaceC532390KuL<Object>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332590D2b(C05XL<InterfaceC532390KuL<Object>> c05xl, InterfaceC1364105Vn<? super C332590D2b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C332590D2b c332590D2b = new C332590D2b(this.LLILLJJLI, interfaceC1364105Vn);
        c332590D2b.LL = obj;
        return c332590D2b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowGraph@bf8f.awaitAnySuccess$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(this.LLILLJJLI, this.LL);
        C1C7U.LIZIZ("FlowGraph@bf8f.awaitAnySuccess$2$1$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC532390KuL<? extends Object> interfaceC532390KuL, InterfaceC1364105Vn<? super Pair<? extends C05XL<InterfaceC532390KuL<? extends Object>>, ? extends InterfaceC532390KuL<? extends Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC532390KuL, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
