package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Zvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C915470Zvl {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC919170a1j.values().length];
        try {
            iArr[EnumC919170a1j.MATCH_TYPE_CATCH_BEANS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
