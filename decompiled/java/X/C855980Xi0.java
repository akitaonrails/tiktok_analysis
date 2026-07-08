package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Xi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855980Xi0 {
    public static boolean LIZ;

    public static final int LIZLLL() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_photo_text_banner_entrance_guide_type", true);
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!C1428470nHB.LJLL(videoPublishEditModel) || !C1697810uHb.LJIIJJI(4, 8).contains(Integer.valueOf(LIZLLL()))) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ai_tip isPhotoModeStrengthenIntention = ");
            sbLIZ.append(C1428470nHB.LJLL(videoPublishEditModel));
            sbLIZ.append(" topics isNotNull = ");
            boolean z = true;
            sbLIZ.append(!videoPublishEditModel.creativeModel.imagePublishBackSaveModel.topicInspirations.isEmpty());
            c1437510nVlLJJLIIIJ.LIZ("ai_tip label", C2188811AlT.LIZIZ(sbLIZ));
            if (!C1428470nHB.LJLL(videoPublishEditModel) || !(!videoPublishEditModel.creativeModel.imagePublishBackSaveModel.topicInspirations.isEmpty()) || LIZLLL() < 5) {
                z = false;
            }
            LIZ = z;
        }
        return LIZ;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (!C1428470nHB.LJLL(videoPublishEditModel) || !C1697810uHb.LJIIJJI(1, 2, 5, 6).contains(Integer.valueOf(LIZLLL()))) {
            return false;
        }
        return true;
    }
}
