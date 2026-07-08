package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aJU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC930180aJU {
    public static final EnumC930180aJU CHANGE_TO_GRID;
    public static final EnumC930180aJU CHANGE_TO_GRID_FIX_ITEM;
    public static final EnumC930180aJU CHANGE_TO_GRID_ITEM;
    public static final EnumC930180aJU CHANGE_TO_PANEL;
    public static final EnumC930180aJU CHANGE_TO_PANEL_FIX_ITEM;
    public static final EnumC930180aJU CHANGE_TO_PANEL_ITEM;
    public static final /* synthetic */ EnumC930180aJU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC930180aJU TOGGLE_ADD_EMPTY_SEAT;
    public static final EnumC930180aJU TURN_OFF;
    public static final EnumC930180aJU TURN_ON;

    public static InterfaceC2044707zh<EnumC930180aJU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC930180aJU enumC930180aJU = new EnumC930180aJU("TURN_ON", 0);
        TURN_ON = enumC930180aJU;
        EnumC930180aJU enumC930180aJU2 = new EnumC930180aJU("TURN_OFF", 1);
        TURN_OFF = enumC930180aJU2;
        EnumC930180aJU enumC930180aJU3 = new EnumC930180aJU("CHANGE_TO_PANEL", 2);
        CHANGE_TO_PANEL = enumC930180aJU3;
        EnumC930180aJU enumC930180aJU4 = new EnumC930180aJU("CHANGE_TO_GRID", 3);
        CHANGE_TO_GRID = enumC930180aJU4;
        EnumC930180aJU enumC930180aJU5 = new EnumC930180aJU("CHANGE_TO_PANEL_ITEM", 4);
        CHANGE_TO_PANEL_ITEM = enumC930180aJU5;
        EnumC930180aJU enumC930180aJU6 = new EnumC930180aJU("CHANGE_TO_GRID_ITEM", 5);
        CHANGE_TO_GRID_ITEM = enumC930180aJU6;
        EnumC930180aJU enumC930180aJU7 = new EnumC930180aJU("CHANGE_TO_PANEL_FIX_ITEM", 6);
        CHANGE_TO_PANEL_FIX_ITEM = enumC930180aJU7;
        EnumC930180aJU enumC930180aJU8 = new EnumC930180aJU("CHANGE_TO_GRID_FIX_ITEM", 7);
        CHANGE_TO_GRID_FIX_ITEM = enumC930180aJU8;
        EnumC930180aJU enumC930180aJU9 = new EnumC930180aJU("TOGGLE_ADD_EMPTY_SEAT", 8);
        TOGGLE_ADD_EMPTY_SEAT = enumC930180aJU9;
        EnumC930180aJU[] enumC930180aJUArr = {enumC930180aJU, enumC930180aJU2, enumC930180aJU3, enumC930180aJU4, enumC930180aJU5, enumC930180aJU6, enumC930180aJU7, enumC930180aJU8, enumC930180aJU9};
        LL = enumC930180aJUArr;
        LLILLJJLI = new C2254308sP(enumC930180aJUArr);
    }

    public static EnumC930180aJU[] values() {
        return (EnumC930180aJU[]) LL.clone();
    }

    public static EnumC930180aJU valueOf(String str) {
        return (EnumC930180aJU) C08FF.LIZ(EnumC930180aJU.class, str);
    }

    public EnumC930180aJU(String str, int i) {
    }
}
