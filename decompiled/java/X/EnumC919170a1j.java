package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919170a1j {
    public static final C917350Zyn Companion;
    public static final /* synthetic */ EnumC919170a1j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC919170a1j MATCH_TYPE_1V1;
    public static final EnumC919170a1j MATCH_TYPE_1VN;
    public static final EnumC919170a1j MATCH_TYPE_2V2;
    public static final EnumC919170a1j MATCH_TYPE_CATCH_BEANS;
    public static final EnumC919170a1j MATCH_TYPE_INDIVIDUAL;
    public static final EnumC919170a1j MATCH_TYPE_TAKE_THE_STAGE;
    public static final EnumC919170a1j UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC919170a1j> getEntries() {
        return LLILLL;
    }

    public static final String getMatchMonitorTypeString(EnumC919170a1j enumC919170a1j) {
        Companion.getClass();
        return C917350Zyn.LIZ(enumC919170a1j);
    }

    public static final String getMatchSubTypeString(EnumC919170a1j enumC919170a1j, int i) {
        Companion.getClass();
        return C917350Zyn.LIZIZ(enumC919170a1j, i);
    }

    public static final String getMatchTypeString(EnumC919170a1j enumC919170a1j) {
        Companion.getClass();
        return C917350Zyn.LIZJ(enumC919170a1j);
    }

    static {
        EnumC919170a1j enumC919170a1j = new EnumC919170a1j("UNKNOWN", 0, 0);
        UNKNOWN = enumC919170a1j;
        EnumC919170a1j enumC919170a1j2 = new EnumC919170a1j("MATCH_TYPE_1V1", 1, 1);
        MATCH_TYPE_1V1 = enumC919170a1j2;
        EnumC919170a1j enumC919170a1j3 = new EnumC919170a1j("MATCH_TYPE_2V2", 2, 2);
        MATCH_TYPE_2V2 = enumC919170a1j3;
        EnumC919170a1j enumC919170a1j4 = new EnumC919170a1j("MATCH_TYPE_INDIVIDUAL", 3, 3);
        MATCH_TYPE_INDIVIDUAL = enumC919170a1j4;
        EnumC919170a1j enumC919170a1j5 = new EnumC919170a1j("MATCH_TYPE_1VN", 4, 4);
        MATCH_TYPE_1VN = enumC919170a1j5;
        EnumC919170a1j enumC919170a1j6 = new EnumC919170a1j("MATCH_TYPE_TAKE_THE_STAGE", 5, 51);
        MATCH_TYPE_TAKE_THE_STAGE = enumC919170a1j6;
        EnumC919170a1j enumC919170a1j7 = new EnumC919170a1j("MATCH_TYPE_CATCH_BEANS", 6, 53);
        MATCH_TYPE_CATCH_BEANS = enumC919170a1j7;
        EnumC919170a1j[] enumC919170a1jArr = {enumC919170a1j, enumC919170a1j2, enumC919170a1j3, enumC919170a1j4, enumC919170a1j5, enumC919170a1j6, enumC919170a1j7};
        LLILLJJLI = enumC919170a1jArr;
        LLILLL = new C2254308sP(enumC919170a1jArr);
        Companion = new C917350Zyn();
    }

    public static EnumC919170a1j[] values() {
        return (EnumC919170a1j[]) LLILLJJLI.clone();
    }

    public final boolean isCatchBeans() {
        return this == MATCH_TYPE_CATCH_BEANS;
    }

    public final boolean isMatch() {
        return this == MATCH_TYPE_1V1 || this == MATCH_TYPE_2V2 || this == MATCH_TYPE_INDIVIDUAL || this == MATCH_TYPE_1VN;
    }

    public final boolean isOpenEntranceDirectInviteType() {
        if (this != UNKNOWN) {
            return isMatch() || isCatchBeans() || isTakeTheStage();
        }
        return false;
    }

    public final boolean isTakeTheStage() {
        return this == MATCH_TYPE_TAKE_THE_STAGE;
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC919170a1j valueOf(String str) {
        return (EnumC919170a1j) C08FF.LIZ(EnumC919170a1j.class, str);
    }

    public EnumC919170a1j(String str, int i, int i2) {
        this.LL = i2;
    }
}
