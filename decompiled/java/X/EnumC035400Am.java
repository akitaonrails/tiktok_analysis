package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC035400Am {
    public static final EnumC035400Am EDUCATION_SHEET_CREATE_AND_NOT_NOW;
    public static final EnumC035400Am EDUCATION_SHEET_GOT_IT;
    public static final /* synthetic */ EnumC035400Am[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC035400Am> getEntries() {
        return LLILLL;
    }

    static {
        EnumC035400Am enumC035400Am = new EnumC035400Am("EDUCATION_SHEET_GOT_IT", 0, 0);
        EDUCATION_SHEET_GOT_IT = enumC035400Am;
        EnumC035400Am enumC035400Am2 = new EnumC035400Am("EDUCATION_SHEET_CREATE_AND_NOT_NOW", 1, 1);
        EDUCATION_SHEET_CREATE_AND_NOT_NOW = enumC035400Am2;
        EnumC035400Am[] enumC035400AmArr = {enumC035400Am, enumC035400Am2};
        LLILLJJLI = enumC035400AmArr;
        LLILLL = new C2254308sP(enumC035400AmArr);
    }

    public static EnumC035400Am[] values() {
        return (EnumC035400Am[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC035400Am valueOf(String str) {
        return (EnumC035400Am) C08FF.LIZ(EnumC035400Am.class, str);
    }

    public EnumC035400Am(String str, int i, int i2) {
        this.LL = i2;
    }
}
