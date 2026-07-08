package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C779810UiR {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC779790UiP.values().length];
        try {
            iArr[EnumC779790UiP.CMD_CLICK_FLOAT_BALL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC779790UiP.CMD_ORIENTATION_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC779790UiP.CMD_SEND_FIRST_SNAP_TIP.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
