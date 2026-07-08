package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.PaidContentCreatorStatus;

/* JADX INFO: renamed from: X.0gEK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1157620gEK {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[PaidContentCreatorStatus.values().length];
        try {
            iArr[PaidContentCreatorStatus.ELIGIBLE_WITH_NO_PUBLISHED_SERIES.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[PaidContentCreatorStatus.ELIGIBLE_WITH_PUBLISHED_SERIES.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[PaidContentCreatorStatus.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[PaidContentCreatorStatus.NOT_ELIGIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
