package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03a9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C867103a9 {
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
