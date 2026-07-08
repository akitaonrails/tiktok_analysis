package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0U2V, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C0U2V {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0U2K.values().length];
        try {
            iArr[C0U2K.SINGER_CHANGED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
