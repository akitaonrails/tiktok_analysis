package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.194n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C214803194n {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC214804194o.values().length];
        try {
            iArr[EnumC214804194o.FREEDOM_HEIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC214804194o.AUTO_SIZE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC214804194o.FIXED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC214804194o.DYNAMIC.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC214804194o.FULLSCREEN.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
