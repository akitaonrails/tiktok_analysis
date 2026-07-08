package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.CutSameModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nOU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433000nOU {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        boolean z2;
        if (videoPublishEditModel.creativeModel.nowsShootModel != null) {
            z = true;
        } else {
            z = false;
        }
        if (C1442370ndb.LIZ(z)) {
            return false;
        }
        boolean zLIZ = C1442630ne1.LIZ();
        if ((videoPublishEditModel.isUploadVideo() && C1442610ndz.LIZ()) || (videoPublishEditModel.getOrigin() == 1 && C1442620ne0.LIZ())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (zLIZ && z2) {
            return true;
        }
        return false;
    }

    public static final Float LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        CutSameModel cutSameModel = videoPublishEditModel.creativeModel.cutSameModel;
        if (cutSameModel != null) {
            str = cutSameModel.selectedTemplate;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            CutsameDataItem cutsameDataItem = (CutsameDataItem) GsonProtectorUtils.fromJson(C09C2.LIZ(), str, CutsameDataItem.class);
            if (cutsameDataItem != null) {
                float f = cutsameDataItem.templateComplexityScore;
                if (f <= 0.0f) {
                    return null;
                }
                return Float.valueOf(f);
            }
        } else {
            float f2 = videoPublishEditModel.creativeModel.pugcTemplateData.templateComplexityScore;
            if (f2 > 0.0f) {
                return Float.valueOf(f2);
            }
        }
        return null;
    }
}
