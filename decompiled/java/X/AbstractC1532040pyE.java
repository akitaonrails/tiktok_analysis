package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1532040pyE {
    public static final C1532060pyG LJI = new C1532060pyG();
    public final File LIZ;
    public final int LIZIZ;
    public boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile int LJ;
    public int LJFF;

    public abstract void LIZJ(int i);

    public abstract int LIZLLL(InputStream inputStream, int i);

    public abstract void LJ(int i, byte[] bArr, int i2, int i3);

    public abstract byte[] LJFF(int i);

    public String LJII() {
        return "META";
    }

    public abstract boolean LJIIIIZZ(C0VSJ c0vsj, Function1 function1);

    public abstract void LJIIIZ(int i, byte[] bArr, int i2, int i3, C1532070pyH c1532070pyH);

    public abstract byte[] LJIIJ();

    public abstract void LJIIJJI();

    public abstract void LJIIL(int i, byte b);

    public final String toString() {
        return LJII();
    }

    public final void LIZIZ(int i) {
        if (i == this.LJ) {
        } else {
            throw new IllegalArgumentException("startPos not match");
        }
    }

    public final void LIZ(int i, int i2) {
        if (i + i2 > this.LJFF) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("exceeds capacity");
            C1532920pze c1532920pze = C1532920pze.LIZJ;
            String str = ((C1532050pyF) this).LJII;
            String message = indexOutOfBoundsException.getMessage();
            if (message == null) {
                message = "";
            }
            C1532760pzO.LIZJ(c1532920pze, str, "checkCapacity", message, indexOutOfBoundsException, null, 32);
            throw indexOutOfBoundsException;
        }
    }

    public final boolean LJI(C0VSJ c0vsj, Function1 function1) {
        Object c098200Yq;
        Object c098200Yq2;
        boolean zLJIIIIZZ;
        if (!this.LIZLLL) {
            try {
                c098200Yq = Boolean.valueOf(c0vsj.isFile());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (!Intrinsics.LJFF(c098200Yq, Boolean.TRUE)) {
                synchronized (this) {
                    try {
                        if (!this.LIZLLL) {
                            try {
                                c098200Yq2 = Boolean.valueOf(c0vsj.isFile());
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq2 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                                obj = c098200Yq2;
                            }
                            if (!Intrinsics.LJFF(obj, Boolean.TRUE)) {
                                try {
                                    zLJIIIIZZ = LJIIIIZZ(c0vsj, function1);
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    C1532920pze.LIZJ.LIZIZ(LJII(), "flushToFile", "flush to file failed");
                                    zLJIIIIZZ = false;
                                }
                                this.LIZLLL = zLJIIIIZZ;
                                return this.LIZLLL;
                            }
                        }
                        return true;
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        throw th4;
                    }
                }
            }
        }
        return true;
    }

    public AbstractC1532040pyE(File file, int i, boolean z) {
        boolean z2;
        this.LIZ = file;
        this.LIZIZ = i;
        this.LIZJ = z;
        if (file != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZLLL = z2;
    }
}
