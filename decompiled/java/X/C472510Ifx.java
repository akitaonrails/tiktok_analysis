package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ifx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C472510Ifx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC472500Ifw.values().length];
        try {
            iArr[EnumC472500Ifw.TOPLIVE_56.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
