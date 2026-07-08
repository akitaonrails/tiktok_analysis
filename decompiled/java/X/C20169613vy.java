package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C20169613vy {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC20169713vz.values().length];
        try {
            iArr[EnumC20169713vz.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
