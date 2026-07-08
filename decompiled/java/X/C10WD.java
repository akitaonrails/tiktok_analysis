package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;

/* JADX INFO: renamed from: X.10WD, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C10WD {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AgeGateSdkRegistrationFlow.values().length];
        try {
            iArr[AgeGateSdkRegistrationFlow.NEW_COMPONENT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AgeGateSdkRegistrationFlow.LOGIN_CONSENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
