package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11FC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C11FC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C11FA.values().length];
        LIZ = iArr;
        try {
            iArr[C11FA.TAB_TYPE_DISCOVER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[C11FA.TAB_TYPE_MORE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[C11FA.TAB_TYPE_FOR_YOU.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[C11FA.TAB_TYPE_COLLECT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[C11FA.TAB_TYPE_LOCAL.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[C11FA.TAB_TYPE_UNLIMITED_MUSIC.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
    }
}
