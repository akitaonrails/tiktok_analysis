package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wSV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1781450wSV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1781440wSU.values().length];
        try {
            iArr[EnumC1781440wSU.NATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
