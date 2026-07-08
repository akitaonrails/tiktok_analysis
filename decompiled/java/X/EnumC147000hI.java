package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00hI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC147000hI {
    public static final EnumC147000hI ANCHOR;
    public static final EnumC147000hI AUDIENCE;
    public static final /* synthetic */ EnumC147000hI[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public String LL;
    public String LLILLJJLI = "user_type";

    public static InterfaceC2044707zh<EnumC147000hI> getEntries() {
        return LLILZ;
    }

    static {
        EnumC147000hI enumC147000hI = new EnumC147000hI("ANCHOR", 0, "anchor");
        ANCHOR = enumC147000hI;
        EnumC147000hI enumC147000hI2 = new EnumC147000hI("AUDIENCE", 1, "audience");
        AUDIENCE = enumC147000hI2;
        EnumC147000hI[] enumC147000hIArr = {enumC147000hI, enumC147000hI2};
        LLILLL = enumC147000hIArr;
        LLILZ = new C2254308sP(enumC147000hIArr);
    }

    public static EnumC147000hI[] values() {
        return (EnumC147000hI[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC147000hI valueOf(String str) {
        return (EnumC147000hI) C08FF.LIZ(EnumC147000hI.class, str);
    }

    public final void setKey(String str) {
        this.LLILLJJLI = str;
    }

    public final void setValue(String str) {
        this.LL = str;
    }

    public EnumC147000hI(String str, int i, String str2) {
        this.LL = str2;
    }
}
