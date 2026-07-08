package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import u4.q0;

/* JADX INFO: renamed from: X.19YT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19YT extends LinearLayout {
    public C1888650zFP LL;
    public View LLILLJJLI;
    public final /* synthetic */ C19YU LLILLL;

    public TextView getTextView() {
        return null;
    }

    public final void LIZ() {
        View view;
        C1888650zFP c1888650zFP = this.LL;
        if (c1888650zFP == null || (view = c1888650zFP.LJ) == null) {
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
        if (c1888650zFP != null) {
            C19YU c19yu = c1888650zFP.LJI;
            if (c19yu == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if ((c1888650zFP.LJFF || c1888650zFP.LIZLLL != -1) && c19yu.getSelectedTabPosition() == c1888650zFP.LIZLLL) {
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
        this.LL.LIZ(true);
        return true;
    }

    public C1888650zFP getTab() {
        return this.LL;
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
        View view = this.LLILLJJLI;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C1888650zFP c1888650zFP) {
        if (c1888650zFP != this.LL) {
            this.LL = c1888650zFP;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19YT(C19YU c19yu, Context context) {
        super(context);
        this.LLILLL = c19yu;
        int i = c19yu.LLJI;
        if (i != 0) {
            setBackground(C14MI.LIZ(context, i));
        }
        setPaddingRelative(c19yu.LLILZIL, c19yu.LLILZLL, c19yu.LLIZ, c19yu.LLIZLLLIL);
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
