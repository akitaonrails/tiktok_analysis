package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.044A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C044A {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AnonymousClass0449.values().length];
        try {
            iArr[AnonymousClass0449.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AnonymousClass0449.SWITCH_SKU.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[AnonymousClass0449.CHANGE_SKU_QUANTITY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[AnonymousClass0449.CHANGE_PURCHASE_METHOD.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
