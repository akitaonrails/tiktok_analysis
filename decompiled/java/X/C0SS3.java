package X;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SS3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SS3 {
    public final C0SRL LIZ;
    public Boolean LIZIZ;

    public final void LIZ() {
        LIZIZ(-16777216, false);
    }

    public C0SS3(C0SRL c0srl) {
        this.LIZ = c0srl;
    }

    public final void LIZIZ(int i, boolean z) {
        int i2;
        int i3;
        C497270Jen.LIZLLL(i, this.LIZ.LIZIZ);
        C19EG c19eg = this.LIZ.LIZIZ;
        if (c19eg != null && !Intrinsics.LJFF(this.LIZIZ, Boolean.valueOf(z))) {
            if (Build.VERSION.SDK_INT >= 30) {
                new C1A6V(c19eg.getWindow(), c19eg.getWindow().getDecorView()).LIZJ(z);
            } else {
                int systemUiVisibility = c19eg.getWindow().getDecorView().getSystemUiVisibility();
                if (z) {
                    i2 = systemUiVisibility & (-8193);
                } else {
                    i2 = systemUiVisibility | 8192;
                }
                c19eg.getWindow().getDecorView().setSystemUiVisibility(i2);
                if (z) {
                    i3 = i2 | 8192;
                } else {
                    i3 = i2 & (-8193);
                }
                c19eg.getWindow().getDecorView().setSystemUiVisibility(i3);
            }
            this.LIZIZ = Boolean.valueOf(z);
        }
    }
}
