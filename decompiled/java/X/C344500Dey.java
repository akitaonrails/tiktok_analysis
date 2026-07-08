package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Dey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C344500Dey {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC344510Dez.values().length];
        try {
            iArr[EnumC344510Dez.NO_NET_TOAST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC344510Dez.ENTER_FYP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC344510Dez.FEED_CARD_GUIDE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
