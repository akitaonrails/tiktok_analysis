package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1787080wba {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1787060wbY.values().length];
        try {
            iArr[EnumC1787060wbY.VERIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
