package X;

import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0MT8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MT8 extends C0MT7 implements IEvent {
    public final int LJI;
    public final CommerceToolsTcmModel LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final Class<?> LJIIJ;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    @Override // X.C0MT7
    public final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        super.LIZ(videoPublishEditModel);
        videoPublishEditModel.commentSetting = this.LJI;
        videoPublishEditModel.creativeModel.commerceModel.setTcmModel(this.LJII);
        videoPublishEditModel.isPrivate = this.LJIIIIZZ;
        videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType = this.LJIIIZ;
    }

    public C0MT8(VideoPublishEditModel videoPublishEditModel, Class<?> cls) {
        super(videoPublishEditModel);
        this.LJI = videoPublishEditModel.commentSetting;
        this.LJII = videoPublishEditModel.creativeModel.commerceModel.getTcmModel();
        this.LJIIIIZZ = videoPublishEditModel.isPrivate;
        this.LJIIJ = cls;
        this.LJIIIZ = videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType;
    }
}
