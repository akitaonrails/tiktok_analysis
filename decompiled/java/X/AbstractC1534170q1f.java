package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1534170q1f {
    public static final /* synthetic */ int LJFF = 0;
    public final AbstractC1533800q14 LIZ;
    public final int LIZIZ;
    public volatile boolean LIZJ;
    public volatile int LIZLLL;
    public int LJ;

    public abstract void LIZJ(int i);

    public abstract int LIZLLL(InputStream inputStream, int i);

    public abstract byte[] LJ(int i);

    public String LJII() {
        return "META";
    }

    public abstract boolean LJIIIIZZ(C0VSJ c0vsj, Function1 function1);

    public abstract boolean LJIIIZ();

    public abstract void LJIIJ(int i, byte[] bArr, int i2, int i3, C1534670q2T c1534670q2T);

    public abstract void LJIIJJI();

    public abstract byte[] LJIIL();

    public abstract void LJIILIIL(int i, byte b);

    public abstract void LJIILJJIL(int i, byte[] bArr, int i2, int i3);

    public JSONObject LJI() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("size", this.LJ);
        jSONObject.put("current_ptr", this.LIZLLL);
        jSONObject.put("is_valid", LJIIIZ());
        jSONObject.put("is_cache_flushed", this.LIZJ);
        return jSONObject;
    }

    public final String toString() {
        return LJII();
    }

    public final void LIZIZ(int i) {
        if (i == this.LIZLLL) {
        } else {
            throw new IllegalArgumentException("startPos not match");
        }
    }

    public AbstractC1534170q1f(AbstractC1533800q14 abstractC1533800q14, int i) {
        this.LIZ = abstractC1533800q14;
        this.LIZIZ = i;
    }

    public final void LIZ(int i, int i2) throws JSONException {
        int i3 = this.LJ;
        int i4 = i + i2;
        if (i4 > i3) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("exceeds capacity");
            String str = ((C1534200q1i) this).LJI;
            String message = indexOutOfBoundsException.getMessage();
            if (message == null) {
                message = "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("capacity", i3);
            jSONObject.put("expect", i4);
            C1533880q1C.LIZ(str, "checkCapacity", message, indexOutOfBoundsException, jSONObject);
            throw indexOutOfBoundsException;
        }
    }

    public final boolean LJFF(C0VSJ c0vsj, Function1 function1) {
        Object c098200Yq;
        Object c098200Yq2;
        if (!this.LIZJ) {
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
                boolean zLJIIIIZZ = false;
                if (!LJIIIZ()) {
                    return false;
                }
                synchronized (this) {
                    try {
                        if (!this.LIZJ) {
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
                                if (!LJIIIZ()) {
                                    return false;
                                }
                                try {
                                    zLJIIIIZZ = LJIIIIZZ(c0vsj, function1);
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    C1534250q1n.LIZIZ(LJII(), "flush to file failed", th3);
                                }
                                this.LIZJ = zLJIIIIZZ;
                                return this.LIZJ;
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
}
