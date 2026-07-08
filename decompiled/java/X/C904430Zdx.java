package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Zdx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C904430Zdx {
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
