package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0nHD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1428490nHD {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1428480nHC.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC1428480nHC.TRACK_PAGE_RECORD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC1428480nHC.TRACK_PAGE_EDIT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
