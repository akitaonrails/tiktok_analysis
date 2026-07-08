package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import kotlin.Pair;

/* JADX INFO: renamed from: X.124R, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C124R extends C124Q {
    public int LLJLLL;

    @Override // X.C124Q
    public final float LJIIL() {
        return 8.0f;
    }

    @Override // X.C124Q, X.C124Y
    public int getDefaultTextSize() {
        return this.LLJLLL;
    }

    @Override // X.C124Q
    public final int LJIIIZ(int i) {
        return i + this.LLIZ;
    }

    @Override // X.C124Q
    public final int LJIIJ(int i) {
        return Math.max(i, getPaddingTop());
    }

    @Override // X.C124Q
    public final void LJIIJJI(String str) {
        C0F50 c0f50 = this.LLJJJJLIIL;
        if (c0f50 != null) {
            c0f50.LIZIZ();
        }
    }

    @Override // X.C124Q
    public final int LJIILIIL(String str) {
        return (int) getPaint().measureText(str);
    }

    @Override // X.C124Q, X.C124Y
    public void setDefaultTextSize(int i) {
        this.LLJLLL = i;
    }

    public final void setSafeAreaHeight(int i) {
        this.LLJJLIIIJLLLLLLLZ.LIZLLL = i;
    }

    public C124R(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUseAutoTextSize(true);
        this.LLJLLL = 20;
    }

    @Override // X.C124Q
    public final void LJIILJJIL(int i, int i2) {
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = i2;
        if (this.LLJJIII) {
            setMaskBlurColor(i2);
            this.LLJILJIL = 5;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        Pair<Integer, Integer> pairLJI = C0F9I.LJI(i, i2);
        int iIntValue = pairLJI.getFirst().intValue();
        int iIntValue2 = pairLJI.getSecond().intValue();
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    if (i != 6 && i != 7) {
                        return;
                    }
                } else {
                    this.LLJILJIL = 4;
                    this.LLJIJIL = i2;
                    this.LLJ.setColor(iIntValue2);
                    setBackground(null);
                    setTextColor(iIntValue);
                    setShadowLayer(12.0f, 0.0f, 0.0f, 0);
                    if (Build.VERSION.SDK_INT < 28) {
                        return;
                    }
                    setFallbackLineSpacing(false);
                    return;
                }
            }
            this.LLJILJIL = i;
            setTextColor(iIntValue);
            this.LLJIJIL = iIntValue2;
            return;
        }
        this.LLJILJIL = 1;
        this.LLJIJIL = iIntValue2;
        setBackground(null);
        setTextColor(iIntValue);
    }
}
