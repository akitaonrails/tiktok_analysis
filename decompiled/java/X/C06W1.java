package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06W1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C06W1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1620106Vz.values().length];
        try {
            iArr[EnumC1620106Vz.COMMENT_DELETE_PUSH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1620106Vz.COMMENT_BATCH_DELETE_PUSH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1620106Vz.COMMENT_DISLIKE_PUSH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
