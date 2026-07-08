package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.search.CreationSearchModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MA0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MA0 {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        Bundle bundle = videoPublishEditModel.creativeModel.text2ImageModel.etParams;
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (string != null && string.length() != 0) {
                c0lab.LJ(str, string);
            }
        }
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        CreationSearchModel creationSearchModel = videoPublishEditModel.creativeModel.creationSearchModel;
        if (creationSearchModel == null) {
            return;
        }
        c0lab.LJ("search_id", creationSearchModel.getSearchId());
        c0lab.LJ("search_keyword", creationSearchModel.getSearchKeyWord());
        c0lab.LJ("search_result_id", creationSearchModel.getSearchResultId());
        c0lab.LJ("search_type", creationSearchModel.getSearchType());
        c0lab.LJ("search_enter_position", creationSearchModel.getSearchEnterPosition());
    }
}
