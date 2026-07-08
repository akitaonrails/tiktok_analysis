package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.report.HasMore;

/* JADX INFO: renamed from: X.0828, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class AnonymousClass0828 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[HasMore.values().length];
        try {
            iArr[HasMore.TRUE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[HasMore.FALSE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
