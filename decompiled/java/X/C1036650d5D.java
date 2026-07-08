package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0d5D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1036650d5D {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1036640d5C.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC1036640d5C.PAGE_SELECT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC1036640d5C.SLIDE_1PX.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
