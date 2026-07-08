package X;

import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0FRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390110FRh {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(InterfaceC1418580n1E interfaceC1418580n1E, VideoPublishEditModel videoPublishEditModel) {
        if (interfaceC1418580n1E != null) {
            return interfaceC1418580n1E.Ie2();
        }
        MicDataModel micDataModel = videoPublishEditModel.creativeModel.micDataModel;
        if ((micDataModel.editDefaultVolume != 0.0f || micDataModel.editVolumeChangeMark) && !videoPublishEditModel.isCurrentAutoCutMode() && C1403850mdT.LJIIJJI(videoPublishEditModel) && videoPublishEditModel.getVoiceVolume() > 0.0f) {
            return true;
        }
        return false;
    }
}
