package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0RoY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C707160RoY {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC707150RoX.values().length];
        try {
            iArr[EnumC707150RoX.DATE_LOCATION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
