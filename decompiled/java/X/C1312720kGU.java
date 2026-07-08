package X;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0kGU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312720kGU {
    public final RectF LIZ;
    public final float[] LIZIZ;
    public final boolean LIZJ;

    public final Rect LIZ() {
        RectF rectF = this.LIZ;
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1312720kGU)) {
            return false;
        }
        C1312720kGU c1312720kGU = (C1312720kGU) obj;
        RectF rectF = this.LIZ;
        if (rectF != null) {
            if (this.LIZIZ != null && this.LIZJ && c1312720kGU.LIZJ) {
                if (rectF.equals(c1312720kGU.LIZ) && Arrays.equals(this.LIZIZ, c1312720kGU.LIZIZ)) {
                    return true;
                }
                return false;
            }
            RectF rectF2 = c1312720kGU.LIZ;
            if (rectF2 != null && !this.LIZJ && !c1312720kGU.LIZJ) {
                return rectF.equals(rectF2);
            }
            return false;
        }
        if (c1312720kGU.LIZ == null && this.LIZJ && c1312720kGU.LIZJ) {
            return Arrays.equals(this.LIZIZ, c1312720kGU.LIZIZ);
        }
        if (c1312720kGU.LIZ == null && !this.LIZJ && !c1312720kGU.LIZJ) {
            return true;
        }
        return false;
    }

    public C1312720kGU(RectF rectF, float[] fArr) {
        this.LIZ = rectF;
        this.LIZIZ = fArr;
        boolean z = false;
        if (fArr != null && fArr.length == 8) {
            int length = fArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (fArr[i] > 0.0f) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.LIZJ = z;
    }
}
