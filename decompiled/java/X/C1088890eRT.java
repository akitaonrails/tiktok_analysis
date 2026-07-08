package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eRT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1088890eRT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1088900eRU.values().length];
        try {
            iArr[EnumC1088900eRU.ICON_LAND.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1088900eRU.ICON_WITH_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1088900eRU.ICON.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
