package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10RE, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C10RE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C10RF.values().length];
        try {
            iArr[C10RF.NEW_UI.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C10RF.ONLINE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C10RF.TOPIC.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
