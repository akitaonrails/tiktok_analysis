package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0RJ7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C0RJ7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0RQ9.values().length];
        try {
            iArr[C0RQ9.TYPE_DOT_INTERACT_AREA_TABLET.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0RQ9.TYPE_DOT_BOTTOM_AREA.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0RQ9.TYPE_DOT_TOP_AREA.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
