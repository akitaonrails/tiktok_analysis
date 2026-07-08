package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0meN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1404410meN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1404400meM.values().length];
        try {
            iArr[EnumC1404400meM.FILTER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
