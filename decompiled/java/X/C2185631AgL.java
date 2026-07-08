package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2185631AgL {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2185621AgK.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC2185621AgK.TEPIXEL_FORMAT_YUV420.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC2185621AgK.TEPIXEL_FORMAT_JPEG.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
