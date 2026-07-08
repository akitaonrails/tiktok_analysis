package X;

/* JADX INFO: renamed from: X.1APb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2178851APb {
    LEVEL_GAME_DEFAULT(-1, "default"),
    LEVEL_GAME_480P_25(1, "ld"),
    LEVEL_GAME_540P_25(2, "sd"),
    LEVEL_GAME_720P_30(3, "hd"),
    LEVEL_GAME_720P_60(4, "hd_60"),
    LEVEL_GAME_1080P_30(5, "uhd"),
    LEVEL_GAME_1080P_60(6, "uhd_60");

    public final int LL;
    public final String LLILLJJLI;

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoQualityGameLevel{mLevel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mSdkKey='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getSdkKey() {
        return this.LLILLJJLI;
    }

    public int level() {
        return this.LL;
    }

    public static final EnumC2178851APb levelIntToGameLevel(int i) {
        EnumC2178851APb enumC2178851APb = LEVEL_GAME_DEFAULT;
        switch (i) {
            case 1:
                return LEVEL_GAME_480P_25;
            case 2:
                return LEVEL_GAME_540P_25;
            case 3:
                return LEVEL_GAME_720P_30;
            case 4:
                return LEVEL_GAME_720P_60;
            case 5:
                return LEVEL_GAME_1080P_30;
            case 6:
                return LEVEL_GAME_1080P_60;
            default:
                return enumC2178851APb;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final EnumC2178851APb sdkKeyToGameLevel(String str) {
        EnumC2178851APb enumC2178851APb = LEVEL_GAME_DEFAULT;
        str.getClass();
        switch (str.hashCode()) {
            case -846238328:
                if (str.equals("uhd_60")) {
                    return LEVEL_GAME_1080P_60;
                }
                return enumC2178851APb;
            case 3324:
                if (str.equals("hd")) {
                    return LEVEL_GAME_720P_30;
                }
                return enumC2178851APb;
            case 3448:
                if (str.equals("ld")) {
                    return LEVEL_GAME_480P_25;
                }
                return enumC2178851APb;
            case 3665:
                if (str.equals("sd")) {
                    return LEVEL_GAME_540P_25;
                }
                return enumC2178851APb;
            case 115761:
                if (str.equals("uhd")) {
                    return LEVEL_GAME_1080P_30;
                }
                return enumC2178851APb;
            case 99118301:
                if (str.equals("hd_60")) {
                    return LEVEL_GAME_720P_60;
                }
                return enumC2178851APb;
            default:
                return enumC2178851APb;
        }
    }

    public static EnumC2178851APb valueOf(String str) {
        return (EnumC2178851APb) C08FF.LIZ(EnumC2178851APb.class, str);
    }

    EnumC2178851APb(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
