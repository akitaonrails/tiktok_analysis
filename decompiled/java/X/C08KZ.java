package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.queuemonitor.model.QueueType;

/* JADX INFO: renamed from: X.08KZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C08KZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[QueueType.values().length];
        try {
            iArr[QueueType.MESSAGE_QUEUE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[QueueType.THREAD_POOL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
