package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1032860cz6 {
    public static final C1033500d08 Companion;
    public static final /* synthetic */ EnumC1032860cz6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1032860cz6 NORMAL;
    public static final EnumC1032860cz6 ONE_TO_N;
    public static final EnumC1032860cz6 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1032860cz6> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0d08] */
    static {
        EnumC1032860cz6 enumC1032860cz6 = new EnumC1032860cz6("UNKNOWN", 0, -1);
        UNKNOWN = enumC1032860cz6;
        EnumC1032860cz6 enumC1032860cz62 = new EnumC1032860cz6("NORMAL", 1, 0);
        NORMAL = enumC1032860cz62;
        EnumC1032860cz6 enumC1032860cz63 = new EnumC1032860cz6("ONE_TO_N", 2, 1);
        ONE_TO_N = enumC1032860cz63;
        EnumC1032860cz6[] enumC1032860cz6Arr = {enumC1032860cz6, enumC1032860cz62, enumC1032860cz63};
        LLILLJJLI = enumC1032860cz6Arr;
        LLILLL = new C2254308sP(enumC1032860cz6Arr);
        Companion = new Object() { // from class: X.0d08
        };
    }

    public static EnumC1032860cz6[] values() {
        return (EnumC1032860cz6[]) LLILLJJLI.clone();
    }

    public final boolean isOneToN() {
        return this == ONE_TO_N;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1032860cz6 valueOf(String str) {
        return (EnumC1032860cz6) C08FF.LIZ(EnumC1032860cz6.class, str);
    }

    public EnumC1032860cz6(String str, int i, int i2) {
        this.LL = i2;
    }
}
