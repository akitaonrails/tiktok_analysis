package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0tgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public /* synthetic */ class C1674700tgK {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1674690tgJ.values().length];
        try {
            iArr[EnumC1674690tgJ.CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1674690tgJ.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1674690tgJ.DELETE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
