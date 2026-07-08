package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0xWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1822500xWi {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1822480xWg.values().length];
        try {
            iArr[EnumC1822480xWg.FETCH_CACHE_THEN_FETCH_REMOTE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1822480xWg.IGNORE_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1822480xWg.FETCH_FROM_CACHE_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1822480xWg.FETCH_REMOTE_ONLY_WHEN_NO_CACHE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1822480xWg.FETCH_CACHE_THEN_CATCH_IN_FLIGHT_RESPONSE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
