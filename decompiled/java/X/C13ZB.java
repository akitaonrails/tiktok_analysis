package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C13ZC LL;
    public final /* synthetic */ C13Z8 LLILLJJLI;
    public final /* synthetic */ C13ZD LLILLL;
    public final /* synthetic */ C13Z3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13ZB(C13ZC c13zc, C13Z8 c13z8, C13ZD c13zd, C13Z3 c13z3) {
        super(0);
        this.LL = c13zc;
        this.LLILLJJLI = c13z8;
        this.LLILLL = c13zd;
        this.LLILZ = c13z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C13ZC c13zc = this.LL;
        C13ZH c13zh = c13zc.LJJIL;
        C13Z8 c13z8 = this.LLILLJJLI;
        C13ZD c13zd = this.LLILLL;
        C13Z3 c13z3 = this.LLILZ;
        C13Z8 c13z82 = c13zh.LIZIZ;
        try {
            c13zh.LIZIZ = c13z8;
            C13ZD c13zd2 = c13zc.LJJIJ;
            int[] iArr = c13zc.LJIILJJIL;
            C20029713Yp<C13D2> c20029713Yp = c13zc.LJIJJLI;
            c13zc.LJIILJJIL = null;
            c13zc.LJIJJLI = null;
            try {
                c13zc.LJJIJ = c13zd;
                boolean z = c13zh.LJ;
                try {
                    c13zh.LJ = false;
                    C13ZC.LJJJ(c13zc, c13z3.LIZ, c13z3.LJI, c13z3.LIZIZ);
                    c13zh.LJ = z;
                    c13zc.LJJIJ = c13zd2;
                    c13zc.LJIILJJIL = iArr;
                    c13zc.LJIJJLI = c20029713Yp;
                    c13zh.LIZIZ = c13z82;
                    return Unit.LIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c13zh.LJ = z;
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c13zc.LJJIJ = c13zd2;
                c13zc.LJIILJJIL = iArr;
                c13zc.LJIJJLI = c20029713Yp;
                throw th2;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c13zh.LIZIZ = c13z82;
            throw th3;
        }
    }
}
