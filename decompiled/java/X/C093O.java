package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.093O, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.EffectPrefetcherComponentImpl$runQueueDrainer$1$1", f = "EffectPrefetcherComponent.kt", l = {}, m = "invokeSuspend")
public final class C093O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C093Q LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C093O(C093Q c093q, InterfaceC1364105Vn<? super C093O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c093q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C093O c093o = new C093O(this.LLILLJJLI, interfaceC1364105Vn);
        c093o.LL = obj;
        return c093o;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectPrefetcherComponentImpl@551d.runQueueDrainer$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C093Q c093q = this.LLILLJJLI;
        int i = c093q.LLILLJJLI;
        if (i < 1) {
            i = 1;
        }
        int i2 = 0;
        do {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C093P(c093q, null), 3);
            i2++;
        } while (i2 < i);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectPrefetcherComponentImpl@551d.runQueueDrainer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
