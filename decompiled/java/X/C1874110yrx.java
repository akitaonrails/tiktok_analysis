package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0yrx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C1874110yrx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1874080yru.values().length];
        try {
            iArr[EnumC1874080yru.DM_TURN_ON_PERMISSION_FRIENDS_REVAMP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1874080yru.DM_TURN_ON_PERMISSION_CREATOR_REVAMP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1874080yru.DM_TURN_ON_PERMISSION_CREATOR_OTHERS_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
