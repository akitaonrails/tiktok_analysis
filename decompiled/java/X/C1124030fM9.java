package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1124030fM9 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC1124020fM8.values().length];
        LIZIZ = iArr;
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZIZ[EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZIZ[EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZIZ[EnumC1124020fM8.SLOT_LIVE_WATCHER_L3_POP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZIZ[EnumC1124020fM8.SLOT_LIVE_FREE_FRAME.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZIZ[EnumC1124020fM8.SLOT_LIVE_BROADCAST_SCRIPT.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZIZ[EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_PREVIEW.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZIZ[EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_BROADCAST.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            LIZIZ[EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_WATCHER.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            LIZIZ[EnumC1124020fM8.SLOT_LIVE_EC_AUCTION_ACTING_AREA.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            LIZIZ[EnumC1124020fM8.SLOT_LIVE_EC_AUCTION_BOTTOM_RIGHT_ACTING_AREA.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        int[] iArr2 = new int[EnumC756810TmR.values().length];
        LIZ = iArr2;
        try {
            iArr2[EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR.ordinal()] = 1;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            LIZ[EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR.ordinal()] = 2;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            LIZ[EnumC756810TmR.SLOT_LIVE_WATCHER_L2_TOOLBAR.ordinal()] = 3;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
    }
}
