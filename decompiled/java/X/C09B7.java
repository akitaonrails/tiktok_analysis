package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;

/* JADX INFO: renamed from: X.09B7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C09B7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Thread.State.values().length];
        try {
            iArr[Thread.State.BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[Thread.State.WAITING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[Thread.State.TIMED_WAITING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
