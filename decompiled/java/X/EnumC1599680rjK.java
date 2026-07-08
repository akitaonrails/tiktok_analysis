package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1599680rjK {
    public static final EnumC1599680rjK IGNORE;
    public static final /* synthetic */ EnumC1599680rjK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1599680rjK LYNX;
    public static final EnumC1599680rjK NATIVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1599680rjK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1599680rjK enumC1599680rjK = new EnumC1599680rjK("NATIVE", 0, "native");
        NATIVE = enumC1599680rjK;
        EnumC1599680rjK enumC1599680rjK2 = new EnumC1599680rjK("LYNX", 1, "lynx");
        LYNX = enumC1599680rjK2;
        EnumC1599680rjK enumC1599680rjK3 = new EnumC1599680rjK("IGNORE", 2, "ignore");
        IGNORE = enumC1599680rjK3;
        EnumC1599680rjK[] enumC1599680rjKArr = {enumC1599680rjK, enumC1599680rjK2, enumC1599680rjK3};
        LLILLJJLI = enumC1599680rjKArr;
        LLILLL = new C2254308sP(enumC1599680rjKArr);
    }

    public static EnumC1599680rjK[] values() {
        return (EnumC1599680rjK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1599680rjK valueOf(String str) {
        return (EnumC1599680rjK) C08FF.LIZ(EnumC1599680rjK.class, str);
    }

    public EnumC1599680rjK(String str, int i, String str2) {
        this.LL = str2;
    }
}
