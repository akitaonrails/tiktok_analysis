package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: X.0Wq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835530Wq7<TResult> {
    public final Object LIZ = new Object();
    public Queue<InterfaceC835690WqN<TResult>> LIZIZ;
    public boolean LIZJ;

    public final void LIZ(AbstractC835450Wpz<TResult> abstractC835450Wpz) {
        InterfaceC835690WqN interfaceC835690WqN;
        synchronized (this.LIZ) {
            try {
                if (this.LIZIZ != null && !this.LIZJ) {
                    this.LIZJ = true;
                    while (true) {
                        synchronized (this.LIZ) {
                            try {
                                interfaceC835690WqN = (InterfaceC835690WqN) ((ArrayDeque) this.LIZIZ).poll();
                                if (interfaceC835690WqN == null) {
                                    this.LIZJ = false;
                                    return;
                                }
                            } finally {
                            }
                        }
                        interfaceC835690WqN.LIZ(abstractC835450Wpz);
                    }
                }
            } finally {
            }
        }
    }

    public final void LIZIZ(InterfaceC835690WqN<TResult> interfaceC835690WqN) {
        synchronized (this.LIZ) {
            try {
                if (this.LIZIZ == null) {
                    this.LIZIZ = new ArrayDeque();
                }
                ((ArrayDeque) this.LIZIZ).add(interfaceC835690WqN);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
