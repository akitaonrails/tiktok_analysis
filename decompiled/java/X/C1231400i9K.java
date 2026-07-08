package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0i9K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1231400i9K {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1231460i9Q.values().length];
        try {
            iArr[EnumC1231460i9Q.EDIT_PROFILE_PAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
