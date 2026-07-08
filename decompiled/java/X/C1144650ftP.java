package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ftP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1144650ftP {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;
    public static final /* synthetic */ int[] LIZLLL;
    public static final /* synthetic */ int[] LJ;
    public static final /* synthetic */ int[] LJFF;

    static {
        int[] iArr = new int[EnumC964170bCJ.values().length];
        try {
            iArr[EnumC964170bCJ.MATCH_START.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC964170bCJ.PUNISH_START.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC0300008k.values().length];
        try {
            iArr2[EnumC0300008k.BATTLE_ITEM_CARD_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC0300008k.BATTLE_INFO_RESPONSE.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC1144570ftH.values().length];
        try {
            iArr3[EnumC1144570ftH.AUDIENCE.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr3[EnumC1144570ftH.AUDIENCE_SENDER.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr3[EnumC1144570ftH.ANCHOR.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZJ = iArr3;
        int[] iArr4 = new int[EnumC919120a1e.values().length];
        try {
            iArr4[EnumC919120a1e.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr4[EnumC919120a1e.TEAM_ANCHOR.ordinal()] = 2;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr4[EnumC919120a1e.ENEMY_ANCHOR.ordinal()] = 3;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr4[EnumC919120a1e.AUDIENCE_SENDER.ordinal()] = 4;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr4[EnumC919120a1e.TEAM_AUDIENCE.ordinal()] = 5;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr4[EnumC919120a1e.ENEMY_AUDIENCE.ordinal()] = 6;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        LIZLLL = iArr4;
        int[] iArr5 = new int[EnumC1144690ftT.values().length];
        try {
            iArr5[EnumC1144690ftT.WRONG_BATTLE_ID.ordinal()] = 1;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr5[EnumC1144690ftT.UNKNOWN_ITEM_CARD_TYPE.ordinal()] = 2;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr5[EnumC1144690ftT.WRONG_MATCH_STATE.ordinal()] = 3;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr5[EnumC1144690ftT.WRONG_MESSAGE_TIMING.ordinal()] = 4;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        LJ = iArr5;
        int[] iArr6 = new int[EnumC1144700ftU.values().length];
        try {
            iArr6[EnumC1144700ftU.ITEM_TIME_EXPIRED.ordinal()] = 1;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr6[EnumC1144700ftU.MATCH_SETTLED.ordinal()] = 2;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr6[EnumC1144700ftU.ITEM_PURGED.ordinal()] = 3;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr6[EnumC1144700ftU.MATCH_ENDED.ordinal()] = 4;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        LJFF = iArr6;
    }
}
