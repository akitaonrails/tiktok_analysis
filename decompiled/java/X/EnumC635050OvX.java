package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC635050OvX {
    public static final EnumC635050OvX CONTAINER_MORE_FUNCTION_ROUTE;
    public static final EnumC635050OvX GUIDANCE_PANEL;
    public static final EnumC635050OvX INSIDE_GAME_EDU;
    public static final /* synthetic */ EnumC635050OvX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC635050OvX SNACK_BAR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC635050OvX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC635050OvX enumC635050OvX = new EnumC635050OvX("INSIDE_GAME_EDU", 0, "inside_game_edu");
        INSIDE_GAME_EDU = enumC635050OvX;
        EnumC635050OvX enumC635050OvX2 = new EnumC635050OvX("CONTAINER_MORE_FUNCTION_ROUTE", 1, "container_more_function_route");
        CONTAINER_MORE_FUNCTION_ROUTE = enumC635050OvX2;
        EnumC635050OvX enumC635050OvX3 = new EnumC635050OvX("GUIDANCE_PANEL", 2, "guidance_panel");
        GUIDANCE_PANEL = enumC635050OvX3;
        EnumC635050OvX enumC635050OvX4 = new EnumC635050OvX("SNACK_BAR", 3, "snack_bar");
        SNACK_BAR = enumC635050OvX4;
        EnumC635050OvX[] enumC635050OvXArr = {enumC635050OvX, enumC635050OvX2, enumC635050OvX3, enumC635050OvX4};
        LLILLJJLI = enumC635050OvXArr;
        LLILLL = new C2254308sP(enumC635050OvXArr);
    }

    public static EnumC635050OvX[] values() {
        return (EnumC635050OvX[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC635050OvX valueOf(String str) {
        return (EnumC635050OvX) C08FF.LIZ(EnumC635050OvX.class, str);
    }

    public EnumC635050OvX(String str, int i, String str2) {
        this.LL = str2;
    }
}
