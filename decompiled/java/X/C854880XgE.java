package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0XgE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C854880XgE {
    public static final C854880XgE LIZ = new C854880XgE();

    public static final void LIZ(Bundle bundle, VideoPublishEditModel videoPublishEditModel) {
        if (bundle != null && ((Boolean) C284540BDg.LIZ.getValue()).booleanValue()) {
            String string = bundle.getString("publish_desc_title");
            if (string != null) {
                videoPublishEditModel.setTitle(string);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("publish_desc_struct_list");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                videoPublishEditModel.setStructList(parcelableArrayList);
            }
            String string2 = bundle.getString("publish_desc_markup_text");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("publish_desc_markup_extra");
            CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
            if (string2 != null) {
                captionModel.markupText = string2;
            }
            if (parcelableArrayList2 != null) {
                captionModel.markupExtra = parcelableArrayList2;
            }
        }
    }
}
