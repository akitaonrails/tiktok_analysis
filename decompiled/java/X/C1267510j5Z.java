package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0j5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1267510j5Z {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1267980j6K.values().length];
        try {
            iArr[EnumC1267980j6K.NORMAL_LIVE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1267980j6K.GAME_LIVE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
