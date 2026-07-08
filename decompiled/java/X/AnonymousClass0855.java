package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0855, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class AnonymousClass0855 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AnonymousClass0854.values().length];
        try {
            iArr[AnonymousClass0854.VISUAL_SEARCH_BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
