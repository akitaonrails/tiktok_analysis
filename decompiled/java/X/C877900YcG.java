package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C877900YcG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C05RV.values().length];
        try {
            iArr[C05RV.PRO_CREATOR_INBOX.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
