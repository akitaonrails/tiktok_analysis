package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05RW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C05RW {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C05RV.values().length];
        try {
            iArr[C05RV.BUSINESS_INBOX.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C05RV.PRO_CREATOR_INBOX.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
