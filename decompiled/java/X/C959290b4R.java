package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0b4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C959290b4R {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC959280b4Q.values().length];
        try {
            iArr[EnumC959280b4Q.FRIENDS_RANKING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC959280b4Q.LEAGUE_RECOMMEND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
