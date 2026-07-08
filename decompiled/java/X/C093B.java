package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.093B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.EffectPrefetcherComponentImplV2$startDrainer$1$1", f = "EffectPrefetcherComponentImplV2.kt", l = {}, m = "invokeSuspend")
public final class C093B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C093F LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C093B(C093F c093f, InterfaceC1364105Vn<? super C093B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c093f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C093B c093b = new C093B(this.LLILLJJLI, interfaceC1364105Vn);
        c093b.LL = obj;
        return c093b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectPrefetcherComponentImplV2@7766.startDrainer$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C093F c093f = this.LLILLJJLI;
        int i = c093f.LLILLJJLI;
        if (i < 1) {
            i = 1;
        }
        int i2 = 0;
        do {
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C093C(c093f, null), 3);
            i2++;
        } while (i2 < i);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectPrefetcherComponentImplV2@7766.startDrainer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
