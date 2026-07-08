package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0W2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C816870W2r {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC816850W2p.values().length];
        try {
            iArr[EnumC816850W2p.SORTED_MAF.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
