package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.039E, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C039E {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC803903Cb.values().length];
        try {
            iArr[EnumC803903Cb.HAS_ICON.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC803903Cb.NO_ICON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
