package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.080D, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C080D {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C080C.values().length];
        try {
            iArr[C080C.REALTIME_SPECIAL_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
