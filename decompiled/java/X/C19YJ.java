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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import u4.q0;

/* JADX INFO: renamed from: X.19YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19YJ extends LinearLayout {
    public C1383090m5z LL;
    public TuxTextView LLILLJJLI;
    public ImageView LLILLL;
    public View LLILZ;
    public TextView LLILZIL;
    public ImageView LLILZLL;
    public int LLIZ;
    public final /* synthetic */ C19YK LLIZLLLIL;

    public void setTabViewSelectedListener(C19YR c19yr) {
    }

    public final void LIZ() {
        View view;
        C1383090m5z c1383090m5z = this.LL;
        if (c1383090m5z == null || (view = c1383090m5z.LJ) == null) {
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
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            ImageView imageView = this.LLILLL;
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
                this.LLILLL.setImageDrawable(null);
            }
            TextView textView = (TextView) view.findViewById(R.id.text1);
            this.LLILZIL = textView;
            if (textView != null) {
                this.LLIZ = textView.getMaxLines();
            }
            this.LLILZLL = (ImageView) view.findViewById(R.id.icon);
        }
        boolean z = false;
        if (this.LLILZ == null) {
            if (this.LLILLL == null) {
                ImageView imageView2 = (ImageView) C21146717pB.LIZIZ(getContext(), com.zhiliaoapp.musically.R.layout.a1t, this, false);
                addView(imageView2, 0);
                this.LLILLL = imageView2;
            }
            if (this.LLILLJJLI == null) {
                TuxTextView tuxTextView2 = new TuxTextView(getContext());
                tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView2.setGravity(17);
                tuxTextView2.setMaxLines(2);
                addView(tuxTextView2, new FrameLayout.LayoutParams(-2, -2));
                this.LLILLJJLI = tuxTextView2;
                this.LLIZ = tuxTextView2.getMaxLines();
            }
            this.LLILLJJLI.setTuxFont(this.LLIZLLLIL.LLJIJIL);
            this.LLIZLLLIL.LLJILJIL = this.LLILLJJLI.getTextSize();
            ColorStateList colorStateList = this.LLIZLLLIL.LLJI;
            if (colorStateList != null) {
                this.LLILLJJLI.setTextColor(colorStateList);
            }
            LIZIZ(this.LLILLJJLI, this.LLILLL);
        } else {
            TextView textView2 = this.LLILZIL;
            if (textView2 != null || this.LLILZLL != null) {
                LIZIZ(textView2, this.LLILZLL);
            }
        }
        if (c1383090m5z != null) {
            C19YK c19yk = c1383090m5z.LJI;
            if (c19yk == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if (c19yk.getSelectedTabPosition() == c1383090m5z.LIZLLL) {
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
        InterfaceC1344620l5w interfaceC1344620l5w = this.LLIZLLLIL.LLJZ;
        if (interfaceC1344620l5w != null) {
            interfaceC1344620l5w.LIZ(this.LL);
        } else {
            this.LL.LIZ();
        }
        return true;
    }

    public TextView getCustomTextView() {
        return this.LLILZIL;
    }

    public C1383090m5z getTab() {
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
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setSelected(z);
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

    public void setTab(C1383090m5z c1383090m5z) {
        if (c1383090m5z != this.LL) {
            this.LL = c1383090m5z;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19YJ(C19YK c19yk, Context context) {
        super(context);
        this.LLIZLLLIL = c19yk;
        this.LLIZ = 2;
        int i = c19yk.LLJILLL;
        if (i != 0) {
            setBackground(C14MI.LIZ(context, i));
        }
        setPaddingRelative(c19yk.LLILZLL, c19yk.LLIZ, c19yk.LLIZLLLIL, c19yk.LLJ);
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        q0.LJJ(this, C20097213kI.LIZ(getContext()));
    }

    public final void LIZIZ(TextView textView, ImageView imageView) {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2;
        C1383090m5z c1383090m5z = this.LL;
        CharSequence charSequence3 = null;
        if (c1383090m5z != null) {
            drawable = c1383090m5z.LIZ;
            charSequence = c1383090m5z.LIZIZ;
            charSequence2 = c1383090m5z.LIZJ;
        } else {
            drawable = null;
            charSequence = null;
            charSequence2 = null;
        }
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
            i = View.MeasureSpec.makeMeasureSpec(this.LLIZLLLIL.LLJJ, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.LLILLJJLI != null) {
            getResources();
            float f = this.LLIZLLLIL.LLJILJIL;
            int i3 = this.LLIZ;
            ImageView imageView = this.LLILLL;
            if (imageView != null && imageView.getVisibility() == 0) {
                i3 = 1;
            } else {
                TuxTextView tuxTextView = this.LLILLJJLI;
                if (tuxTextView != null && tuxTextView.getLineCount() > 1) {
                    f = this.LLIZLLLIL.LLJILJILJ;
                }
            }
            float textSize = this.LLILLJJLI.getTextSize();
            int lineCount = this.LLILLJJLI.getLineCount();
            int maxLines = this.LLILLJJLI.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (this.LLIZLLLIL.LLJJJ == 1 && f > textSize && lineCount == 1 && ((layout = this.LLILLJJLI.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    return;
                }
                this.LLILLJJLI.setTextSize(0, f);
                this.LLILLJJLI.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }
}
