package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fMA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1124040fMA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1124020fM8.values().length];
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_WATCHER.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_EC_WATCHER_WATERMARK.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_EC_AUCTION_ACTING_AREA.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_EC_AUCTION_BOTTOM_RIGHT_ACTING_AREA.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
