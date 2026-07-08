package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05AY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C05AY {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1308705Af.values().length];
        try {
            iArr[EnumC1308705Af.RECORDING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
