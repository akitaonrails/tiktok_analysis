package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0L9R, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9R implements Serializable {
    public static final int $stable = 0;
    public final int height;
    public final int max;
    public final int min;
    public final float scale;
    public final int width;

    public final C0L9R scaleMax(int i) {
        int i2 = (int) (i / this.scale);
        if (this.width > this.height) {
            return new C0L9R(i, i2);
        }
        return new C0L9R(i2, i);
    }

    public final C0L9R scaleMin(int i) {
        int i2 = (int) (i * this.scale);
        if (this.width > this.height) {
            return new C0L9R(i2, i);
        }
        return new C0L9R(i, i2);
    }

    public C0L9R(int i, int i2) {
        this.width = i;
        this.height = i2;
        int iMax = Math.max(i, i2);
        this.max = iMax;
        int iMin = Math.min(i, i2);
        this.min = iMin;
        this.scale = iMax / iMin;
    }

    public final boolean isLargeOrEqualThan(C0L9R c0l9r, C0L9P c0l9p) {
        int i = C0L9Q.LIZ[c0l9p.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.max < c0l9r.max && this.min < c0l9r.min) {
                    return false;
                }
            } else {
                throw new C1954807lC();
            }
        } else if (this.max < c0l9r.max || this.min < c0l9r.min) {
            return false;
        }
        return true;
    }

    public final C0L9R scaleTo(C0L9R c0l9r, C0L9S c0l9s) {
        if (C0L9Q.LIZIZ[c0l9s.ordinal()] == 1) {
            int i = this.max;
            int i2 = c0l9r.min;
            int i3 = i * i2;
            int i4 = this.min;
            int i5 = c0l9r.max;
            if (i3 >= i4 * i5) {
                return scaleMax(i5);
            }
            return scaleMin(i2);
        }
        throw new C1954807lC();
    }
}
