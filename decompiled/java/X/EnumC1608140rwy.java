package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1608140rwy {
    public static final EnumC1608140rwy AD_PLAYABLE;
    public static final EnumC1608140rwy CLEAR_MODE;
    public static final EnumC1608140rwy DESC_BAR;
    public static final EnumC1608140rwy EDGE_SPEEDUP;
    public static final /* synthetic */ EnumC1608140rwy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1608140rwy MINI_DRAMA_CLEAR_MODE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1608140rwy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1608140rwy enumC1608140rwy = new EnumC1608140rwy("DESC_BAR", 0, "DescBottomInteractController");
        DESC_BAR = enumC1608140rwy;
        EnumC1608140rwy enumC1608140rwy2 = new EnumC1608140rwy("EDGE_SPEEDUP", 1, "EdgeSpeedupBottomController");
        EDGE_SPEEDUP = enumC1608140rwy2;
        EnumC1608140rwy enumC1608140rwy3 = new EnumC1608140rwy("CLEAR_MODE", 2, "ClearModeBottomController");
        CLEAR_MODE = enumC1608140rwy3;
        EnumC1608140rwy enumC1608140rwy4 = new EnumC1608140rwy("AD_PLAYABLE", 3, "AdPlayableBottomController");
        AD_PLAYABLE = enumC1608140rwy4;
        EnumC1608140rwy enumC1608140rwy5 = new EnumC1608140rwy("MINI_DRAMA_CLEAR_MODE", 4, "MiniDramaClearModeBottomController");
        MINI_DRAMA_CLEAR_MODE = enumC1608140rwy5;
        EnumC1608140rwy[] enumC1608140rwyArr = {enumC1608140rwy, enumC1608140rwy2, enumC1608140rwy3, enumC1608140rwy4, enumC1608140rwy5};
        LLILLJJLI = enumC1608140rwyArr;
        LLILLL = new C2254308sP(enumC1608140rwyArr);
    }

    public static EnumC1608140rwy[] values() {
        return (EnumC1608140rwy[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC1608140rwy valueOf(String str) {
        return (EnumC1608140rwy) C08FF.LIZ(EnumC1608140rwy.class, str);
    }

    public EnumC1608140rwy(String str, int i, String str2) {
        this.LL = str2;
    }
}
