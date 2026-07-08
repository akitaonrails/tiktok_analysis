package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import u4.q0;

/* JADX INFO: renamed from: X.19Xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21556119Xr extends LinearLayout {
    public C21556219Xs LL;
    public TextView LLILLJJLI;
    public ImageView LLILLL;
    public View LLILZ;
    public TextView LLILZIL;
    public ImageView LLILZLL;
    public int LLIZ;
    public final /* synthetic */ C21556319Xt LLIZLLLIL;

    public final void LIZ() {
        View view;
        C21556219Xs c21556219Xs = this.LL;
        if (c21556219Xs == null || (view = c21556219Xs.LJ) == null) {
            View view2 = this.LLILZ;
            if (view2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
                removeView(view2);
                this.LLILZ = null;
            }
            this.LLILZIL = null;
            this.LLILZLL = null;
        } else {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
                }
                addView(view);
            }
            this.LLILZ = view;
            TextView textView = this.LLILLJJLI;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            ImageView imageView = this.LLILLL;
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
                this.LLILLL.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.LLILZIL = textView2;
            if (textView2 != null) {
                this.LLIZ = textView2.getMaxLines();
            }
            this.LLILZLL = (ImageView) view.findViewById(R.id.icon);
        }
        boolean z = false;
        if (this.LLILZ == null) {
            if (this.LLILLL == null) {
                ImageView imageView2 = (ImageView) C786410Ut5.Td(C786410Ut5.ne(getContext()), com.zhiliaoapp.musically.R.layout.bjl, this, false);
                addView(imageView2, 0);
                this.LLILLL = imageView2;
            }
            if (this.LLILLJJLI == null) {
                TextView textView3 = (TextView) C786410Ut5.Td(C786410Ut5.ne(getContext()), com.zhiliaoapp.musically.R.layout.bjm, this, false);
                addView(textView3);
                this.LLILLJJLI = textView3;
                this.LLIZ = textView3.getMaxLines();
            }
            this.LLILLJJLI.setTextAppearance(this.LLIZLLLIL.LLJ);
            ColorStateList colorStateList = this.LLIZLLLIL.LLJI;
            if (colorStateList != null) {
                this.LLILLJJLI.setTextColor(colorStateList);
            }
            LIZIZ(this.LLILLJJLI, this.LLILLL);
        } else {
            TextView textView4 = this.LLILZIL;
            if (textView4 != null || this.LLILZLL != null) {
                LIZIZ(textView4, this.LLILZLL);
            }
        }
        if (c21556219Xs != null) {
            C21556319Xt c21556319Xt = c21556219Xs.LJI;
            if (c21556319Xt == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if (c21556319Xt.getSelectedTabPosition() == c21556219Xs.LIZLLL) {
                z = true;
            }
        }
        setSelected(z);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.LL == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.LLIZLLLIL.getClass();
        C21556219Xs c21556219Xs = this.LL;
        C21556319Xt c21556319Xt = c21556219Xs.LJI;
        if (c21556319Xt == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c21556319Xt.LJIIL(c21556219Xs, true);
        return true;
    }

    public TextView getCustomTextView() {
        return this.LLILZIL;
    }

    public C21556219Xs getTab() {
        return this.LL;
    }

    public TextView getTextView() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractC21547819Um.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractC21547819Um.class.getName());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.LLILLL;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.LLILZ;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C21556219Xs c21556219Xs) {
        if (c21556219Xs != this.LL) {
            this.LL = c21556219Xs;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21556119Xr(C21556319Xt c21556319Xt, Context context) {
        super(context);
        this.LLIZLLLIL = c21556319Xt;
        this.LLIZ = 2;
        int i = c21556319Xt.LLJILJILJ;
        if (i != 0) {
            setBackground(C14MI.LIZ(context, i));
        }
        setPaddingRelative(c21556319Xt.LLILZIL, c21556319Xt.LLILZLL, c21556319Xt.LLIZ, c21556319Xt.LLIZLLLIL);
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        q0.LJJ(this, C20097213kI.LIZ(getContext()));
    }

    public final void LIZIZ(TextView textView, ImageView imageView) {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2;
        C21556219Xs c21556219Xs = this.LL;
        CharSequence charSequence3 = null;
        if (c21556219Xs != null) {
            drawable = c21556219Xs.LIZ;
            charSequence = c21556219Xs.LIZIZ;
            charSequence2 = c21556219Xs.LIZJ;
        } else {
            drawable = null;
            charSequence = null;
            charSequence2 = null;
        }
        int iLIZIZ = 0;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                C786410Ut5.LJZI(0, imageView);
                int visibility = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, this);
            } else {
                C786410Ut5.LJZI(8, imageView);
                imageView.setImageDrawable(null);
            }
            imageView.setContentDescription(charSequence2);
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                C786410Ut5.LLIL(textView, 0);
                int visibility2 = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, this);
            } else {
                C786410Ut5.LLIL(textView, 8);
                textView.setText((CharSequence) null);
            }
            textView.setContentDescription(charSequence2);
            if (C497740JfY.LJJ()) {
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z && imageView.getVisibility() == 0) {
                iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
            }
            if (iLIZIZ != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iLIZIZ;
                imageView.requestLayout();
            }
        }
        if (!z) {
            charSequence3 = charSequence2;
        }
        C1697050uGN.LIZ(this, charSequence3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int tabMaxWidth = this.LLIZLLLIL.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(this.LLIZLLLIL.LLJILLL, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.LLILLJJLI != null) {
            getResources();
            float f = this.LLIZLLLIL.LLJIJIL;
            int i3 = this.LLIZ;
            ImageView imageView = this.LLILLL;
            if (imageView != null && imageView.getVisibility() == 0) {
                i3 = 1;
            } else {
                TextView textView = this.LLILLJJLI;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.LLIZLLLIL.LLJILJIL;
                }
            }
            float textSize = this.LLILLJJLI.getTextSize();
            int lineCount = this.LLILLJJLI.getLineCount();
            int maxLines = this.LLILLJJLI.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (this.LLIZLLLIL.LLJJIJIL == 1 && f > textSize && lineCount == 1 && ((layout = this.LLILLJJLI.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    return;
                }
                this.LLILLJJLI.setTextSize(0, f);
                this.LLILLJJLI.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }
}
