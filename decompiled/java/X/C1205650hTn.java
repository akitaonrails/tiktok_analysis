package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.WorldCupMatchStatus;

/* JADX INFO: renamed from: X.0hTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1205650hTn {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[WorldCupMatchStatus.values().length];
        try {
            iArr[WorldCupMatchStatus.FINISHED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[WorldCupMatchStatus.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
