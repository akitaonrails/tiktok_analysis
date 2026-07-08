package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.13TO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TO {
    public final C13TM LIZ;
    public final boolean[] LIZIZ;
    public boolean LIZJ;
    public final /* synthetic */ C13TL LIZLLL;

    public final File LIZ() {
        File file;
        synchronized (this.LIZLLL) {
            try {
                C13TM c13tm = this.LIZ;
                if (c13tm.LJFF != this) {
                    throw new IllegalStateException();
                }
                if (!c13tm.LJ) {
                    this.LIZIZ[0] = true;
                }
                file = c13tm.LIZLLL[0];
                if (!this.LIZLLL.LL.exists()) {
                    this.LIZLLL.LL.mkdirs();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return file;
    }

    public C13TO(C13TL c13tl, C13TM c13tm) {
        boolean[] zArr;
        this.LIZLLL = c13tl;
        this.LIZ = c13tm;
        if (c13tm.LJ) {
            zArr = null;
        } else {
            zArr = new boolean[c13tl.LLIZ];
        }
        this.LIZIZ = zArr;
    }
}
