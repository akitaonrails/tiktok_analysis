package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fOJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1125370fOJ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1125400fOM.values().length];
        try {
            iArr[EnumC1125400fOM.GUEST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1125400fOM.ANCHOR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
