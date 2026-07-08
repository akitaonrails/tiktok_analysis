package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.creatorverification.CreatorVerificationStatus;

/* JADX INFO: renamed from: X.0iKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1238630iKz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CreatorVerificationStatus.values().length];
        try {
            iArr[CreatorVerificationStatus.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[CreatorVerificationStatus.VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
