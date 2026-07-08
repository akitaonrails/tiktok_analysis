package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0PNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C643920PNm {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC643930PNn.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC643930PNn.FIRST_VIDEO_CHUNK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC643930PNn.ALL_VIDEO_CHUNKS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
