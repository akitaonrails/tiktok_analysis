package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1DIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public /* synthetic */ class C2253711DIz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C1DJ0.values().length];
        try {
            iArr[C1DJ0.DOUBLE_TAP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C1DJ0.TOOL_BAR_ICON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C1DJ0.SWITCH_CAMERA_PROP_FRONT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C1DJ0.SWITCH_CAMERA_PROP_REAR.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C1DJ0.SWITCH_CAMERA_AR_PROP_REAR.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[C1DJ0.OPEN_CAMERA_PROP_CANCEL.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
