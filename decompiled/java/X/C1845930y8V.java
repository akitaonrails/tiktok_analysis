package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0y8V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845930y8V extends FrameLayout {
    public C1845940y8W LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;
    public final /* synthetic */ C1846060y8i LLILZ;

    public final int getContentHeight() {
        int i = 0;
        View[] viewArr = {this.LLILLJJLI, this.LLILLL};
        int bottom = 0;
        int top = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    top = Math.min(top, view.getTop());
                    bottom = Math.max(bottom, view.getBottom());
                } else {
                    top = view.getTop();
                    bottom = view.getBottom();
                }
                z = true;
            }
            i++;
        } while (i < 2);
        return bottom - top;
    }

    public final int getContentWidth() {
        int i = 0;
        View[] viewArr = {this.LLILLJJLI, this.LLILLL};
        int right = 0;
        int left = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    left = Math.min(left, view.getLeft());
                    right = Math.max(right, view.getRight());
                } else {
                    left = view.getLeft();
                    right = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 2);
        return right - left;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        Integer num;
        FrameLayout.LayoutParams layoutParams;
        int selectedTabPosition;
        C1845940y8W c1845940y8W = this.LL;
        int i = this.LLILZ.LLIZLLLIL;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        AttributeSet attributeSet = null;
        if (i == 0) {
            if (this.LLILLJJLI == null) {
                TuxTextView tuxTextView = new TuxTextView(getContext(), attributeSet, 6, false ? 1 : 0);
                C1846060y8i c1846060y8i = this.LLILZ;
                tuxTextView.setGravity(17);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setMaxLines(1);
                tuxTextView.setTuxFont(c1846060y8i.LLILZ);
                this.LLILLJJLI = tuxTextView;
                addView(tuxTextView);
                TuxTextView tuxTextView2 = this.LLILLJJLI;
                ((FrameLayout.LayoutParams) (tuxTextView2 != null ? tuxTextView2.getLayoutParams() : null)).gravity = 17;
                setBackground(null);
            }
            TuxTextView tuxTextView3 = this.LLILLJJLI;
            if (tuxTextView3 != null) {
                C1845940y8W c1845940y8W2 = this.LL;
                CharSequence charSequence = c1845940y8W2 != null ? c1845940y8W2.LIZJ : null;
                if (this.LLILZ.LLJ == 1) {
                    C426750GoL.LJIIIZ(tuxTextView3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, false, 26);
                    tuxTextView3.setMinWidth(0);
                } else {
                    C426750GoL.LJIIIZ(tuxTextView3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, false, 26);
                    tuxTextView3.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                }
                if (charSequence == null || charSequence.length() == 0) {
                    C786410Ut5.LLIL(tuxTextView3, 8);
                    tuxTextView3.setText((CharSequence) null);
                } else {
                    tuxTextView3.setText(charSequence);
                    C786410Ut5.LLIL(tuxTextView3, 0);
                    tuxTextView3.setTextColor(this.LLILZ.LLILLL);
                    int visibility = getVisibility();
                    setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, this);
                }
            }
            View view = this.LLILLL;
            if (view != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
                removeView(view);
            }
            this.LLILLL = null;
        } else if (i == 1) {
            if (this.LLILLL == null) {
                TuxIconView tuxIconView = new TuxIconView(getContext(), null, false ? 1 : 0, 6, null == true ? 1 : 0);
                tuxIconView.setContentDescription(null);
                tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                this.LLILLL = tuxIconView;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                layoutParams2.gravity = 17;
                TuxIconView tuxIconView2 = this.LLILLL;
                if (tuxIconView2 != null) {
                    C786410Ut5.M6(tuxIconView2, layoutParams2);
                }
                addView(this.LLILLL, 0);
            }
            TuxIconView tuxIconView3 = this.LLILLL;
            if (tuxIconView3 != null) {
                C1845940y8W c1845940y8W3 = this.LL;
                if (c1845940y8W3 == null || (num = c1845940y8W3.LIZIZ) == null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                    tuxIconView3.setImageDrawable(null);
                } else {
                    tuxIconView3.setIconRes(num.intValue());
                    tuxIconView3.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    tuxIconView3.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    ViewGroup.LayoutParams layoutParams3 = tuxIconView3.getLayoutParams();
                    if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        C786410Ut5.M6(tuxIconView3, layoutParams);
                    }
                    tuxIconView3.setTintColorStateList$tux_theme_release(this.LLILZ.LLILLL);
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                    int visibility2 = getVisibility();
                    setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, this);
                }
            }
            View view2 = this.LLILLJJLI;
            if (view2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
                removeView(view2);
            }
            this.LLILLJJLI = null;
        }
        if (c1845940y8W != null) {
            if (!TextUtils.isEmpty(null)) {
                setContentDescription(null);
            }
            C1846060y8i c1846060y8i2 = c1845940y8W.LJ;
            if (c1846060y8i2 != null && (selectedTabPosition = c1846060y8i2.getSelectedTabPosition()) != -1 && selectedTabPosition == c1845940y8W.LIZLLL) {
                z = true;
            }
        }
        setSelected(z);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        C1845940y8W c1845940y8W = this.LL;
        if (c1845940y8W == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        c1845940y8W.LIZ();
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1845940y8W c1845940y8W = this.LL;
        if (c1845940y8W == null) {
            return;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(C20092913jb.LIZ(0, 1, c1845940y8W.LIZLLL, 1, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(C20092413jW.LJI);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setSelected(z);
        }
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            tuxIconView.setSelected(z);
        }
    }

    public final void setTab(C1845940y8W c1845940y8W) {
        if (c1845940y8W != this.LL) {
            this.LL = c1845940y8W;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845930y8V(C1846060y8i c1846060y8i, Context context) {
        super(context);
        this.LLILZ = c1846060y8i;
        setClickable(true);
    }
}
