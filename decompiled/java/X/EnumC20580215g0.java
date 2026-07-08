package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15g0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20580215g0 {
    public static final /* synthetic */ EnumC20580215g0[] LLIZLLLIL;
    public static final /* synthetic */ C2254308sP LLJ;
    public static final EnumC20580215g0 NORMAL;
    public static final EnumC20580215g0 SMALL_SCREEN;
    public final float LL;
    public final float LLILLJJLI = 45.0f;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;

    public static InterfaceC2044707zh<EnumC20580215g0> getEntries() {
        return LLJ;
    }

    static {
        EnumC20580215g0 enumC20580215g0 = new EnumC20580215g0("NORMAL", 0, 72.0f, 117.0f, 60.0f, 262.0f, 160.0f, 48.0f);
        NORMAL = enumC20580215g0;
        EnumC20580215g0 enumC20580215g02 = new EnumC20580215g0("SMALL_SCREEN", 1, 64.0f, 109.0f, 52.0f, 184.0f, 112.0f, 40.0f);
        SMALL_SCREEN = enumC20580215g02;
        EnumC20580215g0[] enumC20580215g0Arr = {enumC20580215g0, enumC20580215g02};
        LLIZLLLIL = enumC20580215g0Arr;
        LLJ = new C2254308sP(enumC20580215g0Arr);
    }

    public static EnumC20580215g0[] values() {
        return (EnumC20580215g0[]) LLIZLLLIL.clone();
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

    public final float getYourStoryButtonHeightDp() {
        return this.LLIZ;
    }

    public static EnumC20580215g0 valueOf(String str) {
        return (EnumC20580215g0) C08FF.LIZ(EnumC20580215g0.class, str);
    }

    public EnumC20580215g0(String str, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        this.LL = f;
        this.LLILLL = f2;
        this.LLILZ = f3;
        this.LLILZIL = f4;
        this.LLILZLL = f5;
        this.LLIZ = f6;
    }
}
