package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YM3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0YM3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0YM2.values().length];
        try {
            iArr[C0YM2.TIKTOK_SOCIAL_IM.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
