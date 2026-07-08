package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uJK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1698880uJK {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1699200uJq.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC1699200uJq.PLAYER_INITIATED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC1699200uJq.CONTENT_STEERING_INITIATED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[EnumC1699200uJq.SIGNAL_INITIATED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
