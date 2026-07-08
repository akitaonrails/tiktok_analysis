package X;

import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1D5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250291D5v extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2250281D5u LL;
    public final /* synthetic */ C2250331D5z LLILLJJLI;
    public final /* synthetic */ C2250321D5y LLILLL;
    public final /* synthetic */ InterfaceC2250311D5x LLILZ;
    public final /* synthetic */ C13IQ<? extends InterfaceC2250311D5x> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250291D5v(C2250281D5u c2250281D5u, C2250331D5z c2250331D5z, C2250321D5y c2250321D5y, InterfaceC2250311D5x interfaceC2250311D5x, C13IQ<? extends InterfaceC2250311D5x> c13iq) {
        super(0);
        this.LL = c2250281D5u;
        this.LLILLJJLI = c2250331D5z;
        this.LLILLL = c2250321D5y;
        this.LLILZ = interfaceC2250311D5x;
        this.LLILZIL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2250281D5u c2250281D5u = this.LL;
        C2250331D5z c2250331D5z = this.LLILLJJLI;
        c2250281D5u.getClass();
        C1D66 c1d66 = c2250281D5u.LIZ;
        C1D63 c1d63 = new C1D63(c2250331D5z, c1d66.LIZ, c1d66.LJFF, new AwS614S0100000_35(c2250281D5u, 147));
        this.LLILLL.LJ = C1D3K.EXECUTING_IMMEDIATE;
        this.LLILLL.LIZIZ.put(this.LLILLJJLI.LIZ, this.LLILZ.executeImmediate(c1d63));
        this.LLILLL.LIZJ = true;
        C2250281D5u c2250281D5u2 = this.LL;
        InterfaceC2250311D5x interfaceC2250311D5x = this.LLILZ;
        c2250281D5u2.getClass();
        if ((!interfaceC2250311D5x.getDependencies().isEmpty()) && this.LL.LIZIZ(this.LLILZIL)) {
            this.LL.LIZLLL(this.LLILZIL);
        } else {
            C2250281D5u c2250281D5u3 = this.LL;
            InterfaceC2250311D5x interfaceC2250311D5x2 = this.LLILZ;
            c2250281D5u3.getClass();
            if (!interfaceC2250311D5x2.getDependencies().isEmpty()) {
                this.LLILLL.LJ = C1D3K.WAITING_DEPENDENCIES;
            } else {
                this.LLILLL.LJ = C1D3K.COMPLETED;
                CountDownLatch countDownLatch = (CountDownLatch) ((LinkedHashMap) this.LL.LJFF).get(this.LLILLJJLI.LIZ);
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        }
        this.LL.LIZJ();
        return Unit.LIZ;
    }
}
