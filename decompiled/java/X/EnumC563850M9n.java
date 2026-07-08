package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC563850M9n {
    public static final EnumC563850M9n CELL_BUTTON;
    public static final EnumC563850M9n DISABLE;
    public static final EnumC563850M9n FLOAT_TOGGLE;
    public static final /* synthetic */ EnumC563850M9n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC563850M9n TOP_TOGGLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC563850M9n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC563850M9n enumC563850M9n = new EnumC563850M9n("DISABLE", 0, "disable");
        DISABLE = enumC563850M9n;
        EnumC563850M9n enumC563850M9n2 = new EnumC563850M9n("TOP_TOGGLE", 1, "top_toggle");
        TOP_TOGGLE = enumC563850M9n2;
        EnumC563850M9n enumC563850M9n3 = new EnumC563850M9n("CELL_BUTTON", 2, "cell_button");
        CELL_BUTTON = enumC563850M9n3;
        EnumC563850M9n enumC563850M9n4 = new EnumC563850M9n("FLOAT_TOGGLE", 3, "float_toggle");
        FLOAT_TOGGLE = enumC563850M9n4;
        EnumC563850M9n[] enumC563850M9nArr = {enumC563850M9n, enumC563850M9n2, enumC563850M9n3, enumC563850M9n4};
        LLILLJJLI = enumC563850M9nArr;
        LLILLL = new C2254308sP(enumC563850M9nArr);
    }

    public static EnumC563850M9n[] values() {
        return (EnumC563850M9n[]) LLILLJJLI.clone();
    }

    public final String getMobName() {
        return this.LL;
    }

    public static EnumC563850M9n valueOf(String str) {
        return (EnumC563850M9n) C08FF.LIZ(EnumC563850M9n.class, str);
    }

    public EnumC563850M9n(String str, int i, String str2) {
        this.LL = str2;
    }
}
