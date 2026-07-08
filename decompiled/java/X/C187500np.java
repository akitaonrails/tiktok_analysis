package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C187500np {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC187400no.values().length];
        try {
            iArr[EnumC187400no.TOP_BUYER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
