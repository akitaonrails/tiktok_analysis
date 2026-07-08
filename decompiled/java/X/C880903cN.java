package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03cN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C880903cN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC880203cG.values().length];
        try {
            iArr[EnumC880203cG.SYSTEM_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
