package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1524740pmS {
    public static final /* synthetic */ int[] LIZ;

    static {
        EnumC1524720pmQ.values();
        int[] iArr = new int[EnumC1524710pmP.values().length];
        try {
            iArr[EnumC1524710pmP.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1524710pmP.ARRAYBUFFER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
