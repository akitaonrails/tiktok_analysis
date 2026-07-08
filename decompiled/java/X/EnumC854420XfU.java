package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854420XfU {
    public static final EnumC854420XfU EMAIL;
    public static final /* synthetic */ EnumC854420XfU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC854420XfU PASSWORD;
    public static final EnumC854420XfU SMS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC854420XfU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC854420XfU enumC854420XfU = new EnumC854420XfU("EMAIL", 0, "email");
        EMAIL = enumC854420XfU;
        EnumC854420XfU enumC854420XfU2 = new EnumC854420XfU("PASSWORD", 1, "password");
        PASSWORD = enumC854420XfU2;
        EnumC854420XfU enumC854420XfU3 = new EnumC854420XfU("SMS", 2, "sms");
        SMS = enumC854420XfU3;
        EnumC854420XfU[] enumC854420XfUArr = {enumC854420XfU, enumC854420XfU2, enumC854420XfU3};
        LLILLJJLI = enumC854420XfUArr;
        LLILLL = new C2254308sP(enumC854420XfUArr);
    }

    public static EnumC854420XfU[] values() {
        return (EnumC854420XfU[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC854420XfU valueOf(String str) {
        return (EnumC854420XfU) C08FF.LIZ(EnumC854420XfU.class, str);
    }

    public EnumC854420XfU(String str, int i, String str2) {
        this.LL = str2;
    }
}
