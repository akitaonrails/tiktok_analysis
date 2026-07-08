package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1580500rEO {
    public static final EnumC1580500rEO CHANGE_REGISTER;
    public static final EnumC1580500rEO COLD_START;
    public static final /* synthetic */ EnumC1580500rEO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1580500rEO USER_OPEN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1580500rEO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1580500rEO enumC1580500rEO = new EnumC1580500rEO("COLD_START", 0, "cold_start");
        COLD_START = enumC1580500rEO;
        EnumC1580500rEO enumC1580500rEO2 = new EnumC1580500rEO("USER_OPEN", 1, "user_open");
        USER_OPEN = enumC1580500rEO2;
        EnumC1580500rEO enumC1580500rEO3 = new EnumC1580500rEO("CHANGE_REGISTER", 2, "change_register");
        CHANGE_REGISTER = enumC1580500rEO3;
        EnumC1580500rEO[] enumC1580500rEOArr = {enumC1580500rEO, enumC1580500rEO2, enumC1580500rEO3};
        LLILLJJLI = enumC1580500rEOArr;
        LLILLL = new C2254308sP(enumC1580500rEOArr);
    }

    public static EnumC1580500rEO[] values() {
        return (EnumC1580500rEO[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1580500rEO valueOf(String str) {
        return (EnumC1580500rEO) C08FF.LIZ(EnumC1580500rEO.class, str);
    }

    public EnumC1580500rEO(String str, int i, String str2) {
        this.LL = str2;
    }
}
