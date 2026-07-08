package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0dJZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045550dJZ {
    public static final C1045550dJZ LJ = new C1045550dJZ();
    public WeakReference<Context> LIZ;
    public C854540Xfg LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public final void LIZ(boolean z) {
        if (this.LIZLLL != z) {
            this.LIZLLL = z;
            if (this.LIZJ) {
                if (z) {
                    C1046040dKM.LJ.LIZIZ();
                } else {
                    C1046040dKM.LJ.LIZ();
                }
            }
        }
    }
}
