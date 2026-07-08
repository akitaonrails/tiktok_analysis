package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C743370TDz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC743340TDw.values().length];
        try {
            iArr[EnumC743340TDw.CAST_STATE_RECONNECT_FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
