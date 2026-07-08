package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2180391AUz {
    public static final EnumC2180391AUz APP;
    public static final /* synthetic */ EnumC2180391AUz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2180391AUz SYSTEM;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2180391AUz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2180391AUz enumC2180391AUz = new EnumC2180391AUz("APP", 0, "app");
        APP = enumC2180391AUz;
        EnumC2180391AUz enumC2180391AUz2 = new EnumC2180391AUz("SYSTEM", 1, "system");
        SYSTEM = enumC2180391AUz2;
        EnumC2180391AUz[] enumC2180391AUzArr = {enumC2180391AUz, enumC2180391AUz2};
        LLILLJJLI = enumC2180391AUzArr;
        LLILLL = new C2254308sP(enumC2180391AUzArr);
    }

    public static EnumC2180391AUz[] values() {
        return (EnumC2180391AUz[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2180391AUz valueOf(String str) {
        return (EnumC2180391AUz) C08FF.LIZ(EnumC2180391AUz.class, str);
    }

    public EnumC2180391AUz(String str, int i, String str2) {
        this.LL = str2;
    }
}
