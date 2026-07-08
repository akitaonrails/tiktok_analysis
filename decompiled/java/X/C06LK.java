package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06LK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C06LK {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC904370Zdr.values().length];
        try {
            iArr[EnumC904370Zdr.SHARED_VIDEOS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
