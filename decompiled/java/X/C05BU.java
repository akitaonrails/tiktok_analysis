package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05BU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05BU extends C09AY implements Function1<C1378605aS, Unit> {
    public final /* synthetic */ InterfaceC497601wk LL;
    public final /* synthetic */ C05P0<C0ZDN> LLILLJJLI;
    public final /* synthetic */ C05P0<Float> LLILLL;
    public final /* synthetic */ C05P0<Float> LLILZ;
    public final /* synthetic */ C05P0<C09AE> LLILZIL;
    public final /* synthetic */ C05P0<Boolean> LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05BU(InterfaceC497601wk interfaceC497601wk, C05P0<C0ZDN> c05p0, C05P0<Float> c05p02, C05P0<Float> c05p03, C05P0<C09AE> c05p04, C05P0<Boolean> c05p05, C05P0<Boolean> c05p06) {
        super(1);
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
        this.LLILZ = c05p03;
        this.LLILZIL = c05p04;
        this.LLILZLL = c05p05;
        this.LLIZ = c05p06;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1378605aS c1378605aS) {
        this.LLILLJJLI.getValue().LIZ(0);
        this.LLILZ.setValue(Float.valueOf(this.LLILLL.getValue().floatValue()));
        C09AE value = this.LLILZIL.getValue();
        if (value != null) {
            value.LIZIZ(null);
        }
        this.LLILZIL.setValue(C23250099c.LIZLLL(this.LL, null, null, new C05AL(this.LLILZLL, this.LLIZ, null), 3));
        return Unit.LIZ;
    }
}
