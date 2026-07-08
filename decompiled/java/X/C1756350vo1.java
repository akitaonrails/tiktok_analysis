package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0vo1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1756350vo1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1756340vo0.values().length];
        try {
            iArr[EnumC1756340vo0.HALF_SCREEN_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
