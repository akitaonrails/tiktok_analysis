package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0S5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C715740S5s {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC715680S5m.values().length];
        try {
            iArr[EnumC715680S5m.OVERRIDE_TO_TRANSLATED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC715680S5m.OVERRIDE_TO_ORIGINAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
