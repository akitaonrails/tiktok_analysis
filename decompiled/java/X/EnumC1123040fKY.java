package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1123040fKY {
    public static final EnumC1123040fKY COURSE;
    public static final EnumC1123040fKY DM;
    public static final EnumC1123040fKY FORM;
    public static final /* synthetic */ EnumC1123040fKY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1123040fKY SERVICE_PLUS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1123040fKY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1123040fKY enumC1123040fKY = new EnumC1123040fKY("DM", 0, 0);
        DM = enumC1123040fKY;
        EnumC1123040fKY enumC1123040fKY2 = new EnumC1123040fKY("FORM", 1, 1);
        FORM = enumC1123040fKY2;
        EnumC1123040fKY enumC1123040fKY3 = new EnumC1123040fKY("COURSE", 2, 2);
        COURSE = enumC1123040fKY3;
        EnumC1123040fKY enumC1123040fKY4 = new EnumC1123040fKY("SERVICE_PLUS", 3, 3);
        SERVICE_PLUS = enumC1123040fKY4;
        EnumC1123040fKY[] enumC1123040fKYArr = {enumC1123040fKY, enumC1123040fKY2, enumC1123040fKY3, enumC1123040fKY4};
        LLILLJJLI = enumC1123040fKYArr;
        LLILLL = new C2254308sP(enumC1123040fKYArr);
    }

    public static EnumC1123040fKY[] values() {
        return (EnumC1123040fKY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1123040fKY valueOf(String str) {
        return (EnumC1123040fKY) C08FF.LIZ(EnumC1123040fKY.class, str);
    }

    public EnumC1123040fKY(String str, int i, int i2) {
        this.LL = i2;
    }
}
