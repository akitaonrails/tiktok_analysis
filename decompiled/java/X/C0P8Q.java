package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0P8Q, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P8Q implements C0P8K {
    public final Drawable LIZ;

    public final boolean equals(Object obj) {
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.LIZ;
        if (drawable == null) {
            return 0;
        }
        return drawable.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowTop1Background(background=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0P8Q(Drawable drawable) {
        this.LIZ = drawable;
    }
}
