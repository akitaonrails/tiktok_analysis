package X;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import com.lynx.tasm.behavior.ui.LynxUI;

/* JADX INFO: renamed from: X.0kFR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1312070kFR extends AbstractC1312060kFQ {
    public abstract boolean LIZLLL();

    @Override // X.AbstractC1312060kFQ
    public final Animation LIZIZ(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f) {
        float f2;
        float f3;
        float f4;
        final float f5;
        final T t = lynxUI.mView;
        int i17 = this.LIZ.LLILZ;
        float f6 = 1.0f;
        final float f7 = 0.0f;
        if (i17 != 2) {
            if (i17 != 4) {
                if (i17 != 8) {
                    if (LIZLLL()) {
                        f5 = f;
                    } else {
                        f5 = 0.0f;
                    }
                    if (!LIZLLL()) {
                        f7 = f;
                    }
                    return new Animation(f5, f7, t) { // from class: X.0kFU
                        public final View LL;
                        public final float LLILLJJLI;
                        public final float LLILLL;

                        @Override // android.view.animation.Animation
                        public final boolean willChangeBounds() {
                            return false;
                        }

                        @Override // android.view.animation.Animation
                        public final void applyTransformation(float f8, Transformation transformation) {
                            C786410Ut5.T4(this.LL, this.LLILLJJLI + (this.LLILLL * f8));
                        }

                        {
                            this.LL = t;
                            this.LLILLJJLI = f5;
                            this.LLILLL = f7 - f5;
                        }
                    };
                }
                if (LIZLLL()) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                if (LIZLLL()) {
                    f6 = 0.0f;
                }
                return new ScaleAnimation(f4, f6, f4, f6, 1, 0.5f, 1, 0.5f);
            }
            if (LIZLLL()) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            if (LIZLLL()) {
                f6 = 0.0f;
            }
            return new ScaleAnimation(1.0f, 1.0f, f3, f6, 1, 0.0f, 1, 0.5f);
        }
        if (LIZLLL()) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (LIZLLL()) {
            f6 = 0.0f;
        }
        return new ScaleAnimation(f2, f6, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
    }
}
