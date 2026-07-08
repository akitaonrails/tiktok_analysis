package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.TaskStage;

/* JADX INFO: renamed from: X.0MnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C579020MnM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[TaskStage.values().length];
        try {
            iArr[TaskStage.AIGC_TRIGGER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[TaskStage.AIGC_TASK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
