package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1063240dm6 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1063300dmC.values().length];
        try {
            iArr[EnumC1063300dmC.WEB.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1063300dmC.LYNX.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
