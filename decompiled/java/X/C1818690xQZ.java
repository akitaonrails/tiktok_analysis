package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0xQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1818690xQZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1818710xQb.values().length];
        try {
            iArr[EnumC1818710xQb.LAYOUT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1818710xQb.CROP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
