package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0JkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C500810JkV {
    public static final /* synthetic */ int[] LIZ;

    static {
        EnumC500820JkW.values();
        int[] iArr = new int[EnumC500800JkU.values().length];
        try {
            iArr[EnumC500800JkU.LIVE_ROOM.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC500800JkU.LIVE_BROADCAST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
