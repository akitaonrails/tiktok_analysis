package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1195650hDf {
    public static final EnumC1195650hDf LARGE;
    public static final /* synthetic */ EnumC1195650hDf[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC1195650hDf MEDIUM;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;

    public static InterfaceC2044707zh<EnumC1195650hDf> getEntries() {
        return LLIZ;
    }

    static {
        EnumC1195650hDf enumC1195650hDf = new EnumC1195650hDf("MEDIUM", 0, 28, 12, 16, 71, 81);
        MEDIUM = enumC1195650hDf;
        EnumC1195650hDf enumC1195650hDf2 = new EnumC1195650hDf("LARGE", 1, 32, 16, 20, 51, 61);
        LARGE = enumC1195650hDf2;
        EnumC1195650hDf[] enumC1195650hDfArr = {enumC1195650hDf, enumC1195650hDf2};
        LLILZLL = enumC1195650hDfArr;
        LLIZ = new C2254308sP(enumC1195650hDfArr);
    }

    public static EnumC1195650hDf[] values() {
        return (EnumC1195650hDf[]) LLILZLL.clone();
    }

    public final int getAvatarSizeDp() {
        return this.LLILLL;
    }

    public final int getChipHeightDp() {
        return this.LL;
    }

    public final int getIconSizeDp() {
        return this.LLILLJJLI;
    }

    public final int getLabelFont() {
        return this.LLILZ;
    }

    public final int getTrailingNumberFont() {
        return this.LLILZIL;
    }

    public static EnumC1195650hDf valueOf(String str) {
        return (EnumC1195650hDf) C08FF.LIZ(EnumC1195650hDf.class, str);
    }

    public EnumC1195650hDf(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
        this.LLILZ = i5;
        this.LLILZIL = i6;
    }
}
