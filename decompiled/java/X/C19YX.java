package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import u4.q0;

/* JADX INFO: renamed from: X.19YX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19YX extends LinearLayout {
    public C21557119Yb LL;
    public View LLILLJJLI;
    public final /* synthetic */ C19YY LLILLL;

    public TextView getTextView() {
        return null;
    }

    public final void LIZ() {
        View view;
        C21557119Yb c21557119Yb = this.LL;
        if (c21557119Yb == null || (view = c21557119Yb.LIZLLL) == null) {
            View view2 = this.LLILLJJLI;
            if (view2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
                removeView(view2);
                this.LLILLJJLI = null;
            }
        } else {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
                }
                addView(view);
            }
            this.LLILLJJLI = view;
            TextView textView = (TextView) view.findViewById(R.id.text1);
            if (textView != null) {
                textView.getMaxLines();
            }
            view.findViewById(R.id.icon);
        }
        boolean z = false;
        if (c21557119Yb != null) {
            C19YY c19yy = c21557119Yb.LJFF;
            if (c19yy == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if ((c21557119Yb.LJ || c21557119Yb.LIZJ != -1) && c19yy.getSelectedTabPosition() == c21557119Yb.LIZJ) {
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
        this.LLILLL.getClass();
        this.LL.LIZ();
        return true;
    }

    public C21557119Yb getTab() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        View view = this.LLILLJJLI;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C21557119Yb c21557119Yb) {
        if (c21557119Yb != this.LL) {
            this.LL = c21557119Yb;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19YX(C19YY c19yy, Context context) {
        super(context);
        this.LLILLL = c19yy;
        int i = c19yy.LLJI;
        if (i != 0) {
            setBackground(C14MI.LIZ(context, i));
        }
        setPaddingRelative(c19yy.LLILZIL, c19yy.LLILZLL, c19yy.LLIZ, c19yy.LLIZLLLIL);
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        q0.LJJ(this, C20097213kI.LIZ(getContext()));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int tabMaxWidth = this.LLILLL.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(this.LLILLL.LLJIJIL, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
