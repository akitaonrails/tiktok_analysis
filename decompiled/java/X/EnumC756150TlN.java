package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TlN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC756150TlN {
    public static final EnumC756150TlN ADDED;
    public static final EnumC756150TlN CLOSE;
    public static final /* synthetic */ EnumC756150TlN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC756150TlN REMOVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC756150TlN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC756150TlN enumC756150TlN = new EnumC756150TlN("ADDED", 0, "1");
        ADDED = enumC756150TlN;
        EnumC756150TlN enumC756150TlN2 = new EnumC756150TlN("REMOVE", 1, "2");
        REMOVE = enumC756150TlN2;
        EnumC756150TlN enumC756150TlN3 = new EnumC756150TlN("CLOSE", 2, "3");
        CLOSE = enumC756150TlN3;
        EnumC756150TlN[] enumC756150TlNArr = {enumC756150TlN, enumC756150TlN2, enumC756150TlN3};
        LLILLJJLI = enumC756150TlNArr;
        LLILLL = new C2254308sP(enumC756150TlNArr);
    }

    public static EnumC756150TlN[] values() {
        return (EnumC756150TlN[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC756150TlN valueOf(String str) {
        return (EnumC756150TlN) C08FF.LIZ(EnumC756150TlN.class, str);
    }

    public EnumC756150TlN(String str, int i, String str2) {
        this.LL = str2;
    }
}
