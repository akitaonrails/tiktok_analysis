package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0gfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1174590gfh {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1174570gff.values().length];
        try {
            iArr[EnumC1174570gff.POI_LIST_NINE_SHEET.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1174570gff.POI_LIST_THREE_SHEET.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
