package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21568119ax {
    public static final EnumC21568119ax BOTTOM_LEFT_SMALL;
    public static final EnumC21568119ax LEFT_BOTTOM_LARGE;
    public static final EnumC21568119ax LEFT_BOTTOM_MEDIUM;
    public static final EnumC21568119ax LEFT_BOTTOM_SMALL;
    public static final /* synthetic */ EnumC21568119ax[] LLJILJILJ;
    public static final /* synthetic */ C2254308sP LLJILLL;
    public static final EnumC21568119ax RIGHT_BOTTOM_MEDIUM;
    public static final EnumC21568119ax RIGHT_BOTTOM_SMALL;
    public static final EnumC21568119ax TOP_LARGE;
    public final float LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final float LLILZIL = 0.0f;
    public final float LLJI = 0.5f;

    public static InterfaceC2044707zh<EnumC21568119ax> getEntries() {
        return LLJILLL;
    }

    static {
        EnumC21568119ax enumC21568119ax = new EnumC21568119ax("TOP_LARGE", 0, 0.0f, 13.0f, 0.0f, 0.0f, 2.0f, 5.0f, 0.07f, 0.12f, 121.0f, 2.0f);
        TOP_LARGE = enumC21568119ax;
        EnumC21568119ax enumC21568119ax2 = new EnumC21568119ax("LEFT_BOTTOM_MEDIUM", 1, 19.0f, 0.0f, 0.0f, 0.0f, 2.0f, 5.0f, 0.07f, 0.12f, 121.0f, 2.0f);
        LEFT_BOTTOM_MEDIUM = enumC21568119ax2;
        EnumC21568119ax enumC21568119ax3 = new EnumC21568119ax("LEFT_BOTTOM_SMALL", 2, 13.0f, 0.0f, 0.0f, 0.0f, 2.0f, 5.0f, 0.07f, 0.12f, 48.0f, 2.0f);
        LEFT_BOTTOM_SMALL = enumC21568119ax3;
        EnumC21568119ax enumC21568119ax4 = new EnumC21568119ax("RIGHT_BOTTOM_SMALL", 3, 0.0f, 0.0f, 13.0f, 0.0f, 2.0f, 5.0f, 0.07f, 0.12f, 48.0f, 2.0f);
        RIGHT_BOTTOM_SMALL = enumC21568119ax4;
        EnumC21568119ax enumC21568119ax5 = new EnumC21568119ax("BOTTOM_LEFT_SMALL", 4, 0.0f, 0.0f, 0.0f, 10.0f, 4.5f, 4.5f, 0.1f, 0.05f, 48.0f, 1.0f);
        BOTTOM_LEFT_SMALL = enumC21568119ax5;
        EnumC21568119ax enumC21568119ax6 = new EnumC21568119ax("LEFT_BOTTOM_LARGE", 5, 14.0f, 0.0f, 0.0f, 0.0f, 2.0f, 5.0f, 0.07f, 0.12f, 121.0f, 2.0f);
        LEFT_BOTTOM_LARGE = enumC21568119ax6;
        EnumC21568119ax enumC21568119ax7 = new EnumC21568119ax("RIGHT_BOTTOM_MEDIUM", 6, 0.0f, 0.0f, 19.0f, 0.0f, 2.0f, 5.0f, 0.07f, 0.12f, 121.0f, 2.0f);
        RIGHT_BOTTOM_MEDIUM = enumC21568119ax7;
        EnumC21568119ax[] enumC21568119axArr = {enumC21568119ax, enumC21568119ax2, enumC21568119ax3, enumC21568119ax4, enumC21568119ax5, enumC21568119ax6, enumC21568119ax7};
        LLJILJILJ = enumC21568119axArr;
        LLJILLL = new C2254308sP(enumC21568119axArr);
    }

    public static EnumC21568119ax[] values() {
        return (EnumC21568119ax[]) LLJILJILJ.clone();
    }

    public final float getShadowOutsetBottomDp() {
        return Math.max(0.0f, (this.LLJILJIL * this.LLIZ) + this.LLILZLL);
    }

    public final float getShadowOutsetLeftDp() {
        return Math.max(0.0f, (this.LLJILJIL * this.LLIZ) - this.LLILZIL);
    }

    public final float getShadowOutsetRightDp() {
        return Math.max(0.0f, (this.LLJILJIL * this.LLIZ) + this.LLILZIL);
    }

    public final float getShadowOutsetTopDp() {
        return Math.max(0.0f, (this.LLJILJIL * this.LLIZ) - this.LLILZLL);
    }

    public final float getBorderOpacity() {
        return this.LLJ;
    }

    public final float getBorderWidth() {
        return this.LLJI;
    }

    public final float getContentInsetBottom() {
        return this.LLILZ;
    }

    public final float getContentInsetLeft() {
        return this.LL;
    }

    public final float getContentInsetRight() {
        return this.LLILLL;
    }

    public final float getContentInsetTop() {
        return this.LLILLJJLI;
    }

    public final float getMinWidth() {
        return this.LLJIJIL;
    }

    public final float getShadowBlurScale() {
        return this.LLJILJIL;
    }

    public final float getShadowOffsetX() {
        return this.LLILZIL;
    }

    public final float getShadowOffsetY() {
        return this.LLILZLL;
    }

    public final float getShadowOpacity() {
        return this.LLIZLLLIL;
    }

    public final float getShadowRadius() {
        return this.LLIZ;
    }

    public static EnumC21568119ax valueOf(String str) {
        return (EnumC21568119ax) C08FF.LIZ(EnumC21568119ax.class, str);
    }

    public EnumC21568119ax(String str, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
        this.LLILZ = f4;
        this.LLILZLL = f5;
        this.LLIZ = f6;
        this.LLIZLLLIL = f7;
        this.LLJ = f8;
        this.LLJIJIL = f9;
        this.LLJILJIL = f10;
    }
}
