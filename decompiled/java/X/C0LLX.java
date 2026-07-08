package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;

/* JADX INFO: renamed from: X.0LLX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0LLX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Source.values().length];
        try {
            iArr[Source.EDITOR_PRO_AIGC_T2I.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[Source.EDITOR_PRO_AIGC_T2V.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
