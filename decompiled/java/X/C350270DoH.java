package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350270DoH {
    public final Bitmap LIZ;
    public final float LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C350270DoH)) {
            return false;
        }
        C350270DoH c350270DoH = (C350270DoH) obj;
        return Intrinsics.LJFF(this.LIZ, c350270DoH.LIZ) && Float.compare(this.LIZIZ, c350270DoH.LIZIZ) == 0 && Float.compare(this.LIZJ, c350270DoH.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryCard(bitmap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cardCenterX=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cardCenterY=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C350270DoH(Bitmap bitmap, float f, float f2) {
        this.LIZ = bitmap;
        this.LIZIZ = f;
        this.LIZJ = f2;
    }
}
