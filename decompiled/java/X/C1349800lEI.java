package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.comment.param.ICommentPageParamsAppDiffProtocol;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0lEI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349800lEI extends C1351080lGM<C1349800lEI> {
    public static final long serialVersionUID = -8706130331733501305L;
    public int LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public Aweme LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public String LLJJIII;
    public int LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Map<String, String> LLJLL;
    public String LLJLLIL;
    public transient InterfaceC679410Qkt LLJLLL;
    public transient InterfaceC1350210lEx LLJZ;
    public transient InterfaceC1350190lEv LLJZIJLIL;
    public CommentStruct LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public int LLLILZJ;
    public String LLLILZLLLI;
    public String LLLIZZ;
    public boolean LLLJ;
    public String LLLJIL;
    public String LLLJL;
    public String LLLL;
    public String LLLLII;
    public String LLLLIIIILLL;
    public String LLLLIIL;
    public String LLLLIILL;
    public boolean LLLLIILLL;
    public List<User> LLLLIL;
    public boolean LLLLILI;
    public String LLLLJ;
    public boolean LLLLJI;
    public String LLLLL;
    public String LLLLLIL;
    public String LLLLLILLIL;
    public String LLLLLJIL;
    public long LLLLLJLJLL;
    public int LLLLLL;
    public String LLLLLLIL;
    public String LLLLLLJ;
    public String LLLLLLL;
    public String LLLLLLLLL;
    public String LLLLLLLLLL;
    public String LLLLLLLZIL;
    public String LLLLLLZ;
    public int LLLLLLZZ;
    public int LLLLLZ;
    public int LLLLLZIL;
    public int LLLLLZL;
    public boolean LLLLZ;
    public int LLLLZI;
    public long LLLLZIL;
    public int LLLLZLL;
    public float LLLLZLLIL;
    public long LLLLZLLLI;
    public String LLLZ;
    public String LLLZI;
    public boolean LLLZIIL;
    public boolean LLLZIL;
    public int LLLZL;
    public boolean LLLZLL;
    public String LLLZLZ;
    public String LLLZZ;
    public boolean LLLZZIL;
    public boolean LLZ;
    public FypExposedCommentMobParams LLZIL;
    public String LLZILL;
    public String LLZL;
    public boolean LLZLI;
    public boolean LLZLL;
    public String LLZLLIL;
    public String LLZLLLL;
    public boolean LLZZ;
    public boolean LLZZJLIL;
    public boolean LLZZLLIL;
    public String LLZZZIL;
    public C1349900lES LLZZZZ;
    public String a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean forceHideCommentPhoto;
    public long g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public String o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public String u;
    public String v;
    public int w;
    public String x;
    public String y;

    public CommentStruct getAdCommentStruct() {
        CommentStruct commentStruct = this.LLL;
        if (commentStruct == null) {
            return null;
        }
        commentStruct.setAwemeId(this.LLILLJJLI);
        User user = new User();
        user.setUid(this.LLILLL);
        user.setAvatarThumb(this.LLL.getAvatarIcon());
        this.LLL.setUser(user);
        this.LLL.setCommentType(10);
        return this.LLL;
    }

    public String getCommentTag() {
        String str = this.LLILZLL;
        str.getClass();
        return (str.equals("collection") || str.equals("opus")) ? isMyProfile() ? "personal_homepage" : "others_homepage" : this.LLILZLL;
    }

    public String getEnterFrom() {
        if (!TextUtils.isEmpty(this.LLILZIL)) {
            return this.LLILZIL;
        }
        ICommentPageParamsAppDiffProtocol.LIZ.getClass();
        C1350100lEm.LIZIZ.getValue().LIZ();
        int i = this.LLJIJIL;
        return i != 1000 ? i != 1001 ? i != 2000 ? i != 2001 ? this.LLILZLL : "others_collection" : "others_homepage" : "personal_collection" : "personal_homepage";
    }

    public String getFromPage() {
        if (this.LLJILJIL == null) {
            this.LLJILJIL = "";
        }
        return this.LLJILJIL;
    }

    public Boolean getIsFromPostMode() {
        return Boolean.valueOf(this.LLLLZ);
    }

    public C1349900lES getStoryCommentPageParam() {
        if (this.LLZZZZ == null) {
            this.LLZZZZ = new C1349900lES();
        }
        return this.LLZZZZ;
    }

    public Boolean needShowMask() {
        return Boolean.valueOf(this.b);
    }

    public String getEnterMethod() {
        return (!TextUtils.equals(getEnterFrom(), "notification_page") || this.LLZZ) ? this.LLLILZLLLI : "notification";
    }

    public boolean isLandscapeMode() {
        return getOrientationMode() == 1;
    }

    public String getAccountType() {
        return this.d;
    }

    public String getAutoReplyMethod() {
        return this.LLLZZ;
    }

    public Aweme getAweme() {
        return this.LLJILLL;
    }

    public String getChannelNameForServer() {
        return this.a;
    }

    public String getChatType() {
        return this.LLZLLLL;
    }

    public String getClickCommentButtonSource() {
        return this.LLZLLIL;
    }

    public long getCommentCount() {
        return this.LLLLLJLJLL;
    }

    public String getCommentEnterMethod() {
        return this.LLLLLLJ;
    }

    public String getCommentInputPrefillText() {
        return this.LLLIZZ;
    }

    public int getCommentNotice() {
        return this.LLLLLLZZ;
    }

    public String getCreationId() {
        return this.LLLLJ;
    }

    public String getDetailBtmPageId() {
        return this.j;
    }

    public String getEnterPosition() {
        return this.v;
    }

    public String getEventType() {
        return this.LLILZLL;
    }

    public String getExploreFromGroupId() {
        return this.f;
    }

    public long getExploreTabId() {
        return this.g;
    }

    public String getExploreTabName() {
        return this.h;
    }

    public String getExternalShareOid() {
        return this.LLLLLLZ;
    }

    public String getExternalShareUrlUserId() {
        return this.LLLLLLLZIL;
    }

    public String getFcpPanelScene() {
        return this.x;
    }

    public int getFeedPosition() {
        return this.w;
    }

    public int getFirstRefreshCount() {
        return this.l;
    }

    public String getFriendsV3TrackScene() {
        return this.LLZZZIL;
    }

    public String getFromExplorePage() {
        return this.i;
    }

    public String getFromGroupId() {
        return this.LLLLLLLLL;
    }

    public FypExposedCommentMobParams getFypExposedCommentMobParams() {
        return this.LLZIL;
    }

    public String getGdLabel() {
        return this.c;
    }

    public boolean getHideIconGroupOnAgentOpenComment() {
        return this.LLLJ;
    }

    public String getHighlightCids() {
        return this.LLJJJ;
    }

    public boolean getHighlightWithoutScroll() {
        return this.n;
    }

    public Map<String, String> getHotPlayerMap() {
        return this.LLJLL;
    }

    public int getInboxNoticeSubType() {
        return this.LLLLLZIL;
    }

    public int getInboxNoticeType() {
        return this.LLLLLZ;
    }

    public int getInnerPushType() {
        return this.LLLLLZL;
    }

    public String getInsertCids() {
        return this.LLJJIJIL;
    }

    public String getInsertLikeUserIds() {
        return this.LLJJIII;
    }

    public String getInsertVid() {
        return this.LLJJJIL;
    }

    public String getInsertViewUserIds() {
        return this.LLJJIJIIJIL;
    }

    public int getIsEnterGraphicDetail() {
        return this.LLLLZI;
    }

    public int getIsLongItem() {
        return this.LLLILZJ;
    }

    public String getLabelText() {
        return this.y;
    }

    public int getLabelType() {
        return this.LLLLLL;
    }

    public String getLastGroupId() {
        return this.LLLLLLL;
    }

    public int getLikeUserCount() {
        return this.LLJJIJI;
    }

    public List<User> getLikeUsers() {
        return this.LLLLIL;
    }

    public int getLocatePageType() {
        return this.LLJJ;
    }

    public boolean getNavigationBarAutoColorOnHide() {
        return this.k;
    }

    public String getNewsId() {
        return this.LLLLLLLLLL;
    }

    public String getNoticeId() {
        return this.e;
    }

    public String getNowType() {
        return this.LLLZLZ;
    }

    public InterfaceC1350190lEv getOnScrollStateChangedListener() {
        return this.LLJZIJLIL;
    }

    public InterfaceC679410Qkt getOnShowHeightChangeListener() {
        return this.LLJLLL;
    }

    public InterfaceC1350210lEx getOnShowWidthChangeListener() {
        return this.LLJZ;
    }

    public int getOrientationMode() {
        return this.LLLZL;
    }

    public int getPageType() {
        return this.LLJIJIL;
    }

    public String getParentTagId() {
        return this.LLLL;
    }

    public String getPlayListId() {
        return this.LLLLIIL;
    }

    public String getPlayListIdKey() {
        return this.LLLLIIIILLL;
    }

    public String getPlayListType() {
        return this.LLLLII;
    }

    public int getPlayLoops() {
        return this.LLLLZLL;
    }

    public float getPlayPct() {
        return this.LLLLZLLIL;
    }

    public String getPollId() {
        return this.u;
    }

    public String getPreviousPage() {
        return this.LLJLLIL;
    }

    public String getRequestId() {
        return this.LLIZ;
    }

    public String getSearchId() {
        return this.LLLLL;
    }

    public String getSearchKeyword() {
        return this.LLLLLILLIL;
    }

    public String getSearchResultId() {
        return this.LLLLLIL;
    }

    public String getSearchType() {
        return this.LLLLLJIL;
    }

    public long getSessionId() {
        return this.LLLLZLLLI;
    }

    public String getShowCommentPostCid() {
        return this.LLZILL;
    }

    public boolean getSmoothScrollToHighlightComment() {
        return this.m;
    }

    public String getSocialEntrance() {
        return this.LLLJIL;
    }

    public int getSource() {
        return this.LLILZ;
    }

    public String getSourceBtmToken() {
        return this.LLZL;
    }

    public String getSplitContainerTag() {
        return this.LLLZI;
    }

    public String getTabName() {
        return this.LLLLIILL;
    }

    public String getTagId() {
        return this.LLLJL;
    }

    public String getTempEnterMethod() {
        return this.LLLLLLIL;
    }

    public String getTitleClickMethod() {
        return this.o;
    }

    public boolean getVideoDescOnly() {
        return this.p;
    }

    public int getVideoDescViewHeight() {
        return this.q;
    }

    public long getVideoDuration() {
        return this.LLLLZIL;
    }

    public String getVideoFrom() {
        return this.LLLZ;
    }

    public boolean isCommentClose() {
        return this.LLLFF;
    }

    public boolean isCommentLimited() {
        return this.LLLFFI;
    }

    public boolean isEnableComment() {
        return this.LLJI;
    }

    public boolean isEnableMinInnerCommentPanelHeight() {
        return this.LLLIIII;
    }

    public boolean isEnterFullScreen() {
        return this.LLLLIILLL;
    }

    public boolean isExposedCommentDisplayed() {
        return this.LLLZZIL;
    }

    public boolean isExposedCommentUseCache() {
        return this.LLZ;
    }

    public boolean isForceAutoOpenKeyboard() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public boolean isForceHideBatchManagementView() {
        return this.LLLIILIL;
    }

    public boolean isForceHideCommentDesc() {
        return this.LLLIL;
    }

    public boolean isForceHideDonation() {
        return this.LLLIIIL;
    }

    public boolean isForceHideKeyboard() {
        return this.LLJJL;
    }

    public boolean isForceHidePoi() {
        return this.LLLIIL;
    }

    public boolean isForceHideReplyWithVideo() {
        return this.LLLI;
    }

    public boolean isForceOpenReply() {
        return this.LLJJJJLIIL;
    }

    public boolean isForceRefresh() {
        return this.LLLF;
    }

    public boolean isFragmentReCreate() {
        return this.r;
    }

    public boolean isFriendsSimpleDetail() {
        return this.LLZZJLIL;
    }

    public boolean isFriendsV3Feed() {
        return this.LLZZLLIL;
    }

    public boolean isFromPostList() {
        return this.LLLLJI;
    }

    public boolean isHotPlayer() {
        return this.LLJLILLLLZIIL;
    }

    public boolean isMyProfile() {
        return this.LLJ;
    }

    public boolean isNeedAutoLikeComment() {
        return this.LLJL;
    }

    public boolean isNeedShowReplyPanel() {
        return this.LLJLIL;
    }

    public boolean isNoPermissionVideo() {
        return this.LLLZLL;
    }

    public boolean isPreBind() {
        return this.LLZLL;
    }

    public boolean isPreCreate() {
        return this.LLZLI;
    }

    public boolean isPrivateAweme() {
        return this.LLIZLLLIL;
    }

    public boolean isScrollToTop() {
        return this.LLJJJJ;
    }

    public boolean isShowBackgroundOverlay() {
        return this.LLLIIIIL;
    }

    public boolean isShowEmptyCommentTips() {
        return this.LLLFZ;
    }

    public boolean isShowLikeUsers() {
        return this.LLLLILI;
    }

    public boolean isShowRepostGuideTooltip() {
        return this.t;
    }

    public boolean isShowTitle() {
        return this.LLJILJILJ;
    }

    public boolean isShowTopToastAfterComment() {
        return this.LLLII;
    }

    public boolean isSmoothScrollLocate() {
        return this.LLJJI;
    }

    public boolean isSplitMode() {
        return this.LLLZIIL;
    }

    public boolean isSplitModeRefresh() {
        return this.LLLZIL;
    }

    public boolean isStoryImmersiveFeed() {
        return this.LLZZ;
    }

    public boolean isVideoMusicTitleDisplayOnFeed() {
        return this.s;
    }

    public boolean shouldShowVideoDesc() {
        return this.LLLILZ;
    }

    public boolean showReplyWithInsertCid() {
        return this.LLJJJJJIL;
    }

    public C1349800lEI(String str) {
        super(str);
        this.LLLLLL = -1;
        this.LLLLLLJ = "";
        this.LLLLLLL = "";
        this.LLLZLZ = "post";
        this.LLZILL = "";
        this.LLZL = "";
        this.LLZLLLL = "";
        this.LLZZZIL = "";
        this.a = "";
        this.d = "";
        this.f = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = -1;
        this.o = "";
        this.s = true;
        this.x = "";
    }

    public C1349800lEI forceRefresh(boolean z) {
        this.LLLF = z;
        return this;
    }

    public C1349800lEI setAccountType(String str) {
        this.d = str;
        return this;
    }

    public C1349800lEI setAdCommentStruct(CommentStruct commentStruct) {
        this.LLL = commentStruct;
        return this;
    }

    public C1349800lEI setAutoReplyMethod(String str) {
        this.LLLZZ = str;
        return this;
    }

    public C1349800lEI setAweme(Aweme aweme) {
        this.LLJILLL = aweme;
        return this;
    }

    public C1349800lEI setChannelNameForServer(String str) {
        this.a = str;
        return this;
    }

    public C1349800lEI setChatType(String str) {
        this.LLZLLLL = str;
        return this;
    }

    public C1349800lEI setClickCommentButtonSource(String str) {
        this.LLZLLIL = str;
        return this;
    }

    public C1349800lEI setCommentClose(boolean z) {
        this.LLLFF = z;
        return this;
    }

    public C1349800lEI setCommentCount(long j) {
        this.LLLLLJLJLL = j;
        return this;
    }

    public C1349800lEI setCommentEnterMethod(String str) {
        this.LLLLLLJ = str;
        return this;
    }

    public C1349800lEI setCommentLimited(boolean z) {
        this.LLLFFI = z;
        return this;
    }

    public C1349800lEI setCommentNotice(int i) {
        this.LLLLLLZZ = i;
        return this;
    }

    public C1349800lEI setCreationId(String str) {
        this.LLLLJ = str;
        return this;
    }

    public C1349800lEI setDetailBtmPageId(String str) {
        this.j = str;
        return this;
    }

    public C1349800lEI setEnableComment(boolean z) {
        this.LLJI = z;
        return this;
    }

    public C1349800lEI setEnableMinInnerCommentPanelHeight(boolean z) {
        this.LLLIIII = z;
        return this;
    }

    public C1349800lEI setEnterFrom(String str) {
        this.LLILZIL = str;
        return this;
    }

    public C1349800lEI setEnterFullScreen(boolean z) {
        this.LLLLIILLL = z;
        return this;
    }

    public C1349800lEI setEnterMethod(String str) {
        this.LLLILZLLLI = str;
        return this;
    }

    public void setEnterPosition(String str) {
        this.v = str;
    }

    public C1349800lEI setEventType(String str) {
        this.LLILZLL = str;
        return this;
    }

    public C1349800lEI setExploreFromGroupId(String str) {
        this.f = str;
        return this;
    }

    public C1349800lEI setExploreTabId(long j) {
        this.g = j;
        return this;
    }

    public C1349800lEI setExploreTabName(String str) {
        this.h = str;
        return this;
    }

    public C1349800lEI setExposedCommentDisplayed(boolean z) {
        this.LLLZZIL = z;
        return this;
    }

    public C1349800lEI setExposedCommentUseCache(boolean z) {
        this.LLZ = z;
        return this;
    }

    public C1349800lEI setExternalShareOid(String str) {
        this.LLLLLLZ = str;
        return this;
    }

    public C1349800lEI setExternalShareUrlUserId(String str) {
        this.LLLLLLLZIL = str;
        return this;
    }

    public C1349800lEI setFcpPanelScene(String str) {
        this.x = str;
        return this;
    }

    public C1349800lEI setFeedPosition(int i) {
        this.w = i;
        return this;
    }

    public void setFirstRefreshCount(int i) {
        this.l = i;
    }

    public C1349800lEI setForceAutoOpenKeyboard(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
        return this;
    }

    public C1349800lEI setForceHideBatchManagementView(boolean z) {
        this.LLLIILIL = z;
        return this;
    }

    public C1349800lEI setForceHideCommentDesc(boolean z) {
        this.LLLIL = z;
        return this;
    }

    public C1349800lEI setForceHideDonation(boolean z) {
        this.LLLIIIL = z;
        return this;
    }

    public C1349800lEI setForceHideKeyboard(boolean z) {
        this.LLJJL = z;
        return this;
    }

    public C1349800lEI setForceHidePoi(boolean z) {
        this.LLLIIL = z;
        return this;
    }

    public C1349800lEI setForceHideReplyWithVideo(boolean z) {
        this.LLLI = z;
        return this;
    }

    public C1349800lEI setFragmentReCreate(boolean z) {
        this.r = z;
        return this;
    }

    public void setFriendsSimpleDetail(boolean z) {
        this.LLZZJLIL = z;
    }

    public void setFriendsV3Feed(boolean z) {
        this.LLZZLLIL = z;
    }

    public void setFriendsV3TrackScene(String str) {
        this.LLZZZIL = str;
    }

    public C1349800lEI setFromExplorePage(String str) {
        this.i = str;
        return this;
    }

    public C1349800lEI setFromGroupId(String str) {
        this.LLLLLLLLL = str;
        return this;
    }

    public C1349800lEI setFromPage(String str) {
        this.LLJILJIL = str;
        return this;
    }

    public C1349800lEI setFromPostList(boolean z) {
        this.LLLLJI = z;
        return this;
    }

    public C1349800lEI setFypExposedCommentMobParams(FypExposedCommentMobParams fypExposedCommentMobParams) {
        this.LLZIL = fypExposedCommentMobParams;
        return this;
    }

    public C1349800lEI setGdLabel(String str) {
        this.c = str;
        return this;
    }

    public C1349800lEI setHighlightCids(String str) {
        this.LLJJJ = str;
        return this;
    }

    public void setHighlightWithoutScroll(boolean z) {
        this.n = z;
    }

    public C1349800lEI setHotPlayer(boolean z) {
        this.LLJLILLLLZIIL = z;
        return this;
    }

    public C1349800lEI setHotPlayerMap(Map<String, String> map) {
        this.LLJLL = map;
        return this;
    }

    public C1349800lEI setInboxNoticeSubType(int i) {
        this.LLLLLZIL = i;
        return this;
    }

    public C1349800lEI setInboxNoticeType(int i) {
        this.LLLLLZ = i;
        return this;
    }

    public C1349800lEI setInnerPushType(int i) {
        this.LLLLLZL = i;
        return this;
    }

    public C1349800lEI setInsertLikeUserIds(String str) {
        this.LLJJIII = str;
        return this;
    }

    public C1349800lEI setInsertVid(String str) {
        this.LLJJJIL = str;
        return this;
    }

    public C1349800lEI setInsertViewUserIds(String str) {
        this.LLJJIJIIJIL = str;
        return this;
    }

    public C1349800lEI setIsEnterGraphicDetail(int i) {
        this.LLLLZI = i;
        return this;
    }

    public C1349800lEI setIsFromPostMode(boolean z) {
        this.LLLLZ = z;
        return this;
    }

    public C1349800lEI setIsLongItem(int i) {
        this.LLLILZJ = i;
        return this;
    }

    public C1349800lEI setIsNoPermissionVideo(boolean z) {
        this.LLLZLL = z;
        return this;
    }

    public C1349800lEI setLabelText(String str) {
        this.y = str;
        return this;
    }

    public C1349800lEI setLabelType(int i) {
        this.LLLLLL = i;
        return this;
    }

    public C1349800lEI setLastGroupId(String str) {
        this.LLLLLLL = str;
        return this;
    }

    public C1349800lEI setLikeUserCount(int i) {
        this.LLJJIJI = i;
        return this;
    }

    public C1349800lEI setLikeUsers(List<User> list) {
        this.LLLLIL = list;
        return this;
    }

    public C1349800lEI setLocatePageType(int i) {
        this.LLJJ = i;
        return this;
    }

    public C1349800lEI setMyProfile(boolean z) {
        this.LLJ = z;
        return this;
    }

    public void setNavigationBarAutoColorOnHide(boolean z) {
        this.k = z;
    }

    public C1349800lEI setNeedAutoLikeComment(boolean z) {
        this.LLJL = z;
        return this;
    }

    public C1349800lEI setNeedShowMask(boolean z) {
        this.b = z;
        return this;
    }

    public C1349800lEI setNeedShowReplyPanel(boolean z) {
        this.LLJLIL = z;
        return this;
    }

    public C1349800lEI setNewsId(String str) {
        this.LLLLLLLLLL = str;
        return this;
    }

    public C1349800lEI setNoticeId(String str) {
        this.e = str;
        return this;
    }

    public void setNowType(String str) {
        this.LLLZLZ = str;
    }

    public C1349800lEI setOnScrollStateChangedListener(InterfaceC1350190lEv interfaceC1350190lEv) {
        this.LLJZIJLIL = interfaceC1350190lEv;
        return this;
    }

    public C1349800lEI setOnShowHeightChangeListener(InterfaceC679410Qkt interfaceC679410Qkt) {
        this.LLJLLL = interfaceC679410Qkt;
        return this;
    }

    public C1349800lEI setOnShowWidthChangeListener(InterfaceC1350210lEx interfaceC1350210lEx) {
        this.LLJZ = interfaceC1350210lEx;
        return this;
    }

    public C1349800lEI setOrientationMode(int i) {
        this.LLLZL = i;
        return this;
    }

    public C1349800lEI setPageType(int i) {
        this.LLJIJIL = i;
        return this;
    }

    public void setParentTagId(String str) {
        this.LLLL = str;
    }

    public C1349800lEI setPlayListId(String str) {
        this.LLLLIIL = str;
        return this;
    }

    public C1349800lEI setPlayListIdKey(String str) {
        this.LLLLIIIILLL = str;
        return this;
    }

    public C1349800lEI setPlayListType(String str) {
        this.LLLLII = str;
        return this;
    }

    public C1349800lEI setPlayLoops(int i) {
        this.LLLLZLL = i;
        return this;
    }

    public C1349800lEI setPlayPct(float f) {
        this.LLLLZLLIL = f;
        return this;
    }

    public C1349800lEI setPollId(String str) {
        this.u = str;
        return this;
    }

    public C1349800lEI setPreBind(boolean z) {
        this.LLZLL = z;
        return this;
    }

    public C1349800lEI setPreCreate(boolean z) {
        this.LLZLI = z;
        return this;
    }

    public C1349800lEI setPreviousPage(String str) {
        this.LLJLLIL = str;
        return this;
    }

    public C1349800lEI setPrivateAweme(boolean z) {
        this.LLIZLLLIL = z;
        return this;
    }

    public C1349800lEI setRequestId(String str) {
        this.LLIZ = str;
        return this;
    }

    public C1349800lEI setScrollToTop(boolean z) {
        this.LLJJJJ = z;
        return this;
    }

    public C1349800lEI setSearchId(String str) {
        this.LLLLL = str;
        return this;
    }

    public C1349800lEI setSearchKeyword(String str) {
        this.LLLLLILLIL = str;
        return this;
    }

    public C1349800lEI setSearchResultId(String str) {
        this.LLLLLIL = str;
        return this;
    }

    public C1349800lEI setSearchType(String str) {
        this.LLLLLJIL = str;
        return this;
    }

    public C1349800lEI setSessionId(long j) {
        this.LLLLZLLLI = j;
        return this;
    }

    public C1349800lEI setShouldShowVideoDesc(boolean z) {
        this.LLLILZ = z;
        return this;
    }

    public C1349800lEI setShowBackgroundOverlay(boolean z) {
        this.LLLIIIIL = z;
        return this;
    }

    public C1349800lEI setShowCommentPostCid(String str) {
        this.LLZILL = str;
        return this;
    }

    public C1349800lEI setShowEmptyCommentTips(boolean z) {
        this.LLLFZ = z;
        return this;
    }

    public C1349800lEI setShowLikeUsers(boolean z) {
        this.LLLLILI = z;
        return this;
    }

    public C1349800lEI setShowRepostGuideTooltip(boolean z) {
        this.t = z;
        return this;
    }

    public C1349800lEI setShowTitle(boolean z) {
        this.LLJILJILJ = z;
        return this;
    }

    public C1349800lEI setShowTopToastAfterComment(boolean z) {
        this.LLLII = z;
        return this;
    }

    public C1349800lEI setSmoothScrollLocate(boolean z) {
        this.LLJJI = z;
        return this;
    }

    public void setSmoothScrollToHighlightComment(boolean z) {
        this.m = z;
    }

    public C1349800lEI setSocialEntrance(String str) {
        this.LLLJIL = str;
        return this;
    }

    public C1349800lEI setSource(int i) {
        this.LLILZ = i;
        return this;
    }

    public C1349800lEI setSourceBtmToken(String str) {
        this.LLZL = str;
        return this;
    }

    public void setSplitContainerTag(String str) {
        this.LLLZI = str;
    }

    public void setSplitMode(boolean z) {
        this.LLLZIIL = z;
    }

    public void setSplitModeRefresh(boolean z) {
        this.LLLZIL = z;
    }

    public void setStoryCommentPageParam(C1349900lES c1349900lES) {
        this.LLZZZZ = c1349900lES;
    }

    public void setStoryImmersiveFeed(boolean z) {
        this.LLZZ = z;
    }

    public C1349800lEI setTabName(String str) {
        this.LLLLIILL = str;
        return this;
    }

    public void setTagId(String str) {
        this.LLLJL = str;
    }

    public void setTempEnterMethod(String str) {
        this.LLLLLLIL = str;
    }

    public C1349800lEI setTitleClickMethod(String str) {
        this.o = str;
        return this;
    }

    public C1349800lEI setVideoDescOnly(boolean z) {
        this.p = z;
        return this;
    }

    public C1349800lEI setVideoDescViewHeight(int i) {
        this.q = i;
        return this;
    }

    public C1349800lEI setVideoDuration(long j) {
        this.LLLLZIL = j;
        return this;
    }

    public C1349800lEI setVideoFrom(String str) {
        this.LLLZ = str;
        return this;
    }

    public C1349800lEI setVideoMusicTitleDisplayOnFeed(boolean z) {
        this.s = z;
        return this;
    }

    public C1349800lEI setAgentOpenCommentParams(String str, boolean z) {
        this.LLLIZZ = str;
        this.LLLJ = z;
        return this;
    }

    public C1349800lEI setInsertCids(String str, boolean z, boolean z2) {
        this.LLJJIJIL = str;
        this.LLJJJJJIL = z;
        this.LLJJJJLIIL = z2;
        return this;
    }
}
