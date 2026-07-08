package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0auQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C953080auQ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC953070auP.values().length];
        try {
            iArr[EnumC953070auP.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC953070auP.INPUT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC953070auP.TEXT_STYLE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC953070auP.NORMAL_SELECT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
