package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Wth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837750Wth extends C09AY implements Function1<C838040WuA, Object> {
    public final /* synthetic */ Function1<C838040WuA, Object> LL;
    public final /* synthetic */ C825940Wae LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C837750Wth(C825940Wae c825940Wae, Function1 function1) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = c825940Wae;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(C838040WuA c838040WuA) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        C838040WuA c838040WuA2 = c838040WuA;
        try {
            C837730Wtf.LIZ.LIZ(this.LLILLJJLI, c838040WuA2);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        try {
            Object objInvoke = this.LL.invoke(c838040WuA2);
            try {
                C837730Wtf.LIZ.LIZIZ(this.LLILLJJLI, c838040WuA2);
                c098200Yq3 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq3 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq3);
            return objInvoke;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            try {
                C837730Wtf.LIZ.LIZIZ(this.LLILLJJLI, c838040WuA2);
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq2 = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            throw th3;
        }
    }
}
