package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06G6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C06G6 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C06G9.values().length];
        try {
            iArr[C06G9.STREAK_PET_INLINE_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C06G9.INVITE_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C06G9.ACTION_BAR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C06G9.WIDGET.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
