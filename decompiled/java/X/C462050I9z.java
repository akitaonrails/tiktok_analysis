package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0I9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462050I9z extends FrameLayout {
    public ImageView LL;
    public ImageView LLILLJJLI;
    public ImageView LLILLL;
    public final C01GW LLILZ;

    private final ValueAnimator getRotateAnimation() {
        return (ValueAnimator) this.LLILZ.getValue();
    }

    public final C417620GZc LIZ() {
        C417620GZc c417620GZc = new C417620GZc(getContext(), null);
        c417620GZc.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c417620GZc);
        c417620GZc.setLayoutParams(layoutParams);
        return c417620GZc;
    }

    public final void LIZIZ(C0IA2 c0ia2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C0IA3 c0ia3LIZIZ = c0ia2.LIZIZ();
        if (c0ia3LIZIZ != null) {
            ImageView imageViewLIZ = this.LL;
            if (imageViewLIZ == null) {
                imageViewLIZ = LIZ();
            }
            C786410Ut5.Cb(imageViewLIZ, 0.0f);
            this.LL = imageViewLIZ;
            if (C09RB.LJIILL(new C09RD(this), imageViewLIZ) != 0) {
                ViewParent parent = imageViewLIZ.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(imageViewLIZ, viewGroup3);
                }
                addView(imageViewLIZ);
            }
            imageViewLIZ.setImageBitmap(c0ia3LIZIZ.LIZ());
        }
        C0IA3 c0ia3LIZ = c0ia2.LIZ();
        if (c0ia3LIZ != null) {
            ImageView imageViewLIZ2 = this.LLILLJJLI;
            if (imageViewLIZ2 == null) {
                imageViewLIZ2 = LIZ();
            }
            C786410Ut5.Cb(imageViewLIZ2, 18.0f);
            this.LLILLJJLI = imageViewLIZ2;
            if (C09RB.LJIILL(new C09RD(this), imageViewLIZ2) != 1) {
                ViewParent parent2 = imageViewLIZ2.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(imageViewLIZ2, viewGroup2);
                }
                addView(imageViewLIZ2, 0);
            }
            imageViewLIZ2.setImageBitmap(c0ia3LIZ.LIZ());
        }
        if (c0ia2 instanceof C462040I9y) {
            C0IA3 c0ia3 = ((C462040I9y) c0ia2).LJ;
            if (c0ia3 != null) {
                ImageView imageViewLIZ3 = this.LLILLL;
                if (imageViewLIZ3 == null) {
                    imageViewLIZ3 = LIZ();
                }
                C786410Ut5.Cb(imageViewLIZ3, 18.0f);
                this.LLILLL = imageViewLIZ3;
                if (C09RB.LJIILL(new C09RD(this), imageViewLIZ3) != 2) {
                    ViewParent parent3 = imageViewLIZ3.getParent();
                    if ((parent3 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent3) != null) {
                        C786410Ut5.LJJJLZIJ(imageViewLIZ3, viewGroup);
                    }
                    addView(imageViewLIZ3, 0);
                }
                imageViewLIZ3.setImageBitmap(c0ia3.LIZ());
            }
            View view = this.LL;
            if (view != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
                removeView(view);
            }
            ValueAnimator rotateAnimation = getRotateAnimation();
            if (rotateAnimation != null) {
                rotateAnimation.cancel();
            }
            ValueAnimator rotateAnimation2 = getRotateAnimation();
            if (rotateAnimation2 != null) {
                rotateAnimation2.start();
            }
        }
    }

    public C462050I9z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 98));
    }
}
