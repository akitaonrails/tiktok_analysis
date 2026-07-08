package X;

import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Mw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584420Mw4 {
    public static volatile C584420Mw4 LIZJ;
    public final List<Integer> LIZ = new CopyOnWriteArrayList();
    public final AtomicBoolean LIZIZ;

    public static C584420Mw4 LIZ() {
        if (LIZJ == null) {
            synchronized (C584420Mw4.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C584420Mw4();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public C584420Mw4() {
        new CopyOnWriteArrayList();
        this.LIZIZ = new AtomicBoolean(false);
    }

    public final void LIZIZ(int i) {
        if (this.LIZIZ.get()) {
            return;
        }
        synchronized (C584420Mw4.class) {
            try {
                if (((CopyOnWriteArrayList) this.LIZ).contains(Integer.valueOf(i))) {
                    JatoXL.resetPriority(i);
                    CpusetManager.resetCoreBind(i);
                    ((CopyOnWriteArrayList) this.LIZ).remove(Integer.valueOf(i));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
