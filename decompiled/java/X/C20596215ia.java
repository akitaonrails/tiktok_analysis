package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15ia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C20596215ia {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC20596115iZ.values().length];
        try {
            iArr[EnumC20596115iZ.CLEAN_CACHE_AND_DRAFT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
