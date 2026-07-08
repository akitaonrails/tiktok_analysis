package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1608560rxe {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1608550rxd.values().length];
        try {
            iArr[EnumC1608550rxd.UNFOLLOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
