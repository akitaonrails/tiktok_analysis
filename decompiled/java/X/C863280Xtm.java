package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Xtm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.retry.LoopingNetworkRequestRetryScheduler$moveToNextInQueue$2", f = "NetworkRequestRetryScheduler.kt", l = {613}, m = "invokeSuspend")
public final class C863280Xtm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C1DEV LL;
    public C863980Xuu LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C863980Xuu LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863280Xtm(C863980Xuu c863980Xuu, String str, InterfaceC1364105Vn<? super C863280Xtm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c863980Xuu;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863280Xtm(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C863980Xuu c863980Xuu;
        C1DEV c1dev;
        String str;
        C1C7U.LIZ("LoopingNetworkRequestRetryScheduler@4605.moveToNextInQueue$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LLILLL;
                c863980Xuu = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c863980Xuu = this.LLILZIL;
            c1dev = c863980Xuu.LJII;
            str = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = c863980Xuu;
            this.LLILLL = str;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.moveToNextInQueue$2");
                return objLJFF;
            }
        }
        try {
            if (c863980Xuu.LJIIIZ.contains(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Request ");
                sbLIZ.append(str);
                sbLIZ.append(" is already processing");
                c863980Xuu.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.moveToNextInQueue$2");
                return false;
            }
            c1dev.LIZIZ(null);
            C864100Xv6 c864100Xv6LIZLLL = this.LLILZIL.LIZIZ.LIZLLL();
            if (c864100Xv6LIZLLL == null) {
                C863980Xuu c863980Xuu2 = this.LLILZIL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("No current request in queue, ");
                sbLIZ2.append(this.LLILZLL);
                sbLIZ2.append(" does not exist");
                c863980Xuu2.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.moveToNextInQueue$2");
                return false;
            }
            if (Intrinsics.LJFF(c864100Xv6LIZLLL.LIZ, this.LLILZLL)) {
                C863980Xuu c863980Xuu3 = this.LLILZIL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Request ");
                sbLIZ3.append(this.LLILZLL);
                sbLIZ3.append(" is already at the head of the queue");
                c863980Xuu3.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
                C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.moveToNextInQueue$2");
                return true;
            }
            long j = c864100Xv6LIZLLL.LJ + 1;
            boolean zLIZJ = this.LLILZIL.LIZIZ.LIZJ(j, this.LLILZLL);
            if (zLIZJ) {
                C863980Xuu c863980Xuu4 = this.LLILZIL;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Successfully moved request to next position in queue: ");
                sbLIZ4.append(this.LLILZLL);
                sbLIZ4.append(" (insertion_time: ");
                sbLIZ4.append(j);
                sbLIZ4.append(')');
                c863980Xuu4.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ4));
            } else {
                C863980Xuu c863980Xuu5 = this.LLILZIL;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Failed to move request to next position in queue: ");
                sbLIZ5.append(this.LLILZLL);
                c863980Xuu5.LIZ.LIZLLL().LJIIIIZZ("NetworkRequestRetryScheduler", C2188811AlT.LIZIZ(sbLIZ5), null);
            }
            Boolean boolValueOf = Boolean.valueOf(zLIZJ);
            C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.moveToNextInQueue$2");
            return boolValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
