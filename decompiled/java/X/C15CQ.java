package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15CQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C15CQ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C15CV.values().length];
        try {
            iArr[C15CV.LOP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C15CV.ACHIEVEMENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C15CV.LIVE_JOURNEY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
