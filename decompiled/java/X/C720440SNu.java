package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0SNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C720440SNu {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC719760SLe.values().length];
        try {
            iArr[EnumC719760SLe.ZOOM_FIX.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC719760SLe.CLEAR_MODE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC719760SLe.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        EnumC1995107rh.values();
    }
}
