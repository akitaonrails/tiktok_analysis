package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1ANf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2178371ANf {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2178381ANg.values().length];
        try {
            iArr[EnumC2178381ANg.START.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2178381ANg.RESUMED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
