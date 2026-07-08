package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0w9U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1769660w9U {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1769650w9T.values().length];
        try {
            iArr[EnumC1769650w9T.HANDLE_BYTESYNC_DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1769650w9T.HANDLE_BYTESYNC_DELAYED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1769650w9T.HANDLE_BYTESYNC_IMMEDIATELY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
