package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14Fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C20234514Fj {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC1862310yYv.values().length];
        try {
            iArr[EnumC1862310yYv.PINNED_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC20234414Fi.values().length];
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_USER_VOICE.ordinal()] = 2;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_RECOMMEND_WORD.ordinal()] = 3;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_HIGHLIGHT_WORD.ordinal()] = 4;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_ROUND0_RECOMMEND_WORD.ordinal()] = 5;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_KEYBOARD_INPUT.ordinal()] = 6;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_IMAGE_QA.ordinal()] = 7;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_FEED_BAR_INPUT.ordinal()] = 8;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_SEARCH_ASK_TAKO_CARD.ordinal()] = 9;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_COMMENT_TOP_WORD.ordinal()] = 10;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_ENTITY_WORD.ordinal()] = 11;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_ENTITY_SUG.ordinal()] = 12;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_SEARCH_SUG.ordinal()] = 13;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr2[EnumC20234414Fi.SEND_TYPE_EXPERIENCE_DECISION_SUG.ordinal()] = 14;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        LIZIZ = iArr2;
    }
}
