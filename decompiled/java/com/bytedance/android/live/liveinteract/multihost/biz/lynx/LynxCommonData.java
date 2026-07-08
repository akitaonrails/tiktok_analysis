package com.bytedance.android.live.liveinteract.multihost.biz.lynx;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC976700bWW;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchOpeningAnimationConfig;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LynxCommonData {

    @C09CT("common")
    public final Common common;

    @C09CT("start_animation")
    public final StartAnimationData startAnimation;

    @C09CT("title_bar")
    public final TitleBarData titleBar;

    public static final class CoHostInfo {

        @C09CT("channel_id")
        public final String channelId;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CoHostInfo) && Intrinsics.LJFF(this.channelId, ((CoHostInfo) obj).channelId);
        }

        public final int hashCode() {
            return this.channelId.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CoHostInfo(channelId=");
            sbLIZ.append(this.channelId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CoHostInfo() {
            this("");
        }

        public CoHostInfo(String str) {
            this.channelId = str;
        }
    }

    public static final class Common {

        @C09CT("general_info")
        public final GeneralInfo generalInfo;

        @C09CT("ice_showdown_info")
        public final IceShowdownInfo iceShowdownInfo;

        @C09CT("is_rank_league_match")
        public final Integer isRankLeagueMatch;

        @C09CT("is_rank_league_revamp")
        public final Integer isRankLeagueRevamp;

        @C09CT("layout")
        public final Layout layout;

        @C09CT("league_match_info")
        public final LeagueMatchInfo leagueMatchInfo;

        @C09CT("linked_user_list")
        public final List<LinkedUser> linkedUserList;

        @C09CT("room")
        public final CustomRoom room;

        @C09CT("source_payload")
        public final SourcePayload sourcePayload;

        @C09CT("specific_gift_info")
        public final SpecificGiftInfo specificGiftInfo;

        public Common() {
            this(null, null, null, null, null, null, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Common)) {
                return false;
            }
            Common common = (Common) obj;
            return Intrinsics.LJFF(this.leagueMatchInfo, common.leagueMatchInfo) && Intrinsics.LJFF(this.generalInfo, common.generalInfo) && Intrinsics.LJFF(this.specificGiftInfo, common.specificGiftInfo) && Intrinsics.LJFF(this.sourcePayload, common.sourcePayload) && Intrinsics.LJFF(this.iceShowdownInfo, common.iceShowdownInfo) && Intrinsics.LJFF(this.isRankLeagueMatch, common.isRankLeagueMatch) && Intrinsics.LJFF(this.isRankLeagueRevamp, common.isRankLeagueRevamp) && Intrinsics.LJFF(this.linkedUserList, common.linkedUserList) && Intrinsics.LJFF(this.layout, common.layout) && Intrinsics.LJFF(this.room, common.room);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Common(leagueMatchInfo=");
            sbLIZ.append(this.leagueMatchInfo);
            sbLIZ.append(", generalInfo=");
            sbLIZ.append(this.generalInfo);
            sbLIZ.append(", specificGiftInfo=");
            sbLIZ.append(this.specificGiftInfo);
            sbLIZ.append(", sourcePayload=");
            sbLIZ.append(this.sourcePayload);
            sbLIZ.append(", iceShowdownInfo=");
            sbLIZ.append(this.iceShowdownInfo);
            sbLIZ.append(", isRankLeagueMatch=");
            sbLIZ.append(this.isRankLeagueMatch);
            sbLIZ.append(", isRankLeagueRevamp=");
            sbLIZ.append(this.isRankLeagueRevamp);
            sbLIZ.append(", linkedUserList=");
            sbLIZ.append(this.linkedUserList);
            sbLIZ.append(", layout=");
            sbLIZ.append(this.layout);
            sbLIZ.append(", room=");
            sbLIZ.append(this.room);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final int hashCode() {
            LeagueMatchInfo leagueMatchInfo = this.leagueMatchInfo;
            int iHashCode = (leagueMatchInfo == null ? 0 : leagueMatchInfo.hashCode()) * 31;
            GeneralInfo generalInfo = this.generalInfo;
            int iHashCode2 = (iHashCode + (generalInfo == null ? 0 : generalInfo.hashCode())) * 31;
            SpecificGiftInfo specificGiftInfo = this.specificGiftInfo;
            int iHashCode3 = (iHashCode2 + (specificGiftInfo == null ? 0 : specificGiftInfo.hashCode())) * 31;
            SourcePayload sourcePayload = this.sourcePayload;
            int iHashCode4 = (iHashCode3 + (sourcePayload == null ? 0 : sourcePayload.hashCode())) * 31;
            IceShowdownInfo iceShowdownInfo = this.iceShowdownInfo;
            int i = (iHashCode4 + (iceShowdownInfo == null ? 0 : iceShowdownInfo.reserved)) * 31;
            Integer num = this.isRankLeagueMatch;
            int iHashCode5 = (i + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.isRankLeagueRevamp;
            int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<LinkedUser> list = this.linkedUserList;
            int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            Layout layout = this.layout;
            int iHashCode8 = (iHashCode7 + (layout == null ? 0 : layout.hashCode())) * 31;
            CustomRoom customRoom = this.room;
            return iHashCode8 + (customRoom != null ? customRoom.roomAuth.giftRankSwitchStatus : 0);
        }

        public Common(LeagueMatchInfo leagueMatchInfo, GeneralInfo generalInfo, SpecificGiftInfo specificGiftInfo, SourcePayload sourcePayload, IceShowdownInfo iceShowdownInfo, Integer num, Integer num2, List<LinkedUser> list, Layout layout, CustomRoom customRoom) {
            this.leagueMatchInfo = leagueMatchInfo;
            this.generalInfo = generalInfo;
            this.specificGiftInfo = specificGiftInfo;
            this.sourcePayload = sourcePayload;
            this.iceShowdownInfo = iceShowdownInfo;
            this.isRankLeagueMatch = num;
            this.isRankLeagueRevamp = num2;
            this.linkedUserList = list;
            this.layout = layout;
            this.room = customRoom;
        }
    }

    public static final class CustomRoom {

        @C09CT("room_auth")
        public final CustomRoomAuth roomAuth;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomRoom) && Intrinsics.LJFF(this.roomAuth, ((CustomRoom) obj).roomAuth);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CustomRoom(roomAuth=");
            sbLIZ.append(this.roomAuth);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final int hashCode() {
            return this.roomAuth.giftRankSwitchStatus;
        }

        public CustomRoom(CustomRoomAuth customRoomAuth) {
            this.roomAuth = customRoomAuth;
        }
    }

    public static final class LayoutContainerView {

        @C09CT("h")
        public final float h;

        @C09CT("w")
        public final float w;

        @C09CT("x")
        public final float x;

        @C09CT("y")
        public final float y;

        public LayoutContainerView() {
            this(0.0f, 0.0f, 0.0f, 0.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutContainerView)) {
                return false;
            }
            LayoutContainerView layoutContainerView = (LayoutContainerView) obj;
            return Float.compare(this.x, layoutContainerView.x) == 0 && Float.compare(this.y, layoutContainerView.y) == 0 && Float.compare(this.w, layoutContainerView.w) == 0 && Float.compare(this.h, layoutContainerView.h) == 0;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LayoutContainerView(x=");
            sbLIZ.append(this.x);
            sbLIZ.append(", y=");
            sbLIZ.append(this.y);
            sbLIZ.append(", w=");
            sbLIZ.append(this.w);
            sbLIZ.append(", h=");
            sbLIZ.append(this.h);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final int hashCode() {
            return (((((Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y)) * 31) + Float.floatToIntBits(this.w)) * 31) + Float.floatToIntBits(this.h);
        }

        public LayoutContainerView(float f, float f2, float f3, float f4) {
            this.x = f;
            this.y = f2;
            this.w = f3;
            this.h = f4;
        }
    }

    public static final class LayoutWindow {

        @C09CT("cohost_spot_extra")
        public final CoHostSpotExtra cohostSpotExtra;

        @C09CT("h")
        public final int h;

        @C09CT("linkMicId")
        public final String linkMicId;

        @C09CT("onlineState")
        public final int onlineState;

        @C09CT("spotId")
        public final int spotId;

        @C09CT("state")
        public final int state;

        @C09CT("w")
        public final int w;

        @C09CT("x")
        public final int x;

        @C09CT("y")
        public final int y;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutWindow)) {
                return false;
            }
            LayoutWindow layoutWindow = (LayoutWindow) obj;
            return Intrinsics.LJFF(this.linkMicId, layoutWindow.linkMicId) && this.spotId == layoutWindow.spotId && this.state == layoutWindow.state && this.onlineState == layoutWindow.onlineState && this.x == layoutWindow.x && this.y == layoutWindow.y && this.w == layoutWindow.w && this.h == layoutWindow.h && Intrinsics.LJFF(this.cohostSpotExtra, layoutWindow.cohostSpotExtra);
        }

        public final int hashCode() {
            return (((((((((((((((this.linkMicId.hashCode() * 31) + this.spotId) * 31) + this.state) * 31) + this.onlineState) * 31) + this.x) * 31) + this.y) * 31) + this.w) * 31) + this.h) * 31) + this.cohostSpotExtra.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LayoutWindow(linkMicId=");
            sbLIZ.append(this.linkMicId);
            sbLIZ.append(", spotId=");
            sbLIZ.append(this.spotId);
            sbLIZ.append(", state=");
            sbLIZ.append(this.state);
            sbLIZ.append(", onlineState=");
            sbLIZ.append(this.onlineState);
            sbLIZ.append(", x=");
            sbLIZ.append(this.x);
            sbLIZ.append(", y=");
            sbLIZ.append(this.y);
            sbLIZ.append(", w=");
            sbLIZ.append(this.w);
            sbLIZ.append(", h=");
            sbLIZ.append(this.h);
            sbLIZ.append(", cohostSpotExtra=");
            sbLIZ.append(this.cohostSpotExtra);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public LayoutWindow() {
            this("", 0, 0, 0, 0, 0, 0, 0, new CoHostSpotExtra(0, 0, 0));
        }

        public LayoutWindow(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, CoHostSpotExtra coHostSpotExtra) {
            this.linkMicId = str;
            this.spotId = i;
            this.state = i2;
            this.onlineState = i3;
            this.x = i4;
            this.y = i5;
            this.w = i6;
            this.h = i7;
            this.cohostSpotExtra = coHostSpotExtra;
        }
    }

    public static final class StreamContainerFrame {

        @C09CT("h")
        public final float h;

        @C09CT("w")
        public final float w;

        @C09CT("x")
        public final float x;

        @C09CT("y")
        public final float y;

        public StreamContainerFrame() {
            this(0.0f, 0.0f, 0.0f, 0.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StreamContainerFrame)) {
                return false;
            }
            StreamContainerFrame streamContainerFrame = (StreamContainerFrame) obj;
            return Float.compare(this.x, streamContainerFrame.x) == 0 && Float.compare(this.y, streamContainerFrame.y) == 0 && Float.compare(this.w, streamContainerFrame.w) == 0 && Float.compare(this.h, streamContainerFrame.h) == 0;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreamContainerFrame(x=");
            sbLIZ.append(this.x);
            sbLIZ.append(", y=");
            sbLIZ.append(this.y);
            sbLIZ.append(", w=");
            sbLIZ.append(this.w);
            sbLIZ.append(", h=");
            sbLIZ.append(this.h);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final int hashCode() {
            return (((((Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y)) * 31) + Float.floatToIntBits(this.w)) * 31) + Float.floatToIntBits(this.h);
        }

        public StreamContainerFrame(float f, float f2, float f3, float f4) {
            this.x = f;
            this.y = f2;
            this.w = f3;
            this.h = f4;
        }
    }

    public LynxCommonData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LynxCommonData)) {
            return false;
        }
        LynxCommonData lynxCommonData = (LynxCommonData) obj;
        return Intrinsics.LJFF(this.common, lynxCommonData.common) && Intrinsics.LJFF(this.startAnimation, lynxCommonData.startAnimation) && Intrinsics.LJFF(this.titleBar, lynxCommonData.titleBar);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxCommonData(common=");
        sbLIZ.append(this.common);
        sbLIZ.append(", startAnimation=");
        sbLIZ.append(this.startAnimation);
        sbLIZ.append(", titleBar=");
        sbLIZ.append(this.titleBar);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        Common common = this.common;
        int iHashCode = (common == null ? 0 : common.hashCode()) * 31;
        StartAnimationData startAnimationData = this.startAnimation;
        int iHashCode2 = (iHashCode + (startAnimationData == null ? 0 : startAnimationData.hashCode())) * 31;
        TitleBarData titleBarData = this.titleBar;
        return iHashCode2 + (titleBarData != null ? titleBarData.hide : 0);
    }

    public static final class CustomRoomAuth {

        @C09CT("transaction_history")
        public int giftRankSwitchStatus;

        public CustomRoomAuth() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomRoomAuth) && this.giftRankSwitchStatus == ((CustomRoomAuth) obj).giftRankSwitchStatus;
        }

        public final int hashCode() {
            return this.giftRankSwitchStatus;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CustomRoomAuth(giftRankSwitchStatus=");
            sbLIZ.append(this.giftRankSwitchStatus);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CustomRoomAuth(int i) {
            this.giftRankSwitchStatus = i;
        }
    }

    public static final class IceShowdownInfo {

        @C09CT("reserved")
        public final int reserved;

        public IceShowdownInfo() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IceShowdownInfo) && this.reserved == ((IceShowdownInfo) obj).reserved;
        }

        public final int hashCode() {
            return this.reserved;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IceShowdownInfo(reserved=");
            sbLIZ.append(this.reserved);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public IceShowdownInfo(int i) {
            this.reserved = i;
        }
    }

    public static final class TitleBarData {

        @C09CT("hide")
        public final int hide;

        public TitleBarData() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TitleBarData) && this.hide == ((TitleBarData) obj).hide;
        }

        public final int hashCode() {
            return this.hide;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TitleBarData(hide=");
            sbLIZ.append(this.hide);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public TitleBarData(int i) {
            this.hide = i;
        }
    }

    public static final class LayoutDiffInfo {

        @C09CT("newWindows")
        public final List<LayoutWindow> newWindows;

        @C09CT("removedWindows")
        public final List<LayoutWindow> removedWindows;

        public LayoutDiffInfo() {
            this(null, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutDiffInfo)) {
                return false;
            }
            LayoutDiffInfo layoutDiffInfo = (LayoutDiffInfo) obj;
            return Intrinsics.LJFF(this.newWindows, layoutDiffInfo.newWindows) && Intrinsics.LJFF(this.removedWindows, layoutDiffInfo.removedWindows);
        }

        public final int hashCode() {
            return (this.newWindows.hashCode() * 31) + this.removedWindows.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LayoutDiffInfo(newWindows=");
            sbLIZ.append(this.newWindows);
            sbLIZ.append(", removedWindows=");
            sbLIZ.append(this.removedWindows);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public LayoutDiffInfo(List<LayoutWindow> list, List<LayoutWindow> list2) {
            this.newWindows = list;
            this.removedWindows = list2;
        }

        public LayoutDiffInfo(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
        }
    }

    public static final class CoHostSpotExtra {

        @C09CT("contentType")
        public final int contentType;

        @C09CT("isEnlarged")
        public final int isEnlarged;

        @C09CT("preEnlargeSpotId")
        public final int preEnlargeSpotId;

        public CoHostSpotExtra() {
            this(0, 0, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoHostSpotExtra)) {
                return false;
            }
            CoHostSpotExtra coHostSpotExtra = (CoHostSpotExtra) obj;
            return this.isEnlarged == coHostSpotExtra.isEnlarged && this.contentType == coHostSpotExtra.contentType && this.preEnlargeSpotId == coHostSpotExtra.preEnlargeSpotId;
        }

        public final int hashCode() {
            return (((this.isEnlarged * 31) + this.contentType) * 31) + this.preEnlargeSpotId;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CoHostSpotExtra(isEnlarged=");
            sbLIZ.append(this.isEnlarged);
            sbLIZ.append(", contentType=");
            sbLIZ.append(this.contentType);
            sbLIZ.append(", preEnlargeSpotId=");
            sbLIZ.append(this.preEnlargeSpotId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CoHostSpotExtra(int i, int i2, int i3) {
            this.isEnlarged = i;
            this.contentType = i2;
            this.preEnlargeSpotId = i3;
        }
    }

    public static final class Layout {

        @C09CT("CoHostLayoutExtra")
        public final CoHostLayoutExtra coHostLayoutExtra;

        @C09CT("diffInfo")
        public final LayoutDiffInfo diffInfo;

        @C09CT("fullInfo")
        public final LayoutFullInfo fullInfo;

        public Layout() {
            this(null, new LayoutDiffInfo(null, null, 3, null), null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Layout)) {
                return false;
            }
            Layout layout = (Layout) obj;
            return Intrinsics.LJFF(this.fullInfo, layout.fullInfo) && Intrinsics.LJFF(this.diffInfo, layout.diffInfo) && Intrinsics.LJFF(this.coHostLayoutExtra, layout.coHostLayoutExtra);
        }

        public final int hashCode() {
            LayoutFullInfo layoutFullInfo = this.fullInfo;
            int iHashCode = (((layoutFullInfo == null ? 0 : layoutFullInfo.hashCode()) * 31) + this.diffInfo.hashCode()) * 31;
            CoHostLayoutExtra coHostLayoutExtra = this.coHostLayoutExtra;
            return iHashCode + (coHostLayoutExtra != null ? coHostLayoutExtra.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Layout(fullInfo=");
            sbLIZ.append(this.fullInfo);
            sbLIZ.append(", diffInfo=");
            sbLIZ.append(this.diffInfo);
            sbLIZ.append(", coHostLayoutExtra=");
            sbLIZ.append(this.coHostLayoutExtra);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Layout(LayoutFullInfo layoutFullInfo, LayoutDiffInfo layoutDiffInfo, CoHostLayoutExtra coHostLayoutExtra) {
            this.fullInfo = layoutFullInfo;
            this.diffInfo = layoutDiffInfo;
            this.coHostLayoutExtra = coHostLayoutExtra;
        }
    }

    public static final class LeagueMatchInfo {

        @C09CT("is_rank_league_match")
        public final int isRankLeagueMatch;

        @C09CT("is_rank_league_revamp")
        public final int isRankLeagueRevamp;

        @C09CT("league_rank_score_info")
        public final LeagueScoreInfo leagueRankScoreInfo;

        public LeagueMatchInfo() {
            this(0, 0, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeagueMatchInfo)) {
                return false;
            }
            LeagueMatchInfo leagueMatchInfo = (LeagueMatchInfo) obj;
            return this.isRankLeagueMatch == leagueMatchInfo.isRankLeagueMatch && this.isRankLeagueRevamp == leagueMatchInfo.isRankLeagueRevamp && Intrinsics.LJFF(this.leagueRankScoreInfo, leagueMatchInfo.leagueRankScoreInfo);
        }

        public final int hashCode() {
            int i = ((this.isRankLeagueMatch * 31) + this.isRankLeagueRevamp) * 31;
            LeagueScoreInfo leagueScoreInfo = this.leagueRankScoreInfo;
            return i + (leagueScoreInfo == null ? 0 : leagueScoreInfo.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LeagueMatchInfo(isRankLeagueMatch=");
            sbLIZ.append(this.isRankLeagueMatch);
            sbLIZ.append(", isRankLeagueRevamp=");
            sbLIZ.append(this.isRankLeagueRevamp);
            sbLIZ.append(", leagueRankScoreInfo=");
            sbLIZ.append(this.leagueRankScoreInfo);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public LeagueMatchInfo(int i, int i2, LeagueScoreInfo leagueScoreInfo) {
            this.isRankLeagueMatch = i;
            this.isRankLeagueRevamp = i2;
            this.leagueRankScoreInfo = leagueScoreInfo;
        }
    }

    public static final class SourcePayload {

        @C09CT("battle_info_response")
        public final Object battleInfoResponse;

        @C09CT("linkbattlemsg")
        public final Object linkBattleMsg;

        @C09CT("model_type")
        public final String modelType;

        public SourcePayload() {
            this("message", null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SourcePayload)) {
                return false;
            }
            SourcePayload sourcePayload = (SourcePayload) obj;
            return Intrinsics.LJFF(this.modelType, sourcePayload.modelType) && Intrinsics.LJFF(this.linkBattleMsg, sourcePayload.linkBattleMsg) && Intrinsics.LJFF(this.battleInfoResponse, sourcePayload.battleInfoResponse);
        }

        public final int hashCode() {
            int iHashCode = this.modelType.hashCode() * 31;
            Object obj = this.linkBattleMsg;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.battleInfoResponse;
            return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SourcePayload(modelType=");
            sbLIZ.append(this.modelType);
            sbLIZ.append(", linkBattleMsg=");
            sbLIZ.append(this.linkBattleMsg);
            sbLIZ.append(", battleInfoResponse=");
            sbLIZ.append(this.battleInfoResponse);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SourcePayload(String str, Object obj, Object obj2) {
            this.modelType = str;
            this.linkBattleMsg = obj;
            this.battleInfoResponse = obj2;
        }
    }

    public static final class SpecificGiftInfo {

        @C09CT("gift_id")
        public final long giftId;

        @C09CT("gift_image_urls")
        public final List<String> giftImageUrls;

        @C09CT("gift_name")
        public final String giftName;

        public SpecificGiftInfo() {
            this(0L, null, null, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpecificGiftInfo)) {
                return false;
            }
            SpecificGiftInfo specificGiftInfo = (SpecificGiftInfo) obj;
            return this.giftId == specificGiftInfo.giftId && Intrinsics.LJFF(this.giftName, specificGiftInfo.giftName) && Intrinsics.LJFF(this.giftImageUrls, specificGiftInfo.giftImageUrls);
        }

        public final int hashCode() {
            int iY2 = C786410Ut5.Y2(this.giftId) * 31;
            String str = this.giftName;
            return ((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.giftImageUrls.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SpecificGiftInfo(giftId=");
            sbLIZ.append(this.giftId);
            sbLIZ.append(", giftName=");
            sbLIZ.append(this.giftName);
            sbLIZ.append(", giftImageUrls=");
            sbLIZ.append(this.giftImageUrls);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SpecificGiftInfo(long j, String str, List<String> list) {
            this.giftId = j;
            this.giftName = str;
            this.giftImageUrls = list;
        }

        public SpecificGiftInfo(long j, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public LynxCommonData(Common common, StartAnimationData startAnimationData, TitleBarData titleBarData) {
        this.common = common;
        this.startAnimation = startAnimationData;
        this.titleBar = titleBarData;
    }

    public static final class CoHostLayoutExtra {

        @C09CT("isEnlargeMode")
        public final int isEnlargeMode;

        @C09CT("isZoomLayout")
        public final int isZoomLayout;

        @C09CT("offsetY")
        public final int offsetY;

        @C09CT(Scene.SCENE_SERVICE)
        public final int scene;

        public CoHostLayoutExtra() {
            this(0, 0, 0, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoHostLayoutExtra)) {
                return false;
            }
            CoHostLayoutExtra coHostLayoutExtra = (CoHostLayoutExtra) obj;
            return this.isZoomLayout == coHostLayoutExtra.isZoomLayout && this.offsetY == coHostLayoutExtra.offsetY && this.scene == coHostLayoutExtra.scene && this.isEnlargeMode == coHostLayoutExtra.isEnlargeMode;
        }

        public final int hashCode() {
            return (((((this.isZoomLayout * 31) + this.offsetY) * 31) + this.scene) * 31) + this.isEnlargeMode;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CoHostLayoutExtra(isZoomLayout=");
            sbLIZ.append(this.isZoomLayout);
            sbLIZ.append(", offsetY=");
            sbLIZ.append(this.offsetY);
            sbLIZ.append(", scene=");
            sbLIZ.append(this.scene);
            sbLIZ.append(", isEnlargeMode=");
            sbLIZ.append(this.isEnlargeMode);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CoHostLayoutExtra(int i, int i2, int i3, int i4) {
            this.isZoomLayout = i;
            this.offsetY = i2;
            this.scene = i3;
            this.isEnlargeMode = i4;
        }
    }

    public static final class LayoutFullInfo {

        @C09CT("layoutContainerView")
        public final LayoutContainerView layoutContainerView;

        @C09CT("layoutID")
        public final String layoutId;

        @C09CT("layoutKey")
        public final String layoutKey;

        @C09CT("windows")
        public final List<LayoutWindow> windows;

        public LayoutFullInfo() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutFullInfo)) {
                return false;
            }
            LayoutFullInfo layoutFullInfo = (LayoutFullInfo) obj;
            return Intrinsics.LJFF(this.layoutKey, layoutFullInfo.layoutKey) && Intrinsics.LJFF(this.layoutId, layoutFullInfo.layoutId) && Intrinsics.LJFF(this.layoutContainerView, layoutFullInfo.layoutContainerView) && Intrinsics.LJFF(this.windows, layoutFullInfo.windows);
        }

        public final int hashCode() {
            return (((((this.layoutKey.hashCode() * 31) + this.layoutId.hashCode()) * 31) + this.layoutContainerView.hashCode()) * 31) + this.windows.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LayoutFullInfo(layoutKey=");
            sbLIZ.append(this.layoutKey);
            sbLIZ.append(", layoutId=");
            sbLIZ.append(this.layoutId);
            sbLIZ.append(", layoutContainerView=");
            sbLIZ.append(this.layoutContainerView);
            sbLIZ.append(", windows=");
            sbLIZ.append(this.windows);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public LayoutFullInfo(String str, String str2, LayoutContainerView layoutContainerView, List<LayoutWindow> list) {
            this.layoutKey = str;
            this.layoutId = str2;
            this.layoutContainerView = layoutContainerView;
            this.windows = list;
        }

        public LayoutFullInfo(String str, String str2, LayoutContainerView layoutContainerView, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new LayoutContainerView(0.0f, 0.0f, 0.0f, 0.0f) : layoutContainerView, (i & 8) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final class StartAnimationData {

        @C09CT("enable")
        public final int enable;

        @C09CT("match_opening_animation_config")
        public final MatchOpeningAnimationConfig matchOpeningAnimationConfig;

        @C09CT("match_theme")
        public final int matchTheme;

        @C09CT("should_skip_start_animation")
        public final int shouldSkipStartAnimation;

        public StartAnimationData() {
            this(0, null, 0, 1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartAnimationData)) {
                return false;
            }
            StartAnimationData startAnimationData = (StartAnimationData) obj;
            return this.shouldSkipStartAnimation == startAnimationData.shouldSkipStartAnimation && Intrinsics.LJFF(this.matchOpeningAnimationConfig, startAnimationData.matchOpeningAnimationConfig) && this.matchTheme == startAnimationData.matchTheme && this.enable == startAnimationData.enable;
        }

        public final int hashCode() {
            int i = this.shouldSkipStartAnimation * 31;
            MatchOpeningAnimationConfig matchOpeningAnimationConfig = this.matchOpeningAnimationConfig;
            return ((((i + (matchOpeningAnimationConfig == null ? 0 : matchOpeningAnimationConfig.hashCode())) * 31) + this.matchTheme) * 31) + this.enable;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StartAnimationData(shouldSkipStartAnimation=");
            sbLIZ.append(this.shouldSkipStartAnimation);
            sbLIZ.append(", matchOpeningAnimationConfig=");
            sbLIZ.append(this.matchOpeningAnimationConfig);
            sbLIZ.append(", matchTheme=");
            sbLIZ.append(this.matchTheme);
            sbLIZ.append(", enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public StartAnimationData(int i, MatchOpeningAnimationConfig matchOpeningAnimationConfig, int i2, int i3) {
            this.shouldSkipStartAnimation = i;
            this.matchOpeningAnimationConfig = matchOpeningAnimationConfig;
            this.matchTheme = i2;
            this.enable = i3;
        }
    }

    public static final class GeneralInfo {

        @C09CT("cohost_info")
        public final CoHostInfo cohostInfo;

        @C09CT("combo_info")
        public final Map<String, Long> comboInfo;

        @C09CT("linked_user_list")
        public final List<LinkedUser> linkedUserList;

        @C09CT("match_end_timestamp")
        public final long matchEndTimestamp;

        @C09CT("match_gameplay_option")
        public final int matchGameplayOption;

        @C09CT("match_identify_scene")
        public final int matchIdentifyScene;

        @C09CT("match_identify_start_time")
        public final long matchIdentifyStartTime;

        @C09CT("match_start_source")
        public final String matchStartSource;

        @C09CT("match_status")
        public final EnumC976700bWW matchStatus;

        @C09CT("match_type")
        public final int matchType;

        @C09CT("need_user_switch_position")
        public final int needUserSwitchPosition;

        @C09CT("stream_container_frame")
        public final StreamContainerFrame streamContainerFrame;

        @C09CT("team_formation")
        public final Map<String, List<String>> teamFormation;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeneralInfo)) {
                return false;
            }
            GeneralInfo generalInfo = (GeneralInfo) obj;
            return this.matchStatus == generalInfo.matchStatus && this.matchType == generalInfo.matchType && Intrinsics.LJFF(this.cohostInfo, generalInfo.cohostInfo) && Intrinsics.LJFF(this.comboInfo, generalInfo.comboInfo) && Intrinsics.LJFF(this.teamFormation, generalInfo.teamFormation) && this.matchIdentifyStartTime == generalInfo.matchIdentifyStartTime && this.matchEndTimestamp == generalInfo.matchEndTimestamp && this.matchIdentifyScene == generalInfo.matchIdentifyScene && Intrinsics.LJFF(this.matchStartSource, generalInfo.matchStartSource) && this.needUserSwitchPosition == generalInfo.needUserSwitchPosition && this.matchGameplayOption == generalInfo.matchGameplayOption && Intrinsics.LJFF(this.linkedUserList, generalInfo.linkedUserList) && Intrinsics.LJFF(this.streamContainerFrame, generalInfo.streamContainerFrame);
        }

        public final int hashCode() {
            int iHashCode = ((this.matchStatus.hashCode() * 31) + this.matchType) * 31;
            CoHostInfo coHostInfo = this.cohostInfo;
            int iHashCode2 = (iHashCode + (coHostInfo == null ? 0 : coHostInfo.hashCode())) * 31;
            Map<String, Long> map = this.comboInfo;
            int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, List<String>> map2 = this.teamFormation;
            return ((((((((((((((((iHashCode3 + (map2 != null ? map2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.matchIdentifyStartTime)) * 31) + C786410Ut5.Y2(this.matchEndTimestamp)) * 31) + this.matchIdentifyScene) * 31) + this.matchStartSource.hashCode()) * 31) + this.needUserSwitchPosition) * 31) + this.matchGameplayOption) * 31) + this.linkedUserList.hashCode()) * 31) + this.streamContainerFrame.hashCode();
        }

        public final String toString() {
            return "GeneralInfo(matchStatus=" + this.matchStatus + ", matchType=" + this.matchType + ", cohostInfo=" + this.cohostInfo + ", comboInfo=" + this.comboInfo + ", teamFormation=" + this.teamFormation + ", matchIdentifyStartTime=" + this.matchIdentifyStartTime + ", matchEndTimestamp=" + this.matchEndTimestamp + ", matchIdentifyScene=" + this.matchIdentifyScene + ", matchStartSource=" + this.matchStartSource + ", needUserSwitchPosition=" + this.needUserSwitchPosition + ", matchGameplayOption=" + this.matchGameplayOption + ", linkedUserList=" + this.linkedUserList + ", streamContainerFrame=" + this.streamContainerFrame + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public GeneralInfo(EnumC976700bWW enumC976700bWW, int i, CoHostInfo coHostInfo, Map<String, Long> map, Map<String, ? extends List<String>> map2, long j, long j2, int i2, String str, int i3, int i4, List<LinkedUser> list, StreamContainerFrame streamContainerFrame) {
            this.matchStatus = enumC976700bWW;
            this.matchType = i;
            this.cohostInfo = coHostInfo;
            this.comboInfo = map;
            this.teamFormation = map2;
            this.matchIdentifyStartTime = j;
            this.matchEndTimestamp = j2;
            this.matchIdentifyScene = i2;
            this.matchStartSource = str;
            this.needUserSwitchPosition = i3;
            this.matchGameplayOption = i4;
            this.linkedUserList = list;
            this.streamContainerFrame = streamContainerFrame;
        }

        public GeneralInfo(EnumC976700bWW enumC976700bWW, int i, CoHostInfo coHostInfo, Map map, Map map2, long j, long j2, int i2, String str, int i3, int i4, List list, StreamContainerFrame streamContainerFrame, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? EnumC976700bWW.NONE : enumC976700bWW, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? null : coHostInfo, (i5 & 8) != 0 ? null : map, (i5 & 16) == 0 ? map2 : null, (i5 & 32) != 0 ? 0L : j, (i5 & 64) != 0 ? 0L : j2, (i5 & 128) != 0 ? 0 : i2, (i5 & 256) != 0 ? "normal" : str, (i5 & 512) != 0 ? 0 : i3, (i5 & 1024) != 0 ? 0 : i4, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list, streamContainerFrame);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class LinkedUser {

        @C09CT("audioMute")
        public final int audioMute;

        @C09CT("avatar_url_list")
        public final List<String> avatarUrlList;

        @C09CT("badge_info")
        public final GiftGalleryBadgeInfo badgeInfo;

        @C09CT("badgeInfo")
        public final GiftGalleryBadgeInfo badgeInfoV2;

        @C09CT("followStatus")
        public final long followStatus;

        @C09CT("linkMicId")
        public final String linkMicId;

        @C09CT("linkedTime")
        public final double linkedTime;

        @C09CT("name")
        public final String name;

        @C09CT("rivalUid")
        public final String rivalUid;

        @C09CT("role")
        public final int role;

        @C09CT("sourceType")
        public final int sourceType;

        @C09CT("uid")
        public final String uid;

        @C09CT("user_id")
        public final String userId;

        @C09CT("userType")
        public final int userType;

        @C09CT("videoOn")
        public final int videoOn;

        public LinkedUser() {
            this(null, null, null, null, null, null, 0, 0, null, 0, 0, null, 0, 0.0d, 0L, 32767, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkedUser)) {
                return false;
            }
            LinkedUser linkedUser = (LinkedUser) obj;
            return Intrinsics.LJFF(this.userId, linkedUser.userId) && Intrinsics.LJFF(this.name, linkedUser.name) && Intrinsics.LJFF(this.avatarUrlList, linkedUser.avatarUrlList) && Intrinsics.LJFF(this.badgeInfo, linkedUser.badgeInfo) && Intrinsics.LJFF(this.uid, linkedUser.uid) && Intrinsics.LJFF(this.badgeInfoV2, linkedUser.badgeInfoV2) && this.audioMute == linkedUser.audioMute && this.videoOn == linkedUser.videoOn && Intrinsics.LJFF(this.rivalUid, linkedUser.rivalUid) && this.role == linkedUser.role && this.userType == linkedUser.userType && Intrinsics.LJFF(this.linkMicId, linkedUser.linkMicId) && this.sourceType == linkedUser.sourceType && Double.compare(this.linkedTime, linkedUser.linkedTime) == 0 && this.followStatus == linkedUser.followStatus;
        }

        public final int hashCode() {
            int iHashCode = ((((this.userId.hashCode() * 31) + this.name.hashCode()) * 31) + this.avatarUrlList.hashCode()) * 31;
            GiftGalleryBadgeInfo giftGalleryBadgeInfo = this.badgeInfo;
            int iHashCode2 = (((iHashCode + (giftGalleryBadgeInfo == null ? 0 : giftGalleryBadgeInfo.hashCode())) * 31) + this.uid.hashCode()) * 31;
            GiftGalleryBadgeInfo giftGalleryBadgeInfo2 = this.badgeInfoV2;
            return ((((((((((((((((((iHashCode2 + (giftGalleryBadgeInfo2 != null ? giftGalleryBadgeInfo2.hashCode() : 0)) * 31) + this.audioMute) * 31) + this.videoOn) * 31) + this.rivalUid.hashCode()) * 31) + this.role) * 31) + this.userType) * 31) + this.linkMicId.hashCode()) * 31) + this.sourceType) * 31) + C786410Ut5.X2(this.linkedTime)) * 31) + C786410Ut5.Y2(this.followStatus);
        }

        public final String toString() {
            return "LinkedUser(userId=" + this.userId + ", name=" + this.name + ", avatarUrlList=" + this.avatarUrlList + ", badgeInfo=" + this.badgeInfo + ", uid=" + this.uid + ", badgeInfoV2=" + this.badgeInfoV2 + ", audioMute=" + this.audioMute + ", videoOn=" + this.videoOn + ", rivalUid=" + this.rivalUid + ", role=" + this.role + ", userType=" + this.userType + ", linkMicId=" + this.linkMicId + ", sourceType=" + this.sourceType + ", linkedTime=" + this.linkedTime + ", followStatus=" + this.followStatus + ')';
        }

        public LinkedUser(String str, String str2, List<String> list, GiftGalleryBadgeInfo giftGalleryBadgeInfo, String str3, GiftGalleryBadgeInfo giftGalleryBadgeInfo2, int i, int i2, String str4, int i3, int i4, String str5, int i5, double d, long j) {
            this.userId = str;
            this.name = str2;
            this.avatarUrlList = list;
            this.badgeInfo = giftGalleryBadgeInfo;
            this.uid = str3;
            this.badgeInfoV2 = giftGalleryBadgeInfo2;
            this.audioMute = i;
            this.videoOn = i2;
            this.rivalUid = str4;
            this.role = i3;
            this.userType = i4;
            this.linkMicId = str5;
            this.sourceType = i5;
            this.linkedTime = d;
            this.followStatus = j;
        }

        public LinkedUser(String str, String str2, List list, GiftGalleryBadgeInfo giftGalleryBadgeInfo, String str3, GiftGalleryBadgeInfo giftGalleryBadgeInfo2, int i, int i2, String str4, int i3, int i4, String str5, int i5, double d, long j, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? C13BV.INSTANCE : list, (i6 & 8) != 0 ? null : giftGalleryBadgeInfo, (i6 & 16) != 0 ? "" : str3, (i6 & 32) == 0 ? giftGalleryBadgeInfo2 : null, (i6 & 64) != 0 ? 0 : i, (i6 & 128) != 0 ? 1 : i2, (i6 & 256) != 0 ? "" : str4, (i6 & 512) != 0 ? 0 : i3, (i6 & 1024) != 0 ? 0 : i4, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str5 : "", (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? i5 : 0, (i6 & 8192) != 0 ? 0.0d : d, (i6 & 16384) != 0 ? 0L : j);
        }
    }
}
