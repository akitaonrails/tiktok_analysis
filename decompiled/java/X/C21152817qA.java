package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.17qA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21152817qA {
    public final Executor LIZ;
    public final Function0<Unit> LIZIZ;
    public boolean LIZLLL;
    public final Object LIZJ = new Object();
    public final List<Function0<Unit>> LJ = new ArrayList();

    public final void LIZ() {
        synchronized (this.LIZJ) {
            try {
                this.LIZLLL = true;
                Iterator<Function0<Unit>> it2 = this.LJ.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke();
                }
                ((ArrayList) this.LJ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C21152817qA(InterfaceExecutorC21352518hH interfaceExecutorC21352518hH, AwS576S0100000_32 awS576S0100000_32) {
        this.LIZ = interfaceExecutorC21352518hH;
        this.LIZIZ = awS576S0100000_32;
    }
}
