package X;

import android.graphics.Rect;
import android.view.animation.Animation;
import com.lynx.tasm.behavior.ui.LynxUI;

/* JADX INFO: renamed from: X.0kFQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1312060kFQ {
    public final C1313370kHX LIZ = new C1313370kHX();

    public abstract Animation LIZIZ(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f);

    public final boolean LIZJ() {
        C1313370kHX c1313370kHX = this.LIZ;
        return c1313370kHX != null && c1313370kHX.LLILLJJLI > 0;
    }

    public final Animation LIZ(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f) {
        if (!LIZJ()) {
            return null;
        }
        Animation animationLIZIZ = LIZIZ(lynxUI, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect, f);
        if (animationLIZIZ != null) {
            animationLIZIZ.setDuration(this.LIZ.LLILLJJLI);
            animationLIZIZ.setStartOffset(this.LIZ.LLILLL);
            animationLIZIZ.setInterpolator(C1313380kHY.LIZ(this.LIZ));
        }
        return animationLIZIZ;
    }
}
