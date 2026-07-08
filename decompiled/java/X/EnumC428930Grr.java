package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Grr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC428930Grr {
    public static final EnumC428930Grr LARGE;
    public static final /* synthetic */ EnumC428930Grr[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC428930Grr MEDIUM;
    public static final EnumC428930Grr SMALL;
    public static final EnumC428930Grr X_SMALL;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final float LLILZ;
    public final float LLILZIL;

    public static InterfaceC2044707zh<EnumC428930Grr> getEntries() {
        return LLIZ;
    }

    static {
        EnumC428930Grr enumC428930Grr = new EnumC428930Grr("LARGE", 0, 32, -4, 36, 13.0f, -0.07f);
        LARGE = enumC428930Grr;
        EnumC428930Grr enumC428930Grr2 = new EnumC428930Grr("MEDIUM", 1, 24, -3, 27, 10.0f, -0.1f);
        MEDIUM = enumC428930Grr2;
        EnumC428930Grr enumC428930Grr3 = new EnumC428930Grr("SMALL", 2, 20, -2, 22, 10.0f, -0.15f);
        SMALL = enumC428930Grr3;
        EnumC428930Grr enumC428930Grr4 = new EnumC428930Grr("X_SMALL", 3, 16, -2, 18, 9.0f, -0.15f);
        X_SMALL = enumC428930Grr4;
        EnumC428930Grr[] enumC428930GrrArr = {enumC428930Grr, enumC428930Grr2, enumC428930Grr3, enumC428930Grr4};
        LLILZLL = enumC428930GrrArr;
        LLIZ = new C2254308sP(enumC428930GrrArr);
    }

    public static EnumC428930Grr[] values() {
        return (EnumC428930Grr[]) LLILZLL.clone();
    }

    public final int getDp$avatar_release() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
    }

    public final float getDpFloat$avatar_release() {
        return C418440Gaw.LIZIZ(Integer.valueOf(this.LL));
    }

    public final int getCutoutSizeDp() {
        return this.LLILLL;
    }

    public final int getItemSpacingDp() {
        return this.LLILLJJLI;
    }

    public final float getLetterSpacing() {
        return this.LLILZIL;
    }

    public final int getSizeDp() {
        return this.LL;
    }

    public final float getTextSizeDp() {
        return this.LLILZ;
    }

    public static EnumC428930Grr valueOf(String str) {
        return (EnumC428930Grr) C08FF.LIZ(EnumC428930Grr.class, str);
    }

    public EnumC428930Grr(String str, int i, int i2, int i3, int i4, float f, float f2) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
        this.LLILZ = f;
        this.LLILZIL = f2;
    }
}
