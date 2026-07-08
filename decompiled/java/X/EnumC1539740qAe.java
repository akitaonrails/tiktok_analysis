package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1539740qAe {
    public static final EnumC1539740qAe BUILTIN;
    public static final EnumC1539740qAe CDN;
    public static final EnumC1539740qAe GECKO;
    public static final /* synthetic */ EnumC1539740qAe[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1539740qAe MEMORY;
    public static final EnumC1539740qAe UNKNOWN;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1539740qAe> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1539740qAe enumC1539740qAe = new EnumC1539740qAe("GECKO", 0, "Gecko", 1);
        GECKO = enumC1539740qAe;
        EnumC1539740qAe enumC1539740qAe2 = new EnumC1539740qAe("CDN", 1, "CDN", 2);
        CDN = enumC1539740qAe2;
        EnumC1539740qAe enumC1539740qAe3 = new EnumC1539740qAe("BUILTIN", 2, "Builtin", 3);
        BUILTIN = enumC1539740qAe3;
        EnumC1539740qAe enumC1539740qAe4 = new EnumC1539740qAe("MEMORY", 3, "Memory", 4);
        MEMORY = enumC1539740qAe4;
        EnumC1539740qAe enumC1539740qAe5 = new EnumC1539740qAe("UNKNOWN", 4, "unknown", 5);
        UNKNOWN = enumC1539740qAe5;
        EnumC1539740qAe[] enumC1539740qAeArr = {enumC1539740qAe, enumC1539740qAe2, enumC1539740qAe3, enumC1539740qAe4, enumC1539740qAe5};
        LLILLL = enumC1539740qAeArr;
        LLILZ = new C2254308sP(enumC1539740qAeArr);
    }

    public static EnumC1539740qAe[] values() {
        return (EnumC1539740qAe[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC1539740qAe valueOf(String str) {
        return (EnumC1539740qAe) C08FF.LIZ(EnumC1539740qAe.class, str);
    }

    public EnumC1539740qAe(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
