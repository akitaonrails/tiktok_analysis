package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0605, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class AnonymousClass0605 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AnonymousClass0604.values().length];
        try {
            iArr[AnonymousClass0604.CREATOR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AnonymousClass0604.USER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
