package X;

import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MT7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MT7 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public C0MT7(VideoPublishEditModel videoPublishEditModel) {
        PrivacySettingModel privacySettingModel = videoPublishEditModel.creativeModel.privacySettingModel;
        this.LIZ = privacySettingModel.contentReusePermission;
        this.LIZIZ = videoPublishEditModel.reactDuetSetting;
        this.LIZJ = videoPublishEditModel.stitchSetting;
        this.LIZLLL = privacySettingModel.allowCreateSticker;
        this.LJ = privacySettingModel.allowShareToStory;
        this.LJFF = videoPublishEditModel.getCreativeFlowData().getPublishConfig().getMatureTheme();
    }

    public void LIZ(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.reactDuetSetting = this.LIZIZ;
        videoPublishEditModel.stitchSetting = this.LIZJ;
        PrivacySettingModel privacySettingModel = videoPublishEditModel.creativeModel.privacySettingModel;
        privacySettingModel.allowCreateSticker = this.LIZLLL;
        privacySettingModel.allowShareToStory = this.LJ;
        videoPublishEditModel.getCreativeFlowData().getPublishConfig().setMatureTheme(this.LJFF);
        videoPublishEditModel.creativeModel.privacySettingModel.contentReusePermission = this.LIZ;
    }
}
