package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0neV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442930neV {
    public static final C1442930neV LIZ = new C1442930neV();

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C1429680nJ8.LJ(videoPublishEditModel.creativeModel.musicBuzModel)) {
            return null;
        }
        return C1443230nez.LJI(videoPublishEditModel);
    }

    public static String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        List listLJJLIIIJILLIZJL;
        TimeSpeedModelExtension timeSpeedModelExtension;
        String stickerId;
        ArrayList<TimeSpeedModelExtension> finalSegments = videoPublishEditModel.getFinalSegments();
        if (finalSegments != null && (timeSpeedModelExtension = (TimeSpeedModelExtension) C13LP.LJJJLL(finalSegments)) != null && (stickerId = timeSpeedModelExtension.getStickerId()) != null) {
            return stickerId;
        }
        String stickers = videoPublishEditModel.getStickers();
        if (stickers == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(stickers, new String[]{","}, 0, 6)) == null) {
            return null;
        }
        return (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL);
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        boolean z = false;
        if (C0CHQ.LIZ().getAccountService().LJIIJJI()) {
            return false;
        }
        String collectionId = videoPublishEditModel.creativeModel.paidContentModel.getCollectionId();
        if (collectionId != null && collectionId.length() != 0) {
            return false;
        }
        String str = videoPublishEditModel.creativeModel.text2ImageModel.text;
        if (str != null && str.length() != 0) {
            return false;
        }
        if (videoPublishEditModel.getTtStoryUploadModel() != null) {
            z = true;
        }
        return !z;
    }

    public static boolean LIZLLL(boolean z) {
        if (z) {
            if (C284510BDd.LIZ() != 2 && C284510BDd.LIZ() != 4) {
                return false;
            }
        } else if (C284520BDe.LIZ() != 2 && C284520BDe.LIZ() != 4) {
            return false;
        }
        return true;
    }
}
