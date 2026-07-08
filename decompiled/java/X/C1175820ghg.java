package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ghg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1175820ghg {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1175790ghd.values().length];
        try {
            iArr[EnumC1175790ghd.CARD_VIEW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1175790ghd.POI_LIST_FIVE_SHEET.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1175790ghd.POI_LIST_THREE_SHEET.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
