package X;

import com.google.gson.e;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitInputInfo;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import com.ss.android.ugc.aweme.portrait.model.RefType;

/* JADX INFO: renamed from: X.0LiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550460LiO {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new e().LIZ();
    }

    public static final int LIZ(AIPortraitContextModel aIPortraitContextModel) {
        String str;
        AIPortraitInputInfo aIPortraitInputInfo = aIPortraitContextModel.inputInfo;
        if (aIPortraitInputInfo == null) {
            return RefImageType.NONE.getValue();
        }
        RefType refType = aIPortraitInputInfo.refType;
        if (refType != RefType.REUSE_ALL && refType != RefType.REUSE_IMAGE) {
            if (refType == RefType.REUSE_NONE && (str = aIPortraitInputInfo.referenceImageUploadId) != null && str.length() != 0) {
                return RefImageType.USER_UPLOAD.getValue();
            }
            return RefImageType.NONE.getValue();
        }
        return RefImageType.PRESET.getValue();
    }
}
