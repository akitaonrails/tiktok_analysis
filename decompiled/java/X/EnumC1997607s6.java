package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07s6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1997607s6 {
    public static final EnumC1997607s6 COMMENT_LIST_SCENARIO_BULLET;
    public static final EnumC1997607s6 COMMENT_LIST_SCENARIO_DEFAULT;
    public static final EnumC1997607s6 COMMENT_LIST_SCENARIO_NOW;
    public static final EnumC1997607s6 COMMENT_LIST_SCENARIO_NOW_BULLET;
    public static final /* synthetic */ EnumC1997607s6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1997607s6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1997607s6 enumC1997607s6 = new EnumC1997607s6("COMMENT_LIST_SCENARIO_DEFAULT", 0, 0);
        COMMENT_LIST_SCENARIO_DEFAULT = enumC1997607s6;
        EnumC1997607s6 enumC1997607s62 = new EnumC1997607s6("COMMENT_LIST_SCENARIO_BULLET", 1, 1);
        COMMENT_LIST_SCENARIO_BULLET = enumC1997607s62;
        EnumC1997607s6 enumC1997607s63 = new EnumC1997607s6("COMMENT_LIST_SCENARIO_NOW", 2, 2);
        COMMENT_LIST_SCENARIO_NOW = enumC1997607s63;
        EnumC1997607s6 enumC1997607s64 = new EnumC1997607s6("COMMENT_LIST_SCENARIO_NOW_BULLET", 3, 3);
        COMMENT_LIST_SCENARIO_NOW_BULLET = enumC1997607s64;
        EnumC1997607s6[] enumC1997607s6Arr = {enumC1997607s6, enumC1997607s62, enumC1997607s63, enumC1997607s64};
        LLILLJJLI = enumC1997607s6Arr;
        LLILLL = new C2254308sP(enumC1997607s6Arr);
    }

    public static EnumC1997607s6[] values() {
        return (EnumC1997607s6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1997607s6 valueOf(String str) {
        return (EnumC1997607s6) C08FF.LIZ(EnumC1997607s6.class, str);
    }

    public EnumC1997607s6(String str, int i, int i2) {
        this.LL = i2;
    }
}
