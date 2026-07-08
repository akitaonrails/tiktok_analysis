package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ih2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C473180Ih2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC473170Ih1.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC473170Ih1.NO_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC473170Ih1.PANEL_MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
