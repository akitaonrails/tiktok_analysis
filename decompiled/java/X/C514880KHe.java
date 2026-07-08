package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C514880KHe {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC514890KHf.values().length];
        try {
            iArr[EnumC514890KHf.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
