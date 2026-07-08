package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11lC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C19593211lC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC19593011lA.values().length];
        try {
            iArr[EnumC19593011lA.ATTRIBUTION_LINK_MEDIA_SIZE_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC19593011lA.ATTRIBUTION_LINK_MEDIA_SIZE_LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
