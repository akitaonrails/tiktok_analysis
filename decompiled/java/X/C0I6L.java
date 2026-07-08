package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0I6L, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I6L implements C0I6N {
    public final float LIZ = 0.5f;
    public final int LIZIZ = R.attr.a02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I6L)) {
            return false;
        }
        C0I6L c0i6l = (C0I6L) obj;
        return Float.compare(this.LIZ, c0i6l.LIZ) == 0 && this.LIZIZ == c0i6l.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Stroke(widthDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", colorAttr=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ;
    }
}
