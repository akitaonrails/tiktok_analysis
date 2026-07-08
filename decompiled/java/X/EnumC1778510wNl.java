package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778510wNl {
    public static final EnumC1778510wNl DISK;
    public static final EnumC1778510wNl H5_MEMORY;
    public static final /* synthetic */ EnumC1778510wNl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1778510wNl MEMORY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1778510wNl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1778510wNl enumC1778510wNl = new EnumC1778510wNl("DISK", 0, "disk");
        DISK = enumC1778510wNl;
        EnumC1778510wNl enumC1778510wNl2 = new EnumC1778510wNl("MEMORY", 1, "memory");
        MEMORY = enumC1778510wNl2;
        EnumC1778510wNl enumC1778510wNl3 = new EnumC1778510wNl("H5_MEMORY", 2, "h5_memory");
        H5_MEMORY = enumC1778510wNl3;
        EnumC1778510wNl[] enumC1778510wNlArr = {enumC1778510wNl, enumC1778510wNl2, enumC1778510wNl3};
        LLILLJJLI = enumC1778510wNlArr;
        LLILLL = new C2254308sP(enumC1778510wNlArr);
    }

    public static EnumC1778510wNl[] values() {
        return (EnumC1778510wNl[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1778510wNl valueOf(String str) {
        return (EnumC1778510wNl) C08FF.LIZ(EnumC1778510wNl.class, str);
    }

    public EnumC1778510wNl(String str, int i, String str2) {
        this.LL = str2;
    }
}
