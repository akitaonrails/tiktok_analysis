package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1749100vcK {
    public static final EnumC1749100vcK EMPTY_ERROR;
    public static final EnumC1749100vcK FORM_ERROR;
    public static final EnumC1749100vcK LENGTH_ERROR;
    public static final /* synthetic */ EnumC1749100vcK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1749100vcK SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1749100vcK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1749100vcK enumC1749100vcK = new EnumC1749100vcK("SUCCESS", 0, "success");
        SUCCESS = enumC1749100vcK;
        EnumC1749100vcK enumC1749100vcK2 = new EnumC1749100vcK("EMPTY_ERROR", 1, "empty");
        EMPTY_ERROR = enumC1749100vcK2;
        EnumC1749100vcK enumC1749100vcK3 = new EnumC1749100vcK("FORM_ERROR", 2, "form_error");
        FORM_ERROR = enumC1749100vcK3;
        EnumC1749100vcK enumC1749100vcK4 = new EnumC1749100vcK("LENGTH_ERROR", 3, "length_error");
        LENGTH_ERROR = enumC1749100vcK4;
        EnumC1749100vcK[] enumC1749100vcKArr = {enumC1749100vcK, enumC1749100vcK2, enumC1749100vcK3, enumC1749100vcK4};
        LLILLJJLI = enumC1749100vcKArr;
        LLILLL = new C2254308sP(enumC1749100vcKArr);
    }

    public static EnumC1749100vcK[] values() {
        return (EnumC1749100vcK[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC1749100vcK valueOf(String str) {
        return (EnumC1749100vcK) C08FF.LIZ(EnumC1749100vcK.class, str);
    }

    public EnumC1749100vcK(String str, int i, String str2) {
        this.LL = str2;
    }
}
