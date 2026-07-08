package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Y6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.CpuInfoUtils$markCpuUsage$1$1", f = "CpuInfoUtils.kt", l = {}, m = "invokeSuspend")
public final class C08Y6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C08Y8 LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08Y6(C08Y8 c08y8, boolean z, InterfaceC1364105Vn<? super C08Y6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c08y8;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08Y6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CpuInfoUtils@97b0.markCpuUsage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C08Y8 c08y8 = C08Y7.LIZ;
        if (c08y8 != null) {
            boolean z = this.LLILLJJLI;
            C08Y8 c08y82 = this.LL;
            if (z) {
                double d = c08y82.LIZIZ;
                double d2 = c08y8.LIZIZ;
                if (d != d2) {
                    C08Y7.LIZIZ = C2286608xc.LJ((int) (((c08y82.LIZ - c08y8.LIZ) * 100.0d) / (d - d2)));
                }
            }
        }
        C08Y7.LIZ = this.LL;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CpuInfoUtils@97b0.markCpuUsage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
