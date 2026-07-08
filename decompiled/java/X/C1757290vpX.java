package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0vpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1757290vpX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1757300vpY.values().length];
        try {
            iArr[EnumC1757300vpY.MICRO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1757300vpY.MINI.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
