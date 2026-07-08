package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03j7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C922703j7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC922503j5.values().length];
        try {
            iArr[EnumC922503j5.CHECKOUT_PAY_LATER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
