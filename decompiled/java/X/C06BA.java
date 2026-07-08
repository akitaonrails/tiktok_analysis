package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06BA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C06BA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C06BD.values().length];
        try {
            iArr[C06BD.StreakCmdStart.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
