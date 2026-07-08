package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C756820TmS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC756810TmR.values().length];
        try {
            iArr[EnumC756810TmR.SLOT_BROADCAST_SHARE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC756810TmR.SLOT_AUDIENCE_SHARE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
