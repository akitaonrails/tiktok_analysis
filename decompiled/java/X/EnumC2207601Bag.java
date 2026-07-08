package X;

import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1Bag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2207601Bag {
    LEVEL_0,
    LEVEL_1,
    LEVEL_2,
    LEVEL_3,
    LEVEL_4,
    LEVEL_5,
    LEVEL_6,
    LEVEL_7,
    LEVEL_8,
    LEVEL_9;

    public static EnumC2207601Bag valueOf(int i) {
        switch (i) {
            case 0:
                return LEVEL_0;
            case 1:
                return LEVEL_1;
            case 2:
                return LEVEL_2;
            case 3:
                return LEVEL_3;
            case 4:
                return LEVEL_4;
            case 5:
                return LEVEL_5;
            case 6:
                return LEVEL_6;
            case 7:
                return LEVEL_7;
            case 8:
                return LEVEL_8;
            case BdTuring.TYPE_ECAF /* 9 */:
                return LEVEL_9;
            default:
                return null;
        }
    }

    public static EnumC2207601Bag valueOf(String str) {
        return (EnumC2207601Bag) C08FF.LIZ(EnumC2207601Bag.class, str);
    }
}
