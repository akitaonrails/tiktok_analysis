package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918990a1R {
    public static final EnumC918990a1R FLOAT;
    public static final EnumC918990a1R FLOAT_FIX;
    public static final EnumC918990a1R GRID_FIX;
    public static final EnumC918990a1R GRID_FLOAT;
    public static final EnumC918990a1R GRID_FLOAT_COHOST_OLD;
    public static final /* synthetic */ EnumC918990a1R[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC918990a1R NORMAL;
    public static final EnumC918990a1R ZOOM_GRID_ANCHOR;
    public static final EnumC918990a1R ZOOM_GRID_FLOAT_ANCHOR;
    public static final EnumC918990a1R ZOOM_GRID_FLOAT_GUEST;
    public static final EnumC918990a1R ZOOM_GRID_GUEST;
    public static final EnumC918990a1R ZOOM_PANEL;
    public static final EnumC918990a1R ZOOM_PANEL_FLOAT_GUEST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC918990a1R> getEntries() {
        return LLILLL;
    }

    static {
        EnumC918990a1R enumC918990a1R = new EnumC918990a1R("FLOAT", 0, "panel_float");
        FLOAT = enumC918990a1R;
        EnumC918990a1R enumC918990a1R2 = new EnumC918990a1R("FLOAT_FIX", 1, "panel_fix");
        FLOAT_FIX = enumC918990a1R2;
        EnumC918990a1R enumC918990a1R3 = new EnumC918990a1R("GRID_FLOAT", 2, "grid_float");
        GRID_FLOAT = enumC918990a1R3;
        EnumC918990a1R enumC918990a1R4 = new EnumC918990a1R("GRID_FIX", 3, "grid_fix");
        GRID_FIX = enumC918990a1R4;
        EnumC918990a1R enumC918990a1R5 = new EnumC918990a1R("NORMAL", 4, "normal");
        NORMAL = enumC918990a1R5;
        EnumC918990a1R enumC918990a1R6 = new EnumC918990a1R("GRID_FLOAT_COHOST_OLD", 5, "grid_float_cohost_old");
        GRID_FLOAT_COHOST_OLD = enumC918990a1R6;
        EnumC918990a1R enumC918990a1R7 = new EnumC918990a1R("ZOOM_PANEL", 6, "zoom_panel");
        ZOOM_PANEL = enumC918990a1R7;
        EnumC918990a1R enumC918990a1R8 = new EnumC918990a1R("ZOOM_GRID_GUEST", 7, "zoom_grid_guest");
        ZOOM_GRID_GUEST = enumC918990a1R8;
        EnumC918990a1R enumC918990a1R9 = new EnumC918990a1R("ZOOM_GRID_ANCHOR", 8, "zoom_grid_anchor");
        ZOOM_GRID_ANCHOR = enumC918990a1R9;
        EnumC918990a1R enumC918990a1R10 = new EnumC918990a1R("ZOOM_PANEL_FLOAT_GUEST", 9, "zoom_panel_float_guest");
        ZOOM_PANEL_FLOAT_GUEST = enumC918990a1R10;
        EnumC918990a1R enumC918990a1R11 = new EnumC918990a1R("ZOOM_GRID_FLOAT_GUEST", 10, "zoom_grid_float_guest");
        ZOOM_GRID_FLOAT_GUEST = enumC918990a1R11;
        EnumC918990a1R enumC918990a1R12 = new EnumC918990a1R("ZOOM_GRID_FLOAT_ANCHOR", 11, "zoom_grid_float_anchor");
        ZOOM_GRID_FLOAT_ANCHOR = enumC918990a1R12;
        EnumC918990a1R[] enumC918990a1RArr = {enumC918990a1R, enumC918990a1R2, enumC918990a1R3, enumC918990a1R4, enumC918990a1R5, enumC918990a1R6, enumC918990a1R7, enumC918990a1R8, enumC918990a1R9, enumC918990a1R10, enumC918990a1R11, enumC918990a1R12};
        LLILLJJLI = enumC918990a1RArr;
        LLILLL = new C2254308sP(enumC918990a1RArr);
    }

    public static EnumC918990a1R[] values() {
        return (EnumC918990a1R[]) LLILLJJLI.clone();
    }

    public final String getBusinessType() {
        return this.LL;
    }

    public static EnumC918990a1R valueOf(String str) {
        return (EnumC918990a1R) C08FF.LIZ(EnumC918990a1R.class, str);
    }

    public EnumC918990a1R(String str, int i, String str2) {
        this.LL = str2;
    }
}
