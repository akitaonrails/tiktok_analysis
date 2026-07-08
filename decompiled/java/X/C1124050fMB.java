package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fMB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1124050fMB {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC1124020fM8.values().length];
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_FREE_FRAME.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_BROADCAST_SCRIPT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_PREVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_BROADCAST.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC756810TmR.values().length];
        try {
            iArr2[EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[EnumC756810TmR.SLOT_BROADCAST_PREVIEW_EC_INDEPENDENT.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        LIZIZ = iArr2;
    }
}
