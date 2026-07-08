package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0xDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1810500xDM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1811400xEo.values().length];
        try {
            iArr[EnumC1811400xEo.E_COMMERCE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
