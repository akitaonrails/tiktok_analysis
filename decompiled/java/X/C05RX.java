package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05RX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C05RX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C05RV.values().length];
        try {
            iArr[C05RV.PERSONAL_INBOX.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
