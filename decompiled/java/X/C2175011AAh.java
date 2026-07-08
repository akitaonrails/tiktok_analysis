package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2175011AAh {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2175001AAg.values().length];
        try {
            iArr[EnumC2175001AAg.MASK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2175001AAg.PAID_MASK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC2175001AAg.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC2175001AAg.PREVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
