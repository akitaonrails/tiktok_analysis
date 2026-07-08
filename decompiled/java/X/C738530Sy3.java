package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS26S0001000_11;
import njp.a;

/* JADX INFO: renamed from: X.0Sy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.util.InputPerfTracker$start$1", f = "InputPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C738530Sy3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C738530Sy3(int i, String str, InterfaceC1364105Vn<? super C738530Sy3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C738530Sy3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputPerfTracker@2fe3.start$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C738570Sy7 c738570Sy7 = C738570Sy7.LIZ;
        C738560Sy6 c738560Sy6 = C738560Sy6.LL;
        AwS26S0001000_11 awS26S0001000_11 = new AwS26S0001000_11(this.LL, 0);
        int i = this.LL;
        String str = this.LLILLJJLI;
        C738560Sy6.LLILLJJLI.put(C2286608xc.LJ(i), new C738550Sy5(0.0f, str, awS26S0001000_11));
        C725430Scv.LJ(c738570Sy7, 0.001f, awS26S0001000_11);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InputPerfTracker@2fe3.start$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
