package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1787210wbn {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1787180wbk.values().length];
        try {
            iArr[EnumC1787180wbk.INTEGRATION_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
