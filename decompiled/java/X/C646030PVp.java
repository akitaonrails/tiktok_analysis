package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0PVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C646030PVp {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC646250PWl.values().length];
        try {
            iArr[EnumC646250PWl.SEARCH_ROOT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
