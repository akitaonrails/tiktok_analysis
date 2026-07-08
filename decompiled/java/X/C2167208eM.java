package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.08eM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2167208eM implements InterfaceC2167308eN {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Runtime LIZLLL;
    public final /* synthetic */ Method LJ;

    public final void LIZ(int i, String str) {
        String str2;
        if (this.LIZ) {
            if ((i & 4) == 4) {
                str2 = this.LIZIZ;
            } else {
                str2 = this.LIZJ;
            }
            try {
                try {
                    synchronized (this.LIZLLL) {
                        try {
                            String str3 = (String) C2204961BRm.a0(this.LJ, this.LIZLLL, new Object[]{str, C2167708eR.class.getClassLoader(), str2}, new C0WZX("dzBzEgQ7XM/eWlgqCwGLamAnp/cegmU4SakIDPKp", new String[]{"019e5"}));
                            if (str3 != null) {
                                throw new UnsatisfiedLinkError(str3);
                            }
                        } finally {
                        }
                    }
                    return;
                } finally {
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException("Error: Cannot load " + str, e);
            }
        }
        System.load(str);
    }

    public C2167208eM(boolean z, String str, String str2, Runtime runtime, Method method) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = runtime;
        this.LJ = method;
    }
}
