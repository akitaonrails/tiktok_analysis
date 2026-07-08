package X;

import com.ss.android.ugc.aweme.effectcreator.experiments.MobileEffectVideoImportData;

/* JADX INFO: renamed from: X.0LvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558520LvO {
    public static final MobileEffectVideoImportData LIZ = new MobileEffectVideoImportData(8388608, 3, 1, 8, 720, 1280, 2097152, 24);
    public static MobileEffectVideoImportData LIZIZ;

    public static final MobileEffectVideoImportData LIZ() {
        MobileEffectVideoImportData mobileEffectVideoImportData = LIZIZ;
        if (mobileEffectVideoImportData != null) {
            return mobileEffectVideoImportData;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        MobileEffectVideoImportData mobileEffectVideoImportData2 = LIZ;
        MobileEffectVideoImportData mobileEffectVideoImportData3 = (MobileEffectVideoImportData) c0c64LJIILLIIL.LJJII(MobileEffectVideoImportData.class, mobileEffectVideoImportData2, "ame_pack_size_control_config", true);
        LIZIZ = mobileEffectVideoImportData3;
        return mobileEffectVideoImportData3 != null ? mobileEffectVideoImportData3 : mobileEffectVideoImportData2;
    }
}
