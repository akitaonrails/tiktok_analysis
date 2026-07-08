package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1523370pkF {
    public static final /* synthetic */ int[] LIZ;

    static {
        EnumC1523360pkE.values();
        int[] iArr = new int[EnumC1067640dtC.values().length];
        try {
            iArr[EnumC1067640dtC.LYNX.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
