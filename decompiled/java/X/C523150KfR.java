package X;

import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumBottomActionBarConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumNextButtonConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523150KfR extends C09AY implements Function1<ChoosePhotoPreviewPageConfig, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ MvChoosePhotoScene LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C523150KfR(boolean z, MvChoosePhotoScene mvChoosePhotoScene, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = mvChoosePhotoScene;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = z5;
        this.LLIZ = z6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        AlbumNextButtonConfig albumNextButtonConfigO7;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = choosePhotoPreviewPageConfig;
        boolean z6 = false;
        if (!this.LL && !this.LLILLJJLI.isFromUseTemplate()) {
            z = false;
        } else {
            z = true;
        }
        choosePhotoPreviewPageConfig2.isFromCutSame = z;
        choosePhotoPreviewPageConfig2.isSoundSync = this.LLILLJJLI.isSoundSyncMode();
        if (!this.LLILLJJLI.isUgcTemplateMode() && !this.LLILLJJLI.isFromUseTemplate()) {
            z2 = false;
        } else {
            z2 = true;
        }
        choosePhotoPreviewPageConfig2.isUgcTemplate = z2;
        choosePhotoPreviewPageConfig2.isAIGCAvatar = this.LLILLJJLI.isAIGC();
        choosePhotoPreviewPageConfig2.isEditorProReplace = this.LLILLJJLI.isEditorProReplace();
        choosePhotoPreviewPageConfig2.isAutoCutSoundSyncMode = this.LLILLJJLI.isAutoCutAnchorSoundSyncMode();
        choosePhotoPreviewPageConfig2.isAutoCutAnchorMode = this.LLILLJJLI.isAutoCutAnchorMode();
        choosePhotoPreviewPageConfig2.supportRepeatSelect = this.LLILLL;
        if (!this.LLILZ && (this.LL || this.LLILLJJLI.enableBottomDocker)) {
            z3 = true;
        } else {
            z3 = false;
        }
        choosePhotoPreviewPageConfig2.showDockInPreviewPage = z3;
        MvChoosePhotoScene mvChoosePhotoScene = this.LLILLJJLI;
        if ((!mvChoosePhotoScene.nextRulesAdjustment || mvChoosePhotoScene.isMVMode() || this.LLILLJJLI.isEditorProAIGC() || choosePhotoPreviewPageConfig2.chooseSceneMode == 64) && !this.LLILLJJLI.isFromAILivePhotoCreation()) {
            z4 = false;
        } else {
            z4 = true;
        }
        choosePhotoPreviewPageConfig2.nextRuleAdjustment = z4;
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LLILLJJLI;
        choosePhotoPreviewPageConfig2.stickerMultiPhotosMode = mvChoosePhotoScene2.stickerSupportMultiPhotos;
        choosePhotoPreviewPageConfig2.showAutoCutBtn = mvChoosePhotoScene2.canShowAutoCutBtn;
        if (!mvChoosePhotoScene2.isFromAILivePhotoCreation() && !C522930Kf5.LIZIZ(this.LLILLJJLI.getChooseScene$tools_camera_record_release()) && !C522930Kf5.LIZ(this.LLILLJJLI.getChooseScene$tools_camera_record_release()) && choosePhotoPreviewPageConfig2.chooseSceneMode != 64) {
            z5 = false;
        } else {
            z5 = true;
        }
        choosePhotoPreviewPageConfig2.forceHideMediaRecyclerView = z5;
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LLILLJJLI;
        choosePhotoPreviewPageConfig2.showUseEffectBtn = mvChoosePhotoScene3.canReuseImageEffectTemplate;
        C527340KmC c527340KmC = C527340KmC.LIZ;
        int chooseScene$tools_camera_record_release = mvChoosePhotoScene3.getChooseScene$tools_camera_record_release();
        boolean z7 = this.LLILZIL;
        c527340KmC.getClass();
        if (C527340KmC.LIZIZ(chooseScene$tools_camera_record_release, z7) && !this.LLILLJJLI.fromStoryHeadPlus()) {
            z6 = true;
        }
        choosePhotoPreviewPageConfig2.showEditorProBtn = z6;
        choosePhotoPreviewPageConfig2.chooseSceneMode = this.LLILLJJLI.getChooseScene$tools_camera_record_release();
        MvChoosePhotoScene mvChoosePhotoScene4 = this.LLILLJJLI;
        choosePhotoPreviewPageConfig2.minSelectedPhotoCount = mvChoosePhotoScene4.minPhotoSelectCount;
        choosePhotoPreviewPageConfig2.maxUseEffectPhotoCount = mvChoosePhotoScene4.maxUseEffectCount;
        choosePhotoPreviewPageConfig2.isCreatePUGCTemplateFrom = this.LLILZLL;
        choosePhotoPreviewPageConfig2.isFromEditorProAnchor = mvChoosePhotoScene4.isFromEditorProSchemeLaunched();
        choosePhotoPreviewPageConfig2.enableLivePhotoSwitch = this.LLIZ;
        AlbumBottomActionBarConfig albumBottomActionBarConfig = this.LLILLJJLI.bottomActionBarConfig;
        if (albumBottomActionBarConfig != null) {
            albumNextButtonConfigO7 = albumBottomActionBarConfig.O7();
        } else {
            albumNextButtonConfigO7 = null;
        }
        choosePhotoPreviewPageConfig2.nextBtnConfig = albumNextButtonConfigO7;
        String str = this.LLILLJJLI.bottomActionBarType;
        C523950Kgj.LIZIZ.getClass();
        choosePhotoPreviewPageConfig2.enableBottomBarRefactory = Intrinsics.LJFF(str, C523950Kgj.LIZJ);
        return Unit.LIZ;
    }
}
