package X;

import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1ELJ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ELJ extends C09AY implements Function1<ProfileState, ProfileState> {
    public final /* synthetic */ boolean LL = false;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ELJ(boolean z) {
        super(1);
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ProfileState invoke(ProfileState profileState) {
        ProfileState profileState2 = profileState;
        return profileState2.copy(profileState2.uid, profileState2.suid, profileState2.user, profileState2.sourceAweme, profileState2.loadAvatar, profileState2.avatarClickCount, profileState2.curTabType, profileState2.userVisibleHint, profileState2.needUpdateAvatarUrl, profileState2.livePreviousPage, profileState2.isFromMain, profileState2.isFirstNodeShow, profileState2.enterFrom, profileState2.isPostGuideShow, profileState2.isPostAwemeEmpty, profileState2.isPostAndDraftEmpty, profileState2.isGuideUserCard, profileState2.isPublishTabEmpty, profileState2.isPostAwemeEmptyWhenPrivateShow, profileState2.needShowProfileCollectionGuide, profileState2.triggerCopyrightViolationSnackBarEvent, profileState2.isAvatarClicked, profileState2.isBackgroundCoverClicked, profileState2.currentDownloadSetting, profileState2.onHiddenChanged, profileState2.fromSearch, profileState2.shouldShowViewerEntranceTips, profileState2.shouldShowViewerDialog, Boolean.valueOf(this.LL), Boolean.valueOf(this.LLILLJJLI), profileState2.aigcNavMetadata, profileState2.targetTab, profileState2.needRefreshAwemeListEvent, profileState2.needRefreshPhotoModeAwemeMuteEvent, profileState2.photoTopicProfileBannerEvent, profileState2.csiBanner, profileState2.guideCreateVideoWithEffectModel, profileState2.isBottomBannerCheckComplete, profileState2.publishAwemeRefreshed, profileState2.isRefreshing, profileState2.isLocating);
    }
}
