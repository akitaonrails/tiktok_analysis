package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05V4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05V4 extends C09AY implements Function1<C1378605aS, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C05P0<Long> LLILZIL;
    public final /* synthetic */ C05P0<C09AE> LLILZLL;
    public final /* synthetic */ C05P0<Integer> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05V4(boolean z, long j, InterfaceC497601wk interfaceC497601wk, Function0<Unit> function0, C05P0<Long> c05p0, C05P0<C09AE> c05p02, C05P0<Integer> c05p03) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = function0;
        this.LLILZIL = c05p0;
        this.LLILZLL = c05p02;
        this.LLIZ = c05p03;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1378605aS c1378605aS) {
        boolean z = true;
        if (this.LL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C05P0<Long> c05p0 = this.LLILZIL;
            float f = C1675710thx.LIZ;
            if (jCurrentTimeMillis - c05p0.getValue().longValue() > this.LLILLJJLI) {
                z = false;
            }
            this.LLILZIL.setValue(Long.valueOf(jCurrentTimeMillis));
            C09AE value = this.LLILZLL.getValue();
            AnonymousClass0956 anonymousClass0956LIZLLL = null;
            if (value != null) {
                value.LIZIZ(null);
            }
            C05P0<C09AE> c05p02 = this.LLILZLL;
            if (!z) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LLILLL, null, null, new C316001Kk(this.LLILLJJLI, this.LLILZ, null), 3);
            }
            c05p02.setValue(anonymousClass0956LIZLLL);
        } else {
            C05P0<Integer> c05p03 = this.LLIZ;
            float f2 = C1675710thx.LIZ;
            if (c05p03.getValue().intValue() <= 1) {
                this.LLILZ.invoke();
            }
        }
        return Unit.LIZ;
    }
}
