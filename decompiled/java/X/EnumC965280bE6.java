package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bE6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC965280bE6 {
    public static final /* synthetic */ EnumC965280bE6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC965280bE6 MULTI_GUEST;
    public static final EnumC965280bE6 MULTI_HOST;
    public static final EnumC965280bE6 UNION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC965280bE6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC965280bE6 enumC965280bE6 = new EnumC965280bE6("UNION", 0, "union");
        UNION = enumC965280bE6;
        EnumC965280bE6 enumC965280bE62 = new EnumC965280bE6("MULTI_GUEST", 1, "multi_guest");
        MULTI_GUEST = enumC965280bE62;
        EnumC965280bE6 enumC965280bE63 = new EnumC965280bE6("MULTI_HOST", 2, "multi_host");
        MULTI_HOST = enumC965280bE63;
        EnumC965280bE6[] enumC965280bE6Arr = {enumC965280bE6, enumC965280bE62, enumC965280bE63};
        LLILLJJLI = enumC965280bE6Arr;
        LLILLL = new C2254308sP(enumC965280bE6Arr);
    }

    public static EnumC965280bE6[] values() {
        return (EnumC965280bE6[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC965280bE6 valueOf(String str) {
        return (EnumC965280bE6) C08FF.LIZ(EnumC965280bE6.class, str);
    }

    public EnumC965280bE6(String str, int i, String str2) {
        this.LL = str2;
    }
}
