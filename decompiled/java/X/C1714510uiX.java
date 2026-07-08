package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1714510uiX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1714520uiY.values().length];
        try {
            iArr[EnumC1714520uiY.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1714520uiY.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1714520uiY.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
