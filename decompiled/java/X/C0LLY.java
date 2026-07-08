package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;

/* JADX INFO: renamed from: X.0LLY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0LLY {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Source.values().length];
        try {
            iArr[Source.EDITOR_PRO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[Source.EDITOR_PRO_AIGC_T2I.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[Source.EDITOR_PRO_AIGC_T2V.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[Source.EDIT_AI_PLAYGROUND.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
