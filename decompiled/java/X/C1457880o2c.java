package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0o2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1457880o2c {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1457890o2d.values().length];
        try {
            iArr[EnumC1457890o2d.DARK_COLOR_WITHOUT_CANCEL_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1457890o2d.DARK_COLOR_WITH_CANCEL_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
