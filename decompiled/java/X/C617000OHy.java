package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0OHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C617000OHy {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC617010OHz.values().length];
        try {
            iArr[EnumC617010OHz.CHANNEL_NOT_SUBSCRIBED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC617010OHz.CHANNEL_SUBSCRIBED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
