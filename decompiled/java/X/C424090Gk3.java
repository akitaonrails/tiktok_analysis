package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C424090Gk3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC428950Grt.values().length];
        try {
            iArr[EnumC428950Grt.Mirror.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC428950Grt.Reset.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC428950Grt.FollowFace.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
