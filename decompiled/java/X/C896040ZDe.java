package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C896040ZDe {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC896030ZDd.values().length];
        try {
            iArr[EnumC896030ZDd.ACTIVITY_AGGREGATED_FAVOURITE_LIST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC896030ZDd.ACTIVITY_AGGREGATED_REPOST_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
