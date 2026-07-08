package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1201580hNE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1201570hND.values().length];
        try {
            iArr[EnumC1201570hND.INTRO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
