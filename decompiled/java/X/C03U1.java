package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03U1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C03U1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC805703Ct.values().length];
        try {
            iArr[EnumC805703Ct.ORDER_HAVE_CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
