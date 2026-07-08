package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0x5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1805700x5c {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1805630x5V.values().length];
        try {
            iArr[EnumC1805630x5V.LIVE_RECHARGE_PANEL_FOOTER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1805630x5V.LIVE_AFTER_RECHARGE_POPUP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
