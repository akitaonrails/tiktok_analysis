package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0i5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1229310i5x {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1229300i5w.values().length];
        try {
            iArr[EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_CAMPUS_VERIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_LIVE_TEAM_LEVEL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_FOLLOW.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_SUBSCRIBE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_SUPER_FAN.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_EVERYONE.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZ = iArr;
    }
}
