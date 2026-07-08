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
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import u4.q0;

/* JADX INFO: renamed from: X.19Y2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19Y2 extends LinearLayout {
    public C19Y5 LL;
    public TextView LLILLJJLI;
    public ImageView LLILLL;
    public View LLILZ;
    public TextView LLILZIL;
    public ImageView LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public final /* synthetic */ C19Y3 LLJ;

    public void setTabViewSelectedListener(C19Y8 c19y8) {
    }

    public final void LIZ() {
        View view;
        C19Y5 c19y5 = this.LL;
        if (c19y5 == null || (view = c19y5.LJFF) == null) {
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
                TextView textView3 = (TextView) C786410Ut5.Td(C786410Ut5.ne(getContext()), com.zhiliaoapp.musically.R.layout.i5z, this, false);
                addView(textView3);
                this.LLILLJJLI = textView3;
                this.LLIZ = textView3.getMaxLines();
            }
            this.LLILLJJLI.setTextAppearance(this.LLJ.LLJ);
            ColorStateList colorStateList = this.LLJ.LLJI;
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
        if (c19y5 != null) {
            C19Y3 c19y3 = c19y5.LJII;
            if (c19y3 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if (c19y3.getSelectedTabPosition() == c19y5.LJ) {
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
        InterfaceC1245470iW1 interfaceC1245470iW1 = this.LLJ.LLJZ;
        if (interfaceC1245470iW1 != null) {
            interfaceC1245470iW1.LIZ(this.LL);
        } else {
            this.LL.LIZ();
        }
        return true;
    }

    public TextView getCustomTextView() {
        return this.LLILZIL;
    }

    public C19Y5 getTab() {
        return this.LL;
    }

    public TextView getTextView() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setContentDescription(this.LL.LIZJ);
        accessibilityNodeInfoCompatWrap.setRoleDescription(this.LLJ.LLJLLL);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(C20092913jb.LIZIZ(0, this.LL.LJ, false));
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

    public void setTab(C19Y5 c19y5) {
        if (c19y5 != this.LL) {
            this.LL = c19y5;
            LIZ();
        }
    }

    public void setUseInnerMarginBottomWhenUseIconView(boolean z) {
        this.LLIZLLLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19Y2(C19Y3 c19y3, Context context) {
        super(context);
        this.LLJ = c19y3;
        this.LLIZ = 2;
        this.LLIZLLLIL = true;
        int i = c19y3.LLJILJILJ;
        if (i != 0) {
            setBackground(C14MI.LIZ(context, i));
        }
        setPaddingRelative(c19y3.LLILZIL, c19y3.LLILZLL, c19y3.LLIZ, c19y3.LLIZLLLIL);
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        q0.LJJ(this, C20097213kI.LIZ(getContext()));
    }

    public final void LIZIZ(TextView textView, ImageView imageView) {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2;
        C19Y5 c19y5 = this.LL;
        CharSequence charSequence3 = null;
        if (c19y5 != null) {
            drawable = c19y5.LIZIZ;
            charSequence = c19y5.LIZJ;
            charSequence2 = c19y5.LIZLLL;
        } else {
            drawable = null;
            charSequence = null;
            charSequence2 = null;
        }
        int iLJII = 0;
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
        if (imageView != null && this.LLIZLLLIL) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z && imageView.getVisibility() == 0) {
                iLJII = this.LLJ.LJII(8);
            }
            if (iLJII != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iLJII;
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
        int tabMaxWidth = this.LLJ.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(this.LLJ.LLJILLL, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.LLILLJJLI != null) {
            getResources();
            float f = this.LLJ.LLJIJIL;
            int i3 = this.LLIZ;
            ImageView imageView = this.LLILLL;
            if (imageView != null && imageView.getVisibility() == 0) {
                i3 = 1;
            } else {
                TextView textView = this.LLILLJJLI;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.LLJ.LLJILJIL;
                }
            }
            float textSize = this.LLILLJJLI.getTextSize();
            int lineCount = this.LLILLJJLI.getLineCount();
            int maxLines = this.LLILLJJLI.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (this.LLJ.LLJJIJIL == 1 && f > textSize && lineCount == 1 && ((layout = this.LLILLJJLI.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    return;
                }
                this.LLILLJJLI.setTextSize(0, f);
                this.LLILLJJLI.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }
}
