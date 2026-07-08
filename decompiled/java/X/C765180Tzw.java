package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Tzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C765180Tzw {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0U0I.values().length];
        try {
            iArr[C0U0I.ADD_TO_QUEUE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
