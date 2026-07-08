package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0EuK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C379500EuK {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC378720Et4.values().length];
        try {
            iArr[EnumC378720Et4.TEXT_TO_IMAGE_CREATION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
