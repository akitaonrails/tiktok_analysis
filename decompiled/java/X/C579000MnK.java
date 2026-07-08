package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.TaskTrigger;

/* JADX INFO: renamed from: X.0MnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C579000MnK {
    public static final /* synthetic */ int[] LIZ;

    static {
        EnumC579010MnL.values();
        int[] iArr = new int[TaskTrigger.values().length];
        try {
            iArr[TaskTrigger.RECORD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[TaskTrigger.TAP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[TaskTrigger.UPLOAD_IMAGE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
