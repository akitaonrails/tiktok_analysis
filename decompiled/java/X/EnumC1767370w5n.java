package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1767370w5n {
    public static final EnumC1767370w5n BOTTOM_LEFT;
    public static final EnumC1767370w5n BOTTOM_RIGHT;
    public static final /* synthetic */ EnumC1767370w5n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1767370w5n NONE;
    public static final EnumC1767370w5n TOP_LEFT;
    public static final EnumC1767370w5n TOP_RIGHT;

    public static InterfaceC2044707zh<EnumC1767370w5n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1767370w5n enumC1767370w5n = new EnumC1767370w5n("NONE", 0);
        NONE = enumC1767370w5n;
        EnumC1767370w5n enumC1767370w5n2 = new EnumC1767370w5n("TOP_LEFT", 1);
        TOP_LEFT = enumC1767370w5n2;
        EnumC1767370w5n enumC1767370w5n3 = new EnumC1767370w5n("TOP_RIGHT", 2);
        TOP_RIGHT = enumC1767370w5n3;
        EnumC1767370w5n enumC1767370w5n4 = new EnumC1767370w5n("BOTTOM_LEFT", 3);
        BOTTOM_LEFT = enumC1767370w5n4;
        EnumC1767370w5n enumC1767370w5n5 = new EnumC1767370w5n("BOTTOM_RIGHT", 4);
        BOTTOM_RIGHT = enumC1767370w5n5;
        EnumC1767370w5n[] enumC1767370w5nArr = {enumC1767370w5n, enumC1767370w5n2, enumC1767370w5n3, enumC1767370w5n4, enumC1767370w5n5};
        LL = enumC1767370w5nArr;
        LLILLJJLI = new C2254308sP(enumC1767370w5nArr);
    }

    public static EnumC1767370w5n[] values() {
        return (EnumC1767370w5n[]) LL.clone();
    }

    public static EnumC1767370w5n valueOf(String str) {
        return (EnumC1767370w5n) C08FF.LIZ(EnumC1767370w5n.class, str);
    }

    public EnumC1767370w5n(String str, int i) {
    }
}
