package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1174810gg3 {
    public static final EnumC1174810gg3 CLICK_ARROW;
    public static final EnumC1174810gg3 CLICK_POI;
    public static final /* synthetic */ EnumC1174810gg3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1174810gg3 MOVE_MAP;
    public static final EnumC1174810gg3 SEARCH_PLACE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1174810gg3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1174810gg3 enumC1174810gg3 = new EnumC1174810gg3("CLICK_ARROW", 0, "click_arrow");
        CLICK_ARROW = enumC1174810gg3;
        EnumC1174810gg3 enumC1174810gg32 = new EnumC1174810gg3("SEARCH_PLACE", 1, "search_place");
        SEARCH_PLACE = enumC1174810gg32;
        EnumC1174810gg3 enumC1174810gg33 = new EnumC1174810gg3("CLICK_POI", 2, "click_poi");
        CLICK_POI = enumC1174810gg33;
        EnumC1174810gg3 enumC1174810gg34 = new EnumC1174810gg3("MOVE_MAP", 3, "move_map");
        MOVE_MAP = enumC1174810gg34;
        EnumC1174810gg3[] enumC1174810gg3Arr = {enumC1174810gg3, enumC1174810gg32, enumC1174810gg33, enumC1174810gg34};
        LLILLJJLI = enumC1174810gg3Arr;
        LLILLL = new C2254308sP(enumC1174810gg3Arr);
    }

    public static EnumC1174810gg3[] values() {
        return (EnumC1174810gg3[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1174810gg3 valueOf(String str) {
        return (EnumC1174810gg3) C08FF.LIZ(EnumC1174810gg3.class, str);
    }

    public EnumC1174810gg3(String str, int i, String str2) {
        this.LL = str2;
    }
}
