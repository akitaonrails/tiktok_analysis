package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1E7R, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public /* synthetic */ class C1E7R {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C1E7L.values().length];
        try {
            iArr[C1E7L.REC_POP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C1E7L.BIG_CARD_FYP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C1E7L.BIG_CARD_FRIENDS_FEED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
