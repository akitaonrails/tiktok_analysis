package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bAM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC962960bAM {
    public static final EnumC962960bAM CATCH_BEANS;
    public static final C962950bAL Companion;
    public static final /* synthetic */ EnumC962960bAM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC962960bAM MATCH_1V1;
    public static final EnumC962960bAM MATCH_1VN;
    public static final EnumC962960bAM MATCH_2V2;
    public static final EnumC962960bAM MATCH_INDIVIDUAL;
    public static final EnumC962960bAM TAKE_THE_STAGE;
    public static final EnumC962960bAM UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC962960bAM> getEntries() {
        return LLILLL;
    }

    public static final String getSubTypeString(EnumC962960bAM enumC962960bAM, int i) {
        Companion.getClass();
        return C962950bAL.LIZ(enumC962960bAM, i);
    }

    public static final EnumC962960bAM getTypeFromInt(Integer num) {
        Companion.getClass();
        return C962950bAL.LIZIZ(num);
    }

    public static final String getTypeString(EnumC962960bAM enumC962960bAM) {
        Companion.getClass();
        return C962950bAL.LIZJ(enumC962960bAM);
    }

    public static final EnumC962960bAM toAllCompetitionBizType(EnumC919170a1j enumC919170a1j) {
        Companion.getClass();
        return C962950bAL.LIZLLL(enumC919170a1j);
    }

    public static final EnumC962960bAM toCompetitionBizType(EnumC919170a1j enumC919170a1j) {
        Companion.getClass();
        return C962950bAL.LJ(enumC919170a1j);
    }

    public static final EnumC919170a1j toMatchType(EnumC962960bAM enumC962960bAM) {
        Companion.getClass();
        return C962950bAL.LJFF(enumC962960bAM);
    }

    static {
        EnumC962960bAM enumC962960bAM = new EnumC962960bAM("UNKNOWN", 0, 0);
        UNKNOWN = enumC962960bAM;
        EnumC962960bAM enumC962960bAM2 = new EnumC962960bAM("TAKE_THE_STAGE", 1, 51);
        TAKE_THE_STAGE = enumC962960bAM2;
        EnumC962960bAM enumC962960bAM3 = new EnumC962960bAM("CATCH_BEANS", 2, 53);
        CATCH_BEANS = enumC962960bAM3;
        EnumC962960bAM enumC962960bAM4 = new EnumC962960bAM("MATCH_1V1", 3, 1);
        MATCH_1V1 = enumC962960bAM4;
        EnumC962960bAM enumC962960bAM5 = new EnumC962960bAM("MATCH_2V2", 4, 2);
        MATCH_2V2 = enumC962960bAM5;
        EnumC962960bAM enumC962960bAM6 = new EnumC962960bAM("MATCH_INDIVIDUAL", 5, 3);
        MATCH_INDIVIDUAL = enumC962960bAM6;
        EnumC962960bAM enumC962960bAM7 = new EnumC962960bAM("MATCH_1VN", 6, 4);
        MATCH_1VN = enumC962960bAM7;
        EnumC962960bAM[] enumC962960bAMArr = {enumC962960bAM, enumC962960bAM2, enumC962960bAM3, enumC962960bAM4, enumC962960bAM5, enumC962960bAM6, enumC962960bAM7};
        LLILLJJLI = enumC962960bAMArr;
        LLILLL = new C2254308sP(enumC962960bAMArr);
        Companion = new C962950bAL();
    }

    public static EnumC962960bAM[] values() {
        return (EnumC962960bAM[]) LLILLJJLI.clone();
    }

    public final boolean isCatchBean() {
        return this == CATCH_BEANS;
    }

    public final boolean isMatch() {
        return this == MATCH_1V1 || this == MATCH_2V2 || this == MATCH_INDIVIDUAL || this == MATCH_1VN;
    }

    public final boolean isTakeTheStage() {
        return this == TAKE_THE_STAGE;
    }

    public final boolean isValid() {
        return this != UNKNOWN;
    }

    public final boolean isCompetitionArch() {
        return isTakeTheStage() || isCatchBean();
    }

    public final int getType() {
        return this.LL;
    }

    public static final EnumC962960bAM fromMatchType(EnumC919170a1j enumC919170a1j) {
        Companion.getClass();
        int i = C962970bAN.LIZIZ[enumC919170a1j.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return UNKNOWN;
            }
            return CATCH_BEANS;
        }
        return TAKE_THE_STAGE;
    }

    public static EnumC962960bAM valueOf(String str) {
        return (EnumC962960bAM) C08FF.LIZ(EnumC962960bAM.class, str);
    }

    public EnumC962960bAM(String str, int i, int i2) {
        this.LL = i2;
    }
}
