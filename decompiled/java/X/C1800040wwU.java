package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1800040wwU {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1800020wwS.values().length];
        try {
            iArr[EnumC1800020wwS.BANNER_AUTO_COLLAPSE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1800020wwS.BANNER_STICKY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
