package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C884403cw {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC884003cs.values().length];
        try {
            iArr[EnumC884003cs.CLICK_SAVE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
