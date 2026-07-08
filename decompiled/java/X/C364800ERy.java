package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ERy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C364800ERy {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC364790ERx.values().length];
        try {
            iArr[EnumC364790ERx.SHOW_LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC364790ERx.SHOW_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC364790ERx.SHOW_NET_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC364790ERx.SHOW_LOADING_WITHOUT_PROCESS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
