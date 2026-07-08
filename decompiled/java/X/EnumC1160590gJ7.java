package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gJ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1160590gJ7 {
    public static final C1160600gJ8 Companion;
    public static final EnumC1160590gJ7 GRID;
    public static final EnumC1160590gJ7 LIST;
    public static final /* synthetic */ EnumC1160590gJ7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1160590gJ7 WATERFALL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1160590gJ7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1160590gJ7 enumC1160590gJ7 = new EnumC1160590gJ7("LIST", 0, "list");
        LIST = enumC1160590gJ7;
        EnumC1160590gJ7 enumC1160590gJ72 = new EnumC1160590gJ7("GRID", 1, "grid");
        GRID = enumC1160590gJ72;
        EnumC1160590gJ7 enumC1160590gJ73 = new EnumC1160590gJ7("WATERFALL", 2, "waterfall");
        WATERFALL = enumC1160590gJ73;
        EnumC1160590gJ7[] enumC1160590gJ7Arr = {enumC1160590gJ7, enumC1160590gJ72, enumC1160590gJ73};
        LLILLJJLI = enumC1160590gJ7Arr;
        LLILLL = new C2254308sP(enumC1160590gJ7Arr);
        Companion = new C1160600gJ8();
    }

    public static EnumC1160590gJ7[] values() {
        return (EnumC1160590gJ7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1160590gJ7 valueOf(String str) {
        return (EnumC1160590gJ7) C08FF.LIZ(EnumC1160590gJ7.class, str);
    }

    public EnumC1160590gJ7(String str, int i, String str2) {
        this.LL = str2;
    }
}
