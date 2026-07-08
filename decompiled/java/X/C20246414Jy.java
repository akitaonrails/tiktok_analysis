package X;

import android.os.Build;

/* JADX INFO: renamed from: X.14Jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20246414Jy {
    public final C20245914Jt LIZ;

    public final C20246014Ju LIZ() {
        return this.LIZ.LIZIZ();
    }

    public C20246414Jy() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C20246514Jz();
        } else if (i >= 29) {
            this.LIZ = new C20245814Js();
        } else {
            this.LIZ = new C20245714Jr();
        }
    }

    public C20246414Jy(C20246014Ju c20246014Ju) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C20246514Jz(c20246014Ju);
        } else if (i >= 29) {
            this.LIZ = new C20245814Js(c20246014Ju);
        } else {
            this.LIZ = new C20245714Jr(c20246014Ju);
        }
    }
}
