package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0J08, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C0J08 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0J09.values().length];
        try {
            iArr[C0J09.GO_LIVE_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0J09.AI_SUMMARY_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0J09.LIVE_SURVEY_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
