package X;

import android.os.Looper;

/* JADX INFO: renamed from: X.0Wjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C831500Wjc {
    public InterfaceC831720Wjy LIZ;
    public Looper LIZIZ;

    public final C831490Wjb LIZ() {
        if (this.LIZ == null) {
            this.LIZ = new C831630Wjp();
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = Looper.getMainLooper();
        }
        return new C831490Wjb(this.LIZ, this.LIZIZ);
    }
}
