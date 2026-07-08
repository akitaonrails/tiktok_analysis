package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0T7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C741710T7p {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC742820TBw.values().length];
        try {
            iArr[EnumC742820TBw.LIVE_ROOM_BOTTOM_CONTENT_HEIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
