package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mQN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1395730mQN {
    public static final C1395720mQM Companion;
    public static final EnumC1395730mQN FEED_SIDEBAR;
    public static final /* synthetic */ EnumC1395730mQN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1395730mQN MINIS_CENTER;
    public static final EnumC1395730mQN PROFILE_RICH_CARD;
    public static final EnumC1395730mQN SHORT_CUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1395730mQN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1395730mQN enumC1395730mQN = new EnumC1395730mQN("MINIS_CENTER", 0, "center");
        MINIS_CENTER = enumC1395730mQN;
        EnumC1395730mQN enumC1395730mQN2 = new EnumC1395730mQN("PROFILE_RICH_CARD", 1, "profile_rich_card");
        PROFILE_RICH_CARD = enumC1395730mQN2;
        EnumC1395730mQN enumC1395730mQN3 = new EnumC1395730mQN("FEED_SIDEBAR", 2, "sidebar");
        FEED_SIDEBAR = enumC1395730mQN3;
        EnumC1395730mQN enumC1395730mQN4 = new EnumC1395730mQN("SHORT_CUT", 3, "desktop_shortcut");
        SHORT_CUT = enumC1395730mQN4;
        EnumC1395730mQN[] enumC1395730mQNArr = {enumC1395730mQN, enumC1395730mQN2, enumC1395730mQN3, enumC1395730mQN4};
        LLILLJJLI = enumC1395730mQNArr;
        LLILLL = new C2254308sP(enumC1395730mQNArr);
        Companion = new C1395720mQM();
    }

    public static EnumC1395730mQN[] values() {
        return (EnumC1395730mQN[]) LLILLJJLI.clone();
    }

    public final EnumC1799930wwJ getRewardMissionType() {
        int i = C1395740mQO.LIZ[ordinal()];
        if (i == 1 || i == 2) {
            return EnumC1799930wwJ.PROFILE_SIDEBAR;
        }
        if (i == 3) {
            return EnumC1799930wwJ.FEED_SIDEBAR;
        }
        if (i == 4) {
            return EnumC1799930wwJ.ADD_TO_HOME_SCREEN;
        }
        throw new C1954807lC();
    }

    public final EnumC1781360wSM getRewardTaskType() {
        return getRewardMissionType().getRewardTaskType();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC1395730mQN valueOf(String str) {
        return (EnumC1395730mQN) C08FF.LIZ(EnumC1395730mQN.class, str);
    }

    public EnumC1395730mQN(String str, int i, String str2) {
        this.LL = str2;
    }
}
