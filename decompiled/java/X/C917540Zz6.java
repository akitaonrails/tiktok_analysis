package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Zz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C917540Zz6 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC919170a1j.values().length];
        try {
            iArr[EnumC919170a1j.MATCH_TYPE_1V1.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC919170a1j.MATCH_TYPE_2V2.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC919170a1j.MATCH_TYPE_INDIVIDUAL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC919170a1j.MATCH_TYPE_1VN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC919170a1j.MATCH_TYPE_CATCH_BEANS.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
