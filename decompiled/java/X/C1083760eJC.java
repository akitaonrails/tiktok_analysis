package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1083760eJC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1083750eJB.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC1083750eJB.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC1083750eJB.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
