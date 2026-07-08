package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0mpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1411150mpF {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1411170mpH.values().length];
        try {
            iArr[EnumC1411170mpH.LOAD_SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1411170mpH.LOAD_FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
