package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C756770TmN {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC1124020fM8.values().length];
        try {
            iArr[EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC756810TmR.values().length];
        try {
            iArr2[EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR.ordinal()] = 1;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr2[EnumC756810TmR.SLOT_LIVE_ANCHOR_TOOLBAR.ordinal()] = 2;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR.ordinal()] = 3;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZIZ = iArr2;
    }
}
