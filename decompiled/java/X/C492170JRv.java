package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0JRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C492170JRv {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC492180JRw.values().length];
        try {
            iArr[EnumC492180JRw.SUB_EMOTE_POLL_CREATE_POPUP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC492180JRw.SUB_EMOTE_POLL_RESULT_POPUP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
