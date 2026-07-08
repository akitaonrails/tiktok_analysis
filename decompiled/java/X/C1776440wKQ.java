package X;

import android.graphics.drawable.GradientDrawable;

/* JADX INFO: renamed from: X.0wKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776440wKQ extends AbstractC1776430wKP {
    public final int LL;
    public final int LLILLJJLI;
    public final GradientDrawable.Orientation LLILLL;

    public final C1776440wKQ copy(int i, int i2, GradientDrawable.Orientation orientation) {
        return new C1776440wKQ(i, i2, orientation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776440wKQ)) {
            return false;
        }
        C1776440wKQ c1776440wKQ = (C1776440wKQ) obj;
        return this.LL == c1776440wKQ.LL && this.LLILLJJLI == c1776440wKQ.LLILLJJLI && this.LLILLL == c1776440wKQ.LLILLL;
    }

    public int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Gradient(startColor=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", endColor=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", orientation=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getEndColor() {
        return this.LLILLJJLI;
    }

    public final GradientDrawable.Orientation getOrientation() {
        return this.LLILLL;
    }

    public final int getStartColor() {
        return this.LL;
    }

    public C1776440wKQ(int i, int i2, GradientDrawable.Orientation orientation) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = orientation;
    }
}
