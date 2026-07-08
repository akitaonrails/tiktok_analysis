package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05TE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C05TE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C05TC.values().length];
        try {
            iArr[C05TC.SHOW_AWEME.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C05TC.SHOW_AWEME_INSTANT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C05TC.HIDE_AWEME.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
