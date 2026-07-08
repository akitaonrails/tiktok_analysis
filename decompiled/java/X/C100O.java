package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.100O, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C100O {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C100M.values().length];
        try {
            iArr[C100M.INLINE_POPUP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C100M.TEMPLATE_ID.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
