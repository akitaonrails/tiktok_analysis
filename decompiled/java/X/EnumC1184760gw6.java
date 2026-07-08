package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1184760gw6 {
    public static final EnumC1184760gw6 CACHE;
    public static final /* synthetic */ EnumC1184760gw6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1184760gw6 REAL;
    public static final EnumC1184760gw6 UNKNOWN;

    public static InterfaceC2044707zh<EnumC1184760gw6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1184760gw6 enumC1184760gw6 = new EnumC1184760gw6("UNKNOWN", 0);
        UNKNOWN = enumC1184760gw6;
        EnumC1184760gw6 enumC1184760gw62 = new EnumC1184760gw6("CACHE", 1);
        CACHE = enumC1184760gw62;
        EnumC1184760gw6 enumC1184760gw63 = new EnumC1184760gw6("REAL", 2);
        REAL = enumC1184760gw63;
        EnumC1184760gw6[] enumC1184760gw6Arr = {enumC1184760gw6, enumC1184760gw62, enumC1184760gw63};
        LL = enumC1184760gw6Arr;
        LLILLJJLI = new C2254308sP(enumC1184760gw6Arr);
    }

    public static EnumC1184760gw6[] values() {
        return (EnumC1184760gw6[]) LL.clone();
    }

    public static EnumC1184760gw6 valueOf(String str) {
        return (EnumC1184760gw6) C08FF.LIZ(EnumC1184760gw6.class, str);
    }

    public EnumC1184760gw6(String str, int i) {
    }
}
