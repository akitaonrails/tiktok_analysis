package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0vdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1749970vdj {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1749980vdk.values().length];
        try {
            iArr[EnumC1749980vdk.FAMILY_PAIRING_ENUM_NO_PAIRING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1749980vdk.FAMILY_PAIRING_ENUM_CHILD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1749980vdk.FAMILY_PAIRING_ENUM_PARENT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
