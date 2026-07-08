package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C779850UiV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC779790UiP.values().length];
        try {
            iArr[EnumC779790UiP.CMD_CLICK_SMALL_WINDOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
