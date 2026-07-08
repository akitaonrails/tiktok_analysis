package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C756720TmI {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC756810TmR.values().length];
        try {
            iArr[EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
