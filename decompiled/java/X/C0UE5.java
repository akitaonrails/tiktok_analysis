package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UE5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C0UE5 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0UE0.values().length];
        try {
            iArr[C0UE0.AUTO_POST_LIVING_PANEL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
