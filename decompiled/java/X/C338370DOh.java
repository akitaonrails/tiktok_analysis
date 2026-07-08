package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C338370DOh {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC338380DOi.values().length];
        try {
            iArr[EnumC338380DOi.EMPTY_RESULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC338380DOi.EMPTY_KEYWORD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC338380DOi.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
