package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0NKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C592170NKl {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0NLF.values().length];
        try {
            iArr[C0NLF.PROMOTION_TRIGGER_POPUP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0NLF.PRE_SCENE_AUTO_CLAIMED_POPUP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
