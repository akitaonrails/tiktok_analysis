package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0onY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486980onY {
    public final Drawable LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1486980onY)) {
            return false;
        }
        C1486980onY c1486980onY = (C1486980onY) obj;
        return Intrinsics.LJFF(this.LIZ, c1486980onY.LIZ) && this.LIZIZ == c1486980onY.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusImage(drawable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1486980onY(Drawable drawable, int i) {
        this.LIZ = drawable;
        this.LIZIZ = i;
    }
}
