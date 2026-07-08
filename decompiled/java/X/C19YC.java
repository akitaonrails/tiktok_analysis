package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import u4.q0;

/* JADX INFO: renamed from: X.19YC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19YC extends LinearLayout {
    public C12H3 LL;
    public View LLILLJJLI;
    public String LLILLL;
    public final C19YD LLILZ;
    public final /* synthetic */ C19YA LLILZIL;

    public TextView getTextView() {
        return null;
    }

    public final void LIZ() {
        View view;
        C12H3 c12h3 = this.LL;
        if (c12h3 == null || (view = c12h3.LJ) == null) {
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
            q0.LJIJ(view, this.LLILZ);
            TextView textView = (TextView) view.findViewById(R.id.text1);
            if (textView != null) {
                textView.getMaxLines();
            }
            view.findViewById(R.id.icon);
        }
        boolean z = false;
        if (c12h3 != null) {
            C19YA c19ya = c12h3.LJI;
            if (c19ya == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if ((c12h3.LJFF || c12h3.LIZLLL != -1) && c19ya.getSelectedTabPosition() == c12h3.LIZLLL) {
                z = true;
            }
        }
        setSelected(z);
    }

    public String getTabRoleDescription() {
        if (this.LLILLL == null) {
            this.LLILLL = getResources().getString(2131823349);
        }
        return this.LLILLL;
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
        InterfaceC1638460sjs interfaceC1638460sjs = this.LLILZIL.onTabClickListener;
        if (interfaceC1638460sjs != null) {
            interfaceC1638460sjs.LIZ(this.LL);
        } else {
            this.LL.LIZ();
        }
        return true;
    }

    public C12H3 getTab() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo == null) {
            return;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        if (this.LLILLJJLI == null) {
            accessibilityNodeInfoCompatWrap.setRoleDescription(getTabRoleDescription());
        }
        C12H3 c12h3 = this.LL;
        if (c12h3 != null) {
            accessibilityNodeInfoCompatWrap.setCollectionItemInfo(C20092913jb.LIZIZ(0, c12h3.LIZLLL, false));
        }
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

    public void setTab(C12H3 c12h3) {
        if (c12h3 != this.LL) {
            this.LL = c12h3;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.19YD] */
    public C19YC(C19YA c19ya, Context context) {
        super(context);
        this.LLILZIL = c19ya;
        this.LLILZ = new C20094213jo() { // from class: X.19YD
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setRoleDescription(this.LIZ.getTabRoleDescription());
            }
        };
        int i = c19ya.mTabBackgroundResId;
        if (i != 0) {
            setBackground(C14MI.LIZ(context, i));
        }
        setPaddingRelative(c19ya.mTabPaddingStart, c19ya.mTabPaddingTop, c19ya.mTabPaddingEnd, c19ya.mTabPaddingBottom);
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        q0.LJJ(this, C20097213kI.LIZ(getContext()));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int tabMaxWidth = this.LLILZIL.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(this.LLILZIL.mTabMaxWidth, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
