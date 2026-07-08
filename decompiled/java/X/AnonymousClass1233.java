package X;

import android.animation.ObjectAnimator;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1233, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1233 extends C196925122x {
    @Override // X.C196925122x
    public final void LJIIJJI() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // X.C196925122x
    public final void LJIIL() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // X.C196925122x
    public final C196926122y LJII() {
        return new AnonymousClass1236();
    }

    @Override // X.C196925122x
    public final TextStickerData LJIIJ() {
        if (this.LLJJIJIL == null) {
            TextStickerData textStickerData = new TextStickerData("", this.LLIZ, this.LLIZLLLIL, this.LLILZ.LIZLLL, this.LLJ, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -32, -1, -1, 4095, null);
            this.LLJJIJIL = textStickerData;
            textStickerData.setTextWrapList(this.LLILZLL);
        }
        this.LLJJIJIL.setTextStr(getText());
        this.LLJJIJIL.setX(this.LL);
        this.LLJJIJIL.setY(this.LLILLJJLI);
        this.LLJJIJIL.setRotation(this.LLILZ.LIZIZ);
        this.LLJJIJIL.setScale(this.LLILZ.LIZ);
        this.LLJJIJIL.setTextWrapList(this.LLILZLL);
        this.LLJJIJIL.setBgMode(this.LLIZ);
        this.LLJJIJIL.setColor(this.LLIZLLLIL);
        this.LLJJIJIL.setAlign(this.LLILZ.LIZLLL);
        this.LLJJIJIL.setFontType(this.LLJ);
        this.LLJJIJIL.setLayoutWidth(getMeasuredWidth());
        this.LLJJIJIL.setLayoutHeight(getMeasuredHeight());
        return this.LLJJIJIL;
    }

    @Override // X.C196925122x
    public final float LJIIIIZZ() {
        return C444960Hcc.LIZJ(getContext()) ? (getMeasuredWidth() / 2.0f) + C12ES.LIZJ(8.0f, getContext()) : (getMeasuredWidth() / 2.0f) - C12ES.LIZJ(8.0f, getContext());
    }

    public final void setSafeAreaHeight(int i) {
        AnonymousClass1236 anonymousClass1236;
        C196926122y c196926122y = this.LLJJIII;
        if ((c196926122y instanceof AnonymousClass1236) && (anonymousClass1236 = (AnonymousClass1236) c196926122y) != null && i >= 0) {
            anonymousClass1236.LJJJJL = i;
        }
    }

    public final void setStickerTextColor(int i) {
        LJJIIJ(getCurMode(), i, getCurAlignTxt(), getCurFontType());
    }

    @Override // X.C196925122x
    public final void LJJIIJ(int i, int i2, int i3, String str) {
        TextStickerData textStickerData = this.LLJJIJIL;
        if (textStickerData != null) {
            textStickerData.setBgMode(i);
            this.LLJJIJIL.setColor(i2);
            this.LLJJIJIL.setFontType(str);
            this.LLJJIJIL.setAlign(i3);
        }
        this.LLIZ = i;
        Pair<Integer, Integer> pairLJI = C0F9I.LJI(i, i2);
        int iIntValue = pairLJI.getFirst().intValue();
        int iIntValue2 = pairLJI.getSecond().intValue();
        LJJIIJZLJL(i, iIntValue2);
        this.LLIZLLLIL = i2;
        this.LLJ = str;
        C0FI2.LJIJJ().LJI = this.LLJ;
        switch (i) {
            case 1:
            case 4:
            case 5:
                setTextColor(iIntValue);
                this.LLILZ.LJFF = false;
                break;
            case 2:
            case 6:
            case 7:
                if (this.LLJILJIL) {
                    setTextColor(1461065763);
                } else {
                    setTextColor(iIntValue);
                }
                LJI(iIntValue2);
                this.LLILZ.LJFF = true;
                break;
            case 3:
                setTextColor(iIntValue);
                LJI(iIntValue2);
                this.LLILZ.LJFF = true;
                break;
        }
        this.LLILZ.LIZLLL = i3;
        invalidate();
    }

    public AnonymousClass1233(C19EG c19eg, SafeHandler safeHandler, TextStickerData textStickerData, boolean z, C19673111y5 c19673111y5, C1DRG c1drg) {
        super(c19eg, safeHandler, textStickerData, z, c19673111y5, Boolean.FALSE, c1drg);
        setEnableEdit(false);
    }
}
