package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ryR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1609050ryR {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1609040ryQ.values().length];
        try {
            iArr[EnumC1609040ryQ.SKYLIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1609040ryQ.FEED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1609040ryQ.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
