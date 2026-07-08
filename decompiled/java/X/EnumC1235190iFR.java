package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235190iFR {
    public static final EnumC1235190iFR EMAIL;
    public static final /* synthetic */ EnumC1235190iFR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235190iFR PHONE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235190iFR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235190iFR enumC1235190iFR = new EnumC1235190iFR("EMAIL", 0, "email");
        EMAIL = enumC1235190iFR;
        EnumC1235190iFR enumC1235190iFR2 = new EnumC1235190iFR("PHONE", 1, "phone");
        PHONE = enumC1235190iFR2;
        EnumC1235190iFR[] enumC1235190iFRArr = {enumC1235190iFR, enumC1235190iFR2};
        LLILLJJLI = enumC1235190iFRArr;
        LLILLL = new C2254308sP(enumC1235190iFRArr);
    }

    public static EnumC1235190iFR[] values() {
        return (EnumC1235190iFR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235190iFR valueOf(String str) {
        return (EnumC1235190iFR) C08FF.LIZ(EnumC1235190iFR.class, str);
    }

    public EnumC1235190iFR(String str, int i, String str2) {
        this.LL = str2;
    }
}
