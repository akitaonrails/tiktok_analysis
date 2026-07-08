package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC920920a4Y {
    public static final EnumC920920a4Y BAD;
    public static final EnumC920920a4Y GOOD;
    public static final /* synthetic */ EnumC920920a4Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC920920a4Y UNKNOWN;
    public static final EnumC920920a4Y VERY_BAD;

    public static InterfaceC2044707zh<EnumC920920a4Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC920920a4Y enumC920920a4Y = new EnumC920920a4Y("GOOD", 0);
        GOOD = enumC920920a4Y;
        EnumC920920a4Y enumC920920a4Y2 = new EnumC920920a4Y("BAD", 1);
        BAD = enumC920920a4Y2;
        EnumC920920a4Y enumC920920a4Y3 = new EnumC920920a4Y("VERY_BAD", 2);
        VERY_BAD = enumC920920a4Y3;
        EnumC920920a4Y enumC920920a4Y4 = new EnumC920920a4Y("UNKNOWN", 3);
        UNKNOWN = enumC920920a4Y4;
        EnumC920920a4Y[] enumC920920a4YArr = {enumC920920a4Y, enumC920920a4Y2, enumC920920a4Y3, enumC920920a4Y4};
        LL = enumC920920a4YArr;
        LLILLJJLI = new C2254308sP(enumC920920a4YArr);
    }

    public static EnumC920920a4Y[] values() {
        return (EnumC920920a4Y[]) LL.clone();
    }

    public static EnumC920920a4Y valueOf(String str) {
        return (EnumC920920a4Y) C08FF.LIZ(EnumC920920a4Y.class, str);
    }

    public EnumC920920a4Y(String str, int i) {
    }
}
