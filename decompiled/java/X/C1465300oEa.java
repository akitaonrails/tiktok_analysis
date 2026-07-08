package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1465300oEa {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1465290oEZ.values().length];
        try {
            iArr[EnumC1465290oEZ.CUSTOM_STICKER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1465290oEZ.NON_GIPHY_INFO_STICKER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
