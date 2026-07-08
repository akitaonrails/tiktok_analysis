package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC773230UUv {
    public static final /* synthetic */ EnumC773230UUv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC773230UUv STATE_T0;
    public static final EnumC773230UUv STATE_T1;
    public static final EnumC773230UUv STATE_T2;
    public final String LL;

    public static InterfaceC2044707zh<EnumC773230UUv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC773230UUv enumC773230UUv = new EnumC773230UUv("STATE_T0", 0, "T0");
        STATE_T0 = enumC773230UUv;
        EnumC773230UUv enumC773230UUv2 = new EnumC773230UUv("STATE_T1", 1, "T1");
        STATE_T1 = enumC773230UUv2;
        EnumC773230UUv enumC773230UUv3 = new EnumC773230UUv("STATE_T2", 2, "T2");
        STATE_T2 = enumC773230UUv3;
        EnumC773230UUv[] enumC773230UUvArr = {enumC773230UUv, enumC773230UUv2, enumC773230UUv3};
        LLILLJJLI = enumC773230UUvArr;
        LLILLL = new C2254308sP(enumC773230UUvArr);
    }

    public static EnumC773230UUv[] values() {
        return (EnumC773230UUv[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC773230UUv valueOf(String str) {
        return (EnumC773230UUv) C08FF.LIZ(EnumC773230UUv.class, str);
    }

    public EnumC773230UUv(String str, int i, String str2) {
        this.LL = str2;
    }
}
