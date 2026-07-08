package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.security.SecureRandom;

/* JADX INFO: renamed from: X.0DId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336770DId extends LinearLayout {
    public float LL;
    public int LLILLJJLI;
    public Integer LLILLL;
    public int LLILZ;

    public final float getRate() {
        return this.LL;
    }

    public final int getSpace() {
        return this.LLILLJJLI;
    }

    public final int getStarSize() {
        return this.LLILZ;
    }

    public final void setNoneTypeStarTintColor(int i) {
        this.LLILLL = Integer.valueOf(i);
    }

    public final void setRate(float f) {
        int i;
        boolean z;
        this.LL = f;
        int i2 = (int) f;
        float f2 = f - i2;
        if (f2 >= 0.25f && f2 < 0.75d) {
            i = (i2 * 2) + 1;
        } else {
            i = i2 * 2;
            if (f2 >= 0.75d) {
                i += 2;
            }
        }
        int iMin = Math.min(i, 10);
        int i3 = iMin / 2;
        if (iMin % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            LIZ(2, (ImageView) getChildAt(i5));
            i4++;
            i5++;
        }
        if (z) {
            LIZ(1, (ImageView) getChildAt(i5));
            i5++;
        }
        while (i5 < 5) {
            LIZ(0, (ImageView) getChildAt(i5));
            i5++;
        }
    }

    public final void setSpace(int i) {
        this.LLILLJJLI = i;
    }

    public final void setStarSize(int i) {
        int iLIZIZ;
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        int i2 = 0;
        for (Object obj : new C2500209qy(this, 3)) {
            int i3 = i2 + 1;
            ViewGroup.LayoutParams layoutParams = null;
            if (i2 >= 0) {
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    layoutParams = layoutParams2;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    int i4 = this.LLILZ;
                    marginLayoutParams.width = i4;
                    marginLayoutParams.height = i4;
                    if (i2 == 0) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    } else {
                        iLIZIZ = this.LLILLJJLI;
                    }
                    marginLayoutParams.setMarginStart(iLIZIZ);
                    C786410Ut5.W5(view, marginLayoutParams);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C336770DId(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 0;
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        do {
            ImageView imageView = new ImageView(context);
            int i2 = this.LLILZ;
            C786410Ut5.c6(imageView, new LinearLayout.LayoutParams(i2, i2));
            if (getChildCount() != 0) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart(this.LLILLJJLI);
                    C786410Ut5.W5(imageView, marginLayoutParams);
                }
            }
            addView(imageView);
            i++;
        } while (i < 5);
        if (isInEditMode()) {
            setRate((float) ((new SecureRandom().nextDouble() * ((double) 10)) / ((double) 2)));
        }
    }

    public final void LIZ(int i, ImageView imageView) {
        int iIntValue;
        if (i == 2) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_star_fill;
            c419910GdJ.LIZLLL = Integer.valueOf(C960203pA.LIZ(R.attr.a1h, getContext()));
            imageView.setImageDrawable(c419910GdJ.LIZ(getContext()));
            return;
        }
        if (i == 0) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_star_fill;
            Context context = getContext();
            Integer num = this.LLILLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = R.attr.ea;
            }
            c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(iIntValue, context);
            imageView.setImageDrawable(c419910GdJ2.LIZ(getContext()));
            return;
        }
        if (i != 1) {
            return;
        }
        if (C960203pA.LIZIZ(getContext())) {
            imageView.setImageResource(R.drawable.b15);
        } else {
            imageView.setImageResource(R.drawable.b14);
        }
    }
}
