package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0OJQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C0OJQ {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC617060OIe.values().length];
        try {
            iArr[EnumC617060OIe.IDENTITY_CREATOR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC617060OIe.IDENTITY_SUBSCRIBER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[C0OJR.values().length];
        try {
            iArr2[C0OJR.BULLETIN_OPEN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[C0OJR.CREATOR_CLOSED_CAN_REOPEN.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[C0OJR.CREATOR_CLOSED_CREATED_ANOTHER.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[C0OJR.CREATOR_CLOSED_OVER_TIME.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZIZ = iArr2;
    }
}
