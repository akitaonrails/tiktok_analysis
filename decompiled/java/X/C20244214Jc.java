package X;

import android.os.Build;

/* JADX INFO: renamed from: X.14Jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20244214Jc {
    public final C20245214Jm LIZ;

    public C20244214Jc() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C20244314Jd();
        } else if (i >= 29) {
            this.LIZ = new C20244414Je();
        } else {
            this.LIZ = new C20244114Jb();
        }
    }

    public C20244214Jc(C20244614Jg c20244614Jg) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C20244314Jd(c20244614Jg);
        } else if (i >= 29) {
            this.LIZ = new C20244414Je(c20244614Jg);
        } else {
            this.LIZ = new C20244114Jb(c20244614Jg);
        }
    }
}
