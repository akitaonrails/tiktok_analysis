package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jKV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1276770jKV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1276740jKS.values().length];
        try {
            iArr[EnumC1276740jKS.RENDER_FIT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
