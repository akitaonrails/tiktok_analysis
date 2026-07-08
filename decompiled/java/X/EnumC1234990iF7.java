package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1234990iF7 {
    public static final EnumC1234990iF7 DIGITAL_1;
    public static final EnumC1234990iF7 DIGITAL_2;
    public static final EnumC1234990iF7 DIGITAL_3;
    public static final /* synthetic */ EnumC1234990iF7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1234990iF7 UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1234990iF7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1234990iF7 enumC1234990iF7 = new EnumC1234990iF7("DIGITAL_1", 0, "1");
        DIGITAL_1 = enumC1234990iF7;
        EnumC1234990iF7 enumC1234990iF72 = new EnumC1234990iF7("DIGITAL_2", 1, "2");
        DIGITAL_2 = enumC1234990iF72;
        EnumC1234990iF7 enumC1234990iF73 = new EnumC1234990iF7("DIGITAL_3", 2, "3");
        DIGITAL_3 = enumC1234990iF73;
        EnumC1234990iF7 enumC1234990iF74 = new EnumC1234990iF7("UNKNOWN", 3, "100");
        UNKNOWN = enumC1234990iF74;
        EnumC1234990iF7[] enumC1234990iF7Arr = {enumC1234990iF7, enumC1234990iF72, enumC1234990iF73, enumC1234990iF74};
        LLILLJJLI = enumC1234990iF7Arr;
        LLILLL = new C2254308sP(enumC1234990iF7Arr);
    }

    public static EnumC1234990iF7[] values() {
        return (EnumC1234990iF7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1234990iF7 valueOf(String str) {
        return (EnumC1234990iF7) C08FF.LIZ(EnumC1234990iF7.class, str);
    }

    public EnumC1234990iF7(String str, int i, String str2) {
        this.LL = str2;
    }
}
