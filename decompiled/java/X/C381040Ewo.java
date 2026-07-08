package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ewo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C381040Ewo {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC378720Et4.values().length];
        try {
            iArr[EnumC378720Et4.TEXT_TO_IMAGE_CREATION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC378720Et4.TEXT_TO_VIDEO_CREATION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
