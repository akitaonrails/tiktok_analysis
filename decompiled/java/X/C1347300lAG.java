package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.CommentListModel;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347300lAG {
    public static final /* synthetic */ int LIZ = 0;

    public static CommentContextSource LIZ(Map map) {
        Aweme aweme;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        String str7;
        Boolean bool2;
        Integer num;
        int iIntValue;
        String str8;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Boolean bool3;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        boolean zBooleanValue5;
        boolean zBooleanValue6;
        boolean zBooleanValue7;
        boolean zBooleanValue8;
        boolean zBooleanValue9;
        boolean zBooleanValue10;
        Long l;
        String str9;
        int iIntValue6;
        boolean zBooleanValue11;
        boolean zBooleanValue12;
        String str10;
        boolean zBooleanValue13;
        String str11;
        FypExposedCommentMobParams fypExposedCommentMobParams;
        String str12;
        C2189821An6 c2189821An6;
        String str13;
        String str14;
        String str15;
        int i;
        long jLongValue;
        String str16;
        boolean zBooleanValue14;
        boolean zBooleanValue15;
        boolean zBooleanValue16;
        boolean zBooleanValue17;
        boolean zBooleanValue18;
        boolean zBooleanValue19;
        boolean zBooleanValue20;
        boolean zBooleanValue21;
        boolean zBooleanValue22;
        EnumC1346360l8k enumC1346360l8k;
        boolean zBooleanValue23;
        boolean zBooleanValue24;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        long jLongValue2;
        int iIntValue7;
        float fFloatValue;
        int iIntValue8;
        int iIntValue9;
        boolean zBooleanValue25;
        String str30;
        String str31;
        boolean zBooleanValue26;
        int iIntValue10;
        boolean zBooleanValue27;
        String str32;
        String str33;
        boolean zBooleanValue28;
        int iIntValue11;
        long jLongValue3;
        long jLongValue4;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        String str34;
        String str35;
        Boolean bool7;
        int iIntValue12;
        boolean zBooleanValue29;
        boolean zBooleanValue30;
        String str36;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Integer num2;
        Long l2;
        Long l3;
        Integer num3;
        String str37;
        Boolean bool11;
        Boolean bool12;
        Integer num4;
        Boolean bool13;
        Boolean bool14;
        Integer num5;
        Integer num6;
        Float f;
        Integer num7;
        Long l4;
        Boolean bool15;
        Boolean bool16;
        Boolean bool17;
        Boolean bool18;
        Boolean bool19;
        Boolean bool20;
        Boolean bool21;
        Boolean bool22;
        Boolean bool23;
        Boolean bool24;
        Boolean bool25;
        Boolean bool26;
        Long l5;
        Boolean bool27;
        Boolean bool28;
        Boolean bool29;
        Integer num8;
        Boolean bool30;
        Boolean bool31;
        Boolean bool32;
        Boolean bool33;
        Boolean bool34;
        Boolean bool35;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        Boolean bool36;
        Boolean bool37;
        Boolean bool38;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get("aweme");
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        Object obj2 = linkedHashMap.get("requestId");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        Object obj3 = linkedHashMap.get("enterFrom");
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        } else {
            str2 = null;
        }
        Object obj4 = linkedHashMap.get("videoFrom");
        if (obj4 instanceof String) {
            str3 = (String) obj4;
        } else {
            str3 = null;
        }
        Object obj5 = linkedHashMap.get("enterMethod");
        if (obj5 instanceof String) {
            str4 = (String) obj5;
        } else {
            str4 = null;
        }
        Object obj6 = linkedHashMap.get("fromPage");
        if (obj6 instanceof String) {
            str5 = (String) obj6;
        } else {
            str5 = null;
        }
        Object obj7 = linkedHashMap.get("eventType");
        if (obj7 instanceof String) {
            str6 = (String) obj7;
        } else {
            str6 = null;
        }
        Object obj8 = linkedHashMap.get("isMyProfile");
        if (obj8 instanceof Boolean) {
            bool = (Boolean) obj8;
        } else {
            bool = null;
        }
        Object obj9 = linkedHashMap.get("tabName");
        if (obj9 instanceof String) {
            str7 = (String) obj9;
        } else {
            str7 = null;
        }
        Object obj10 = linkedHashMap.get("isSpiltMode");
        if (obj10 instanceof Boolean) {
            bool2 = (Boolean) obj10;
        } else {
            bool2 = null;
        }
        Object obj11 = linkedHashMap.get("pageType");
        if (obj11 instanceof Integer) {
            num = (Integer) obj11;
        } else {
            num = null;
        }
        boolean zBooleanValue31 = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Object obj12 = linkedHashMap.get("accountType");
        if (obj12 instanceof String) {
            str8 = (String) obj12;
        } else {
            str8 = null;
        }
        Object obj13 = linkedHashMap.get("commentClose");
        if ((obj13 instanceof Boolean) && (bool38 = (Boolean) obj13) != null) {
            zBooleanValue = bool38.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Object obj14 = linkedHashMap.get("commentLimited");
        if ((obj14 instanceof Boolean) && (bool37 = (Boolean) obj14) != null) {
            zBooleanValue2 = bool37.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        Object obj15 = linkedHashMap.get("enableComment");
        if (obj15 instanceof Boolean) {
            bool3 = (Boolean) obj15;
        } else {
            bool3 = null;
        }
        boolean zBooleanValue32 = true;
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = true;
        }
        Object obj16 = linkedHashMap.get("isLandscapeMode");
        if ((obj16 instanceof Boolean) && (bool36 = (Boolean) obj16) != null) {
            zBooleanValue4 = bool36.booleanValue();
        } else {
            zBooleanValue4 = false;
        }
        Object obj17 = linkedHashMap.get("commentNotice");
        if ((obj17 instanceof Integer) && (num12 = (Integer) obj17) != null) {
            iIntValue2 = num12.intValue();
        } else {
            iIntValue2 = 0;
        }
        Object obj18 = linkedHashMap.get("inboxNoticeType");
        if ((obj18 instanceof Integer) && (num11 = (Integer) obj18) != null) {
            iIntValue3 = num11.intValue();
        } else {
            iIntValue3 = -1;
        }
        Object obj19 = linkedHashMap.get("inboxNoticeSubType");
        if ((obj19 instanceof Integer) && (num10 = (Integer) obj19) != null) {
            iIntValue4 = num10.intValue();
        } else {
            iIntValue4 = -1;
        }
        Object obj20 = linkedHashMap.get("innerPushType");
        if ((obj20 instanceof Integer) && (num9 = (Integer) obj20) != null) {
            iIntValue5 = num9.intValue();
        } else {
            iIntValue5 = -1;
        }
        Object obj21 = linkedHashMap.get("forceHideBatchManagementView");
        if ((obj21 instanceof Boolean) && (bool35 = (Boolean) obj21) != null) {
            zBooleanValue5 = bool35.booleanValue();
        } else {
            zBooleanValue5 = false;
        }
        Object obj22 = linkedHashMap.get("forceOpenKeyboard");
        if ((obj22 instanceof Boolean) && (bool34 = (Boolean) obj22) != null) {
            zBooleanValue6 = bool34.booleanValue();
        } else {
            zBooleanValue6 = false;
        }
        Object obj23 = linkedHashMap.get("forceHideCommentDesc");
        if ((obj23 instanceof Boolean) && (bool33 = (Boolean) obj23) != null) {
            zBooleanValue7 = bool33.booleanValue();
        } else {
            zBooleanValue7 = false;
        }
        Object obj24 = linkedHashMap.get("shouldShowVideoDesc");
        if ((obj24 instanceof Boolean) && (bool32 = (Boolean) obj24) != null) {
            zBooleanValue8 = bool32.booleanValue();
        } else {
            zBooleanValue8 = false;
        }
        Object obj25 = linkedHashMap.get("forceHideDonation");
        if ((obj25 instanceof Boolean) && (bool31 = (Boolean) obj25) != null) {
            zBooleanValue9 = bool31.booleanValue();
        } else {
            zBooleanValue9 = false;
        }
        Object obj26 = linkedHashMap.get("forceHidePoi");
        if ((obj26 instanceof Boolean) && (bool30 = (Boolean) obj26) != null) {
            zBooleanValue10 = bool30.booleanValue();
        } else {
            zBooleanValue10 = false;
        }
        Object obj27 = linkedHashMap.get("sessionId");
        if (obj27 instanceof Long) {
            l = (Long) obj27;
        } else {
            l = null;
        }
        Object obj28 = linkedHashMap.get("splitContainerTag");
        if (obj28 instanceof String) {
            str9 = (String) obj28;
        } else {
            str9 = null;
        }
        Object obj29 = linkedHashMap.get("locatePageType");
        if ((obj29 instanceof Integer) && (num8 = (Integer) obj29) != null) {
            iIntValue6 = num8.intValue();
        } else {
            iIntValue6 = 1;
        }
        Object obj30 = linkedHashMap.get("smoothScrollLocate");
        if ((obj30 instanceof Boolean) && (bool29 = (Boolean) obj30) != null) {
            zBooleanValue11 = bool29.booleanValue();
        } else {
            zBooleanValue11 = true;
        }
        Object obj31 = linkedHashMap.get("isNoPermissionVideoFromCommentHistory");
        if ((obj31 instanceof Boolean) && (bool28 = (Boolean) obj31) != null) {
            zBooleanValue12 = bool28.booleanValue();
        } else {
            zBooleanValue12 = false;
        }
        Object obj32 = linkedHashMap.get("showCommentPostCid");
        if (obj32 instanceof String) {
            str10 = (String) obj32;
        } else {
            str10 = null;
        }
        String str38 = "";
        if (str10 == null) {
            str10 = "";
        }
        Object obj33 = linkedHashMap.get("isPreCreate");
        if ((obj33 instanceof Boolean) && (bool27 = (Boolean) obj33) != null) {
            zBooleanValue13 = bool27.booleanValue();
        } else {
            zBooleanValue13 = false;
        }
        Object obj34 = linkedHashMap.get("channelNameForServer");
        if (!(obj34 instanceof String) || (str11 = (String) obj34) == null) {
            str11 = "";
        }
        Object obj35 = linkedHashMap.get("fypExposedCommentMobParams");
        if (obj35 instanceof FypExposedCommentMobParams) {
            fypExposedCommentMobParams = (FypExposedCommentMobParams) obj35;
        } else {
            fypExposedCommentMobParams = null;
        }
        Object obj36 = linkedHashMap.get("gdLabel");
        if (obj36 instanceof String) {
            str12 = (String) obj36;
        } else {
            str12 = null;
        }
        Object obj37 = linkedHashMap.get("feedParam");
        if (obj37 instanceof C2189821An6) {
            c2189821An6 = (C2189821An6) obj37;
        } else {
            c2189821An6 = null;
        }
        Object obj38 = linkedHashMap.get("noticeId");
        if (obj38 instanceof String) {
            str13 = (String) obj38;
        } else {
            str13 = null;
        }
        Object obj39 = linkedHashMap.get("friendsV3TrackScene");
        if (!(obj39 instanceof String) || (str14 = (String) obj39) == null) {
            str14 = "";
        }
        CommentCommonModel commentCommonModel = new CommentCommonModel(aweme, str, str2, str3, str4, null, str5, false, str6, bool, str7, bool2, iIntValue, str8, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, iIntValue2, iIntValue3, iIntValue4, iIntValue5, zBooleanValue5, zBooleanValue6, false, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, l, str9, iIntValue6, zBooleanValue11, zBooleanValue12, null, null, str10, zBooleanValue13, false, str11, fypExposedCommentMobParams, str12, c2189821An6, str13, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, false, false, str14, null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false);
        CommentKeyboardModel commentKeyboardModel = new CommentKeyboardModel();
        Object obj40 = linkedHashMap.get("clickFrom");
        if (obj40 instanceof String) {
            str15 = (String) obj40;
        } else {
            str15 = null;
        }
        commentKeyboardModel.setClickFrom(str15);
        Object obj41 = linkedHashMap.get("fromLocation");
        if (!(obj41 instanceof String) || obj41 == null) {
            obj41 = "";
        }
        if (Intrinsics.LJFF(obj41, "comment_button")) {
            i = 0;
        } else if (Intrinsics.LJFF(obj41, "input_box")) {
            i = 1;
        } else {
            i = -1;
        }
        commentKeyboardModel.setFromFakeEditText(i);
        Object obj42 = linkedHashMap.get("keyBoardShowTime");
        if ((obj42 instanceof Long) && (l5 = (Long) obj42) != null) {
            jLongValue = l5.longValue();
        } else {
            jLongValue = 0;
        }
        commentKeyboardModel.setKeyBoardShowTime(jLongValue);
        Object obj43 = linkedHashMap.get("enableGiftScene");
        if ((obj43 instanceof Boolean) && (bool26 = (Boolean) obj43) != null) {
            zBooleanValue32 = bool26.booleanValue();
        }
        commentKeyboardModel.setEnableGiftScene(zBooleanValue32);
        Object obj44 = linkedHashMap.get("giftSendEnterMethod");
        if (!(obj44 instanceof String) || (str16 = (String) obj44) == null) {
            str16 = "";
        }
        commentKeyboardModel.setGiftSendEnterMethod(str16);
        Object obj45 = linkedHashMap.get("forceDisableExposedEmoji");
        if ((obj45 instanceof Boolean) && (bool25 = (Boolean) obj45) != null) {
            zBooleanValue14 = bool25.booleanValue();
        } else {
            zBooleanValue14 = false;
        }
        commentKeyboardModel.setForceDisableExposedEmoji(zBooleanValue14);
        Object obj46 = linkedHashMap.get("forceDisableMention");
        if ((obj46 instanceof Boolean) && (bool24 = (Boolean) obj46) != null) {
            zBooleanValue15 = bool24.booleanValue();
        } else {
            zBooleanValue15 = false;
        }
        commentKeyboardModel.setForceDisableMention(zBooleanValue15);
        Object obj47 = linkedHashMap.get("isLandscapeMode");
        if ((obj47 instanceof Boolean) && (bool23 = (Boolean) obj47) != null) {
            zBooleanValue16 = bool23.booleanValue();
        } else {
            zBooleanValue16 = false;
        }
        commentKeyboardModel.setLandscapeMode(zBooleanValue16);
        Object obj48 = linkedHashMap.get("forceDisableCommentPhoto");
        if ((obj48 instanceof Boolean) && (bool22 = (Boolean) obj48) != null) {
            zBooleanValue17 = bool22.booleanValue();
        } else {
            zBooleanValue17 = false;
        }
        commentKeyboardModel.setForceDisableCommentPhoto(zBooleanValue17);
        Object obj49 = linkedHashMap.get("forceDisableReplyWithVideo");
        if ((obj49 instanceof Boolean) && (bool21 = (Boolean) obj49) != null) {
            zBooleanValue18 = bool21.booleanValue();
        } else {
            zBooleanValue18 = false;
        }
        commentKeyboardModel.setForceDisableReplyWithVideo(zBooleanValue18);
        Object obj50 = linkedHashMap.get("hideExposedEmojiInNonePanel");
        if ((obj50 instanceof Boolean) && (bool20 = (Boolean) obj50) != null) {
            zBooleanValue19 = bool20.booleanValue();
        } else {
            zBooleanValue19 = false;
        }
        commentKeyboardModel.setHideExposedEmojiInNonePanel(zBooleanValue19);
        Object obj51 = linkedHashMap.get("hideGiftSelectInNonePanel");
        if ((obj51 instanceof Boolean) && (bool19 = (Boolean) obj51) != null) {
            zBooleanValue20 = bool19.booleanValue();
        } else {
            zBooleanValue20 = false;
        }
        commentKeyboardModel.setHideGiftSelectInNonePanel(zBooleanValue20);
        Object obj52 = linkedHashMap.get("forceHideInnerGiftPanel");
        if ((obj52 instanceof Boolean) && (bool18 = (Boolean) obj52) != null) {
            zBooleanValue21 = bool18.booleanValue();
        } else {
            zBooleanValue21 = false;
        }
        commentKeyboardModel.setForceHideInnerGiftPanel(zBooleanValue21);
        Object obj53 = linkedHashMap.get("shieldKeyboardOpen");
        if ((obj53 instanceof Boolean) && (bool17 = (Boolean) obj53) != null) {
            zBooleanValue22 = bool17.booleanValue();
        } else {
            zBooleanValue22 = false;
        }
        commentKeyboardModel.setShieldKeyboardOpen(zBooleanValue22);
        Object obj54 = linkedHashMap.get("inputServiceType");
        if (obj54 instanceof EnumC1346360l8k) {
            enumC1346360l8k = (EnumC1346360l8k) obj54;
        } else {
            enumC1346360l8k = null;
        }
        commentKeyboardModel.setInputServiceType(enumC1346360l8k);
        Object obj55 = linkedHashMap.get("commentPostChecked");
        if ((obj55 instanceof Boolean) && (bool16 = (Boolean) obj55) != null) {
            zBooleanValue23 = bool16.booleanValue();
        } else {
            zBooleanValue23 = false;
        }
        commentKeyboardModel.setCommentPostChecked(zBooleanValue23);
        Object obj56 = linkedHashMap.get("isFromGuideReplyUser");
        if ((obj56 instanceof Boolean) && (bool15 = (Boolean) obj56) != null) {
            zBooleanValue24 = bool15.booleanValue();
        } else {
            zBooleanValue24 = false;
        }
        commentKeyboardModel.setFromGuideReplyUser(zBooleanValue24);
        Object obj57 = linkedHashMap.get("quickCommentActionType");
        if (obj57 instanceof String) {
            str17 = (String) obj57;
        } else {
            str17 = null;
        }
        commentKeyboardModel.setQuickCommentActionType(str17);
        Object obj58 = linkedHashMap.get("requestId");
        if (!(obj58 instanceof String) || (str18 = (String) obj58) == null) {
            str18 = "";
        }
        Object obj59 = linkedHashMap.get("fromPage");
        if (!(obj59 instanceof String) || (str19 = (String) obj59) == null) {
            str19 = "";
        }
        Object obj60 = linkedHashMap.get("previousPage");
        if (!(obj60 instanceof String) || (str20 = (String) obj60) == null) {
            str20 = "";
        }
        Object obj61 = linkedHashMap.get("videoFrom");
        if (!(obj61 instanceof String) || (str21 = (String) obj61) == null) {
            str21 = "";
        }
        Object obj62 = linkedHashMap.get("playListType");
        if (!(obj62 instanceof String) || (str22 = (String) obj62) == null) {
            str22 = "";
        }
        Object obj63 = linkedHashMap.get("playListIdKey");
        if (!(obj63 instanceof String) || (str23 = (String) obj63) == null) {
            str23 = "";
        }
        Object obj64 = linkedHashMap.get("playListId");
        if (!(obj64 instanceof String) || (str24 = (String) obj64) == null) {
            str24 = "";
        }
        Object obj65 = linkedHashMap.get("searchId");
        if (!(obj65 instanceof String) || (str25 = (String) obj65) == null) {
            str25 = "";
        }
        Object obj66 = linkedHashMap.get("searchResultId");
        if (!(obj66 instanceof String) || (str26 = (String) obj66) == null) {
            str26 = "";
        }
        Object obj67 = linkedHashMap.get("fromGroupId");
        if (!(obj67 instanceof String) || (str27 = (String) obj67) == null) {
            str27 = "";
        }
        Object obj68 = linkedHashMap.get("tagId");
        if (!(obj68 instanceof String) || (str28 = (String) obj68) == null) {
            str28 = "";
        }
        Object obj69 = linkedHashMap.get("parentTagId");
        if (!(obj69 instanceof String) || (str29 = (String) obj69) == null) {
            str29 = "";
        }
        Object obj70 = linkedHashMap.get("videoDuration");
        if ((obj70 instanceof Long) && (l4 = (Long) obj70) != null) {
            jLongValue2 = l4.longValue();
        } else {
            jLongValue2 = 0;
        }
        Object obj71 = linkedHashMap.get("playLoops");
        if ((obj71 instanceof Integer) && (num7 = (Integer) obj71) != null) {
            iIntValue7 = num7.intValue();
        } else {
            iIntValue7 = 0;
        }
        Object obj72 = linkedHashMap.get("playPct");
        if ((obj72 instanceof Float) && (f = (Float) obj72) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Object obj73 = linkedHashMap.get("hasTitle");
        if ((obj73 instanceof Integer) && (num6 = (Integer) obj73) != null) {
            iIntValue8 = num6.intValue();
        } else {
            iIntValue8 = 0;
        }
        Object obj74 = linkedHashMap.get("isEnterGraphicDetail");
        if ((obj74 instanceof Integer) && (num5 = (Integer) obj74) != null) {
            iIntValue9 = num5.intValue();
        } else {
            iIntValue9 = 0;
        }
        Object obj75 = linkedHashMap.get("isFromPostMode");
        if ((obj75 instanceof Boolean) && (bool14 = (Boolean) obj75) != null) {
            zBooleanValue25 = bool14.booleanValue();
        } else {
            zBooleanValue25 = false;
        }
        Object obj76 = linkedHashMap.get("creationId");
        if (!(obj76 instanceof String) || (str30 = (String) obj76) == null) {
            str30 = "";
        }
        Object obj77 = linkedHashMap.get("newsId");
        if (!(obj77 instanceof String) || (str31 = (String) obj77) == null) {
            str31 = "";
        }
        Object obj78 = linkedHashMap.get("isHotPlayer");
        if ((obj78 instanceof Boolean) && (bool13 = (Boolean) obj78) != null) {
            zBooleanValue26 = bool13.booleanValue();
        } else {
            zBooleanValue26 = false;
        }
        Object obj79 = linkedHashMap.get("isLongItem");
        if ((obj79 instanceof Integer) && (num4 = (Integer) obj79) != null) {
            iIntValue10 = num4.intValue();
        } else {
            iIntValue10 = 0;
        }
        Object obj80 = linkedHashMap.get("enterFullScreen");
        if ((obj80 instanceof Boolean) && (bool12 = (Boolean) obj80) != null) {
            zBooleanValue27 = bool12.booleanValue();
        } else {
            zBooleanValue27 = false;
        }
        Object obj81 = linkedHashMap.get("commentEnterMethod");
        if (!(obj81 instanceof String) || (str32 = (String) obj81) == null) {
            str32 = "";
        }
        Object obj82 = linkedHashMap.get("lastGroupId");
        if (!(obj82 instanceof String) || (str33 = (String) obj82) == null) {
            str33 = "";
        }
        Object obj83 = linkedHashMap.get("translationClicked");
        if ((obj83 instanceof Boolean) && (bool11 = (Boolean) obj83) != null) {
            zBooleanValue28 = bool11.booleanValue();
        } else {
            zBooleanValue28 = false;
        }
        Object obj84 = linkedHashMap.get("chatType");
        if ((obj84 instanceof String) && (str37 = (String) obj84) != null) {
            str38 = str37;
        }
        Object obj85 = linkedHashMap.get("splitPercent");
        if ((obj85 instanceof Integer) && (num3 = (Integer) obj85) != null) {
            iIntValue11 = num3.intValue();
        } else {
            iIntValue11 = 5;
        }
        CommentEventModel commentEventModel = new CommentEventModel(str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, jLongValue2, iIntValue7, fFloatValue, iIntValue8, iIntValue9, zBooleanValue25, str30, str31, zBooleanValue26, iIntValue10, zBooleanValue27, "", str32, str33, zBooleanValue28, str38, Integer.valueOf(iIntValue11), "", 0L, "", "", "", "", "", 0, null, null, new ArrayList());
        CommentListModel commentListModel = new CommentListModel();
        Object obj86 = linkedHashMap.get("commentCount");
        if ((obj86 instanceof Long) && (l3 = (Long) obj86) != null) {
            jLongValue3 = l3.longValue();
        } else {
            jLongValue3 = 0;
        }
        commentListModel.setCommentCount(jLongValue3);
        Object obj87 = linkedHashMap.get("outterCommentCount");
        if ((obj87 instanceof Long) && (l2 = (Long) obj87) != null) {
            jLongValue4 = l2.longValue();
        } else {
            jLongValue4 = 0;
        }
        commentListModel.setOutterCommentCount(jLongValue4);
        Object obj88 = linkedHashMap.get("isCommentBanned");
        if (obj88 instanceof Boolean) {
            bool4 = (Boolean) obj88;
        } else {
            bool4 = null;
        }
        commentListModel.setCommentBanned(bool4);
        Object obj89 = linkedHashMap.get("isCommentEnable");
        if (obj89 instanceof Boolean) {
            bool5 = (Boolean) obj89;
        } else {
            bool5 = null;
        }
        commentListModel.setCommentEnable(bool5);
        Object obj90 = linkedHashMap.get("isCommentClose");
        if (obj90 instanceof Boolean) {
            bool6 = (Boolean) obj90;
        } else {
            bool6 = null;
        }
        commentListModel.setCommentClose(bool6);
        Object obj91 = linkedHashMap.get("insertCid");
        if (obj91 instanceof String) {
            str34 = (String) obj91;
        } else {
            str34 = null;
        }
        commentListModel.setInsertCid(str34);
        Object obj92 = linkedHashMap.get("highlightCids");
        if (obj92 instanceof String) {
            str35 = (String) obj92;
        } else {
            str35 = null;
        }
        commentListModel.setHighlightCids(str35);
        Object obj93 = linkedHashMap.get("commentAdAreaSwitch");
        if (obj93 instanceof Boolean) {
            bool7 = (Boolean) obj93;
        } else {
            bool7 = null;
        }
        commentListModel.setCommentAdAreaSwitch(bool7);
        Object obj94 = linkedHashMap.get("securityGuide");
        if ((obj94 instanceof Integer) && (num2 = (Integer) obj94) != null) {
            iIntValue12 = num2.intValue();
        } else {
            iIntValue12 = 0;
        }
        commentListModel.setSecurityGuide(iIntValue12);
        Object obj95 = linkedHashMap.get("shouldShowVideoDesc");
        if ((obj95 instanceof Boolean) && (bool10 = (Boolean) obj95) != null) {
            zBooleanValue29 = bool10.booleanValue();
        } else {
            zBooleanValue29 = false;
        }
        commentListModel.setShouldShowVideoDesc(zBooleanValue29);
        Object obj96 = linkedHashMap.get("showReplyWithInsert");
        if ((obj96 instanceof Boolean) && (bool9 = (Boolean) obj96) != null) {
            zBooleanValue30 = bool9.booleanValue();
        } else {
            zBooleanValue30 = false;
        }
        commentListModel.setShowReplyWithInsert(zBooleanValue30);
        Object obj97 = linkedHashMap.get("sessionId");
        if (obj97 instanceof String) {
            str36 = (String) obj97;
        } else {
            str36 = null;
        }
        commentListModel.setSessionId(str36);
        Object obj98 = linkedHashMap.get("exposedCommentUseCacheData");
        if ((obj98 instanceof Boolean) && (bool8 = (Boolean) obj98) != null) {
            zBooleanValue31 = bool8.booleanValue();
        }
        commentListModel.setExposedCommentUseCacheData(zBooleanValue31);
        CommentContextSource commentContextSource = new CommentContextSource();
        commentContextSource.setCommonModel(commentCommonModel);
        commentContextSource.setKeyboardModel(commentKeyboardModel);
        commentContextSource.setEventModel(commentEventModel);
        commentContextSource.setListModel(commentListModel);
        return commentContextSource;
    }

    public static final void LIZIZ(int i, String str, Aweme aweme, String str2, String str3, User user, C1347310lAH c1347310lAH) {
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enterFrom", str2);
        linkedHashMap.put("aweme", aweme);
        linkedHashMap.put("hasTitle", Integer.valueOf(C735370Ssx.LIZ(aweme)));
        linkedHashMap.put("sessionId", c1347310lAH.LJIILIIL);
        CommentContextSource commentContextSourceLIZ = LIZ(linkedHashMap);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        int i2 = i - 1;
        if (c1347310lAH.LJIIL) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("is_include_quick_mention", str4));
        String str5 = c1347310lAH.LIZIZ;
        c1350920lG6.getClass();
        C1350920lG6.LJJJLL(str, str3, user, i2, commentContextSourceLIZ, mapLIZJ, str5);
    }

    public static final void LJ(Aweme aweme, Comment comment, String str, String str2, String str3, boolean z, String str4, Map map, C1347310lAH c1347310lAH) {
        Integer numValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aweme", aweme);
        linkedHashMap.put("enterFrom", str);
        linkedHashMap.put("enterMethod", str2);
        linkedHashMap.put("isMyProfile", Boolean.valueOf(z));
        linkedHashMap.put("hasTitle", Integer.valueOf(C735370Ssx.LIZ(aweme)));
        linkedHashMap.put("fromPage", ((LinkedHashMap) map).get("from_page"));
        Boolean bool = Boolean.FALSE;
        linkedHashMap.put("isLandscapeMode", bool);
        linkedHashMap.put("tabName", ((LinkedHashMap) map).get("tab_name"));
        linkedHashMap.put("newsId", "");
        linkedHashMap.put("accountType", ((LinkedHashMap) map).get("account_type"));
        CommentContextSource commentContextSourceLIZ = LIZ(linkedHashMap);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        if (c1347310lAH != null) {
            numValueOf = Integer.valueOf(c1347310lAH.LIZLLL);
        } else {
            numValueOf = null;
        }
        c1350920lG6.getClass();
        C1350920lG6.LJZL(comment, bool, str4, str3, numValueOf, commentContextSourceLIZ);
    }

    public static final void LIZJ(String str, String str2, Aweme aweme, boolean z, boolean z2, String str3, String str4, String str5, Map map, String str6, String str7, String str8, String str9, Comment comment, FypExposedCommentMobParams fypExposedCommentMobParams, String str10, String str11, String str12, boolean z3) {
        Object obj;
        Integer num;
        Object obj2;
        String noticeIdForComment;
        String str13 = str12;
        String str14 = str10;
        if (comment != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enterFrom", str);
            linkedHashMap.put("aweme", aweme);
            linkedHashMap.put("previousPage", str7);
            linkedHashMap.put("hasTitle", Integer.valueOf(C735370Ssx.LIZ(aweme)));
            linkedHashMap.put("fromPage", str8);
            String noticeTypeForComment = null;
            if (map != null) {
                obj = map.get("is_landscape_screen");
            } else {
                obj = null;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            boolean z4 = false;
            if (num != null && num.intValue() == 1) {
                z4 = true;
            }
            linkedHashMap.put("isLandscapeMode", Boolean.valueOf(z4));
            if (map != null) {
                obj2 = map.get("tab_name");
            } else {
                obj2 = null;
            }
            linkedHashMap.put("tabName", obj2);
            linkedHashMap.put("isHotPlayer", Boolean.valueOf(z2));
            linkedHashMap.put("enterMethod", str2);
            linkedHashMap.put("requestId", "");
            linkedHashMap.put("lastGroupId", str4);
            linkedHashMap.put("videoFrom", str6);
            linkedHashMap.put("accountType", str14);
            linkedHashMap.put("newsId", str5);
            CommentContextSource commentContextSourceLIZ = LIZ(linkedHashMap);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && abstractC1387200mCcLIZIZ.LIZIZ() != null) {
                noticeIdForComment = C0SUC.LIZ(abstractC1387200mCcLIZIZ.LIZIZ()).getNoticeIdForComment();
            } else {
                noticeIdForComment = null;
            }
            if (C2105908Mv.LIZ(str13)) {
                str13 = noticeIdForComment;
            }
            if (abstractC1387200mCcLIZIZ != null && abstractC1387200mCcLIZIZ.LIZIZ() != null) {
                noticeTypeForComment = C0SUC.LIZ(abstractC1387200mCcLIZIZ.LIZIZ()).getNoticeTypeForComment();
            }
            if (C2105908Mv.LIZ(str14)) {
                str14 = noticeTypeForComment;
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            String strValueOf = String.valueOf(str3);
            c1350920lG6.getClass();
            C1350920lG6.LJLLJ(commentContextSourceLIZ, comment, strValueOf, z, str9, fypExposedCommentMobParams, str11, str14, str13, z3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ca A[PHI: r1 r2 r3 r8 r9 r33 r34
      0x01ca: PHI (r1v45 java.lang.String) = (r1v38 java.lang.String), (r1v46 java.lang.String) binds: [B:99:0x01c8, B:97:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r2v12 java.lang.String) = (r2v5 java.lang.String), (r2v13 java.lang.String) binds: [B:99:0x01c8, B:97:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r3v10 java.lang.String) = (r3v3 java.lang.String), (r3v11 java.lang.String) binds: [B:99:0x01c8, B:97:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r8v12 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>) = 
      (r8v5 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
      (r8v13 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
     binds: [B:99:0x01c8, B:97:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r9v12 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>) = 
      (r9v5 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
      (r9v13 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
     binds: [B:99:0x01c8, B:97:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r33v10 java.lang.Integer) = (r33v3 java.lang.Integer), (r33v11 java.lang.Integer) binds: [B:99:0x01c8, B:97:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r34v9 boolean) = (r34v2 boolean), (r34v10 boolean) binds: [B:99:0x01c8, B:97:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ce A[PHI: r1 r2 r3 r8 r9 r33 r34
      0x01ce: PHI (r1v44 java.lang.String) = (r1v38 java.lang.String), (r1v45 java.lang.String) binds: [B:99:0x01c8, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r2v11 java.lang.String) = (r2v5 java.lang.String), (r2v12 java.lang.String) binds: [B:99:0x01c8, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r3v9 java.lang.String) = (r3v3 java.lang.String), (r3v10 java.lang.String) binds: [B:99:0x01c8, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r8v11 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>) = 
      (r8v5 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
      (r8v12 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
     binds: [B:99:0x01c8, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r9v11 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>) = 
      (r9v5 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
      (r9v12 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
     binds: [B:99:0x01c8, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r33v9 java.lang.Integer) = (r33v3 java.lang.Integer), (r33v10 java.lang.Integer) binds: [B:99:0x01c8, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r34v8 boolean) = (r34v2 boolean), (r34v9 boolean) binds: [B:99:0x01c8, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d2 A[PHI: r0 r1 r2 r3 r8 r9 r33 r34
      0x01d2: PHI (r0v37 java.lang.String) = (r0v42 java.lang.String), (r0v43 java.lang.String) binds: [B:103:0x01d0, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r1v39 java.lang.String) = (r1v44 java.lang.String), (r1v45 java.lang.String) binds: [B:103:0x01d0, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r2v6 java.lang.String) = (r2v11 java.lang.String), (r2v12 java.lang.String) binds: [B:103:0x01d0, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r3v4 java.lang.String) = (r3v9 java.lang.String), (r3v10 java.lang.String) binds: [B:103:0x01d0, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r8v6 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>) = 
      (r8v11 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
      (r8v12 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
     binds: [B:103:0x01d0, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r9v6 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>) = 
      (r9v11 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
      (r9v12 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
     binds: [B:103:0x01d0, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r33v4 java.lang.Integer) = (r33v9 java.lang.Integer), (r33v10 java.lang.Integer) binds: [B:103:0x01d0, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r34v3 boolean) = (r34v8 boolean), (r34v9 boolean) binds: [B:103:0x01d0, B:101:0x01cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0215 A[PHI: r0 r1 r2 r3 r8 r9 r33 r34
      0x0215: PHI (r0v41 java.lang.String) = (r0v37 java.lang.String), (r0v42 java.lang.String) binds: [B:105:0x01d4, B:103:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r1v43 java.lang.String) = (r1v39 java.lang.String), (r1v44 java.lang.String) binds: [B:105:0x01d4, B:103:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r2v10 java.lang.String) = (r2v6 java.lang.String), (r2v11 java.lang.String) binds: [B:105:0x01d4, B:103:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r3v8 java.lang.String) = (r3v4 java.lang.String), (r3v9 java.lang.String) binds: [B:105:0x01d4, B:103:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r8v10 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>) = 
      (r8v6 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
      (r8v11 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
     binds: [B:105:0x01d4, B:103:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r9v10 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>) = 
      (r9v6 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
      (r9v11 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
     binds: [B:105:0x01d4, B:103:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r33v8 java.lang.Integer) = (r33v4 java.lang.Integer), (r33v9 java.lang.Integer) binds: [B:105:0x01d4, B:103:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r34v7 boolean) = (r34v3 boolean), (r34v8 boolean) binds: [B:105:0x01d4, B:103:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0218 A[PHI: r0 r1 r2 r3 r8 r9 r33 r34 r39
      0x0218: PHI (r0v40 java.lang.String) = (r0v38 java.lang.String), (r0v41 java.lang.String) binds: [B:108:0x01db, B:115:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r1v42 java.lang.String) = (r1v40 java.lang.String), (r1v43 java.lang.String) binds: [B:108:0x01db, B:115:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r2v9 java.lang.String) = (r2v7 java.lang.String), (r2v10 java.lang.String) binds: [B:108:0x01db, B:115:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r3v7 java.lang.String) = (r3v5 java.lang.String), (r3v8 java.lang.String) binds: [B:108:0x01db, B:115:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r8v9 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>) = 
      (r8v7 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
      (r8v10 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
     binds: [B:108:0x01db, B:115:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r9v9 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>) = 
      (r9v7 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
      (r9v10 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
     binds: [B:108:0x01db, B:115:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r33v7 java.lang.Integer) = (r33v5 java.lang.Integer), (r33v8 java.lang.Integer) binds: [B:108:0x01db, B:115:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r34v6 boolean) = (r34v4 boolean), (r34v7 boolean) binds: [B:108:0x01db, B:115:0x0215] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r39v5 java.lang.String) = (r39v3 java.lang.String), (r39v1 java.lang.String) binds: [B:108:0x01db, B:115:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b6 A[PHI: r8 r9 r33 r34
      0x01b6: PHI (r8v15 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>) = 
      (r8v3 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
      (r8v16 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
     binds: [B:120:0x0220, B:89:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r9v15 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>) = 
      (r9v3 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
      (r9v16 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
     binds: [B:120:0x0220, B:89:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r33v13 java.lang.Integer) = (r33v1 java.lang.Integer), (r33v14 java.lang.Integer) binds: [B:120:0x0220, B:89:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r34v12 boolean) = (r34v0 boolean), (r34v13 boolean) binds: [B:120:0x0220, B:89:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ba A[PHI: r3 r8 r9 r33 r34
      0x01ba: PHI (r3v2 java.lang.String) = (r3v13 java.lang.String), (r3v14 java.lang.String) binds: [B:91:0x01b8, B:89:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r8v4 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>) = 
      (r8v15 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
      (r8v16 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
     binds: [B:91:0x01b8, B:89:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r9v4 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>) = 
      (r9v15 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
      (r9v16 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
     binds: [B:91:0x01b8, B:89:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r33v2 java.lang.Integer) = (r33v13 java.lang.Integer), (r33v14 java.lang.Integer) binds: [B:91:0x01b8, B:89:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r34v1 boolean) = (r34v12 boolean), (r34v13 boolean) binds: [B:91:0x01b8, B:89:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01be A[PHI: r3 r8 r9 r33 r34
      0x01be: PHI (r3v12 java.lang.String) = (r3v2 java.lang.String), (r3v13 java.lang.String) binds: [B:93:0x01bc, B:91:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r8v14 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>) = 
      (r8v4 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
      (r8v15 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
     binds: [B:93:0x01bc, B:91:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r9v14 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>) = 
      (r9v4 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
      (r9v15 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
     binds: [B:93:0x01bc, B:91:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r33v12 java.lang.Integer) = (r33v2 java.lang.Integer), (r33v13 java.lang.Integer) binds: [B:93:0x01bc, B:91:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r34v11 boolean) = (r34v1 boolean), (r34v12 boolean) binds: [B:93:0x01bc, B:91:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c2 A[PHI: r2 r3 r8 r9 r33 r34
      0x01c2: PHI (r2v13 java.lang.String) = (r2v4 java.lang.String), (r2v14 java.lang.String) binds: [B:93:0x01bc, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r3v11 java.lang.String) = (r3v2 java.lang.String), (r3v12 java.lang.String) binds: [B:93:0x01bc, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r8v13 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>) = 
      (r8v4 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
      (r8v14 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
     binds: [B:93:0x01bc, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r9v13 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>) = 
      (r9v4 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
      (r9v14 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
     binds: [B:93:0x01bc, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r33v11 java.lang.Integer) = (r33v2 java.lang.Integer), (r33v12 java.lang.Integer) binds: [B:93:0x01bc, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r34v10 boolean) = (r34v1 boolean), (r34v11 boolean) binds: [B:93:0x01bc, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6 A[PHI: r2 r3 r8 r9 r33 r34
      0x01c6: PHI (r2v5 java.lang.String) = (r2v13 java.lang.String), (r2v14 java.lang.String) binds: [B:97:0x01c4, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r3v3 java.lang.String) = (r3v11 java.lang.String), (r3v12 java.lang.String) binds: [B:97:0x01c4, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r8v5 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>) = 
      (r8v13 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
      (r8v14 java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>)
     binds: [B:97:0x01c4, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r9v5 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>) = 
      (r9v13 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
      (r9v14 java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan>)
     binds: [B:97:0x01c4, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r33v3 java.lang.Integer) = (r33v11 java.lang.Integer), (r33v12 java.lang.Integer) binds: [B:97:0x01c4, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r34v2 boolean) = (r34v10 boolean), (r34v11 boolean) binds: [B:97:0x01c4, B:95:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r44, java.lang.CharSequence r45, java.lang.String r46, com.ss.android.ugc.aweme.comment.model.Comment r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, int r54, java.lang.String r55, X.C1347310lAH r56, long r57, java.lang.String r59, java.lang.String r60, java.lang.String r61, int r62, int r63) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1347300lAG.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.CharSequence, java.lang.String, com.ss.android.ugc.aweme.comment.model.Comment, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, X.0lAH, long, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }
}
