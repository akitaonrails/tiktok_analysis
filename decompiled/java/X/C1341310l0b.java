package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0l0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1341310l0b {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1341620l16.values().length];
        try {
            iArr[EnumC1341620l16.THUMBNAIL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1341620l16.DETAIL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
