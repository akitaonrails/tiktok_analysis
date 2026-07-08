package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.DisclaimerType;

/* JADX INFO: renamed from: X.0yUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1859810yUt {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[DisclaimerType.values().length];
        try {
            iArr[DisclaimerType.DISCLAIMER_TYPE_DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[DisclaimerType.DISCLAIMER_TYPE_TEXT_IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
