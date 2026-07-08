package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialsharesearch.Coordinator$search$1$2", f = "Coordinator.kt", l = {}, m = "invokeSuspend")
public final class C498601wu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1631620sYq<List<? extends InterfaceC1381610m3b>, Double, Double, Unit> LL;
    public final /* synthetic */ List<InterfaceC1381610m3b> LLILLJJLI;
    public final /* synthetic */ double LLILLL;
    public final /* synthetic */ double LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C498601wu(InterfaceC1631620sYq<? super List<? extends InterfaceC1381610m3b>, ? super Double, ? super Double, Unit> interfaceC1631620sYq, List<? extends InterfaceC1381610m3b> list, double d, double d2, InterfaceC1364105Vn<? super C498601wu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = list;
        this.LLILLL = d;
        this.LLILZ = d2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C498601wu(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Coordinator@a411.search$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI, C2286608xc.LIZJ(this.LLILLL), C2286608xc.LIZJ(this.LLILZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Coordinator@a411.search$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
