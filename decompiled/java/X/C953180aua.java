package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0aua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C953180aua {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC953170auZ.values().length];
        try {
            iArr[EnumC953170auZ.REVIEW_NOT_PASSED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
