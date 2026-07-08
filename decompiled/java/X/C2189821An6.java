package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.DanmakuDiggMessage;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1An6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2189821An6 implements Serializable {
    public static final C2189841An8 Companion = new Object() { // from class: X.1An8
    };
    public static final long serialVersionUID = -613452965802915546L;
    public String A;
    public String A0;
    public String A1;
    public String A2;
    public Boolean B;
    public long B0;
    public String B1;
    public String B2;
    public String C;
    public String C0;
    public Integer C1;
    public int C2;
    public String D;
    public String D0;
    public String D1;
    public String D2;
    public int E;
    public String E0;
    public Object E1;
    public boolean E2;
    public String F;
    public String F0;
    public String F1;
    public long F2;
    public boolean G;
    public String G0;
    public Serializable G1;
    public boolean G2;
    public boolean H;
    public String H0;
    public String H1;
    public boolean H2;
    public int I;
    public String I0;
    public String I1;
    public int I2;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f231J;
    public Boolean J0;
    public String J1;
    public String J2;
    public List<String> K;
    public String K0;
    public Integer K1;
    public String K2;
    public List<String> L;
    public int L0;
    public Long L1;
    public int L2;
    public String LL;
    public boolean LLILLJJLI;
    public String LLILLL;
    public String LLILZIL;
    public AnchorCustomData LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public int LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public int LLJJIJIL;
    public String LLJJJ;
    public String LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public long LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public String LLJZ;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public String LLLFZ;
    public String LLLI;
    public String LLLII;
    public String LLLIIII;
    public String LLLIIIIL;
    public String LLLIIIL;
    public String LLLIILIL;
    public String LLLIL;
    public String LLLILZ;
    public String LLLILZJ;
    public Boolean LLLILZLLLI;
    public String LLLIZZ;
    public String LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public String LLLL;
    public boolean LLLLII;
    public String LLLLIIIILLL;
    public String LLLLIIL;
    public String LLLLIILL;
    public List<String> LLLLIILLL;
    public String LLLLIL;
    public String LLLLILI;
    public String LLLLJ;
    public String LLLLJI;
    public String LLLLL;
    public String LLLLLIL;
    public String LLLLLILLIL;
    public int LLLLLJIL;
    public int LLLLLJLJLL;
    public Long LLLLLL;
    public String LLLLLLIL;
    public String LLLLLLJ;
    public int LLLLLLL;
    public int LLLLLLLLLL;
    public String LLLLLLLZIL;
    public String LLLLLLZ;
    public String LLLLLLZZ;
    public String LLLLLZ;
    public String LLLLLZIL;
    public String LLLLLZL;
    public String LLLLZ;
    public String LLLLZI;
    public String LLLLZIL;
    public String LLLLZLL;
    public String LLLLZLLIL;
    public String LLLLZLLLI;
    public String LLLZ;
    public String LLLZI;
    public String LLLZIIL;
    public boolean LLLZIL;
    public String LLLZL;
    public int LLLZLL;
    public boolean LLLZLZ;
    public String LLLZZ;
    public int LLLZZIL;
    public String LLZ;
    public int LLZIL;
    public boolean LLZILL;
    public boolean LLZL;
    public String LLZLI;
    public String LLZLL;
    public String LLZLLIL;
    public String LLZLLLL;
    public String LLZZ;
    public String LLZZJLIL;
    public int LLZZLLIL;
    public int LLZZZIL;
    public String LLZZZZ;
    public String M;
    public String M0;
    public String M1;
    public String M2;
    public boolean N;
    public String N0;
    public int N1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f232O;
    public String O0;
    public DanmakuDiggMessage O1;
    public String O2;
    public int P;
    public String P0;
    public String P1;
    public String Q;
    public String Q0;
    public boolean Q1;
    public String Q2;
    public String R;
    public HashMap<String, String> R0;
    public String R1;
    public long R2;
    public boolean S;
    public String S0;
    public String S1;
    public String S2;
    public String T;
    public String T0;
    public String T1;
    public boolean T2;
    public String U;
    public String U1;
    public boolean U2;
    public String V;
    public boolean V0;
    public String V1;
    public boolean V2;
    public String W;
    public int W0;
    public String W1;
    public boolean W2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f233X;
    public String X0;
    public boolean X1;
    public String X2;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f234Y;
    public String Y0;
    public int Y1;
    public int Y2;
    public String Z;
    public HashMap<String, String> Z0;
    public String Z2;
    public String a;
    public String a0;
    public Integer a1;
    public DetailNavArgModel a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public int f235a3;
    public boolean b;
    public boolean b0;
    public Integer b1;
    public int b2;
    public String b3;
    public String c;
    public boolean c0;
    public String c1;
    public String c2;
    public long c3;
    public String d;
    public boolean d0;
    public String d1;
    public String d2;
    public float d3;
    public String e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f236e0;
    public String e1;
    public String e2;
    public boolean e3;
    public String f;
    public String f0;
    public String f1;
    public String f2;
    public long f3;
    public String g;
    public String g1;
    public boolean g2;
    public boolean g3;
    public int h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f237h0;
    public String h1;
    public String h2;
    public C330660Cxk h3;
    public int i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f238i0;
    public boolean i1;
    public String i2;
    public String i3;
    public boolean j;
    public boolean j0;
    public String j1;
    public String j2;
    public boolean j3;
    public boolean k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f239k0;
    public int k1;
    public String k2;
    public boolean k3;
    public boolean l;
    public String l0;
    public String l1;
    public int l2;
    public boolean l3;
    public String m;
    public Boolean m0;
    public String m1;
    public String m2;
    public String n;
    public String n0;
    public String n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public String f241n2;
    public String n3;
    public String o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f242o0;
    public String o1;
    public String o2;
    public int o3;
    public boolean p;
    public String p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public String f243p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public String f244p2;
    public int p3;
    public String q;
    public String q0;
    public long q1;
    public String q2;
    public boolean r;
    public String r0;
    public String r1;
    public boolean r2;
    public String s;
    public String s0;
    public String s1;
    public String s2;
    public String t;
    public int t0;
    public String t1;
    public int t2;
    public String t3;
    public String u;
    public MatchedFriendStruct u0;
    public String u1;
    public int u2;
    public String u3;
    public String v;
    public String v0;
    public String v1;
    public String v2;
    public boolean v3;
    public String w;
    public String w0;
    public String w1;
    public Object w2;
    public long w3;
    public boolean x;
    public Boolean x0;
    public String x1;
    public boolean x2;
    public String x3;
    public String y;
    public String y0;
    public String y1;
    public boolean y2;
    public String y3;
    public String z;
    public String z0;
    public Boolean z1;
    public boolean z2;
    public String z3;
    public String LLILZ = "";
    public Map<String, String> LLJI = new ConcurrentHashMap();
    public HashMap<String, String> LLJIJIL = new HashMap<>();
    public int LLJJJIL = -1;
    public int LLJJJJ = -1;
    public String LLJZIJLIL = "";
    public String LLL = "";
    public String LLLIIL = "other_places";
    public String LLLLLLLLL = "click";
    public boolean g0 = true;
    public final ConcurrentHashMap<String, List<String>> U0 = new ConcurrentHashMap<>();
    public List<String> Z1 = C13BV.INSTANCE;
    public int N2 = -1;
    public int P2 = -1;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public int f240m3 = -1;
    public String q3 = "";
    public String r3 = "";
    public String s3 = "";

    public final boolean isSearchTopic() {
        return true;
    }

    public final String getPreviousPageWithPlaylistScene() {
        return !TextUtils.isEmpty(this.X2) ? this.X2 : this.LLJLLL;
    }

    public final long getVideoCurrentPosition() {
        Long feedDetailVideoCurrentPosition;
        long j = this.F2;
        if (j != 0) {
            return j;
        }
        DetailNavArgModel detailNavArgModel = this.a2;
        if (detailNavArgModel == null || (feedDetailVideoCurrentPosition = detailNavArgModel.getFeedDetailVideoCurrentPosition()) == null) {
            return 0L;
        }
        return feedDetailVideoCurrentPosition.longValue();
    }

    public final boolean hasTask() {
        return this.LLZIL != 0;
    }

    public final boolean isAdHasReportReason() {
        return !TextUtils.isEmpty(this.J2);
    }

    public final boolean isFromDuetMode() {
        return TextUtils.equals(this.LL, "from_duet_mode");
    }

    public final boolean isFromDuetModeDetail() {
        return TextUtils.equals(this.LL, "from_duet_mode_detail");
    }

    public final boolean isFromEffectDiscoverPanel() {
        return TextUtils.equals(this.LL, "from_effect_discover_panel");
    }

    public final boolean isFromEffectDiscoverTab() {
        return TextUtils.equals(this.LL, "from_effect_discover_tab");
    }

    public final boolean isHotSpot() {
        return !TextUtils.isEmpty(this.LLZZZZ) || this.G2;
    }

    public final boolean isNewLowQualityUser() {
        return this.I2 == 1;
    }

    public String toString() {
        return "FeedParam{from='" + this.LL + "', eventType='" + this.LLILLL + "', extra=" + this.LLJIJIL + ", pageType=" + this.LLJILJIL + ", aid='" + this.LLJILJILJ + "', scrollToTargetAid='" + this.LLJILLL + "', ids='" + this.LLJJ + "', pushParams='" + this.LLJJI + "', cid='" + this.LLJJIII + "', spuId='" + this.LLJJJJJIL + "', rateType=" + this.LLJJJJLIIL + ", pageSize=" + this.LLJJL + ", enterFromRequestId='" + this.LLJJLIIIJLLLLLLLZ + "', previousPage='" + this.LLJLLL + "', isMyProfile=" + this.LLLFF + ", isFromPostList=" + this.LLLFFI + ", shareUserId='" + this.LLLI + "', challengeProfileFrom='" + this.LLLIIII + "', likeEnterMethod='" + this.LLLIIIIL + "', contentSource='" + this.LLLIIIL + "', previousPagePosition='" + this.LLLIIL + "', searchKeyword='" + this.LLLIL + "'，isFromSearchKeyFrameAnchor=’" + this.x + "', topCommentId='" + this.LLLILZ + "', processId='" + this.LLLILZJ + "', isTrending=" + this.LLLILZLLLI + ", userList=" + this.LLLLIILLL + ", uid='" + this.LLLLIL + "', secUid='" + this.LLLLILI + "', musicId='" + this.LLLLJ + "', challengeId='" + this.LLLLL + "', questionId='" + this.LLLLLIL + "', showAnswerQuestionButton='" + this.LLLLLJIL + "', mvId='" + this.LLLLLLIL + "', channelId=" + this.LLLLLLL + ", enterMethodValue='" + this.LLLLLLLLL + "', categoryName='" + this.LLLLLZ + "', videoType=" + this.LLLLLLLLLL + ", queryAwemeMode='" + this.LLLLLLLZIL + "', accountType='" + this.LLLLLLZ + "', tabName='" + this.LLLLLLZZ + "', promotionId='" + this.LLLLLZL + "', productId='" + this.LLLLZ + "', carrierType='" + this.LLLLZI + "', referSeedId='" + this.LLLLZIL + "', referSeedName='" + this.LLLLZLL + "', dataType='" + this.LLLLZLLIL + "', entranceInfo='" + this.LLLLZLLLI + "', searchChannel='" + this.LLLZ + "', stickerId='" + this.LLLZI + "', relatedId='" + this.LLLZIIL + "', fromAdsActivity=" + this.LLLZIL + ", feedsAwemeId='" + this.LLLZL + "', type=" + this.LLLZLL + ", isRecommend=" + this.LLLZLZ + ", cellId='" + this.LLLZZ + "', index=" + this.LLLZZIL + ", hotEnterMethod='" + this.LLZ + "', taskType=" + this.LLZIL + ", showCommentAfterOpen=" + this.LLZILL + ", showShareAfterOpen=" + this.LLZL + ", tutorialId='" + this.LLZLI + "', creationId='" + this.LLZLL + "', microAppId='" + this.LLZLLLL + "', hashTagName='" + this.LLZZ + "', cursor=" + this.LLZZLLIL + ", count=" + this.LLZZZIL + ", hotSearch='" + this.LLZZZZ + "', itemIdList='" + this.a + "', isHotSearch=false, isAdSpot=" + this.b + ", outAwemeId='" + this.c + "', activityId='" + this.d + "', newSourceType='" + this.e + "', newSourceId='" + this.f + "', reactSessionId='" + this.g + "', commentDeleted=" + this.h + ", level1CommentDeleted=" + this.i + ", commentForceOpenReply=" + this.j + ", showPrivacySetting=" + this.l + ", fromGroupId='" + this.m + "', rankFromPrePage='" + this.LLIZ + "', searchResultIdFromPrePage='" + this.LLIZLLLIL + "', referCommodityId='" + this.n + "', mixFromOrder='" + this.o + "', mVideoFromDcd=" + this.p + ", mSearchResultId='" + this.q + "', mListResultType='" + this.s + "', mListItemId='" + this.t + "', mSearchThirdItemId='" + this.u + "', mImprId='" + this.v + "', uidList=" + this.K + ", blueDotList=" + this.L + ", selectedUid='" + this.M + "', isfollowSkyLight=" + this.N + ", hasLatestFollowingUser=" + this.f232O + ", fromRecommendCard=" + this.P + ", authorName='" + this.q2 + "', mIsFromChatRoomPlaying=" + this.r2 + ", mChatRoomPlayingRealAid='" + this.s2 + "', hasMore=" + this.u2 + ", mSpecialTopicRegion='" + this.v2 + "', mObject=" + this.w2 + ", isChain=" + this.x2 + ", isFromDuetChain=" + this.y2 + ", isFromStitchChain=" + this.z2 + ", tracker='" + this.A2 + "', tabText='" + this.B2 + "', cellDetailType=" + this.C2 + ", detailTitleText='" + this.D2 + "', videoCurrentPosition=" + getVideoCurrentPosition() + ", isFromHotSearchRanking=" + this.G2 + ", isFromSearchTopic=" + this.H2 + ", shareParamUtmSource=" + this.c2 + ", shareParamLinkId=" + this.d2 + ", shareParamUserId=" + this.e2 + ", shareCheckSum=" + this.h2 + ", shareTimeStamp=" + this.i2 + ", invitationScene=" + this.j2 + ", shareUrl=" + this.k2 + ", shareLinkMode=" + this.l2 + ", enableDetailActivityVideoCoverTransition=" + this.W2 + ", isHideMusicText=" + this.b0 + ", mStoryType=" + this.E + ", isSupportFeedTransition=" + this.f231J + ", isStoryPage=" + this.H + ", upvoteId=" + this.w0 + ", seekProgress=" + this.d3 + ", isFromSharedStory=" + this.e3 + ", prevPanelId=" + this.f3 + ", conversationId=" + this.m1 + ", chatType=" + this.n1 + ", messageId=" + this.l1 + ", pageName=" + this.j1 + ", searchEnterPosition=" + this.F1 + ", enterFromSub=" + this.H1 + ", aimeStyleId=" + this.c1 + ", preClickImprId=" + this.I1 + ", creativeToolId= " + this.J1 + ", creativeToolAnchorType= " + this.K1 + ", creativeToolClickTime= " + this.L1 + ", templateId= " + this.M1 + ", templateType= " + this.N1 + ", itemId= " + this.f1 + '}';
    }

    public final boolean isFromDuetModeOrDuetModeDetail() {
        return isFromDuetMode() || isFromDuetModeDetail();
    }

    public final boolean isFromEffectDiscover() {
        return isFromEffectDiscoverPanel() || isFromEffectDiscoverTab();
    }

    public final String getAccountType() {
        return this.LLLLLLZ;
    }

    public final String getAceEnterFrom() {
        return this.Q2;
    }

    public final String getActivityId() {
        return this.d;
    }

    public final String getAdBISurveyLandingPage() {
        return this.y3;
    }

    public final String getAdBISurveyLogExtra() {
        return this.z3;
    }

    public final String getAdReportReason() {
        return this.J2;
    }

    public final String getAdReportReasonType() {
        return this.K2;
    }

    public final Long getAddYoursVideoCount() {
        return this.LLLLLL;
    }

    public final String getAddyoursTopicId() {
        return this.LLLLLILLIL;
    }

    public final String getAdvId() {
        return this.S2;
    }

    public final String getAiStudioMessageId() {
        return this.U1;
    }

    public final String getAiStudioSessionId() {
        return this.V1;
    }

    public final String getAid() {
        return this.LLJILJILJ;
    }

    public final String getAimeStyleId() {
        return this.c1;
    }

    public final AnchorCustomData getAnchorCustomData() {
        return this.LLILZLL;
    }

    public final String getAuthorName() {
        return this.q2;
    }

    public final List<String> getBlueDotList() {
        return this.L;
    }

    public final String getCarrierType() {
        return this.LLLLZI;
    }

    public final String getCategoryName() {
        return this.LLLLLZ;
    }

    public final int getCellDetailType() {
        return this.C2;
    }

    public final String getCellId() {
        return this.LLLZZ;
    }

    public final String getCellType() {
        return this.LLLL;
    }

    public final String getChallengeId() {
        return this.LLLLL;
    }

    public final String getChallengeProfileFrom() {
        return this.LLLIIII;
    }

    public final int getChannelId() {
        return this.LLLLLLL;
    }

    public final String getChatFromUserId() {
        return this.q3;
    }

    public final String getChatFromUserNickname() {
        return this.r3;
    }

    public final String getChatRoomPlayingRealAid() {
        return this.s2;
    }

    public final String getChatType() {
        return this.n1;
    }

    public final String getChatroomSessionUUID() {
        return this.o1;
    }

    public final String getCid() {
        return this.LLJJIII;
    }

    public final String getCidFromSearch() {
        return this.C;
    }

    public final String getClickCommentChainSource() {
        return this.x3;
    }

    public final int getCommentDeleted() {
        return this.h;
    }

    public final String getCommentEnterMethod() {
        return this.F0;
    }

    public final String getCommentLabelText() {
        return this.LLJJJ;
    }

    public final int getCommentLabelType() {
        return this.LLJJJIL;
    }

    public final int getCommentNotice() {
        return this.t0;
    }

    public final int getCommentUserFollowStatus() {
        return this.I;
    }

    public final String getCommentViewListIds() {
        return this.O2;
    }

    public final String getContentSource() {
        return this.LLLIIIL;
    }

    public final String getConversationId() {
        return this.m1;
    }

    public final int getCount() {
        return this.LLZZZIL;
    }

    public final String getCreationId() {
        return this.LLZLL;
    }

    public final String getCreativeHubOpenRecordId() {
        return this.Y0;
    }

    public final String getCreativeHubText() {
        return this.X0;
    }

    public final int getCreativeHubType() {
        return this.W0;
    }

    public final Integer getCreativeToolAnchorType() {
        return this.K1;
    }

    public final Long getCreativeToolClickTime() {
        return this.L1;
    }

    public final String getCreativeToolId() {
        return this.J1;
    }

    public final String getCreditVideoAuthorUid() {
        return this.m2;
    }

    public final long getCurrentProfileUserRoomId() {
        return this.LLJLILLLLZIIL;
    }

    public final int getCursor() {
        return this.LLZZLLIL;
    }

    public final DanmakuDiggMessage getDanmakuDiggMessage() {
        return this.O1;
    }

    public final String getDataType() {
        return this.LLLLZLLIL;
    }

    public final int getDetailAdType() {
        return this.L2;
    }

    public final long getDetailPlayDuration() {
        return this.w3;
    }

    public final String getDetailTitleText() {
        return this.D2;
    }

    public final int getDetailVvCount() {
        return this.o3;
    }

    public final int getDetailVvFinishCount() {
        return this.p3;
    }

    public final String getDuetId() {
        return this.LLLLLLJ;
    }

    public final String getEcLiveExtra() {
        return this.A1;
    }

    public final Object getEcMixFeedExtra() {
        return this.E1;
    }

    public final String getEcMixFeedExtraStr() {
        return this.D1;
    }

    public final String getEcSearchTrafficSourceList() {
        return this.e1;
    }

    public final ConcurrentHashMap<String, List<String>> getEmojiDisplaySet() {
        return this.U0;
    }

    public final boolean getEnableStoryVideoCoverTransition() {
        return this.Q1;
    }

    public final Serializable getEnterChatParam() {
        return this.G1;
    }

    public final String getEnterFromLiveRequestId() {
        return this.LLJL;
    }

    public final String getEnterFromLiveRoomId() {
        return this.LLJLIL;
    }

    public final String getEnterFromRequestId() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final String getEnterFromSub() {
        return this.H1;
    }

    public final String getEnterMethodProfile() {
        return this.A;
    }

    public final String getEnterMethodValue() {
        return this.LLLLLLLLL;
    }

    public final String getEnterPlayMethod() {
        return this.f242o0;
    }

    public final String getEnterPlaylistGroupId() {
        return this.f237h0;
    }

    public final boolean getEnterStoryImmersiveFeedWithOutData() {
        return this.l3;
    }

    public final String getEntranceInfo() {
        return this.LLLLZLLLI;
    }

    public final String getEventType() {
        return this.LLILLL;
    }

    public final String getExposeAvatarUrl() {
        return this.w1;
    }

    public final String getExposeCommentText() {
        return this.y1;
    }

    public final String getExposeCommentType() {
        return this.v1;
    }

    public final String getExposeUserName() {
        return this.x1;
    }

    public final String getExternalShareAwemeId() {
        return this.f244p2;
    }

    public final String getExternalShareUrlUserId() {
        return this.f241n2;
    }

    public final String getExternalShareUserOId() {
        return this.o2;
    }

    public final Map<String, String> getExtra() {
        return this.LLJI;
    }

    public final String getExtraSceneType() {
        return this.n0;
    }

    public final String getFeedGroupIdForMixVideo() {
        return this.R;
    }

    public final String getFeedsAwemeId() {
        return this.LLLZL;
    }

    public final String getFollowRecommendPosition() {
        return this.v0;
    }

    public final Boolean getFollowRecommendShowRelationLabel() {
        return this.m0;
    }

    public final String getFollowRecommendTrackEnterFrom() {
        return this.l0;
    }

    public final Integer getFollowStatus() {
        return this.b1;
    }

    public final String getFrom() {
        return this.LL;
    }

    public final String getFromActivityHashCode() {
        return this.LLILZ;
    }

    public final String getFromGroupId() {
        return this.m;
    }

    public final String getFromProfileUid() {
        return this.W1;
    }

    public final int getFromRecommendCard() {
        return this.P;
    }

    public final boolean getFromReferral() {
        return this.LLLF;
    }

    public final Boolean getFromSearchLiveCard() {
        return this.B;
    }

    public final String getGdLabel() {
        return this.g1;
    }

    public final boolean getGoToFypButtonShow() {
        return this.v3;
    }

    public final Boolean getHasMLBBBadge() {
        return this.z1;
    }

    public final int getHasMore() {
        return this.u2;
    }

    public final String getHashTagName() {
        return this.LLZZ;
    }

    public final boolean getHidePoiAnchor() {
        return this.V0;
    }

    public final String getHighlightCids() {
        return this.LLJJIJI;
    }

    public final String getHighlightRepostUids() {
        return this.y0;
    }

    public final String getHomepageUid() {
        return this.C0;
    }

    public final String getHotEnterMethod() {
        return this.LLZ;
    }

    public final String getHotSearch() {
        return this.LLZZZZ;
    }

    public final String getIds() {
        return this.LLJJ;
    }

    public final String getImAwemeOpenFrom() {
        return this.s3;
    }

    public final String getInboxExtra() {
        return this.M2;
    }

    public final HashMap<String, String> getInboxLogExtra() {
        return this.Z0;
    }

    public final int getInboxNoticeSubType() {
        return this.P2;
    }

    public final int getInboxNoticeType() {
        return this.N2;
    }

    public final int getIndex() {
        return this.LLLZZIL;
    }

    public final int getInnerPushType() {
        return this.k1;
    }

    public final int getInteractiveStickerType() {
        return this.Y1;
    }

    public final String getInvitationScene() {
        return this.j2;
    }

    public final String getIsDisplayDistance() {
        return this.N0;
    }

    public final boolean getIsFromSearchKeyFrameAnchor() {
        return this.x;
    }

    public final String getItemId() {
        return this.f1;
    }

    public final String getItemIdList() {
        return this.a;
    }

    public final String getItemPosition() {
        return this.y;
    }

    public final String getLastClientPage() {
        return this.LLLJ;
    }

    public final String getLastGroupId() {
        return this.p0;
    }

    public final int getLevel1CommentDeleted() {
        return this.i;
    }

    public final int getLikeCount() {
        return this.LLJJIJIL;
    }

    public final String getLikeEnterMethod() {
        return this.LLLIIIIL;
    }

    public final String getLikeListIds() {
        return this.LLJJIJIIJIL;
    }

    public final String getListItemId() {
        return this.t;
    }

    public final String getListResultType() {
        return this.s;
    }

    public final Integer getLiveCardType() {
        return this.C1;
    }

    public final String getLiveEnterMethodValue() {
        return this.Q;
    }

    public final String getLiveEnterModule() {
        return this.LLJLLIL;
    }

    public final String getLiveExtraParams() {
        return this.B1;
    }

    public final String getLiveFeedEnterFrom() {
        return this.LLJLL;
    }

    public final String getLiveFromInnerPush() {
        return this.LLJ;
    }

    public final boolean getLoadMoreUponEntrance() {
        return this.E2;
    }

    public final HashMap<String, String> getLogExtra() {
        return this.LLJIJIL;
    }

    public final MatchedFriendStruct getMatchedFriendStructTrack() {
        return this.u0;
    }

    public final long getMaxCursor() {
        return this.R2;
    }

    public final String getMessageId() {
        return this.l1;
    }

    public final String getMicroAppId() {
        return this.LLZLLLL;
    }

    public final String getMixFromOrder() {
        return this.o;
    }

    public final String getMusicId() {
        return this.LLLLJ;
    }

    public final String getMuteStripBannerEnterMethod() {
        return this.u3;
    }

    public final String getMvId() {
        return this.LLLLLLIL;
    }

    public final DetailNavArgModel getNavArgModel() {
        return this.a2;
    }

    public final boolean getNeedAutoLikeComment() {
        return this.U2;
    }

    public final boolean getNeedShowDonation() {
        return this.T2;
    }

    public final boolean getNeedShowReplyPanel() {
        return this.V2;
    }

    public final String getNewSourceId() {
        return this.f;
    }

    public final String getNewSourceType() {
        return this.e;
    }

    public final String getNewsId() {
        return this.q0;
    }

    public final int getNoPermissionVideoType() {
        return this.LLJJJJ;
    }

    public final String getNoticeIdForComment() {
        return this.R1;
    }

    public final String getNoticeTypeForComment() {
        return this.S1;
    }

    public final Object getObject() {
        return this.w2;
    }

    public final Boolean getOpenRepostPanel() {
        return this.x0;
    }

    public final String getOriginalSimilarGroupId() {
        return this.n3;
    }

    public final String getOutAwemeId() {
        return this.c;
    }

    public final String getPageCollectInfo() {
        return this.Q0;
    }

    public final String getPageName() {
        return this.j1;
    }

    public final String getPagePoiId() {
        return this.b3;
    }

    public final int getPageSize() {
        return this.LLJJL;
    }

    public final int getPageType() {
        return this.LLJILJIL;
    }

    public final String getParentTagId() {
        return this.LLLFZ;
    }

    public final String getPhotoMode() {
        return this.LLLLLZIL;
    }

    public final String getPlayListId() {
        return this.f0;
    }

    public final long getPlaylistOffset() {
        return this.c3;
    }

    public final String getPlaylistPreviousPage() {
        return this.X2;
    }

    public final String getPlaylistSearchId() {
        return this.Z2;
    }

    public final String getPoiCollectInfo() {
        return this.P0;
    }

    public final HashMap<String, String> getPoiExtras() {
        return this.R0;
    }

    public final String getPoiFullScreen() {
        return this.O0;
    }

    public final String getPreClickImprId() {
        return this.I1;
    }

    public final String getPreEventType() {
        return this.LLILZIL;
    }

    public final long getPrevPanelId() {
        return this.f3;
    }

    public final String getPreviousPage() {
        return this.LLJLLL;
    }

    public final String getPreviousPagePosition() {
        return this.LLLIIL;
    }

    public final String getProcessId() {
        return this.LLLILZJ;
    }

    public final String getProductId() {
        return this.LLLLZ;
    }

    public final String getProfileEnterMethod() {
        return this.D0;
    }

    public final String getProfileEntranceId() {
        return this.E0;
    }

    public final String getProfileSearchId() {
        return this.z;
    }

    public final String getPromotionId() {
        return this.LLLLLZL;
    }

    public final String getPropId() {
        return this.h1;
    }

    public final String getPushLabel() {
        return this.LLJZ;
    }

    public final String getPushParams() {
        return this.LLJJI;
    }

    public final String getQueryAwemeMode() {
        return this.LLLLLLLZIL;
    }

    public final String getQuestionId() {
        return this.LLLLLIL;
    }

    public final String getRankFromPrePage() {
        return this.LLIZ;
    }

    public final int getRateType() {
        return this.LLJJJJLIIL;
    }

    public final String getReactSessionId() {
        return this.g;
    }

    public final String getRealNowType() {
        return this.K0;
    }

    public final String getRecUserFrom() {
        return this.LLLLIIL;
    }

    public final String getReferCommodityId() {
        return this.n;
    }

    public final String getReferSeedId() {
        return this.LLLLZIL;
    }

    public final String getReferSeedName() {
        return this.LLLLZLL;
    }

    public final String getReferralEnterFrom() {
        return this.LLJZIJLIL;
    }

    public final String getReferralPageEnterFrom() {
        return this.LLL;
    }

    public final String getRelatedId() {
        return this.LLLZIIL;
    }

    public final String getRootEnterFromType() {
        return this.d1;
    }

    public final String getScrollToTargetAid() {
        return this.LLJILLL;
    }

    public final String getSearchChannel() {
        return this.LLLZ;
    }

    public final String getSearchEnterPosition() {
        return this.F1;
    }

    public final String getSearchEntrance() {
        return this.T1;
    }

    public final String getSearchId() {
        return this.w;
    }

    public final String getSearchKeyword() {
        return this.LLLIL;
    }

    public final String getSearchResultId() {
        return this.q;
    }

    public final String getSearchResultIdFromPrePage() {
        return this.LLIZLLLIL;
    }

    public final String getSearchThirdItemId() {
        return this.u;
    }

    public final String getSearchType() {
        return this.D;
    }

    public final String getSecUid() {
        return this.LLLLILI;
    }

    public final float getSeekProgress() {
        return this.d3;
    }

    public final String getSelectedUid() {
        return this.M;
    }

    public final long getSessionId() {
        return this.B0;
    }

    public final String getShareCheckSum() {
        return this.h2;
    }

    public final int getShareLinkMode() {
        return this.l2;
    }

    public final String getShareParamLinkId() {
        return this.d2;
    }

    public final String getShareParamSecUserId() {
        return this.f2;
    }

    public final String getShareParamUserId() {
        return this.e2;
    }

    public final String getShareParamUtmSource() {
        return this.c2;
    }

    public final String getShareTimeStamp() {
        return this.i2;
    }

    public final String getShareUrl() {
        return this.k2;
    }

    public final String getShareUserId() {
        return this.LLLI;
    }

    public final String getShootEnterFrom() {
        return this.I0;
    }

    public final boolean getShouldHidePrivacySetting() {
        return this.g3;
    }

    public final boolean getShouldShowCreatorAiGuide() {
        return this.i1;
    }

    public final int getShowAddYoursButton() {
        return this.LLLLLJLJLL;
    }

    public final int getShowAnswerQuestionButton() {
        return this.LLLLLJIL;
    }

    public final boolean getShowPlaylistViewerEntrance() {
        return this.f238i0;
    }

    public final boolean getShowViewCount() {
        return this.LLILLJJLI;
    }

    public final String getSimilarMusicId() {
        return this.LLLLJI;
    }

    public final int getSocialShareType() {
        return this.b2;
    }

    public final String getSourceBtmToken() {
        return this.P1;
    }

    public final String getSourcePage() {
        return this.LLLIILIL;
    }

    public final String getSpecialTopicRegion() {
        return this.v2;
    }

    public final String getSpuId() {
        return this.LLJJJJJIL;
    }

    public final String getStickerId() {
        return this.LLLZI;
    }

    public final List<String> getStickerInteractionUIDs() {
        return this.Z1;
    }

    public final String getStoryEnterFirstFeedMethod() {
        return this.T0;
    }

    public final String getStoryGuideCardKey() {
        return this.S0;
    }

    public final C330660Cxk getStoryInsertUserWrapper() {
        return this.h3;
    }

    public final String getStoryShootEnterFrom() {
        return this.F;
    }

    public final String getStoryToPostAid() {
        return this.i3;
    }

    public final boolean getStoryToPostNeedHideCover() {
        return this.k3;
    }

    public final boolean getStoryToPostNeedRestartPlay() {
        return this.j3;
    }

    public final int getStoryToPostPhotomodeIndex() {
        return this.f240m3;
    }

    public final int getStoryType() {
        return this.E;
    }

    public final String getTabCode() {
        return this.M0;
    }

    public final String getTabName() {
        return this.LLLLLLZZ;
    }

    public final String getTabText() {
        return this.B2;
    }

    public final String getTagLine() {
        return this.LLZZJLIL;
    }

    public final long getTakoActionItemId() {
        return this.q1;
    }

    public final String getTakoActionProcessId() {
        return this.f243p1;
    }

    public final String getTakoCardRank() {
        return this.t1;
    }

    public final String getTakoPage() {
        return this.u1;
    }

    public final String getTakoSituation() {
        return this.s1;
    }

    public final String getTakoVideoLayer() {
        return this.r1;
    }

    public final String getTargetCreationId() {
        return this.LLZLLIL;
    }

    public final String getTaskStatusList() {
        return this.LLLIZZ;
    }

    public final int getTaskType() {
        return this.LLZIL;
    }

    public final String getTemplateId() {
        return this.M1;
    }

    public final int getTemplateType() {
        return this.N1;
    }

    public final String getTnsBanType() {
        return this.r0;
    }

    public final String getTopCommentId() {
        return this.LLLILZ;
    }

    public final String getTracker() {
        return this.A2;
    }

    public final String getTranslatorId() {
        return this.LLLII;
    }

    public final Boolean getTrending() {
        return this.LLLILZLLLI;
    }

    public final String getTrendingEventId() {
        return this.Z;
    }

    public final String getTrendingName() {
        return this.a0;
    }

    public final String getTutorialId() {
        return this.LLZLI;
    }

    public final int getType() {
        return this.LLLZLL;
    }

    public final String getUid() {
        return this.LLLLIL;
    }

    public final List<String> getUidList() {
        return this.K;
    }

    public final String getUpvoteId() {
        return this.w0;
    }

    public final Integer getUpvoteScene() {
        return this.a1;
    }

    public final String getUseScenario() {
        return this.s0;
    }

    public final List<String> getUserList() {
        return this.LLLLIILLL;
    }

    public final String getUserRecType() {
        return this.LLLLIIIILLL;
    }

    public final String getUserRelationType() {
        return this.LLLLIILL;
    }

    public final String getVideoCollectionId() {
        return this.G0;
    }

    public final String getVideoCollectionName() {
        return this.H0;
    }

    public final int getVideoType() {
        return this.LLLLLLLLLL;
    }

    public final String getVoiceConversionId() {
        return this.A0;
    }

    public final String getVoiceId() {
        return this.z0;
    }

    public final String getVsEnterFrom() {
        return this.T;
    }

    public final String getVsEntranceType() {
        return this.U;
    }

    public final String getVsGroupId() {
        return this.f233X;
    }

    public final String getVsResultId() {
        return this.W;
    }

    public final String getVsSessionId() {
        return this.V;
    }

    public final String getmImprId() {
        return this.v;
    }

    public final boolean isAdSpot() {
        return this.b;
    }

    public final boolean isAllowDeletedAweme() {
        return this.f236e0;
    }

    public final boolean isBigCard() {
        return this.f239k0;
    }

    public final boolean isCard() {
        return this.j0;
    }

    public final boolean isChain() {
        return this.x2;
    }

    public final boolean isCommentForceHideAutoPopKeyboard() {
        return this.k;
    }

    public final boolean isCommentForceOpenReply() {
        return this.j;
    }

    public final String isDisplayDistance() {
        return this.N0;
    }

    public final boolean isEnableDetailActivityVideoCoverTransition() {
        return this.W2;
    }

    public final boolean isExposeSharerMsg() {
        return this.g2;
    }

    public final boolean isFromAdsActivity() {
        return this.LLLZIL;
    }

    public final int isFromAutoMessage() {
        return this.t2;
    }

    public final boolean isFromChatRoomPlaying() {
        return this.r2;
    }

    public final boolean isFromDuetChain() {
        return this.y2;
    }

    public final boolean isFromHotSearchRanking() {
        return this.G2;
    }

    public final int isFromPlaylist() {
        return this.f235a3;
    }

    public final boolean isFromPostList() {
        return this.LLLFFI;
    }

    public final boolean isFromSearchKeyFrameAnchor() {
        return this.x;
    }

    public final boolean isFromSharedStory() {
        return this.e3;
    }

    public final boolean isFromStitchChain() {
        return this.z2;
    }

    public final String isFromTrendingCard() {
        return this.f234Y;
    }

    public final int isFromVideo() {
        return this.Y2;
    }

    public final int isFullScreen() {
        return this.L0;
    }

    public final boolean isHasLatestFollowingUser() {
        return this.f232O;
    }

    public final boolean isHideMusicText() {
        return this.b0;
    }

    public final boolean isMyProfile() {
        return this.LLLFF;
    }

    public final boolean isNewSuggested() {
        return this.LLLLII;
    }

    public final Boolean isNowType() {
        return this.J0;
    }

    public final boolean isPlaylistCleanMode() {
        return this.c0;
    }

    public final boolean isRecommend() {
        return this.LLLZLZ;
    }

    public final String isSameMusicSupplyDetailPage() {
        return this.t3;
    }

    public final boolean isShouldQueryMyStoryFromCache() {
        return this.G;
    }

    public final boolean isShowCommentAfterOpen() {
        return this.LLZILL;
    }

    public final boolean isShowFollowButtonOnBottom() {
        return this.LLLJIL;
    }

    public final boolean isShowFollowButtonOnBottomForMaf() {
        return this.LLLJL;
    }

    public final boolean isShowInterestChoose() {
        return this.S;
    }

    public final boolean isShowPrivacySetting() {
        return this.l;
    }

    public final boolean isShowShareAfterOpen() {
        return this.LLZL;
    }

    public final boolean isSkipEventTracking() {
        return this.X1;
    }

    public final boolean isStoryPage() {
        return this.H;
    }

    public final boolean isSupportFeedTransition() {
        return this.f231J;
    }

    public final boolean isSupportGestureExit() {
        return this.g0;
    }

    public final boolean isSupportScrollInCleanMode() {
        return this.d0;
    }

    public final boolean isUpdateSearchResultId() {
        return this.r;
    }

    public final boolean isVideoFromDcd() {
        return this.p;
    }

    public final boolean isfollowSkyLight() {
        return this.N;
    }

    public final C2189821An6 addDetailPlayDuration(Long l) {
        if (l == null) {
            return this;
        }
        this.w3 += l.longValue();
        return this;
    }

    public final C2189821An6 addDetailVvCount(Integer num) {
        if (num == null) {
            return this;
        }
        this.o3 += num.intValue();
        return this;
    }

    public final C2189821An6 addDetailVvFinishCount(Integer num) {
        if (num == null) {
            return this;
        }
        this.p3 += num.intValue();
        return this;
    }

    public final C2189821An6 isSameMusicSupplyDetailPage(String str) {
        this.t3 = str;
        return this;
    }

    public final C2189821An6 setAIMEStyleId(String str) {
        this.c1 = str;
        return this;
    }

    public final C2189821An6 setAccountType(String str) {
        this.LLLLLLZ = str;
        return this;
    }

    public final C2189821An6 setAceEnterFrom(String str) {
        this.Q2 = str;
        return this;
    }

    public final C2189821An6 setActivityId(String str) {
        this.d = str;
        return this;
    }

    public final C2189821An6 setAdBISurveyLandingPage(String str) {
        this.y3 = str;
        return this;
    }

    public final C2189821An6 setAdBISurveyLogExtra(String str) {
        this.z3 = str;
        return this;
    }

    public final C2189821An6 setAdReportReason(String str) {
        this.J2 = str;
        return this;
    }

    public final C2189821An6 setAdReportReasonType(String str) {
        this.K2 = str;
        return this;
    }

    public final C2189821An6 setAdSpot(boolean z) {
        this.b = z;
        return this;
    }

    public final C2189821An6 setAddYoursVideoCount(Long l) {
        this.LLLLLL = l;
        return this;
    }

    public final C2189821An6 setAddyoursTopicId(String str) {
        this.LLLLLILLIL = str;
        return this;
    }

    public final C2189821An6 setAdvId(String str) {
        if (str == null) {
            this.S2 = "";
            return this;
        }
        this.S2 = str;
        return this;
    }

    public final C2189821An6 setAiStudioMessageId(String str) {
        this.U1 = str;
        return this;
    }

    public final C2189821An6 setAiStudioSessionId(String str) {
        this.V1 = str;
        return this;
    }

    public final C2189821An6 setAid(String str) {
        this.LLJILJILJ = str;
        return this;
    }

    public final C2189821An6 setAllowDeletedAweme(boolean z) {
        this.f236e0 = z;
        return this;
    }

    public final C2189821An6 setAnchorCustomData(AnchorCustomData anchorCustomData) {
        this.LLILZLL = anchorCustomData;
        return this;
    }

    public final C2189821An6 setAuthorName(String str) {
        this.q2 = str;
        return this;
    }

    public final C2189821An6 setBigCard(boolean z) {
        this.f239k0 = z;
        return this;
    }

    public final C2189821An6 setBlueDotList(List<String> list) {
        this.L = list;
        return this;
    }

    public final C2189821An6 setCarrierType(String str) {
        this.LLLLZI = str;
        return this;
    }

    public final C2189821An6 setCategoryName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LLLLLZ = str;
        }
        return this;
    }

    public final C2189821An6 setCellDetailType(int i) {
        this.C2 = i;
        return this;
    }

    public final C2189821An6 setCellId(String str) {
        this.LLLZZ = str;
        return this;
    }

    public final C2189821An6 setCellType(String str) {
        this.LLLL = str;
        return this;
    }

    public final C2189821An6 setChain(boolean z) {
        this.x2 = z;
        return this;
    }

    public final C2189821An6 setChallengeId(String str) {
        this.LLLLL = str;
        return this;
    }

    public final C2189821An6 setChallengeProfileFrom(String str) {
        this.LLLIIII = str;
        return this;
    }

    public final C2189821An6 setChannelId(int i) {
        this.LLLLLLL = i;
        return this;
    }

    public final C2189821An6 setChatFromUserId(String str) {
        if (str == null) {
            str = "";
        }
        this.q3 = str;
        return this;
    }

    public final C2189821An6 setChatFromUserNickname(String str) {
        if (str == null) {
            str = "";
        }
        this.r3 = str;
        return this;
    }

    public final C2189821An6 setChatRoomPlayingRealAid(String str) {
        this.s2 = str;
        return this;
    }

    public final C2189821An6 setChatType(String str) {
        this.n1 = str;
        return this;
    }

    public final C2189821An6 setChatroomSessionUUID(String str) {
        this.o1 = str;
        return this;
    }

    public final C2189821An6 setCid(String str) {
        this.LLJJIII = str;
        return this;
    }

    public final C2189821An6 setCidFromSearch(String str) {
        this.C = str;
        return this;
    }

    public final C2189821An6 setClickCommentChainSource(String str) {
        this.x3 = str;
        return this;
    }

    public final C2189821An6 setCommentDeleted(int i) {
        this.h = i;
        return this;
    }

    public final C2189821An6 setCommentEnterMethod(String str) {
        this.F0 = str;
        return this;
    }

    public final C2189821An6 setCommentForceHideAutoPopKeyboard(boolean z) {
        this.k = z;
        return this;
    }

    public final C2189821An6 setCommentForceOpenReply(boolean z) {
        this.j = z;
        return this;
    }

    public final C2189821An6 setCommentLabelText(String str) {
        this.LLJJJ = str;
        return this;
    }

    public final C2189821An6 setCommentLabelType(int i) {
        this.LLJJJIL = i;
        return this;
    }

    public final C2189821An6 setCommentNotice(int i) {
        this.t0 = i;
        return this;
    }

    public final C2189821An6 setCommentUserFollowStatus(int i) {
        this.I = i;
        return this;
    }

    public final C2189821An6 setCommentViewListIds(String str) {
        this.O2 = str;
        return this;
    }

    public final C2189821An6 setContentSource(String str) {
        this.LLLIIIL = str;
        return this;
    }

    public final C2189821An6 setConversationId(String str) {
        this.m1 = str;
        return this;
    }

    public final C2189821An6 setCount(int i) {
        this.LLZZZIL = i;
        return this;
    }

    public final C2189821An6 setCreationId(String str) {
        this.LLZLL = str;
        return this;
    }

    public final C2189821An6 setCreativeHubOpenRecordId(String str) {
        this.Y0 = str;
        return this;
    }

    public final C2189821An6 setCreativeHubText(String str) {
        this.X0 = str;
        return this;
    }

    public final C2189821An6 setCreativeHubType(int i) {
        this.W0 = i;
        return this;
    }

    public final C2189821An6 setCreativeToolAnchorType(Integer num) {
        this.K1 = num;
        return this;
    }

    public final C2189821An6 setCreativeToolClickTime(long j) {
        this.L1 = Long.valueOf(j);
        return this;
    }

    public final C2189821An6 setCreativeToolId(String str) {
        this.J1 = str;
        return this;
    }

    public final C2189821An6 setCreatorAiGuide(boolean z) {
        this.i1 = z;
        return this;
    }

    public final C2189821An6 setCreditVideoAuthorUid(String str) {
        this.m2 = str;
        return this;
    }

    public final C2189821An6 setCurrentProfileUserLiveRoomId(long j) {
        this.LLJLILLLLZIIL = j;
        return this;
    }

    public final C2189821An6 setCursor(int i) {
        this.LLZZLLIL = i;
        return this;
    }

    public final C2189821An6 setDanmakuDiggMessage(DanmakuDiggMessage danmakuDiggMessage) {
        this.O1 = danmakuDiggMessage;
        return this;
    }

    public final C2189821An6 setDataType(String str) {
        this.LLLLZLLIL = str;
        return this;
    }

    public final C2189821An6 setDetailAdType(int i) {
        this.L2 = i;
        return this;
    }

    public final C2189821An6 setDetailFeedNavArgModel(DetailNavArgModel detailNavArgModel) {
        this.a2 = detailNavArgModel;
        return this;
    }

    public final C2189821An6 setDetailTitleText(String str) {
        this.D2 = str;
        return this;
    }

    public final C2189821An6 setDuetId(String str) {
        this.LLLLLLJ = str;
        return this;
    }

    public final C2189821An6 setECMixFeedExtraStr(String str) {
        this.D1 = str;
        return this;
    }

    public final C2189821An6 setEcLiveExtra(String str) {
        this.A1 = str;
        return this;
    }

    public final void setEcMixFeedExtra(Object obj) {
        this.E1 = obj;
    }

    public final C2189821An6 setEcSearchTrafficSourceList(String str) {
        this.e1 = str;
        return this;
    }

    public final C2189821An6 setEnableDetailActivityVideoCoverTransition(boolean z) {
        this.W2 = z;
        return this;
    }

    public final C2189821An6 setEnableStoryCoverTransition(boolean z) {
        this.Q1 = z;
        return this;
    }

    public final C2189821An6 setEnterChatParam(Serializable serializable) {
        this.G1 = serializable;
        return this;
    }

    public final C2189821An6 setEnterFromLiveRequestId(String str) {
        this.LLJL = str;
        return this;
    }

    public final C2189821An6 setEnterFromLiveRoomId(String str) {
        this.LLJLIL = str;
        return this;
    }

    public final C2189821An6 setEnterFromRequestId(String str) {
        this.LLJJLIIIJLLLLLLLZ = str;
        return this;
    }

    public final C2189821An6 setEnterFromSub(String str) {
        this.H1 = str;
        return this;
    }

    public final C2189821An6 setEnterMethodProfile(String str) {
        this.A = str;
        return this;
    }

    public final C2189821An6 setEnterMethodValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LLLLLLLLL = str;
        }
        return this;
    }

    public final C2189821An6 setEnterPlayMethod(String str) {
        this.f242o0 = str;
        return this;
    }

    public final C2189821An6 setEnterStoryImmersiveFeedWithOutData(boolean z) {
        this.l3 = z;
        return this;
    }

    public final C2189821An6 setEntranceInfo(String str) {
        this.LLLLZLLLI = str;
        return this;
    }

    public final C2189821An6 setEventType(String str) {
        this.LLILLL = str;
        return this;
    }

    public final C2189821An6 setExposeAvatarUrl(String str) {
        this.w1 = str;
        return this;
    }

    public final C2189821An6 setExposeCommentText(String str) {
        this.y1 = str;
        return this;
    }

    public final C2189821An6 setExposeCommentType(String str) {
        this.v1 = str;
        return this;
    }

    public final C2189821An6 setExposeSharerMsg(boolean z) {
        this.g2 = z;
        return this;
    }

    public final C2189821An6 setExposeUserName(String str) {
        this.x1 = str;
        return this;
    }

    public final C2189821An6 setExternalShareAwemeId(String str) {
        this.f244p2 = str;
        return this;
    }

    public final C2189821An6 setExternalShareUrlUserId(String str) {
        this.f241n2 = str;
        return this;
    }

    public final C2189821An6 setExternalShareUserOId(String str) {
        this.o2 = str;
        return this;
    }

    public final C2189821An6 setExtra(HashMap<String, String> map) {
        this.LLJI = new ConcurrentHashMap(map);
        return this;
    }

    public final C2189821An6 setExtraSceneType(String str) {
        this.n0 = str;
        return this;
    }

    public final C2189821An6 setFeedGroupIdForMixVideo(String str) {
        this.R = str;
        return this;
    }

    public final C2189821An6 setFeedsAwemeId(String str) {
        this.LLLZL = str;
        return this;
    }

    public final C2189821An6 setFollowRecommendPosition(String str) {
        this.v0 = str;
        return this;
    }

    public final C2189821An6 setFollowRecommendShowRelationLabel(String str) {
        Boolean bool;
        if (Intrinsics.LJFF(str, "true")) {
            bool = Boolean.TRUE;
        } else if (Intrinsics.LJFF(str, "false")) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        this.m0 = bool;
        return this;
    }

    public final C2189821An6 setFollowRecommendTrackEnterFrom(String str) {
        this.l0 = str;
        return this;
    }

    public final C2189821An6 setFollowStatus(Integer num) {
        this.b1 = num;
        return this;
    }

    public final C2189821An6 setFrom(String str) {
        this.LL = str;
        return this;
    }

    public final C2189821An6 setFromActivityHashCode(String str) {
        this.LLILZ = str;
        return this;
    }

    public final C2189821An6 setFromAdsActivity(boolean z) {
        this.LLLZIL = z;
        return this;
    }

    public final C2189821An6 setFromGroupId(String str) {
        this.m = str;
        return this;
    }

    public final C2189821An6 setFromHotSearchRanking(boolean z) {
        this.G2 = z;
        return this;
    }

    public final C2189821An6 setFromPostList(boolean z) {
        this.LLLFFI = z;
        return this;
    }

    public final C2189821An6 setFromProfileUid(String str) {
        this.W1 = str;
        return this;
    }

    public final C2189821An6 setFromRecommendCard(int i) {
        this.P = i;
        return this;
    }

    public final C2189821An6 setFromReferral(boolean z) {
        this.LLLF = z;
        return this;
    }

    public final C2189821An6 setFromSearchLiveCard(Boolean bool) {
        this.B = bool;
        return this;
    }

    public final C2189821An6 setFullScreen(int i) {
        this.L0 = i;
        return this;
    }

    public final C2189821An6 setGdLabel(String str) {
        this.g1 = str;
        return this;
    }

    public final C2189821An6 setGoToFypButtonShow(boolean z) {
        this.v3 = z;
        return this;
    }

    public final C2189821An6 setHasLatestFollowingUser(boolean z) {
        this.f232O = z;
        return this;
    }

    public final C2189821An6 setHasMLBBBadge(boolean z) {
        this.z1 = Boolean.valueOf(z);
        return this;
    }

    public final C2189821An6 setHasMore(int i) {
        this.u2 = i;
        return this;
    }

    public final C2189821An6 setHashTagName(String str) {
        this.LLZZ = str;
        return this;
    }

    public final C2189821An6 setHideMusicText(boolean z) {
        this.b0 = z;
        return this;
    }

    public final C2189821An6 setHidePoiAnchor(boolean z) {
        this.V0 = z;
        return this;
    }

    public final C2189821An6 setHighlightCids(String str) {
        this.LLJJIJI = str;
        return this;
    }

    public final C2189821An6 setHighlightRepostUids(String str) {
        this.y0 = str;
        return this;
    }

    public final C2189821An6 setHomepageUid(String str) {
        this.C0 = str;
        return this;
    }

    public final C2189821An6 setHotEnterMethod(String str) {
        this.LLZ = str;
        return this;
    }

    public final C2189821An6 setHotSearch(String str) {
        this.LLZZZZ = str;
        return this;
    }

    public final C2189821An6 setIMFrom(String str) {
        if (str == null) {
            str = "";
        }
        this.s3 = str;
        return this;
    }

    public final C2189821An6 setIds(String str) {
        this.LLJJ = str;
        return this;
    }

    public final C2189821An6 setInboxExtra(String str) {
        this.M2 = str;
        return this;
    }

    public final C2189821An6 setInboxLogExtra(HashMap<String, String> map) {
        this.Z0 = map;
        return this;
    }

    public final C2189821An6 setInboxNoticeSubType(int i) {
        this.P2 = i;
        return this;
    }

    public final C2189821An6 setInboxNoticeType(int i) {
        this.N2 = i;
        return this;
    }

    public final C2189821An6 setIndex(int i) {
        this.LLLZZIL = i;
        return this;
    }

    public final C2189821An6 setInnerPushType(int i) {
        this.k1 = i;
        return this;
    }

    public final C2189821An6 setInteractiveStickerType(int i) {
        this.Y1 = i;
        return this;
    }

    public final C2189821An6 setInvitationScene(String str) {
        this.j2 = str;
        return this;
    }

    public final C2189821An6 setIsCard(boolean z) {
        this.j0 = z;
        return this;
    }

    public final C2189821An6 setIsDisplayDistance(String str) {
        this.N0 = str;
        return this;
    }

    public final C2189821An6 setIsFromAutoMessage(int i) {
        this.t2 = i;
        return this;
    }

    public final C2189821An6 setIsFromChatRoomPlaying(boolean z) {
        this.r2 = z;
        return this;
    }

    public final C2189821An6 setIsFromDuetChain(boolean z) {
        this.y2 = z;
        return this;
    }

    public final C2189821An6 setIsFromPlaylist(int i) {
        this.f235a3 = i;
        return this;
    }

    public final C2189821An6 setIsFromSearchKeyFromAnchor(boolean z) {
        this.x = z;
        return this;
    }

    public final C2189821An6 setIsFromSearchTopic(boolean z) {
        this.H2 = z;
        return this;
    }

    public final C2189821An6 setIsFromSharedStory(boolean z) {
        this.e3 = z;
        return this;
    }

    public final C2189821An6 setIsFromStitchChain(boolean z) {
        this.z2 = z;
        return this;
    }

    public final C2189821An6 setIsFromTrendingCard(String str) {
        this.f234Y = str;
        return this;
    }

    public final C2189821An6 setIsFromVideo(int i) {
        this.Y2 = i;
        return this;
    }

    public final C2189821An6 setIsNewLowQualityUser(int i) {
        this.I2 = i;
        return this;
    }

    public final C2189821An6 setIsNewSuggested(boolean z) {
        this.LLLLII = z;
        return this;
    }

    public final C2189821An6 setIsShowFollowButtonOnBottom(boolean z) {
        this.LLLJIL = z;
        return this;
    }

    public final C2189821An6 setIsShowFollowButtonOnBottomForMaf(boolean z) {
        this.LLLJL = z;
        return this;
    }

    public final C2189821An6 setIsSkipEventTracking(boolean z) {
        this.X1 = z;
        return this;
    }

    public final C2189821An6 setIsUpdateSearchResultId(boolean z) {
        this.r = z;
        return this;
    }

    public final C2189821An6 setIsfollowSkyLight(boolean z) {
        this.N = z;
        return this;
    }

    public final C2189821An6 setItemId(String str) {
        this.f1 = str;
        return this;
    }

    public final C2189821An6 setItemIdList(String str) {
        this.a = str;
        return this;
    }

    public final C2189821An6 setItemPosition(String str) {
        this.y = str;
        return this;
    }

    public final C2189821An6 setLastClientPage(String str) {
        this.LLLJ = str;
        return this;
    }

    public final C2189821An6 setLastGroupId(String str) {
        this.p0 = str;
        return this;
    }

    public final C2189821An6 setLevel1CommentDeleted(int i) {
        this.i = i;
        return this;
    }

    public final C2189821An6 setLikeCount(int i) {
        this.LLJJIJIL = i;
        return this;
    }

    public final C2189821An6 setLikeEnterMethod(String str) {
        this.LLLIIIIL = str;
        return this;
    }

    public final C2189821An6 setLikeListIds(String str) {
        this.LLJJIJIIJIL = str;
        return this;
    }

    public final C2189821An6 setListItemId(String str) {
        this.t = str;
        return this;
    }

    public final C2189821An6 setListResultType(String str) {
        this.s = str;
        return this;
    }

    public final C2189821An6 setLiveCardType(Integer num) {
        this.C1 = num;
        return this;
    }

    public final C2189821An6 setLiveEnterMethodValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.Q = str;
        }
        return this;
    }

    public final C2189821An6 setLiveEnterModule(String str) {
        this.LLJLLIL = str;
        return this;
    }

    public final C2189821An6 setLiveExtraFromInnerPush(String str) {
        this.LLJ = str;
        return this;
    }

    public final C2189821An6 setLiveExtraParams(String str) {
        this.B1 = str;
        return this;
    }

    public final C2189821An6 setLiveFeedEnterFrom(String str) {
        this.LLJLL = str;
        return this;
    }

    public final C2189821An6 setLoadMoreUponEntrance(boolean z) {
        this.E2 = z;
        return this;
    }

    public final C2189821An6 setLogExtra(HashMap<String, String> map) {
        this.LLJIJIL = map;
        return this;
    }

    public final C2189821An6 setMatchedFriendStructTrack(MatchedFriendStruct matchedFriendStruct) {
        this.u0 = matchedFriendStruct;
        return this;
    }

    public final C2189821An6 setMaxCursor(long j) {
        this.R2 = j;
        return this;
    }

    public final C2189821An6 setMessageId(String str) {
        this.l1 = str;
        return this;
    }

    public final C2189821An6 setMicroAppId(String str) {
        this.LLZLLLL = str;
        return this;
    }

    public final C2189821An6 setMixFromOrder(String str) {
        this.o = str;
        return this;
    }

    public final C2189821An6 setMusicId(String str) {
        this.LLLLJ = str;
        return this;
    }

    public final C2189821An6 setMuteStripBannerEnterMethodValue(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            this.u3 = str;
        }
        return this;
    }

    public final C2189821An6 setMvId(String str) {
        this.LLLLLLIL = str;
        return this;
    }

    public final C2189821An6 setMyProfile(boolean z) {
        this.LLLFF = z;
        return this;
    }

    public final C2189821An6 setNeedAutoLikeComment(boolean z) {
        this.U2 = z;
        return this;
    }

    public final C2189821An6 setNeedShowDonation(boolean z) {
        this.T2 = z;
        return this;
    }

    public final C2189821An6 setNeedShowReplyPanel(boolean z) {
        this.V2 = z;
        return this;
    }

    public final C2189821An6 setNewSourceId(String str) {
        this.f = str;
        return this;
    }

    public final C2189821An6 setNewSourceType(String str) {
        this.e = str;
        return this;
    }

    public final C2189821An6 setNewsId(String str) {
        this.q0 = str;
        return this;
    }

    public final C2189821An6 setNoPermissionVideoType(int i) {
        this.LLJJJJ = i;
        return this;
    }

    public final C2189821An6 setNoticeIdForComment(String str) {
        this.R1 = str;
        return this;
    }

    public final C2189821An6 setNoticeTypeForComment(String str) {
        this.S1 = str;
        return this;
    }

    public final C2189821An6 setNowType(Boolean bool) {
        this.J0 = bool;
        return this;
    }

    public final C2189821An6 setObject(Object obj) {
        this.w2 = obj;
        return this;
    }

    public final C2189821An6 setOpenRepostPanel(boolean z) {
        this.x0 = Boolean.valueOf(z);
        return this;
    }

    public final C2189821An6 setOriginalSimilarGroupId(String str) {
        this.n3 = str;
        return this;
    }

    public final C2189821An6 setOutAwemeId(String str) {
        this.c = str;
        return this;
    }

    public final C2189821An6 setPageCollectInfo(String str) {
        this.Q0 = str;
        return this;
    }

    public final C2189821An6 setPageName(String str) {
        this.j1 = str;
        return this;
    }

    public final C2189821An6 setPagePoiId(String str) {
        this.b3 = str;
        return this;
    }

    public final C2189821An6 setPageSize(int i) {
        this.LLJJL = i;
        return this;
    }

    public final C2189821An6 setPageType(int i) {
        this.LLJILJIL = i;
        return this;
    }

    public final C2189821An6 setParentTagId(String str) {
        this.LLLFZ = str;
        return this;
    }

    public final C2189821An6 setPhotoMode(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LLLLLZIL = str;
        }
        return this;
    }

    public final void setPlayListId(String str) {
        this.f0 = str;
    }

    public final C2189821An6 setPlaylistCleanMode(boolean z) {
        this.c0 = z;
        return this;
    }

    public final C2189821An6 setPlaylistEnterGroupId(String str) {
        this.f237h0 = str;
        return this;
    }

    public final void setPlaylistOffset(long j) {
        this.c3 = j;
    }

    public final C2189821An6 setPlaylistPreviousPage(String str) {
        this.X2 = str;
        return this;
    }

    public final C2189821An6 setPlaylistSearchId(String str) {
        this.Z2 = str;
        return this;
    }

    public final C2189821An6 setPoiCollectInfo(String str) {
        this.P0 = str;
        return this;
    }

    public final C2189821An6 setPoiExtras(HashMap<String, String> map) {
        this.R0 = map;
        return this;
    }

    public final C2189821An6 setPoiFullScreen(String str) {
        this.O0 = str;
        return this;
    }

    public final C2189821An6 setPreClickImprId(String str) {
        this.I1 = str;
        return this;
    }

    public final C2189821An6 setPreEventType(String str) {
        this.LLILZIL = str;
        return this;
    }

    public final C2189821An6 setPrevPanelId(long j) {
        this.f3 = j;
        return this;
    }

    public final C2189821An6 setPreviousPage(String str) {
        this.LLJLLL = str;
        return this;
    }

    public final C2189821An6 setPreviousPagePosition(String str) {
        this.LLLIIL = str;
        return this;
    }

    public final C2189821An6 setProcessId(String str) {
        this.LLLILZJ = str;
        return this;
    }

    public final C2189821An6 setProductId(String str) {
        this.LLLLZ = str;
        return this;
    }

    public final C2189821An6 setProfileEnterMethod(String str) {
        this.D0 = str;
        return this;
    }

    public final C2189821An6 setProfileEntranceId(String str) {
        this.E0 = str;
        return this;
    }

    public final C2189821An6 setProfileSearchId(String str) {
        this.z = str;
        return this;
    }

    public final C2189821An6 setPromotionId(String str) {
        this.LLLLLZL = str;
        return this;
    }

    public final C2189821An6 setPropId(String str) {
        this.h1 = str;
        return this;
    }

    public final C2189821An6 setPushLabel(String str) {
        this.LLJZ = str;
        return this;
    }

    public final C2189821An6 setPushParams(String str) {
        this.LLJJI = str;
        return this;
    }

    public final C2189821An6 setQueryAwemeMode(String str) {
        this.LLLLLLLZIL = str;
        return this;
    }

    public final C2189821An6 setQuestionId(String str) {
        this.LLLLLIL = str;
        return this;
    }

    public final C2189821An6 setRankFromPrePage(String str) {
        this.LLIZ = str;
        return this;
    }

    public final C2189821An6 setRateType(int i) {
        this.LLJJJJLIIL = i;
        return this;
    }

    public final C2189821An6 setReactSessionId(String str) {
        this.g = str;
        return this;
    }

    public final C2189821An6 setRealNowType(String str) {
        this.K0 = str;
        return this;
    }

    public final C2189821An6 setRecUserFrom(String str) {
        this.LLLLIIL = str;
        return this;
    }

    public final C2189821An6 setRecommend(boolean z) {
        this.LLLZLZ = z;
        return this;
    }

    public final C2189821An6 setReferCommodityId(String str) {
        this.n = str;
        return this;
    }

    public final C2189821An6 setReferSeedId(String str) {
        this.LLLLZIL = str;
        return this;
    }

    public final C2189821An6 setReferSeedName(String str) {
        this.LLLLZLL = str;
        return this;
    }

    public final C2189821An6 setReferralEnterFrom(String str) {
        this.LLJZIJLIL = str;
        return this;
    }

    public final C2189821An6 setReferralPageEnterFrom(String str) {
        this.LLL = str;
        return this;
    }

    public final C2189821An6 setRelatedId(String str) {
        this.LLLZIIL = str;
        return this;
    }

    public final C2189821An6 setRootEnterFromType(String str) {
        this.d1 = str;
        return this;
    }

    public final C2189821An6 setScollToTargetAid(String str) {
        this.LLJILLL = str;
        return this;
    }

    public final C2189821An6 setSearchChannel(String str) {
        this.LLLZ = str;
        return this;
    }

    public final C2189821An6 setSearchEnterPosition(String str) {
        this.F1 = str;
        return this;
    }

    public final C2189821An6 setSearchEntrance(String str) {
        this.T1 = str;
        return this;
    }

    public final C2189821An6 setSearchId(String str) {
        this.w = str;
        return this;
    }

    public final C2189821An6 setSearchKeyword(String str) {
        this.LLLIL = str;
        return this;
    }

    public final C2189821An6 setSearchResultId(String str) {
        this.q = str;
        return this;
    }

    public final C2189821An6 setSearchResultIdFromPrePage(String str) {
        this.LLIZLLLIL = str;
        return this;
    }

    public final C2189821An6 setSearchThirdItemId(String str) {
        this.u = str;
        return this;
    }

    public final C2189821An6 setSearchType(String str) {
        this.D = str;
        return this;
    }

    public final C2189821An6 setSecUid(String str) {
        this.LLLLILI = str;
        return this;
    }

    public final C2189821An6 setSeekProgress(float f) {
        this.d3 = f;
        return this;
    }

    public final C2189821An6 setSelectedUid(String str) {
        this.M = str;
        return this;
    }

    public final C2189821An6 setSessionId(long j) {
        this.B0 = j;
        return this;
    }

    public final C2189821An6 setShareCheckSum(String str) {
        this.h2 = str;
        return this;
    }

    public final C2189821An6 setShareLinkMode(int i) {
        this.l2 = i;
        return this;
    }

    public final C2189821An6 setShareParamLinkId(String str) {
        this.d2 = str;
        return this;
    }

    public final C2189821An6 setShareParamSecUserId(String str) {
        this.f2 = str;
        return this;
    }

    public final C2189821An6 setShareParamUserId(String str) {
        this.e2 = str;
        return this;
    }

    public final C2189821An6 setShareParamUtmSource(String str) {
        this.c2 = str;
        return this;
    }

    public final C2189821An6 setShareTimeStamp(String str) {
        this.i2 = str;
        return this;
    }

    public final C2189821An6 setShareUrl(String str) {
        this.k2 = str;
        return this;
    }

    public final C2189821An6 setShareUserId(String str) {
        this.LLLI = str;
        return this;
    }

    public final C2189821An6 setShootEnterFrom(String str) {
        this.I0 = str;
        return this;
    }

    public final C2189821An6 setShouldHidePrivacySetting(boolean z) {
        this.g3 = z;
        return this;
    }

    public final C2189821An6 setShouldQueryMyStoryFromCache(boolean z) {
        this.G = z;
        return this;
    }

    public final C2189821An6 setShowAddYoursButton(int i) {
        this.LLLLLJLJLL = i;
        return this;
    }

    public final C2189821An6 setShowAnswerQuestionButton(int i) {
        this.LLLLLJIL = i;
        return this;
    }

    public final C2189821An6 setShowCommentAfterOpen(boolean z) {
        this.LLZILL = z;
        return this;
    }

    public final C2189821An6 setShowInterestChoose(boolean z) {
        this.S = z;
        return this;
    }

    public final C2189821An6 setShowPlaylistViewerEntrance(boolean z) {
        this.f238i0 = z;
        return this;
    }

    public final C2189821An6 setShowPrivacySetting(boolean z) {
        this.l = z;
        return this;
    }

    public final C2189821An6 setShowShareAfterOpen(boolean z) {
        this.LLZL = z;
        return this;
    }

    public final C2189821An6 setShowViewCount(boolean z) {
        this.LLILLJJLI = z;
        return this;
    }

    public final C2189821An6 setSimilarMusicId(String str) {
        this.LLLLJI = str;
        return this;
    }

    public final C2189821An6 setSocialShareType(int i) {
        this.b2 = i;
        return this;
    }

    public final C2189821An6 setSourceBtmToken(String str) {
        this.P1 = str;
        return this;
    }

    public final C2189821An6 setSourcePage(String str) {
        this.LLLIILIL = str;
        return this;
    }

    public final C2189821An6 setSpecialTopicRegion(String str) {
        this.v2 = str;
        return this;
    }

    public final C2189821An6 setSpuId(String str) {
        this.LLJJJJJIL = str;
        return this;
    }

    public final C2189821An6 setStickerId(String str) {
        this.LLLZI = str;
        return this;
    }

    public final C2189821An6 setStickerInteractionUIDs(List<String> list) {
        this.Z1 = list;
        return this;
    }

    public final C2189821An6 setStoryEnterFirstFeedMethod(String str) {
        this.T0 = str;
        return this;
    }

    public final C2189821An6 setStoryGuideCardKey(String str) {
        this.S0 = str;
        return this;
    }

    public final C2189821An6 setStoryInsertUserWrapper(Serializable serializable) {
        C330660Cxk c330660Cxk;
        if (serializable instanceof C330660Cxk) {
            c330660Cxk = (C330660Cxk) serializable;
        } else {
            c330660Cxk = null;
        }
        this.h3 = c330660Cxk;
        return this;
    }

    public final C2189821An6 setStoryPage(boolean z) {
        this.H = z;
        return this;
    }

    public final C2189821An6 setStoryShootEnterFrom(String str) {
        this.F = str;
        return this;
    }

    public final C2189821An6 setStoryToPostAid(String str) {
        this.i3 = str;
        return this;
    }

    public final C2189821An6 setStoryToPostNeedHideCover(boolean z) {
        this.k3 = z;
        return this;
    }

    public final C2189821An6 setStoryToPostNeedRestartPlay(boolean z) {
        this.j3 = z;
        return this;
    }

    public final C2189821An6 setStoryToPostPhotomodeIndex(int i) {
        this.f240m3 = i;
        return this;
    }

    public final C2189821An6 setStoryType(int i) {
        this.E = i;
        return this;
    }

    public final C2189821An6 setSupportFeedTransition(boolean z) {
        this.f231J = z;
        return this;
    }

    public final C2189821An6 setSupportGestureExit(boolean z) {
        this.g0 = z;
        return this;
    }

    public final C2189821An6 setSupportScrollInCleanMode(boolean z) {
        this.d0 = z;
        return this;
    }

    public final C2189821An6 setTabCode(String str) {
        this.M0 = str;
        return this;
    }

    public final C2189821An6 setTabName(String str) {
        this.LLLLLLZZ = str;
        return this;
    }

    public final C2189821An6 setTabText(String str) {
        this.B2 = str;
        return this;
    }

    public final C2189821An6 setTagLine(String str) {
        this.LLZZJLIL = str;
        return this;
    }

    public final C2189821An6 setTakoActionId(long j) {
        this.q1 = j;
        return this;
    }

    public final C2189821An6 setTakoActionProcessId(String str) {
        this.f243p1 = str;
        return this;
    }

    public final C2189821An6 setTakoCardRank(String str) {
        this.t1 = str;
        return this;
    }

    public final C2189821An6 setTakoPage(String str) {
        this.u1 = str;
        return this;
    }

    public final C2189821An6 setTakoSituation(String str) {
        this.s1 = str;
        return this;
    }

    public final C2189821An6 setTakoVideoLayer(String str) {
        this.r1 = str;
        return this;
    }

    public final C2189821An6 setTargetCreationId(String str) {
        this.LLZLLIL = str;
        return this;
    }

    public final C2189821An6 setTaskStatusList(String str) {
        this.LLLIZZ = str;
        return this;
    }

    public final C2189821An6 setTaskType(int i) {
        this.LLZIL = i;
        return this;
    }

    public final C2189821An6 setTemplateId(String str) {
        this.M1 = str;
        return this;
    }

    public final C2189821An6 setTemplateType(int i) {
        this.N1 = i;
        return this;
    }

    public final C2189821An6 setTnsBanType(String str) {
        this.r0 = str;
        return this;
    }

    public final C2189821An6 setTopCommentId(String str) {
        this.LLLILZ = str;
        return this;
    }

    public final C2189821An6 setTracker(String str) {
        this.A2 = str;
        return this;
    }

    public final C2189821An6 setTranslatorId(String str) {
        this.LLLII = str;
        return this;
    }

    public final C2189821An6 setTrending(Boolean bool) {
        this.LLLILZLLLI = bool;
        return this;
    }

    public final C2189821An6 setTrendingEventId(String str) {
        this.Z = str;
        return this;
    }

    public final C2189821An6 setTrendingName(String str) {
        this.a0 = str;
        return this;
    }

    public final C2189821An6 setTutorialId(String str) {
        this.LLZLI = str;
        return this;
    }

    public final C2189821An6 setType(int i) {
        this.LLLZLL = i;
        return this;
    }

    public final C2189821An6 setUid(String str) {
        this.LLLLIL = str;
        return this;
    }

    public final C2189821An6 setUidList(List<String> list) {
        this.K = list;
        return this;
    }

    public final C2189821An6 setUpvoteId(String str) {
        this.w0 = str;
        return this;
    }

    public final C2189821An6 setUpvoteScene(Integer num) {
        this.a1 = num;
        return this;
    }

    public final C2189821An6 setUseScenario(String str) {
        this.s0 = str;
        return this;
    }

    public final C2189821An6 setUserList(List<String> list) {
        this.LLLLIILLL = list;
        return this;
    }

    public final C2189821An6 setUserRecType(String str) {
        this.LLLLIIIILLL = str;
        return this;
    }

    public final C2189821An6 setUserRelationType(String str) {
        this.LLLLIILL = str;
        return this;
    }

    public final C2189821An6 setVideoCollectionId(String str) {
        this.G0 = str;
        return this;
    }

    public final C2189821An6 setVideoCollectionName(String str) {
        this.H0 = str;
        return this;
    }

    public final C2189821An6 setVideoCurrentPosition(long j) {
        this.F2 = j;
        return this;
    }

    public final C2189821An6 setVideoFromDcd(boolean z) {
        this.p = z;
        return this;
    }

    public final C2189821An6 setVideoType(int i) {
        this.LLLLLLLLLL = i;
        return this;
    }

    public final C2189821An6 setVoiceConversionId(String str) {
        this.A0 = str;
        return this;
    }

    public final C2189821An6 setVoiceId(String str) {
        this.z0 = str;
        return this;
    }

    public final C2189821An6 setVsEnterFrom(String str) {
        this.T = str;
        return this;
    }

    public final C2189821An6 setVsEntranceType(String str) {
        this.U = str;
        return this;
    }

    public final C2189821An6 setVsGroupId(String str) {
        this.f233X = str;
        return this;
    }

    public final C2189821An6 setVsResultId(String str) {
        this.W = str;
        return this;
    }

    public final C2189821An6 setVsSessionId(String str) {
        this.V = str;
        return this;
    }

    public final C2189821An6 setmImprId(String str) {
        this.v = str;
        return this;
    }
}
