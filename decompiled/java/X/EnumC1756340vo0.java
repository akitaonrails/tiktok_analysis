package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vo0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1756340vo0 {
    public static final C1756650voV Companion;
    public static final EnumC1756340vo0 HALF_SCREEN_TOP;
    public static final /* synthetic */ EnumC1756340vo0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "half_screen_top";

    public static InterfaceC2044707zh<EnumC1756340vo0> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0voV] */
    static {
        EnumC1756340vo0 enumC1756340vo0 = new EnumC1756340vo0();
        HALF_SCREEN_TOP = enumC1756340vo0;
        EnumC1756340vo0[] enumC1756340vo0Arr = {enumC1756340vo0};
        LLILLJJLI = enumC1756340vo0Arr;
        LLILLL = new C2254308sP(enumC1756340vo0Arr);
        Companion = new Object() { // from class: X.0voV
        };
    }

    public static EnumC1756340vo0[] values() {
        return (EnumC1756340vo0[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1756340vo0 valueOf(String str) {
        return (EnumC1756340vo0) C08FF.LIZ(EnumC1756340vo0.class, str);
    }
}
