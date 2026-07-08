package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11G1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11G1 {
    public final Drawable LIZ;
    public final int LIZIZ = R.raw.icon_link;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final int hashCode() {
        return (((((this.LIZIZ * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11G1)) {
            return false;
        }
        C11G1 c11g1 = (C11G1) obj;
        if (this.LIZIZ == c11g1.LIZIZ && this.LIZJ == c11g1.LIZJ && this.LIZLLL == c11g1.LIZLLL && this.LJ == c11g1.LJ) {
            return true;
        }
        return false;
    }

    public C11G1(TuxIconDrawable tuxIconDrawable, int i, int i2, int i3) {
        this.LIZ = tuxIconDrawable;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
