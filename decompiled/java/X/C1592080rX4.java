package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0rX4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592080rX4 extends LinearLayout implements InterfaceC20343214is {
    public C1591980rWu LL;
    public View LLILLJJLI;
    public TextView LLILLL;
    public ImageView LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public final /* synthetic */ C1592450rXf LLIZ;

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return "TAB_TOP/tabview";
    }

    public void setCustomRiskId(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            X.0rWu r4 = r7.LL
            r5 = 0
            if (r4 == 0) goto L9a
            android.view.View r6 = r4.LIZIZ
        L7:
            r3 = 1
            if (r6 == 0) goto L89
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L19
            if (r0 == r7) goto L1c
            if (r0 == 0) goto L19
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C786410Ut5.LJJJLZIJ(r6, r0)
        L19:
            r7.addView(r6)
        L1c:
            r7.LLILLJJLI = r6
            r0 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r1 = r6.findViewById(r0)
            boolean r0 = r1 instanceof android.widget.TextView
            if (r0 == 0) goto L87
            android.widget.TextView r1 = (android.widget.TextView) r1
        L2b:
            r7.LLILLL = r1
            if (r1 == 0) goto L32
            r1.setMaxLines(r3)
        L32:
            X.10Tv r1 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r1.LIZLLL()
            X.0sAQ r0 = r0.LJIJI()
            X.0Snn r0 = r0.LJJL()
            boolean r0 = r0.LJJII()
            if (r0 == 0) goto L63
            X.0sAf r0 = r1.LIZLLL()
            X.0sAQ r0 = r0.LJIJI()
            X.0Snn r0 = r0.LJJL()
            int r2 = r0.LJFF()
            android.widget.TextView r1 = r7.LLILLL
            boolean r0 = r1 instanceof com.bytedance.tux.input.TuxTextView
            if (r0 == 0) goto L63
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            if (r1 == 0) goto L63
            r1.setTuxFont(r2)
        L63:
            r0 = 16908295(0x1020007, float:2.387725E-38)
            android.view.View r1 = r6.findViewById(r0)
            boolean r0 = r1 instanceof android.widget.ImageView
            if (r0 == 0) goto L71
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
        L71:
            r7.LLILZ = r5
        L73:
            if (r4 == 0) goto L85
            X.0rXf r0 = r4.LIZJ
            if (r0 == 0) goto L9d
            int r1 = r0.getSelectedTabPosition()
            int r0 = r4.LIZ
            if (r1 != r0) goto L85
        L81:
            r7.setSelected(r3)
            return
        L85:
            r3 = 0
            goto L81
        L87:
            r1 = r5
            goto L2b
        L89:
            android.view.View r0 = r7.LLILLJJLI
            if (r0 == 0) goto L95
            com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker.recordViewRemovedPoint(r7, r0)
            r7.removeView(r0)
            r7.LLILLJJLI = r5
        L95:
            r7.LLILLL = r5
            r7.LLILZ = r5
            goto L73
        L9a:
            r6 = r5
            goto L7
        L9d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Tab not attached to a TabLayout"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1592080rX4.LIZ():void");
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ANIMATE;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, "");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = super.animate();
        C2180551AVp.LIZ(enumC2180541AVo, this, "");
        return viewPropertyAnimatorAnimate;
    }

    public final InterfaceC1583070rIX getITopTabView() {
        KeyEvent.Callback callback = this.LLILLJJLI;
        if (callback instanceof InterfaceC1583070rIX) {
            return (InterfaceC1583070rIX) callback;
        }
        return null;
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
        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
        C1591980rWu c1591980rWu = this.LL;
        String strValueOf = String.valueOf(c1591980rWu != null ? c1591980rWu.LJ : null);
        c1584320rKY.getClass();
        EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ(strValueOf);
        if (enumC1584360rKcLJIIIIZZ != null) {
            C1906380zi0.LIZ.getClass();
            C1906380zi0.LJ(enumC1584360rKcLJIIIIZZ);
        }
        InterfaceC1591380rVw interfaceC1591380rVw = this.LLIZ.LLJJIJIIJIL;
        if (interfaceC1591380rVw != null) {
            interfaceC1591380rVw.LIZ(this.LL);
        } else {
            C1591980rWu c1591980rWu2 = this.LL;
            C1592450rXf c1592450rXf = c1591980rWu2.LIZJ;
            if (c1592450rXf == null) {
                "Tab not attached to a TabLayout".toString();
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            C337800DMc c337800DMc = C1592450rXf.LLLIZZ;
            c1592450rXf.LJIJJ(c1591980rWu2, true);
        }
        return true;
    }

    public final String getCurrentImageUrl$homepage_common_release() {
        return this.LLILZIL;
    }

    public final ImageView getCustomImageView() {
        return this.LLILZ;
    }

    public final ImageView getCustomImageView$homepage_common_release() {
        return this.LLILZ;
    }

    public final TextView getCustomTextView() {
        return this.LLILLL;
    }

    public final TextView getMCustomTextView$homepage_common_release() {
        return this.LLILLL;
    }

    public final C1591980rWu getTab() {
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
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1591470rW5 topTabPreloadTriggerDispatcher$homepage_common_release;
        C1591980rWu c1591980rWu;
        String strLIZIZ;
        InterfaceC1589850rTT interfaceC1589850rTTLIZ;
        InterfaceC1589850rTT interfaceC1589850rTTLIZ2;
        String strLIZIZ2 = null;
        if (motionEvent.getActionMasked() == 0) {
            C1591980rWu c1591980rWu2 = this.LL;
            if (c1591980rWu2 != null) {
                strLIZIZ2 = c1591980rWu2.LIZIZ();
            }
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ != null) {
                tabSwitchMetricServiceLIZ.LJI();
                C1593220rYu c1593220rYu = C1593220rYu.LIZ;
                C1593220rYu.LIZLLL(this.LLIZ.getHomeTabAbility(), strLIZIZ2);
            }
            C1591470rW5 topTabPreloadTriggerDispatcher$homepage_common_release2 = this.LLIZ.getTopTabPreloadTriggerDispatcher$homepage_common_release();
            if (topTabPreloadTriggerDispatcher$homepage_common_release2 != null && strLIZIZ2 != null && (interfaceC1589850rTTLIZ2 = topTabPreloadTriggerDispatcher$homepage_common_release2.LIZ(strLIZIZ2)) != null) {
                interfaceC1589850rTTLIZ2.LIZJ(new C1589860rTU(EnumC1589840rTS.TOP_TAB));
            }
        } else if (motionEvent.getActionMasked() == 1 && (topTabPreloadTriggerDispatcher$homepage_common_release = this.LLIZ.getTopTabPreloadTriggerDispatcher$homepage_common_release()) != null && (c1591980rWu = this.LL) != null && (strLIZIZ = c1591980rWu.LIZIZ()) != null && (interfaceC1589850rTTLIZ = topTabPreloadTriggerDispatcher$homepage_common_release.LIZ(strLIZIZ)) != null) {
            interfaceC1589850rTTLIZ.LIZLLL();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            super.setAlpha(f);
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        super.setAlpha(f);
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    public final void setCurrentImageUrl$homepage_common_release(String str) {
        this.LLILZIL = str;
    }

    public final void setCustomImageView$homepage_common_release(ImageView imageView) {
        this.LLILZ = imageView;
    }

    public final void setMCustomTextView$homepage_common_release(TextView textView) {
        this.LLILLL = textView;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        View view = this.LLILLJJLI;
        if (view != null) {
            view.setSelected(z);
        }
        TextView textView = this.LLILLL;
        if (textView != null) {
            textView.setSelected(z);
        }
    }

    public final void setSetCustomIconSize$homepage_common_release(boolean z) {
        this.LLILZLL = z;
    }

    public final void setTab(C1591980rWu c1591980rWu) {
        if (!Intrinsics.LJFF(c1591980rWu, this.LL)) {
            this.LL = c1591980rWu;
            LIZ();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592080rX4(C1592450rXf c1592450rXf, Context context) {
        super(context);
        this.LLIZ = c1592450rXf;
        if (c1592450rXf.getMTabBackgroundResId() != 0) {
            setBackground(C14MI.LIZ(context, c1592450rXf.getMTabBackgroundResId()));
        }
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        q0.LJJ(this, C20097213kI.LIZ(getContext()));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.LLIZ.LLILZLL;
        if (!C1157804fw.LIZ() ? !((InterfaceC1586210rNb) ServiceManager.get().getService(ISearchService.class)).LJJ() : !((InterfaceC1586210rNb) ServiceManager.get().getService(ISearchServiceLowEnd.class)).LJJ()) {
            super.onMeasure(i, i2);
            return;
        }
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(this.LLIZ.LLILZLL, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
