package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceItemFileCache$cleanCurrentBlock$2", f = "TraceItemFileCache.kt", l = {}, m = "invokeSuspend")
public final class C806000Vja extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C806020Vjc LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806000Vja(C806020Vjc c806020Vjc, InterfaceC1364105Vn<? super C806000Vja> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c806020Vjc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C806000Vja(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TraceItemFileCache@d8bf.cleanCurrentBlock$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0VSJ c0vsjLIZJ = this.LL.LIZJ();
        if (c0vsjLIZJ != null) {
            Boolean.valueOf(c0vsjLIZJ.delete());
        }
        int i = this.LL.LJ().getInt("trace_read_index", 0);
        if (i != this.LL.LJ().getInt("trace_write_index", 0)) {
            this.LL.LJ().storeInt("trace_read_index", (i + 1) % 100000);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TraceItemFileCache@d8bf.cleanCurrentBlock$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
