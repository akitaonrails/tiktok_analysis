package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1411105fh {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1411005fg.values().length];
        try {
            iArr[EnumC1411005fg.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
