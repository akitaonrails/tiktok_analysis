package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.0Ds4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352620Ds4 {
    public final InterfaceC352610Ds3 LIZ;
    public final VEEditor LIZIZ;
    public boolean LIZJ = false;

    public final void LIZ() {
        VEEditor vEEditor;
        if (this.LIZJ || (vEEditor = this.LIZIZ) == null) {
            return;
        }
        synchronized (vEEditor) {
            try {
                if (!this.LIZJ) {
                    this.LIZIZ.LJIILIIL();
                    InterfaceC352610Ds3 interfaceC352610Ds3 = this.LIZ;
                    if (interfaceC352610Ds3 != null) {
                        interfaceC352610Ds3.onCancel();
                    }
                    this.LIZJ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C352620Ds4(String str, String str2, InterfaceC352610Ds3 interfaceC352610Ds3, VEEditor vEEditor) {
        this.LIZ = interfaceC352610Ds3;
        this.LIZIZ = vEEditor;
    }
}
