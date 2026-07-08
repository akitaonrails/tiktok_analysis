package X;

import com.ss.android.ugc.aweme.experiment.LivePhotoByteBenchExperiment;

/* JADX INFO: renamed from: X.0Mmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578570Mmd {
    public static final C578570Mmd LIZ = new C578570Mmd();

    public static boolean LIZ() {
        LivePhotoByteBenchExperiment livePhotoByteBenchExperiment;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_album_enable_live_photo", true, false) && !C295670BiP.LIZ()) {
            C212350188e c212350188eLIZJ = C212350188e.LIZJ();
            if (c212350188eLIZJ == null) {
                return false;
            }
            C844470XAv.LIZ.getClass();
            C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
            if (c09gaLIZIZ == null || (livePhotoByteBenchExperiment = (LivePhotoByteBenchExperiment) c09gaLIZIZ.LJII(LivePhotoByteBenchExperiment.class)) == null || !livePhotoByteBenchExperiment.isLivePhotoEnabled()) {
                return false;
            }
        }
        return true;
    }
}
