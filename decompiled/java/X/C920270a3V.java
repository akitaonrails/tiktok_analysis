package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0a3V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C920270a3V {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC920250a3T.values().length];
        try {
            iArr[EnumC920250a3T.CAN_ZOOM_TO_MAX.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC920250a3T.CAN_ZOOM_TO_MIN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
