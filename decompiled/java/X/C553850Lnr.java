package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Lnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553850Lnr implements C0DV5<C553850Lnr> {
    public int[] LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public boolean LLIZ;
    public Function2<? super Integer, ? super Integer, float[]> LLJI;
    public float LL = 4.0f;
    public float LLILLJJLI = 8.0f;
    public int[] LLILLL = {-65536, -256, -16711936, -16711681, -16776961, -65281, -65536};
    public long LLIZLLLIL = 1000;
    public int LLJ = 255;

    @Override // X.C0DV5
    public C553850Lnr build() {
        int[] iArr = this.LLILZ;
        if (iArr != null && iArr.length != this.LLILLL.length) {
            throw new IllegalArgumentException("Angles array length must match colors array length");
        }
        if (!this.LLIZ || this.LLIZLLLIL > 0) {
            return this;
        }
        throw new IllegalArgumentException("Animation duration must be positive when animation is enabled");
    }

    public final int getAlpha$tools_ai_uikit_df_release() {
        return this.LLJ;
    }

    public final int[] getAngles$tools_ai_uikit_df_release() {
        return this.LLILZ;
    }

    public final boolean getAnimate$tools_ai_uikit_df_release() {
        return this.LLIZ;
    }

    public final long getAnimationDuration$tools_ai_uikit_df_release() {
        return this.LLIZLLLIL;
    }

    public final float getCenterOffsetX$tools_ai_uikit_df_release() {
        return this.LLILZIL;
    }

    public final float getCenterOffsetY$tools_ai_uikit_df_release() {
        return this.LLILZLL;
    }

    public final int[] getColors$tools_ai_uikit_df_release() {
        return this.LLILLL;
    }

    public final float getCornerRadius$tools_ai_uikit_df_release() {
        return this.LLILLJJLI;
    }

    public final Function2<Integer, Integer, float[]> getDynamicPosCalculate$tools_ai_uikit_df_release() {
        return this.LLJI;
    }

    public final float getStrokeWidth$tools_ai_uikit_df_release() {
        return this.LL;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final C553850Lnr alpha(int i) {
        if (i >= 0 && i < 256) {
            this.LLJ = i;
            return this;
        }
        "Alpha must be in range 0-255".toString();
        throw new IllegalArgumentException("Alpha must be in range 0-255");
    }

    public final C553850Lnr angles(int[] iArr) {
        int[] iArr2;
        if (iArr != null) {
            if (iArr.length == 0) {
                "Angles array cannot be empty".toString();
                throw new IllegalArgumentException("Angles array cannot be empty");
            }
            iArr2 = (int[]) iArr.clone();
        } else {
            iArr2 = null;
        }
        this.LLILZ = iArr2;
        return this;
    }

    public final C553850Lnr colors(int[] iArr) {
        if (iArr.length >= 2) {
            this.LLILLL = (int[]) iArr.clone();
            return this;
        }
        "Colors array must contain at least 2 colors".toString();
        throw new IllegalArgumentException("Colors array must contain at least 2 colors");
    }

    public final C553850Lnr cornerRadius(float f) {
        if (f >= 0.0f) {
            this.LLILLJJLI = f;
            return this;
        }
        "Corner radius must be non-negative".toString();
        throw new IllegalArgumentException("Corner radius must be non-negative");
    }

    public final C553850Lnr dynamicPositionCalculate(Function2<? super Integer, ? super Integer, float[]> function2) {
        this.LLJI = function2;
        return this;
    }

    public final void setAlpha$tools_ai_uikit_df_release(int i) {
        this.LLJ = i;
    }

    public final void setAngles$tools_ai_uikit_df_release(int[] iArr) {
        this.LLILZ = iArr;
    }

    public final void setAnimate$tools_ai_uikit_df_release(boolean z) {
        this.LLIZ = z;
    }

    public final void setAnimationDuration$tools_ai_uikit_df_release(long j) {
        this.LLIZLLLIL = j;
    }

    public final void setCenterOffsetX$tools_ai_uikit_df_release(float f) {
        this.LLILZIL = f;
    }

    public final void setCenterOffsetY$tools_ai_uikit_df_release(float f) {
        this.LLILZLL = f;
    }

    public final void setColors$tools_ai_uikit_df_release(int[] iArr) {
        this.LLILLL = iArr;
    }

    public final void setCornerRadius$tools_ai_uikit_df_release(float f) {
        this.LLILLJJLI = f;
    }

    public final void setDynamicPosCalculate$tools_ai_uikit_df_release(Function2<? super Integer, ? super Integer, float[]> function2) {
        this.LLJI = function2;
    }

    public final void setStrokeWidth$tools_ai_uikit_df_release(float f) {
        this.LL = f;
    }

    public final C553850Lnr strokeWidth(float f) {
        if (f > 0.0f) {
            this.LL = f;
            return this;
        }
        "Stroke width must be positive".toString();
        throw new IllegalArgumentException("Stroke width must be positive");
    }

    public final C553850Lnr animate(boolean z, long j) {
        this.LLIZ = z;
        if (z && j > 0) {
            this.LLIZLLLIL = j;
        }
        return this;
    }

    public final C553850Lnr centerOffset(float f, float f2) {
        this.LLILZIL = f;
        this.LLILZLL = f2;
        return this;
    }
}
