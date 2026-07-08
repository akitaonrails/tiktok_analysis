package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C19553911er {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC19554011es.values().length];
        try {
            iArr[EnumC19554011es.PREVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC19554011es.COLLECT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC19554011es.USE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC19554011es.REFRESH_DOWNLOAD.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
