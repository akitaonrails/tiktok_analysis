package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0CcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C317530CcZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC317520CcY.values().length];
        try {
            iArr[EnumC317520CcY.RECENT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC317520CcY.FRIEND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC317520CcY.FOLLOW.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
