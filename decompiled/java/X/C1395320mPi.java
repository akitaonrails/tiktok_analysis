package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0mPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1395320mPi {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1874010yrn.values().length];
        try {
            iArr[EnumC1874010yrn.DEBUG_META_UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
