package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.persistence.model.AIGCWorkflowNodeStatesPersistence;

/* JADX INFO: renamed from: X.0Lr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C555860Lr6 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AIGCWorkflowNodeStatesPersistence.State.values().length];
        try {
            iArr[AIGCWorkflowNodeStatesPersistence.State.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AIGCWorkflowNodeStatesPersistence.State.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[AIGCWorkflowNodeStatesPersistence.State.PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[AIGCWorkflowNodeStatesPersistence.State.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[AIGCWorkflowNodeStatesPersistence.State.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[AIGCWorkflowNodeStatesPersistence.State.SKIP_FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[AIGCWorkflowNodeStatesPersistence.State.SUCCESS.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZ = iArr;
    }
}
