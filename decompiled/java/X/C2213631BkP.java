package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.ttm.TTMOutput;

/* JADX INFO: renamed from: X.1BkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public /* synthetic */ class C2213631BkP {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[TTMOutput.ReturnType.values().length];
        LIZ = iArr;
        try {
            iArr[TTMOutput.ReturnType.LONG_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[TTMOutput.ReturnType.DOUBLE_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[TTMOutput.ReturnType.STRING_ARRAY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[TTMOutput.ReturnType.OBJECT_ARRAY.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
