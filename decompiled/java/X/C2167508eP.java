package X;

import android.os.StrictMode;
import android.os.Trace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.soloader.Api18TraceUtils;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08eP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2167508eP extends AbstractC2167908eT {
    public final File LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;

    @Override // X.AbstractC2167908eT
    public final String toString() {
        String name;
        try {
            name = String.valueOf(this.LIZ.getCanonicalPath());
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            name = this.LIZ.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.LIZIZ + ']';
    }

    public C2167508eP(C0VSJ c0vsj, int i) {
        this(c0vsj, i, new String[0]);
    }

    public C2167508eP(C0VSJ c0vsj, int i, String[] strArr) {
        this.LIZ = c0vsj;
        this.LIZIZ = i;
        this.LIZJ = Arrays.asList(strArr);
    }

    @Override // X.AbstractC2167908eT
    public int LIZ(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return LIZLLL(str, i, threadPolicy);
    }

    public final int LIZLLL(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        if (C2167708eR.LIZIZ != null) {
            boolean z = false;
            if (this.LIZJ.contains(str)) {
                return 0;
            }
            C0VSJ c0vsj = new C0VSJ(this.LIZ, str);
            C2222808nK c2222808nK = null;
            if (!c0vsj.exists()) {
                return 0;
            }
            if ((i & 1) != 0 && (this.LIZIZ & 2) != 0) {
                return 2;
            }
            if ((this.LIZIZ & 1) != 0) {
                z = true;
            }
            boolean zEquals = c0vsj.getName().equals(str);
            try {
                if (z || !zEquals) {
                    try {
                        C2222808nK c2222808nK2 = new C2222808nK(c0vsj);
                        c2222808nK = c2222808nK2;
                        if (z) {
                            LIZJ(str, c2222808nK2, i, threadPolicy);
                        }
                        if (!zEquals) {
                            InterfaceC2167308eN interfaceC2167308eN = C2167708eR.LIZIZ;
                            c0vsj.getAbsolutePath();
                            ((C2167208eM) interfaceC2167308eN).getClass();
                            throw new UnsupportedOperationException();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (0 != 0) {
                            c2222808nK.close();
                        }
                        throw th;
                    }
                }
                ((C2167208eM) C2167708eR.LIZIZ).LIZ(i, c0vsj.getAbsolutePath());
                if (c2222808nK != null) {
                    c2222808nK.close();
                }
                return 1;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                if (e.getMessage().contains("bad ELF magic")) {
                    if (0 != 0) {
                        c2222808nK.close();
                        return 3;
                    }
                    return 3;
                }
                throw e;
            }
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    public static void LIZJ(String str, C2222808nK c2222808nK, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z = C2167708eR.LIZ;
        if (z) {
            Api18TraceUtils.LIZ("SoLoader.getElfDependencies[", str, e3.f);
        }
        try {
            String[] strArrLIZ = C2222708nJ.LIZ(c2222808nK);
            if (z) {
                Trace.endSection();
            }
            for (String str2 : strArrLIZ) {
                if (!str2.startsWith("/")) {
                    C2167708eR.LJIIIZ(str2, null, i | 1, threadPolicy);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C2167708eR.LIZ) {
                Trace.endSection();
            }
            throw th;
        }
    }
}
