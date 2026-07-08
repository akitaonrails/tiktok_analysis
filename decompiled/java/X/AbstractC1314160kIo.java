package X;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: X.0kIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1314160kIo extends AbstractC1313960kIU {
    public abstract boolean LIZLLL();

    @Override // X.AbstractC1313960kIU
    public final Animation LIZIZ(AbstractC1313520kHm abstractC1313520kHm, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        final float f8;
        final float f9 = f;
        final T t = abstractC1313520kHm.LLLLLILLIL;
        int i13 = this.LIZ.LLILZ;
        if (i13 != 2) {
            if (i13 != 4) {
                if (i13 != 8) {
                    if (LIZLLL()) {
                        f8 = f9;
                    } else {
                        f8 = 0.0f;
                    }
                    if (LIZLLL()) {
                        f9 = 0.0f;
                    }
                    return new Animation(f8, f9, t) { // from class: X.0kG5
                        public final View LL;
                        public final float LLILLJJLI;
                        public final float LLILLL;

                        @Override // android.view.animation.Animation
                        public final boolean willChangeBounds() {
                            return false;
                        }

                        @Override // android.view.animation.Animation
                        public final void applyTransformation(float f10, Transformation transformation) {
                            C786410Ut5.T4(this.LL, this.LLILLJJLI + (this.LLILLL * f10));
                        }

                        {
                            this.LL = t;
                            this.LLILLJJLI = f8;
                            this.LLILLL = f9 - f8;
                        }
                    };
                }
                if (LIZLLL()) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                if (LIZLLL()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                return new ScaleAnimation(f6, f7, f6, f7, 1, 0.5f, 1, 0.5f);
            }
            if (LIZLLL()) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            if (LIZLLL()) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            return new ScaleAnimation(1.0f, 1.0f, f4, f5, 1, 0.0f, 1, 0.5f);
        }
        if (LIZLLL()) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (LIZLLL()) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        return new ScaleAnimation(f2, f3, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
    }
}
