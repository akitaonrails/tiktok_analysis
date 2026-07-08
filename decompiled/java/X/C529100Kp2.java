package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Kp2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529100Kp2 extends C09AY implements Function1<ChooseMediaState, ChooseMediaState> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529100Kp2(int i, int i2, int i3) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
        ChooseMediaState chooseMediaState2 = chooseMediaState;
        return chooseMediaState2.copy(chooseMediaState2.mediaListState, chooseMediaState2.selectMediaState, chooseMediaState2.unSelectMediaState, chooseMediaState2.updateSelectedMediaClipRange, chooseMediaState2.previewMediaState, chooseMediaState2.preMusicState, chooseMediaState2.preChangeMusicState, chooseMediaState2.lastPreMusicState, chooseMediaState2.openingChooseMediaPageState, chooseMediaState2.closingChooseMediaPageState, chooseMediaState2.hideShowChooseMediaPageState, new C528740KoS(this.LL, this.LLILLJJLI, this.LLILLL), chooseMediaState2.allMediaList, chooseMediaState2.photoMediaList, chooseMediaState2.videoMediaList, chooseMediaState2.glanceMediaList, chooseMediaState2.livePhotoMediaList, chooseMediaState2.aiContentMediaList, chooseMediaState2.liveRecordingsMediaList, chooseMediaState2.isChangeMusicDownloadSuccess, chooseMediaState2.previewDockerState, chooseMediaState2.previewDockerInitMediaList, chooseMediaState2.previewSwapState, chooseMediaState2.previewDockerDelMediaState, chooseMediaState2.previewDockerAddMediaState, chooseMediaState2.previewNextBtnMediaState, chooseMediaState2.nextBtnWithDirectUseState, chooseMediaState2.previewNextBtnClickState, chooseMediaState2.previewNextBtnState, chooseMediaState2.previewAutoCutBtnClickState, chooseMediaState2.isClickUseEffectBtn, chooseMediaState2.dockerHasShown, chooseMediaState2.albumViewFullShow, chooseMediaState2.recordPresetResourceState, chooseMediaState2.albumToEditPageState, chooseMediaState2.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState2.autoPickSelectedMedias, chooseMediaState2.notifyRefreshLivePhotoState, chooseMediaState2.goNextMediaState, chooseMediaState2.recordPageExitState, chooseMediaState2.previewAutoCutBtnState, chooseMediaState2.previewEditProBtnState, chooseMediaState2.tabCurrentItemType, chooseMediaState2.showAiContentGuideView, chooseMediaState2.showLiveRecordingsFloatingGuide, chooseMediaState2.liveRecordingsCardShownInFirstScreen, chooseMediaState2.onLoadAiContentMediaList, chooseMediaState2.defaultSelectMediaList, chooseMediaState2.onLoadLiveRecordingsMediaList, chooseMediaState2.mobUnselectMediaFromCheckBox, chooseMediaState2.notifyMobUnselectMediaFromX, chooseMediaState2.mobReEnterUploadPage);
    }
}
