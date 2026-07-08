package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0l1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342000l1i extends FrameLayout {
    public String LL;
    public float LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final Typeface LLJJIII;
    public final C01GW LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public final C427870Gq9 LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C1342010l1j LLJLIL;
    public final RadiusLayout LLJLILLLLZIIL;

    private final float getCornerRadiusPx() {
        return ((Number) this.LLJIJIL.getValue()).floatValue();
    }

    private final float getStrokeWidthPx() {
        return ((Number) this.LLJILLL.getValue()).floatValue();
    }

    private final float getVerticalPaddingPx() {
        return ((Number) this.LLJILJILJ.getValue()).floatValue();
    }

    public final float getAvatarSizePx() {
        return ((Number) this.LLJJ.getValue()).floatValue();
    }

    public final float getEdgeReservePx() {
        return ((Number) this.LLJJIJI.getValue()).floatValue();
    }

    public final float getGapAvatarPercentPx() {
        return ((Number) this.LLJJI.getValue()).floatValue();
    }

    public final float getHorizontalPaddingPx() {
        return ((Number) this.LLJILJIL.getValue()).floatValue();
    }

    public final float getAvatarAlpha() {
        return this.LLJI;
    }

    public final float getAvatarScale() {
        return this.LLJ;
    }

    public final View getAvatarView() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final String getDisplayPercentText() {
        return this.LLILZ;
    }

    public final float getFillPercent() {
        return this.LLILLJJLI;
    }

    public final boolean getHasAnyVote() {
        return this.LLILLL;
    }

    public final boolean getHasSelection() {
        return this.LLILZLL;
    }

    public final String getOptionLabel() {
        return this.LL;
    }

    public final float getPercentAlpha() {
        return this.LLIZLLLIL;
    }

    public final float getTextActive() {
        return this.LLIZ;
    }

    public C1342000l1i(Context context) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        int iIntValue8;
        int i;
        super(context, null, 0);
        this.LL = "";
        this.LLILZ = "0%";
        this.LLIZLLLIL = 1.0f;
        this.LLJ = 1.0f;
        this.LLJI = 1.0f;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 57));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 60));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 62));
        this.LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 61));
        this.LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 56));
        this.LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 59));
        this.LLJJIII = C1697580uHE.LIZIZ(0.0f, 600, 14.0f, 0.0f, Float.valueOf(14.0f), 0.0f, 0, null, 233);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 58));
        C427870Gq9 c427870Gq9 = new C427870Gq9(context);
        C786410Ut5.LLLLJI(c427870Gq9, 4);
        this.LLJJLIIIJLLLLLLLZ = c427870Gq9;
        C1342010l1j c1342010l1j = new C1342010l1j(this, context);
        this.LLJLIL = c1342010l1j;
        RadiusLayout radiusLayout = new RadiusLayout(context, null, 6);
        radiusLayout.setRadius(getCornerRadiusPx());
        radiusLayout.setSmoothRadius(true);
        radiusLayout.addView(c1342010l1j, new FrameLayout.LayoutParams(-1, -1));
        this.LLJLILLLLZIIL = radiusLayout;
        Context context2 = getContext();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context2);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJJIJIIJIL = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, context2);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = this.LLJJIJIL;
        }
        this.LLJJIJIL = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1c, context2);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = this.LLJJJ;
        }
        this.LLJJJ = iIntValue3;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, context2);
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = this.LLJJJIL;
        }
        this.LLJJJIL = iIntValue4;
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a1j, context2);
        if (numLIZJ5 != null) {
            iIntValue5 = numLIZJ5.intValue();
        } else {
            iIntValue5 = this.LLJJJJ;
        }
        this.LLJJJJ = iIntValue5;
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a1k, context2);
        if (numLIZJ6 != null) {
            iIntValue6 = numLIZJ6.intValue();
        } else {
            iIntValue6 = this.LLJJJJJIL;
        }
        this.LLJJJJJIL = iIntValue6;
        Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.a02, context2);
        if (numLIZJ7 != null) {
            iIntValue7 = numLIZJ7.intValue();
        } else {
            iIntValue7 = this.LLJJJJLIIL;
        }
        this.LLJJJJLIIL = iIntValue7;
        Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.a03, context2);
        if (numLIZJ8 != null) {
            iIntValue8 = numLIZJ8.intValue();
        } else {
            iIntValue8 = this.LLJJL;
        }
        this.LLJJL = iIntValue8;
        c1342010l1j.addView(c427870Gq9);
        addView(radiusLayout, new FrameLayout.LayoutParams(-1, -1));
        c1342010l1j.LIZIZ();
        c1342010l1j.LIZJ();
        if (this.LLILZLL) {
            i = this.LLJJJJLIIL;
        } else {
            i = this.LLJJL;
        }
        int iLIZIZ = C814420VxA.LIZIZ(getStrokeWidthPx());
        radiusLayout.LIZIZ(i, iLIZIZ >= 1 ? iLIZIZ : 1, 0, 0);
    }

    public final void setAvatarAlpha(float f) {
        this.LLJI = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        C786410Ut5.t5(this.LLJJLIIIJLLLLLLLZ, this.LLJI);
    }

    public final void setAvatarScale(float f) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        this.LLJ = fLIZLLL;
        C427870Gq9 c427870Gq9 = this.LLJJLIIIJLLLLLLLZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427870Gq9);
        c427870Gq9.setScaleX(fLIZLLL);
        C427870Gq9 c427870Gq92 = this.LLJJLIIIJLLLLLLLZ;
        float f2 = this.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427870Gq92);
        c427870Gq92.setScaleY(f2);
    }

    public final void setDisplayPercentText(String str) {
        boolean z;
        if (this.LLILZ.length() != str.length()) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZ = str;
        if (z) {
            this.LLJLIL.requestLayout();
        }
        this.LLJLIL.invalidate();
    }

    public final void setFillPercent(float f) {
        this.LLILLJJLI = Math.min(100.0f, Math.max(0.0f, f));
        this.LLJLIL.invalidate();
    }

    public final void setHasAnyVote(boolean z) {
        this.LLILLL = z;
        this.LLJLIL.invalidate();
    }

    public final void setHasSelection(boolean z) {
        int i;
        this.LLILZLL = z;
        C1342010l1j c1342010l1j = this.LLJLIL;
        c1342010l1j.LIZIZ();
        c1342010l1j.LIZJ();
        c1342010l1j.invalidate();
        if (this.LLILZLL) {
            i = this.LLJJJJLIIL;
        } else {
            i = this.LLJJL;
        }
        int iLIZIZ = C814420VxA.LIZIZ(getStrokeWidthPx());
        if (iLIZIZ < 1) {
            iLIZIZ = 1;
        }
        this.LLJLILLLLZIIL.LIZIZ(i, iLIZIZ, 0, 0);
    }

    public final void setOptionLabel(String str) {
        this.LL = str;
        this.LLJLIL.invalidate();
    }

    public final void setPercentAlpha(float f) {
        this.LLIZLLLIL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        this.LLJLIL.LIZJ();
        this.LLJLIL.invalidate();
    }

    public final void setSelectedOption(boolean z) {
        this.LLILZIL = z;
        C1342010l1j c1342010l1j = this.LLJLIL;
        c1342010l1j.LIZIZ();
        c1342010l1j.LIZJ();
        c1342010l1j.invalidate();
    }

    public final void setTextActive(float f) {
        this.LLIZ = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        C1342010l1j c1342010l1j = this.LLJLIL;
        c1342010l1j.LIZIZ();
        c1342010l1j.LIZJ();
        c1342010l1j.invalidate();
    }

    public static int LIZIZ(float f, int i) {
        return (C13LZ.LJ(C814420VxA.LIZIZ(Color.alpha(i) * C13LZ.LIZLLL(f, 0.0f, 1.0f)), 0, 255) << 24) | (i & 16777215);
    }

    public final void LIZJ(UrlModel urlModel, boolean z) {
        boolean z2;
        if (z && urlModel != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJL = z2;
        if (!z2) {
            C786410Ut5.LLLLJI(this.LLJJLIIIJLLLLLLLZ, 4);
            this.LLJJLIIIJLLLLLLLZ.setImageDrawable(null);
            this.LLJLIL.invalidate();
        } else {
            C786410Ut5.LLLLJI(this.LLJJLIIIJLLLLLLLZ, 0);
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJ(this.LLJJLIIIJLLLLLLLZ);
            c1331670kl3LJIIIIZZ.LJIIJJI();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZIZ = C814420VxA.LIZIZ((getVerticalPaddingPx() * 2) + C0HD5.LIZIZ(this, Float.valueOf(18.0f)) + C0HD5.LIZIZ(this, Float.valueOf(4.0f)));
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            iLIZIZ = size;
        }
        int size2 = View.MeasureSpec.getSize(i);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(iLIZIZ, 1073741824));
        setMeasuredDimension(size2, iLIZIZ);
    }

    public static int LIZ(float f, int i, int i2) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        return Color.argb(C814420VxA.LIZIZ(Color.alpha(i) + ((Color.alpha(i2) - r4) * fLIZLLL)), C814420VxA.LIZIZ(Color.red(i) + ((Color.red(i2) - r8) * fLIZLLL)), C814420VxA.LIZIZ(Color.green(i) + ((Color.green(i2) - r7) * fLIZLLL)), C814420VxA.LIZIZ(Color.blue(i) + ((Color.blue(i2) - r6) * fLIZLLL)));
    }
}
