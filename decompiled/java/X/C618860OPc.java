package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0OPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C618860OPc {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC618850OPb.values().length];
        try {
            iArr[EnumC618850OPb.EARLIER_RELEASE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
