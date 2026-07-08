package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0om1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1486030om1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1486640on0.values().length];
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
            try {
                iArr[EnumC1486640on0.READY.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e3) {
            e = e3;
        }
        try {
            try {
            } catch (NoSuchFieldError e4) {
                e = e4;
            }
        } catch (NoSuchFieldError e5) {
            e = e5;
        }
        try {
            iArr[EnumC1486640on0.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            e = e6;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
            } catch (NoSuchFieldError e7) {
                e = e7;
            }
            try {
                iArr[EnumC1486640on0.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
                e = e8;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e9) {
            e = e9;
        }
        LIZ = iArr;
    }
}
