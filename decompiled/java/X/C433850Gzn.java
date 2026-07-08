package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Collections;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gzn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433850Gzn extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public Integer LLJILJILJ;

    private final View getTransparentView() {
        return (View) this.LL.getValue();
    }

    public final View LIZ() {
        View view = new View(getContext());
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, -2));
        return view;
    }

    public final View getGradientView() {
        return (View) this.LLILLJJLI.getValue();
    }

    public final View getPaletteView() {
        return (View) this.LLILLL.getValue();
    }

    public final float getChromaFrom() {
        return this.LLIZLLLIL;
    }

    public final float getChromaTo() {
        return this.LLJ;
    }

    public final int getGradientHeight() {
        return this.LLILZIL;
    }

    public final float getLightnessAddition() {
        return this.LLIZ;
    }

    public final float getLightnessFrom() {
        return this.LLJI;
    }

    public final float getLightnessTo() {
        return this.LLJIJIL;
    }

    public final float getMergingTolerance() {
        return this.LLILZLL;
    }

    public final Integer getPlaceholder() {
        return this.LLJILJILJ;
    }

    public final float getStrategyThreshold() {
        return this.LLJILJIL;
    }

    public final int getTransparentHeight() {
        return this.LLILZ;
    }

    public C433850Gzn(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 6));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 4));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 5));
        this.LLILZLL = 4.0f;
        this.LLJ = 0.4f;
        this.LLJIJIL = 1.0f;
        setOrientation(1);
        addView(getTransparentView());
        addView(getGradientView());
        addView(getPaletteView());
    }

    public final void setChromaFrom(float f) {
        this.LLIZLLLIL = f;
    }

    public final void setChromaTo(float f) {
        this.LLJ = f;
    }

    public final void setGradientHeight(int i) {
        this.LLILZIL = i;
    }

    public final void setLightnessAddition(float f) {
        this.LLIZ = f;
    }

    public final void setLightnessFrom(float f) {
        this.LLJI = f;
    }

    public final void setLightnessTo(float f) {
        this.LLJIJIL = f;
    }

    public final void setMergingTolerance(float f) {
        this.LLILZLL = f;
    }

    public final void setPaletteImageUrl(String str) {
        LinearLayout.LayoutParams layoutParams;
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(str)));
        c1331670kl3LJIIJ.LIZLLL("Nimble_Image");
        c1331670kl3LJIIJ.LJJIIJ(new C0ID3(this, 0));
        View transparentView = getTransparentView();
        ViewGroup.LayoutParams layoutParams2 = transparentView.getLayoutParams();
        layoutParams2.height = this.LLILZ;
        C786410Ut5.W5(transparentView, layoutParams2);
        View gradientView = getGradientView();
        ViewGroup.LayoutParams layoutParams3 = gradientView.getLayoutParams();
        layoutParams3.height = this.LLILZIL;
        C786410Ut5.W5(gradientView, layoutParams3);
        View paletteView = getPaletteView();
        ViewGroup.LayoutParams layoutParams4 = paletteView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams5 = null;
        if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams4) != null) {
            layoutParams.weight = 1.0f;
            layoutParams5 = layoutParams;
        }
        C786410Ut5.W5(paletteView, layoutParams5);
        Integer num = this.LLJILJILJ;
        if (num != null) {
            setBackgroundColor(num.intValue());
        }
    }

    public final void setPlaceholder(Integer num) {
        this.LLJILJILJ = num;
    }

    public final void setStrategyThreshold(float f) {
        this.LLJILJIL = f;
    }

    public final void setTransparentHeight(int i) {
        this.LLILZ = i;
    }
}
