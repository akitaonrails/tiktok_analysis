package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.shopify.checkout.models.ProgressButtonState;

/* JADX INFO: renamed from: X.0dXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1054370dXn {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ProgressButtonState.values().length];
        try {
            iArr[ProgressButtonState.Enabled.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[ProgressButtonState.Disabled.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[ProgressButtonState.Loading.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
