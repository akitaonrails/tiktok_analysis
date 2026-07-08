package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uW7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1706810uW7 {
    public static final EnumC1706810uW7 LLILLJJLI;
    public static final EnumC1706810uW7 LLILLL;
    public static final EnumC1706810uW7 LLILZ;
    public static final EnumC1706810uW7 LLILZIL;
    public static final EnumC1706810uW7 LLILZLL;
    public static final /* synthetic */ EnumC1706810uW7[] LLIZ;
    public final int LL;

    static {
        EnumC1706810uW7 enumC1706810uW7 = new EnumC1706810uW7("SUCCESS", 0, 0);
        LLILLJJLI = enumC1706810uW7;
        EnumC1706810uW7 enumC1706810uW72 = new EnumC1706810uW7("FILE_URI_NULL", 1, 1);
        LLILLL = enumC1706810uW72;
        EnumC1706810uW7 enumC1706810uW73 = new EnumC1706810uW7("DETECT_VIDEO_RESPONSE_NULL", 2, 2);
        LLILZ = enumC1706810uW73;
        EnumC1706810uW7 enumC1706810uW74 = new EnumC1706810uW7("RECOMMEND_ID_NULL", 3, 3);
        LLILZIL = enumC1706810uW74;
        EnumC1706810uW7 enumC1706810uW75 = new EnumC1706810uW7("RECOMMEND_PRODUCT_RESPONSE_NULL", 4, 4);
        LLILZLL = enumC1706810uW75;
        EnumC1706810uW7[] enumC1706810uW7Arr = {enumC1706810uW7, enumC1706810uW72, enumC1706810uW73, enumC1706810uW74, enumC1706810uW75};
        LLIZ = enumC1706810uW7Arr;
        new C2254308sP(enumC1706810uW7Arr);
    }

    public static EnumC1706810uW7[] values() {
        return (EnumC1706810uW7[]) LLIZ.clone();
    }

    public static EnumC1706810uW7 valueOf(String str) {
        return (EnumC1706810uW7) C08FF.LIZ(EnumC1706810uW7.class, str);
    }

    public EnumC1706810uW7(String str, int i, int i2) {
        this.LL = i2;
    }
}
