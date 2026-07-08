package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182011AaV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC2181941AaO LL;
    public final /* synthetic */ CountDownLatch LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2182011AaV(InterfaceC2181941AaO interfaceC2181941AaO, CountDownLatch countDownLatch) {
        super(0);
        this.LL = interfaceC2181941AaO;
        this.LLILLJJLI = countDownLatch;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            this.LL.reset();
            this.LLILLJJLI.countDown();
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.countDown();
            throw th;
        }
    }
}
