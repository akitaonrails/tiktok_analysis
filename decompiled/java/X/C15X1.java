package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15X1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15X1 {
    public static final /* synthetic */ C15X1[] LLIZLLLIL;
    public static final /* synthetic */ C2254308sP LLJ;
    public static final C15X1 NORMAL;
    public static final C15X1 SMALL_SCREEN;
    public final float LL;
    public final float LLILLJJLI = 45.0f;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;

    public static InterfaceC2044707zh<C15X1> getEntries() {
        return LLJ;
    }

    static {
        C15X1 c15x1 = new C15X1("NORMAL", 0, 72.0f, 117.0f, 60.0f, 262.0f, 160.0f, 48.0f);
        NORMAL = c15x1;
        C15X1 c15x12 = new C15X1("SMALL_SCREEN", 1, 64.0f, 109.0f, 52.0f, 184.0f, 112.0f, 40.0f);
        SMALL_SCREEN = c15x12;
        C15X1[] c15x1Arr = {c15x1, c15x12};
        LLIZLLLIL = c15x1Arr;
        LLJ = new C2254308sP(c15x1Arr);
    }

    public static C15X1[] values() {
        return (C15X1[]) LLIZLLLIL.clone();
    }

    public final int backgroundViewMarginBottom() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LL)));
    }

    public final float getAvatarSizeDp() {
        return this.LLILZLL;
    }

    public final float getBaseBackgroundViewMarginBottomDp() {
        return this.LL;
    }

    public final float getBottomButtonHeightDp() {
        return this.LLIZ;
    }

    public final float getBubbleViewMaxWidthDp() {
        return this.LLILZIL;
    }

    public final float getScrollViewPaddingBottomOnSoftInputHiddenDp() {
        return this.LLILLL;
    }

    public final float getScrollViewPaddingBottomOnSoftInputShownDp() {
        return this.LLILZ;
    }

    public final float getScrollViewPaddingTopDp() {
        return this.LLILLJJLI;
    }

    public static C15X1 valueOf(String str) {
        return (C15X1) C08FF.LIZ(C15X1.class, str);
    }

    public C15X1(String str, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        this.LL = f;
        this.LLILLL = f2;
        this.LLILZ = f3;
        this.LLILZIL = f4;
        this.LLILZLL = f5;
        this.LLIZ = f6;
    }
}
