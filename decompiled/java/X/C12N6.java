package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.audiencefooter.view.AudienceFooterBottomSheetOption;

/* JADX INFO: renamed from: X.12N6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12N6 {
    public static AudienceFooterBottomSheetOption LIZ(VideoPublishEditModel videoPublishEditModel, int i) {
        AudienceFooterBottomSheetOption audienceFooterBottomSheetOption = new AudienceFooterBottomSheetOption();
        Bundle bundle = new Bundle();
        bundle.putInt("optionType", i);
        C1428470nHB.LLIL(bundle, videoPublishEditModel);
        audienceFooterBottomSheetOption.setArguments(bundle);
        return audienceFooterBottomSheetOption;
    }
}
