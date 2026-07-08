package X;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0rWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591830rWf extends LinearLayout implements InterfaceC1582900rIG, InterfaceC1583070rIX, InterfaceC20343214is {
    public final C1584440rKk LL;
    public final TuxTextView LLILLJJLI;
    public final View LLILLL;
    public final TuxIconView LLILZ;

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return "TAB_TOP/toptabview";
    }

    @Override // X.InterfaceC1583070rIX
    public View getView() {
        return this;
    }

    public void setCustomRiskId(String str) {
    }

    @Override // X.InterfaceC1582900rIG
    public final void LIZIZ() {
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
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

    @Override // X.InterfaceC1583070rIX
    public float getTextWidth() {
        TextPaint paint = this.LLILLJJLI.getPaint();
        if (paint != null) {
            return paint.measureText(this.LL.LIZJ);
        }
        return 0.0f;
    }

    @Override // X.InterfaceC1583070rIX
    public final int LIZ() {
        getView();
        return getWidth();
    }

    public final View getHotDot() {
        return this.LLILLL;
    }

    public final C1584440rKk getIconData() {
        return this.LL;
    }

    public final TuxIconView getIconView() {
        return this.LLILZ;
    }

    public final TuxTextView getTextView() {
        return this.LLILLJJLI;
    }

    public C1591830rWf(C1584440rKk c1584440rKk) {
        float f;
        int iIntValue;
        super(c1584440rKk.LIZ, null, 0);
        this.LL = c1584440rKk;
        setOrientation(0);
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
        this.LLILZ = tuxIconView;
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        this.LLILLJJLI = tuxTextView;
        View view = new View(getContext());
        this.LLILLL = view;
        tuxTextView.setTuxFont(32);
        tuxTextView.setGravity(17);
        tuxTextView.setPadding(C341940Daq.LIZ(12.0d), 0, C341940Daq.LIZ(12.0d), 0);
        tuxTextView.setLines(1);
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (C1591480rW6.LJFF()) {
            f = C1592730rY7.LJ;
        } else {
            f = 0.6f;
        }
        C786410Ut5.B5(tuxTextView2, f);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, C1385040m98.LIZ(getContext(), false));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setMinWidth(C341940Daq.LIZ(53.0d));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C341940Daq.LIZ(58.0d));
        layoutParams.gravity = 17;
        C786410Ut5.R6(this.LLILLJJLI, layoutParams);
        tuxTextView.setId(android.R.id.text1);
        addView(tuxTextView);
        C1591790rWb.LIZ();
        tuxTextView.setPadding(0, 0, 0, 0);
        tuxTextView.setMinWidth(0);
        TuxIconView tuxIconView2 = this.LLILZ;
        tuxIconView2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconView2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
        tuxIconView2.setIconRes(R.raw.icon_chevron_down_fill);
        C786410Ut5.x5(tuxIconView2, 0.6f);
        tuxIconView2.setTintColor(tuxIconView2.getResources().getColor(R.color.ao));
        setGravity(16);
        tuxIconView2.setId(R.id.jqj);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        C2271391DvN.LIZ(tuxIconView2, (C1A5L) C2271381DvM.LJJJJJL.getValue());
        addView(tuxIconView);
        if (tuxIconView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ((ViewGroup.MarginLayoutParams) tuxIconView.getLayoutParams()).setMarginStart(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        view.setId(R.id.tv_tab_dot);
        view.setBackgroundResource(R.drawable.bug);
        C786410Ut5.LJLLLLLL(8, view);
        C341940Daq.LIZ(-12.0d);
        C1591790rWb.LIZ();
        int iLIZ = C341940Daq.LIZ(-8.0d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C341940Daq.LIZ(8.0d), C341940Daq.LIZ(8.0d));
        layoutParams2.setMargins(iLIZ, iLIZ, 0, 0);
        layoutParams2.setMarginStart(iLIZ);
        C1581510rG1.LJI(view);
        C786410Ut5.W5(this.LLILLL, layoutParams2);
        addView(view);
        tuxTextView.setText(c1584440rKk.LIZJ);
        view.setBackgroundResource(R.drawable.bug);
        C844470XAv.LIZ.getClass();
        tuxTextView.setShadowLayer(C12ES.LIZJ(2.0f, C844470XAv.LIZ()), 0.0f, C12ES.LIZJ(2.0f, C844470XAv.LIZ()), ColorProtector.parseColor("#26000000"));
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

    @Override // X.InterfaceC1583070rIX
    public void setText(String str) {
        this.LLILLJJLI.setText(str);
    }

    public void setTextSize(float f) {
        this.LLILLJJLI.setTextSize(1, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }
}
