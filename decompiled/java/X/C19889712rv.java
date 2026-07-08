package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: renamed from: X.12rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19889712rv implements Closeable {
    public static final InterfaceC19890012ry LLILZ;
    public final InterfaceC19890012ry LL;
    public final Deque<Closeable> LLILLJJLI = new ArrayDeque(4);
    public Throwable LLILLL;

    static {
        InterfaceC19890012ry interfaceC19890012ry;
        try {
            final Method method = Throwable.class.getMethod("addSuppressed", Throwable.class);
            interfaceC19890012ry = new InterfaceC19890012ry(method) { // from class: X.12rw
                public final Method LIZ;

                {
                    this.LIZ = method;
                }

                @Override // X.InterfaceC19890012ry
                public final void LIZ(Closeable closeable, Throwable th, Throwable th2) {
                    if (th == th2) {
                        return;
                    }
                    try {
                        C2204961BRm.a0(this.LIZ, th, new Object[]{th2}, new C0WZX("dzBzEgU1UM3QUBkiSh+JaTG5cGioApIyIKhW", null));
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C19889912rx.LIZ.LIZ(closeable, th, th2);
                    }
                }
            };
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC19890012ry = C19889912rx.LIZ;
        }
        LLILZ = interfaceC19890012ry;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.LLILLL;
        while (!((ArrayDeque) this.LLILLJJLI).isEmpty()) {
            Closeable closeable = (Closeable) ((ArrayDeque) this.LLILLJJLI).removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (th == null) {
                    th = th2;
                } else {
                    this.LL.LIZ(closeable, th, th2);
                }
            }
        }
        if (this.LLILLL != null || th == null) {
            return;
        }
        Object obj = C08KI.LIZ;
        if (IOException.class.isInstance(th)) {
            throw ((Throwable) IOException.class.cast(th));
        }
        C08KI.LIZIZ(th);
        throw new AssertionError(th);
    }

    public C19889712rv(InterfaceC19890012ry interfaceC19890012ry) {
        interfaceC19890012ry.getClass();
        this.LL = interfaceC19890012ry;
    }
}
