package X;

import com.ss.android.ugc.aweme.ad.settings.IABExposurePivModel;

/* JADX INFO: renamed from: X.0d6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037720d6w {
    public static final IABExposurePivModel LIZ;

    static {
        IABExposurePivModel iABExposurePivModel = new IABExposurePivModel(0.24f, 0.49f);
        IABExposurePivModel iABExposurePivModel2 = (IABExposurePivModel) C0C64.LJIILLIIL().LJJII(IABExposurePivModel.class, iABExposurePivModel, "iab_exposure_piv_config", true);
        if (iABExposurePivModel2 != null) {
            iABExposurePivModel = iABExposurePivModel2;
        }
        LIZ = iABExposurePivModel;
    }
}
