package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xtc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.entrance.widget.RankExpandManager$startConsumeTimerIfNeeded$1", f = "RankExpandManager.kt", l = {178}, m = "invokeSuspend")
public final class C863180Xtc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1842440y2s LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863180Xtc(C1842440y2s c1842440y2s, InterfaceC1364105Vn<? super C863180Xtc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1842440y2s;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863180Xtc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1C7U.LIZ("RankExpandManager@51f4.startConsumeTimerIfNeeded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        do {
            this.LLILLJJLI.LJ();
            C1842440y2s c1842440y2s = this.LLILLJJLI;
            if (c1842440y2s.LIZLLL == null && c1842440y2s.LJ == null) {
                c1842440y2s.LJIIIIZZ = null;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RankExpandManager@51f4.startConsumeTimerIfNeeded$1");
                return unit;
            }
            j = c1842440y2s.LJIIIZ;
            this.LL = 1;
        } while (AnonymousClass0958.LIZIZ(j, this) != objLJFF);
        C1C7U.LIZIZ("RankExpandManager@51f4.startConsumeTimerIfNeeded$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
