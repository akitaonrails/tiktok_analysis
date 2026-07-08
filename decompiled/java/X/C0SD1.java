package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;

/* JADX INFO: renamed from: X.0SD1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SD1 extends LinearLayout {
    public int LL;
    public int LLILLJJLI;

    public final void LIZIZ() {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LL = 0;
        this.LLILLJJLI = 0;
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final int getShowTagNum() {
        return this.LLILLJJLI;
    }

    public C0SD1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
    }

    public static boolean LIZ(C0SD1 c0sd1, String str, int i, int i2, String str2, int i3, int i4, int i5, boolean z, int i6) {
        int iLIZJ;
        int i7;
        if ((i6 & 32) != 0) {
            i4 = 0;
        }
        if ((i6 & 64) != 0) {
            i5 = 0;
        }
        if ((i6 & 128) != 0) {
            z = false;
        }
        c0sd1.getClass();
        C21279518Ph c21279518PhLIZ = C988900bqC.LIZ();
        c21279518PhLIZ.LJIIL(str);
        c21279518PhLIZ.LJIILJJIL(62);
        c21279518PhLIZ.LIZ(i);
        c21279518PhLIZ.LJIILIIL(i2);
        c21279518PhLIZ.LJIIJ(i5);
        c21279518PhLIZ.LJII(i5);
        c21279518PhLIZ.LJIIIIZZ(i4);
        c21279518PhLIZ.LJIIIZ(i4);
        c21279518PhLIZ.LJIIJJI(new RelativeLayout.LayoutParams(-2, -2));
        c21279518PhLIZ.LIZIZ(C12ES.LIZJ(2.0f, c0sd1.getContext()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) C12ES.LIZJ(14.0f, c0sd1.getContext()), (int) C12ES.LIZJ(14.0f, c0sd1.getContext()));
        C21279618Pi c21279618Pi = c21279518PhLIZ.LIZ;
        if (c21279618Pi != null) {
            c21279618Pi.LJIIZILJ = layoutParams;
        }
        c21279518PhLIZ.LJFF();
        C21279618Pi c21279618Pi2 = c21279518PhLIZ.LIZ;
        if (c21279618Pi2 != null) {
            C21279718Pj c21279718Pj = new C21279718Pj(c0sd1.getContext(), null, 6);
            C786410Ut5.LLLLILI(c21279718Pj, 4);
            c21279718Pj.LIZ(c21279618Pi2);
            c0sd1.addView(c21279718Pj, c0sd1.getChildCount());
            if (c0sd1.getShowTagNum() != 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c21279718Pj.getLayoutParams();
                marginLayoutParams.setMarginStart((int) C12ES.LIZJ(8.0f, c0sd1.getContext()));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21279718Pj);
                c21279718Pj.setLayoutParams(marginLayoutParams);
            }
            ImageView imageView = (ImageView) c21279718Pj.findViewById(c21279718Pj.getImageId());
            if ((!TextUtils.isEmpty(str2)) && str2 != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                c1331670kl3LJIIIZ.LJJI(imageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams2.addRule(15);
                layoutParams2.setMarginEnd((int) C12ES.LIZJ(4.0f, c0sd1.getContext()));
                C786410Ut5.c6(imageView, layoutParams2);
                C786410Ut5.LJZI(0, imageView);
            }
            int iMeasureText = c0sd1.LL + (i4 * 2) + ((int) ((TextView) c0sd1.findViewById(c21279718Pj.getDescId())).getPaint().measureText(str));
            if (imageView.getVisibility() == 8) {
                i7 = 0;
            } else {
                int iLIZJ2 = (int) C12ES.LIZJ(18.0f, c0sd1.getContext());
                if (c0sd1.getShowTagNum() == 0) {
                    iLIZJ = 0;
                } else {
                    iLIZJ = (int) C12ES.LIZJ(8.0f, c0sd1.getContext());
                }
                i7 = iLIZJ2 + iLIZJ;
            }
            int i8 = iMeasureText + i7;
            if (z || i8 <= i3) {
                c0sd1.LL = i8;
                c0sd1.LLILLJJLI++;
                C786410Ut5.LLLLILI(c21279718Pj, 0);
                return true;
            }
        }
        return false;
    }
}
