package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Nmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C604030Nmb {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC604020Nma.values().length];
        try {
            iArr[EnumC604020Nma.CUSTOM_TAB.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
