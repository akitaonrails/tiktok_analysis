package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1063570dmd {
    public static final /* synthetic */ EnumC1063570dmd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1063570dmd PRIVATE;
    public static final EnumC1063570dmd PROTECT;
    public static final EnumC1063570dmd PUBLIC;
    public static final EnumC1063570dmd SECURE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1063570dmd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1063570dmd enumC1063570dmd = new EnumC1063570dmd("PUBLIC", 0, "public");
        PUBLIC = enumC1063570dmd;
        EnumC1063570dmd enumC1063570dmd2 = new EnumC1063570dmd("PRIVATE", 1, "private");
        PRIVATE = enumC1063570dmd2;
        EnumC1063570dmd enumC1063570dmd3 = new EnumC1063570dmd("PROTECT", 2, "protect");
        PROTECT = enumC1063570dmd3;
        EnumC1063570dmd enumC1063570dmd4 = new EnumC1063570dmd("SECURE", 3, "secure");
        SECURE = enumC1063570dmd4;
        EnumC1063570dmd[] enumC1063570dmdArr = {enumC1063570dmd, enumC1063570dmd2, enumC1063570dmd3, enumC1063570dmd4};
        LLILLJJLI = enumC1063570dmdArr;
        LLILLL = new C2254308sP(enumC1063570dmdArr);
    }

    public static EnumC1063570dmd[] values() {
        return (EnumC1063570dmd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1063570dmd valueOf(String str) {
        return (EnumC1063570dmd) C08FF.LIZ(EnumC1063570dmd.class, str);
    }

    public EnumC1063570dmd(String str, int i, String str2) {
        this.LL = str2;
    }
}
