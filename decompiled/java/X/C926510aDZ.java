package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0aDZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C926510aDZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC926600aDi.values().length];
        try {
            iArr[EnumC926600aDi.GO_LIVE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC926600aDi.SEND_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
