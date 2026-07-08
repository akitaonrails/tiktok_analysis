package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1598320rh8 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1598330rh9.values().length];
        try {
            iArr[EnumC1598330rh9.ACTIVE_STATUS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
