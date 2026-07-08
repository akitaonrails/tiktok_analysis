package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dkk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1062400dkk {
    public static final /* synthetic */ EnumC1062400dkk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1062400dkk PRIVATE;
    public static final EnumC1062400dkk PROTECT;
    public static final EnumC1062400dkk PUBLIC;
    public static final EnumC1062400dkk SECURE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1062400dkk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1062400dkk enumC1062400dkk = new EnumC1062400dkk("PUBLIC", 0, "public");
        PUBLIC = enumC1062400dkk;
        EnumC1062400dkk enumC1062400dkk2 = new EnumC1062400dkk("PROTECT", 1, "protected");
        PROTECT = enumC1062400dkk2;
        EnumC1062400dkk enumC1062400dkk3 = new EnumC1062400dkk("PRIVATE", 2, "private");
        PRIVATE = enumC1062400dkk3;
        EnumC1062400dkk enumC1062400dkk4 = new EnumC1062400dkk("SECURE", 3, "secure");
        SECURE = enumC1062400dkk4;
        EnumC1062400dkk[] enumC1062400dkkArr = {enumC1062400dkk, enumC1062400dkk2, enumC1062400dkk3, enumC1062400dkk4};
        LLILLJJLI = enumC1062400dkkArr;
        LLILLL = new C2254308sP(enumC1062400dkkArr);
    }

    public static EnumC1062400dkk[] values() {
        return (EnumC1062400dkk[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1062400dkk valueOf(String str) {
        return (EnumC1062400dkk) C08FF.LIZ(EnumC1062400dkk.class, str);
    }

    public EnumC1062400dkk(String str, int i, String str2) {
        this.LL = str2;
    }
}
