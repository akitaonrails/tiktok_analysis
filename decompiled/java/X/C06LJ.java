package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06LJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C06LJ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC904370Zdr.values().length];
        try {
            iArr[EnumC904370Zdr.SHARED_VIDEOS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC904370Zdr.PRIVATE_MEDIA.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
