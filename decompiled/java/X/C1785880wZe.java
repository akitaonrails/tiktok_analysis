package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1785880wZe {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1785890wZf.values().length];
        try {
            iArr[EnumC1785890wZf.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1785890wZf.EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1785890wZf.FRIEND_RANKING_EMPTY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1785890wZf.FRIEND_RANKING_OPT_OUT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1785890wZf.SERVER_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC1785890wZf.NO_NETWORK.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
