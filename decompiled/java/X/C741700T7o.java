package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0T7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C741700T7o {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC742820TBw.values().length];
        try {
            iArr[EnumC742820TBw.LIVE_ROOM_EC_LIVE_STATUS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC742820TBw.TTLS_LIVE_PRODUCT_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
