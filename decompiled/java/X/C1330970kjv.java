package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kjv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330970kjv {
    public boolean LIZIZ;
    public ColorFilter LIZJ;
    public int LIZ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;

    public final void LIZ(Drawable drawable) {
        boolean z;
        if (drawable == null) {
            return;
        }
        int i = this.LIZ;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.LIZIZ) {
            drawable.setColorFilter(this.LIZJ);
        }
        int i2 = this.LIZLLL;
        boolean z2 = true;
        if (i2 != -1) {
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setDither(z);
        }
        int i3 = this.LJ;
        if (i3 != -1) {
            if (i3 == 0) {
                z2 = false;
            }
            drawable.setFilterBitmap(z2);
        }
    }
}
