package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15rL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C20650515rL {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC20650315rJ.values().length];
        try {
            iArr[EnumC20650315rJ.SYNCING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC20650315rJ.UN_SYNCED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC20650315rJ.SYNCED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
