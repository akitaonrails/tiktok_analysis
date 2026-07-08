package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.creation.CreationTypeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0MSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568750MSj {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2914));

    public static final boolean LIZJ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final boolean LIZ(CreativeModel creativeModel) {
        CreationTypeModel creationTypeModel;
        if (!LIZJ() || creativeModel == null || (creationTypeModel = creativeModel.creationTypeModel) == null || creationTypeModel.creationMode != 2 || creativeModel.editPostModel == null || !creativeModel.imageEditModel.useNewReEditImageExp) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!LIZJ() || videoPublishEditModel == null || !C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return false;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.editPostModel == null || !creativeModel.imageEditModel.useNewReEditImageExp) {
            return false;
        }
        return true;
    }
}
