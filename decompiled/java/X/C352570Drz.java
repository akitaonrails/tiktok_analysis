package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.0Drz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352570Drz {
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC352560Dry LIZJ;
    public final VEEditor LIZLLL;
    public boolean LJ = false;

    public final void LIZ() {
        VEEditor vEEditor;
        if (this.LJ || (vEEditor = this.LIZLLL) == null) {
            return;
        }
        synchronized (vEEditor) {
            try {
                if (!this.LJ) {
                    this.LIZLLL.LJIILIIL();
                    InterfaceC352560Dry interfaceC352560Dry = this.LIZJ;
                    if (interfaceC352560Dry != null) {
                        interfaceC352560Dry.LIZIZ(this.LIZ, this.LIZIZ);
                    }
                    this.LJ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C352570Drz(String str, String str2, InterfaceC352560Dry interfaceC352560Dry, VEEditor vEEditor) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC352560Dry;
        this.LIZLLL = vEEditor;
    }
}
