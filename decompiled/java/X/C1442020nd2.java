package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0nd2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1442020nd2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1442010nd1.values().length];
        try {
            iArr[EnumC1442010nd1.UNKNOWED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1442010nd1.RECORD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1442010nd1.UPLOAD_ONE_IMAGE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1442010nd1.UPLOAD_OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1442010nd1.UPLOAD_ONLY_IMAGE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
