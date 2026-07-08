package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zQ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C1895260zQ4 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1895270zQ5.values().length];
        try {
            iArr[EnumC1895270zQ5.TYPE_LOGOUT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1895270zQ5.TYPE_LOGIN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1895270zQ5.TYPE_BYTESYNC.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
