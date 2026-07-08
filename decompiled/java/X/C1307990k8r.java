package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0k8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1307990k8r {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC1308000k8s.values().length];
        try {
            iArr[EnumC1308000k8s.EXPRESSION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1308000k8s.PITAYA_CEP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1308000k8s.TTM_CEP.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC1308010k8t.values().length];
        try {
            iArr2[EnumC1308010k8t.CUSTOM.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC1308010k8t.APP_LOG.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZIZ = iArr2;
    }
}
