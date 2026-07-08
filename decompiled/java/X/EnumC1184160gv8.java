package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1184160gv8 {
    public static final /* synthetic */ EnumC1184160gv8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1184160gv8 POI_BOTTOM_BAR;
    public static final EnumC1184160gv8 POI_HEADER;
    public static final EnumC1184160gv8 POI_NAV_BAR;
    public static final EnumC1184160gv8 UNKNOWN;

    public static InterfaceC2044707zh<EnumC1184160gv8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1184160gv8 enumC1184160gv8 = new EnumC1184160gv8("POI_NAV_BAR", 0);
        POI_NAV_BAR = enumC1184160gv8;
        EnumC1184160gv8 enumC1184160gv82 = new EnumC1184160gv8("POI_BOTTOM_BAR", 1);
        POI_BOTTOM_BAR = enumC1184160gv82;
        EnumC1184160gv8 enumC1184160gv83 = new EnumC1184160gv8("POI_HEADER", 2);
        POI_HEADER = enumC1184160gv83;
        EnumC1184160gv8 enumC1184160gv84 = new EnumC1184160gv8("UNKNOWN", 3);
        UNKNOWN = enumC1184160gv84;
        EnumC1184160gv8[] enumC1184160gv8Arr = {enumC1184160gv8, enumC1184160gv82, enumC1184160gv83, enumC1184160gv84};
        LL = enumC1184160gv8Arr;
        LLILLJJLI = new C2254308sP(enumC1184160gv8Arr);
    }

    public static EnumC1184160gv8[] values() {
        return (EnumC1184160gv8[]) LL.clone();
    }

    public static EnumC1184160gv8 valueOf(String str) {
        return (EnumC1184160gv8) C08FF.LIZ(EnumC1184160gv8.class, str);
    }

    public EnumC1184160gv8(String str, int i) {
    }
}
