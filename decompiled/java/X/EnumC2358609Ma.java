package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09Ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2358609Ma {
    public static final EnumC2358609Ma CACHE;
    public static final EnumC2358609Ma FILES;
    public static final /* synthetic */ EnumC2358609Ma[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2358609Ma> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2358609Ma enumC2358609Ma = new EnumC2358609Ma("CACHE", 0, "y+2T0brqfIqkZDbYHfFiN/8XI5fyqrwX5cSWeGVK0ys=");
        CACHE = enumC2358609Ma;
        EnumC2358609Ma enumC2358609Ma2 = new EnumC2358609Ma("FILES", 1, "y+2T0brqfIqkZDbYHfFiN/8XI5L6pbEB5cSWeGVK0ys=");
        FILES = enumC2358609Ma2;
        EnumC2358609Ma[] enumC2358609MaArr = {enumC2358609Ma, enumC2358609Ma2};
        LLILLJJLI = enumC2358609MaArr;
        LLILLL = new C2254308sP(enumC2358609MaArr);
    }

    public static EnumC2358609Ma[] values() {
        return (EnumC2358609Ma[]) LLILLJJLI.clone();
    }

    public final String getToken() {
        return this.LL;
    }

    public static EnumC2358609Ma valueOf(String str) {
        return (EnumC2358609Ma) C08FF.LIZ(EnumC2358609Ma.class, str);
    }

    public EnumC2358609Ma(String str, int i, String str2) {
        this.LL = str2;
    }
}
