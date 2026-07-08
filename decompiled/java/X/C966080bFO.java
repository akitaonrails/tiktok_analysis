package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966080bFO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C966020bFI LLILLJJLI;
    public final /* synthetic */ C966100bFQ<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966080bFO(Function0<Unit> function0, C966020bFI c966020bFI, C966100bFQ<Object> c966100bFQ) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = c966020bFI;
        this.LLILLL = c966100bFQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        C966020bFI c966020bFI = this.LLILLJJLI;
        C966100bFQ<Object> c966100bFQ = this.LLILLL;
        try {
            c966020bFI.LJJIIZI.remove(c966100bFQ);
            C189200o6.m2constructorimpl(Boolean.valueOf(c966020bFI.LJJIJ.LIZJ(c966100bFQ)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
