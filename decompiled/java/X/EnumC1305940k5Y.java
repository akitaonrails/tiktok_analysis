package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1305940k5Y {
    public static final EnumC1305940k5Y CUSTOM;
    public static final EnumC1305940k5Y DSA;
    public static final /* synthetic */ EnumC1305940k5Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1305940k5Y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1305940k5Y enumC1305940k5Y = new EnumC1305940k5Y("DSA", 0, "dsa");
        DSA = enumC1305940k5Y;
        EnumC1305940k5Y enumC1305940k5Y2 = new EnumC1305940k5Y("CUSTOM", 1, "custom");
        CUSTOM = enumC1305940k5Y2;
        EnumC1305940k5Y[] enumC1305940k5YArr = {enumC1305940k5Y, enumC1305940k5Y2};
        LLILLJJLI = enumC1305940k5YArr;
        LLILLL = new C2254308sP(enumC1305940k5YArr);
    }

    public static EnumC1305940k5Y[] values() {
        return (EnumC1305940k5Y[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1305940k5Y valueOf(String str) {
        return (EnumC1305940k5Y) C08FF.LIZ(EnumC1305940k5Y.class, str);
    }

    public EnumC1305940k5Y(String str, int i, String str2) {
        this.LL = str2;
    }
}
