package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1223650hwp {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1223630hwn.values().length];
        try {
            iArr[EnumC1223630hwn.SEARCH_PAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
