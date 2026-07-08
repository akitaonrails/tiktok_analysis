package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1799930wwJ {
    public static final EnumC1799930wwJ ADD_TO_HOME_SCREEN;
    public static final C1799940wwK Companion;
    public static final EnumC1799930wwJ FEED_SIDEBAR;
    public static final /* synthetic */ EnumC1799930wwJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1799930wwJ PROFILE_SIDEBAR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1799930wwJ> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0wwK] */
    static {
        EnumC1799930wwJ enumC1799930wwJ = new EnumC1799930wwJ("PROFILE_SIDEBAR", 0, "profile_sidebar");
        PROFILE_SIDEBAR = enumC1799930wwJ;
        EnumC1799930wwJ enumC1799930wwJ2 = new EnumC1799930wwJ("FEED_SIDEBAR", 1, "feed_sidebar");
        FEED_SIDEBAR = enumC1799930wwJ2;
        EnumC1799930wwJ enumC1799930wwJ3 = new EnumC1799930wwJ("ADD_TO_HOME_SCREEN", 2, "add_to_home_screen");
        ADD_TO_HOME_SCREEN = enumC1799930wwJ3;
        EnumC1799930wwJ[] enumC1799930wwJArr = {enumC1799930wwJ, enumC1799930wwJ2, enumC1799930wwJ3};
        LLILLJJLI = enumC1799930wwJArr;
        LLILLL = new C2254308sP(enumC1799930wwJArr);
        Companion = new Object() { // from class: X.0wwK
        };
    }

    public static EnumC1799930wwJ[] values() {
        return (EnumC1799930wwJ[]) LLILLJJLI.clone();
    }

    public final EnumC1781360wSM getRewardTaskType() {
        int i = C1799920wwI.LIZ[ordinal()];
        if (i == 1 || i == 2) {
            return EnumC1781360wSM.REVISIT_EDUCATION;
        }
        if (i == 3) {
            return EnumC1781360wSM.ADD_TO_DESKTOP;
        }
        throw new C1954807lC();
    }

    public final String getConfigKey() {
        return this.LL;
    }

    public static EnumC1799930wwJ valueOf(String str) {
        return (EnumC1799930wwJ) C08FF.LIZ(EnumC1799930wwJ.class, str);
    }

    public EnumC1799930wwJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
