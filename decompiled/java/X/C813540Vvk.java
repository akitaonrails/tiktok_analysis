package X;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: X.0Vvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813540Vvk {
    public final Bundle LIZ;
    public IconCompat LIZIZ;
    public final C813560Vvm[] LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final boolean LJI;
    public final int LJII;
    public final CharSequence LJIIIIZZ;
    public final PendingIntent LJIIIZ;
    public final boolean LJIIJ;

    public final IconCompat LIZ() {
        int i;
        if (this.LIZIZ == null && (i = this.LJII) != 0) {
            this.LIZIZ = IconCompat.LJFF(null, "", i);
        }
        return this.LIZIZ;
    }

    public C813540Vvk(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C813560Vvm[] c813560VvmArr, C813560Vvm[] c813560VvmArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.LJ = true;
        this.LIZIZ = iconCompat;
        if (iconCompat != null) {
            int i2 = iconCompat.LIZ;
            if ((i2 == -1 ? C815270VyX.LIZJ(iconCompat.LIZIZ) : i2) == 2) {
                this.LJII = iconCompat.LJI();
            }
        }
        this.LJIIIIZZ = C813610Vvr.LIZJ(charSequence);
        this.LJIIIZ = pendingIntent;
        this.LIZ = bundle == null ? new Bundle() : bundle;
        this.LIZJ = c813560VvmArr;
        this.LIZLLL = z;
        this.LJFF = i;
        this.LJ = z2;
        this.LJI = z3;
        this.LJIIJ = z4;
    }
}
