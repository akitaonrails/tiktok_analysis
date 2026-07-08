package X;

import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0nYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439180nYS {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        ArrayList<TimeSpeedModelExtension> arrayList;
        if (C0CHW.LIZ() && videoPublishEditModel.getOriginal() == 1 && ((!videoPublishEditModel.isChangeMultiEditData() || (C338630DPh.LIZ() && C0CHW.LIZ())) && (((multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) == null || !multiEditVideoRecordData.isMultiEditRetake) && videoPublishEditModel.getTimeEffect() == null))) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData2 != null && (arrayList = multiEditVideoRecordData2.originalSegments) != null) {
                Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String createId = it2.next().getCreateId();
                    if (createId == null || createId.length() == 0) {
                        return false;
                    }
                }
                if (!videoPublishEditModel.isStitchMode()) {
                    return videoPublishEditModel.getShootedShootMode() == 18 ? true : true;
                }
            } else if (!videoPublishEditModel.isStitchMode() && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_allow_users_to_add_more_clips_when_editing", true) > 0) {
                if (videoPublishEditModel.getShootedShootMode() == 18 && videoPublishEditModel.getShootedShootMode() != 11 && videoPublishEditModel.getShootedShootMode() != 14) {
                    if (videoPublishEditModel.getShootedShootMode() == 10 && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_allow_users_to_add_more_clips_when_editing", true) == 1) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
