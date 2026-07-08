package X;

import android.graphics.Rect;
import android.view.animation.Animation;

/* JADX INFO: renamed from: X.0kIU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1313960kIU {
    public final C1313710kI5 LIZ = new C1313710kI5();

    public abstract Animation LIZIZ(AbstractC1313520kHm abstractC1313520kHm, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect, float f);

    public final boolean LIZJ() {
        C1313710kI5 c1313710kI5 = this.LIZ;
        return c1313710kI5 != null && c1313710kI5.LLILLJJLI > 0;
    }

    public final Animation LIZ(AbstractC1313520kHm abstractC1313520kHm, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect, float f) {
        if (!LIZJ()) {
            return null;
        }
        Animation animationLIZIZ = LIZIZ(abstractC1313520kHm, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, rect, f);
        if (animationLIZIZ != null) {
            animationLIZIZ.setDuration(this.LIZ.LLILLJJLI);
            animationLIZIZ.setStartOffset(this.LIZ.LLILLL);
            animationLIZIZ.setInterpolator(C1313730kI7.LIZ(this.LIZ));
        }
        return animationLIZIZ;
    }
}
