package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1782290wTr {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1782280wTq.values().length];
        try {
            iArr[EnumC1782280wTq.LARGE_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1782280wTq.SMALL_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1782280wTq.BENEFIT_IMPACT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
