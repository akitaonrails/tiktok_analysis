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
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0y8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845910y8T extends FrameLayout {
    public C1845850y8N LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C426770GoN LLILZ;
    public final /* synthetic */ C1846010y8d LLILZIL;

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

    public final void LIZ() {
        int selectedTabPosition;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        C1845850y8N c1845850y8N = this.LL;
        this.LLILZIL.getClass();
        int i = 6;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        AttributeSet attributeSet = null;
        if (this.LLILLJJLI == null) {
            TuxTextView tuxTextView = new TuxTextView(getContext(), attributeSet, i, false ? 1 : 0);
            C1846010y8d c1846010y8d = this.LLILZIL;
            tuxTextView.setGravity(17);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setMaxLines(1);
            tuxTextView.setTuxFont(c1846010y8d.LLILZ);
            this.LLILLJJLI = tuxTextView;
            addView(tuxTextView, new FrameLayout.LayoutParams(-2, -1));
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            ((FrameLayout.LayoutParams) (tuxTextView2 != null ? tuxTextView2.getLayoutParams() : null)).gravity = 17;
            setBackground(null);
        }
        TuxTextView tuxTextView3 = this.LLILLJJLI;
        if (tuxTextView3 != null) {
            C1845850y8N c1845850y8N2 = this.LL;
            CharSequence charSequence = c1845850y8N2 != null ? c1845850y8N2.LIZIZ : null;
            tuxTextView3.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
            if (charSequence == null || charSequence.length() == 0) {
                C786410Ut5.LLIL(tuxTextView3, 8);
                tuxTextView3.setText((CharSequence) null);
            } else {
                tuxTextView3.setText(charSequence);
                C786410Ut5.LLIL(tuxTextView3, 0);
                tuxTextView3.setTextColor(this.LLILZIL.LLILLL);
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
        if (this.LLILZ == null) {
            C426770GoN c426770GoN = new C426770GoN(getContext(), null, 6);
            this.LLILZ = c426770GoN;
            addView(c426770GoN, new FrameLayout.LayoutParams(-2, -2));
            C426770GoN c426770GoN2 = this.LLILZ;
            ViewGroup.LayoutParams layoutParams3 = c426770GoN2 != null ? c426770GoN2.getLayoutParams() : null;
            if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                layoutParams2.gravity = 8388613;
                layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            }
            TuxTextView tuxTextView4 = this.LLILLJJLI;
            ViewGroup.LayoutParams layoutParams4 = tuxTextView4 != null ? tuxTextView4.getLayoutParams() : null;
            if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                layoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            }
            C426770GoN c426770GoN3 = this.LLILZ;
            if (c426770GoN3 != null) {
                c426770GoN3.bringToFront();
            }
            this.LLILZIL.LL.setClipChildren(false);
            this.LLILZIL.LL.setClipToPadding(false);
            C426770GoN c426770GoN4 = this.LLILZ;
            if (c426770GoN4 != null) {
                C786410Ut5.LLLLLLIL(c426770GoN4, 8);
            }
        }
        if (c1845850y8N != null) {
            if (!TextUtils.isEmpty(null)) {
                setContentDescription(null);
            }
            C1846010y8d c1846010y8d2 = c1845850y8N.LIZLLL;
            if (c1846010y8d2 != null && (selectedTabPosition = c1846010y8d2.getSelectedTabPosition()) != -1 && selectedTabPosition == c1845850y8N.LIZJ) {
                z = true;
            }
        }
        setSelected(z);
    }

    @Override // android.view.View
    public final boolean performClick() {
        C426770GoN c426770GoN;
        Long l;
        boolean zPerformClick = super.performClick();
        C1845850y8N c1845850y8N = this.LL;
        if (c1845850y8N == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        C15TA c15ta = C15TA.LIZ;
        Object obj = c1845850y8N.LIZ;
        long jLongValue = (!(obj instanceof Long) || (l = (Long) obj) == null) ? 0L : l.longValue();
        String strValueOf = String.valueOf(c1845850y8N.LIZIZ);
        int i = c1845850y8N.LIZJ;
        C1845910y8T c1845910y8T = c1845850y8N.LJ;
        boolean z = (c1845910y8T == null || (c426770GoN = c1845910y8T.LLILZ) == null || c426770GoN.getVisibility() != 0) ? false : true;
        c15ta.getClass();
        C15TA.LJIILL(new RunnableC696420RTk(jLongValue, i, "tab_button", strValueOf, z));
        C1846010y8d c1846010y8d = c1845850y8N.LIZLLL;
        if (c1846010y8d != null) {
            C1085640eME c1085640eME = C1846010y8d.LLJL;
            c1846010y8d.LJI(c1845850y8N, true);
        }
        return true;
    }

    public final C1845850y8N getTab$explore_release() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1845850y8N c1845850y8N = this.LL;
        if (c1845850y8N == null) {
            return;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(C20092913jb.LIZ(0, 1, c1845850y8N.LIZJ, 1, isSelected()));
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
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setSelected(z);
        }
        this.LLILZIL.getClass();
    }

    public final void setTab$explore_release(C1845850y8N c1845850y8N) {
        if (c1845850y8N != this.LL) {
            this.LL = c1845850y8N;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845910y8T(C1846010y8d c1846010y8d, Context context) {
        super(context);
        this.LLILZIL = c1846010y8d;
        setClickable(true);
    }
}
