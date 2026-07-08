package X;

import Y.AObjectS392S0100000_17;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0f3S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.presenter.AppLogEventListener$realOnEvent$liveLog$3$3", f = "AppLogEventListener.kt", l = {}, m = "invokeSuspend")
public final class C1112440f3S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1113050f4R LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1112440f3S(C1113050f4R c1113050f4R, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c1113050f4R;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1112440f3S(this.LLILLJJLI, interfaceC1364105Vn, this.LL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AObjectS392S0100000_17 aObjectS392S0100000_17;
        C1112760f3y c1112760f3y;
        C1C7U.LIZ("AppLogEventListener@6840.realOnEvent$liveLog$3$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL && (aObjectS392S0100000_17 = this.LLILLJJLI.LLFFF) != null && (c1112760f3y = (C1112760f3y) aObjectS392S0100000_17.invoke()) != null) {
            C1113050f4R c1113050f4R = this.LLILLJJLI;
            c1113050f4R.LJZI = c1112760f3y.LIZ;
            c1113050f4R.LJZL = c1112760f3y.LIZIZ;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AppLogEventListener@6840.realOnEvent$liveLog$3$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
