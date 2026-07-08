package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18JZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C18JZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C18JY.values().length];
        try {
            iArr[C18JY.CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C18JY.SHOW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C18JY.RECEIVE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C18JY.DISAPPEAR.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
