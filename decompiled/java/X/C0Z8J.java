package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VOLightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0Z8J, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8J {
    public static final InterfaceC885810Yp1<?> LIZ(InterfaceC888500YtM interfaceC888500YtM) {
        UrlModel urlModel;
        C886440Yq2 c886440Yq2;
        C0Z8A c0z8a;
        String str;
        String str2;
        C886440Yq2 c886440Yq22;
        C0Z8A c0z8a2;
        String str3;
        boolean z;
        UrlModel urlModel2;
        C886440Yq2 c886440Yq23;
        C0Z8A c0z8a3;
        String str4;
        Integer num = null;
        VORightOperationType vORightOperationType = null;
        VORightOperationType vORightOperationType2 = null;
        VORightOperationType vORightOperationType3 = null;
        if (interfaceC888500YtM instanceof C0Z8L) {
            C0Z8L c0z8l = (C0Z8L) interfaceC888500YtM;
            C878950Ydx pageKey = c0z8l.getPageKey();
            C882110Yj3 c882110Yj3 = C882110Yj3.INSTANCE;
            AnonymousClass0617 anonymousClass0617 = new AnonymousClass0617(C0YM2.TIKTOK_SOCIAL_IM, c0z8l.getSessionId());
            long sortOrder = c0z8l.getSortOrder();
            AbstractC884010Ym7 sessionUnreadViewState = c0z8l.getSessionUnreadViewState();
            String name = c0z8l.getName();
            CharSequence content = c0z8l.getContent();
            Object avatar = c0z8l.getAvatar();
            if (avatar instanceof UrlModel) {
                urlModel2 = (UrlModel) avatar;
            } else {
                urlModel2 = null;
            }
            C886430Yq1 c886430Yq1 = new C886430Yq1(urlModel2);
            String sessionUpdateTime = c0z8l.getSessionUpdateTime();
            EnumC881770YiV readStatus = c0z8l.getReadStatus();
            CharSequence readText = c0z8l.getReadText();
            boolean showReadStatus = c0z8l.getShowReadStatus();
            C429270GsP activityStatusViewData = c0z8l.getActivityStatusViewData();
            String activityText = c0z8l.getActivityText();
            C894700Z8a activityStatusTextWithType = c0z8l.getActivityStatusTextWithType();
            C0I3B msgDraft = c0z8l.getMsgDraft();
            SystemContent systemContentOfLastMsg = c0z8l.getSystemContentOfLastMsg();
            VOLightInteractionEntryConf lightInteractionEntryConf = c0z8l.getLightInteractionEntryConf();
            InterfaceC894890Z8t typingIndicatorInboxData = c0z8l.getTypingIndicatorInboxData();
            C0Z72 middleViewVO = c0z8l.getMiddleViewVO();
            if (middleViewVO != null) {
                c886440Yq23 = middleViewVO.chatStatus;
            } else {
                c886440Yq23 = null;
            }
            C0Z72 middleViewVO2 = c0z8l.getMiddleViewVO();
            if (middleViewVO2 != null) {
                c0z8a3 = middleViewVO2.contentType;
            } else {
                c0z8a3 = null;
            }
            C0Z72 middleViewVO3 = c0z8l.getMiddleViewVO();
            if (middleViewVO3 != null) {
                str4 = middleViewVO3.timestamp;
            } else {
                str4 = null;
            }
            C0Z74 rightViewVO = c0z8l.getRightViewVO();
            if (rightViewVO != null) {
                vORightOperationType = rightViewVO.rightOperationType;
            }
            boolean showVerifyIcon = c0z8l.getShowVerifyIcon();
            boolean showSayHiButton = c0z8l.getShowSayHiButton();
            boolean showStreakButton = c0z8l.getShowStreakButton();
            String sayHiContent = c0z8l.getSayHiContent();
            C887540Yro chatListCameraStatus = c0z8l.getChatListCameraStatus();
            CharSequence typingStatusText = c0z8l.getTypingStatusText();
            boolean zIsShowingTypingStatus = c0z8l.isShowingTypingStatus();
            boolean showingReactionContent = c0z8l.getShowingReactionContent();
            boolean zIsLastMsgFakeMsg = c0z8l.isLastMsgFakeMsg();
            boolean hasStreakReminderInlineMsg = c0z8l.getHasStreakReminderInlineMsg();
            List<C880460YgO> chatLabels = c0z8l.getChatLabels();
            C1722406oo recentActivity = c0z8l.getRecentActivity();
            RelationshipCelebrationTarget storyFriendAnniversary = c0z8l.getStoryFriendAnniversary();
            return new C0Z8N(pageKey, c882110Yj3, anonymousClass0617, sortOrder, sessionUnreadViewState, name, content, c886430Yq1, sessionUpdateTime, readStatus, readText, showReadStatus, activityStatusViewData, activityText, activityStatusTextWithType, msgDraft, systemContentOfLastMsg, lightInteractionEntryConf, typingIndicatorInboxData, c886440Yq23, c0z8a3, str4, vORightOperationType, zIsLastMsgFakeMsg, hasStreakReminderInlineMsg, c0z8l.getShowStarIcon(), chatListCameraStatus, showVerifyIcon, showSayHiButton, showStreakButton, sayHiContent, typingStatusText, zIsShowingTypingStatus, showingReactionContent, recentActivity, storyFriendAnniversary, chatLabels, c0z8l.getChatHint(), c0z8l.getThoughtBubble(), new C0Z8T(0, 104, c0z8l.getSessionId(), true, c0z8l.isMute(), c0z8l.isCheckEmoji(), c0z8l.getConversationUpdatedAt(), c0z8l.getPriority(), c0z8l.getCategory(), c0z8l.getLastMessageScene(), c0z8l.getLastMessageMsgType(), false, c0z8l.getLastMsgCreatedAt(), false, false, c0z8l.getLastMsg(), c0z8l.getLastMsgRecalled(), c0z8l.getLastMsgSendBySelf(), c0z8l.getImUser(), c0z8l.isTCM(), c0z8l.isBlock(), c0z8l.isBlocked(), false, 0, c0z8l.getPreviewContentType(), c0z8l.getUnreadCountForContentPrefix()));
        }
        if (interfaceC888500YtM instanceof C0Z8M) {
            C0Z8M c0z8m = (C0Z8M) interfaceC888500YtM;
            C878950Ydx pageKey2 = c0z8m.getPageKey();
            C1606306Qr c1606306Qr = C1606306Qr.INSTANCE;
            AnonymousClass0617 anonymousClass06172 = new AnonymousClass0617(C0YM2.TIKTOK_SOCIAL_IM, c0z8m.getSessionId());
            long sortOrder2 = c0z8m.getSortOrder();
            AbstractC884010Ym7 sessionUnreadViewState2 = c0z8m.getSessionUnreadViewState();
            String name2 = c0z8m.getName();
            CharSequence content2 = c0z8m.getContent();
            Object avatar2 = c0z8m.getAvatar();
            if (avatar2 instanceof String) {
                str2 = (String) avatar2;
            } else {
                str2 = null;
            }
            C882240YjG c882240YjG = new C882240YjG(str2);
            String sessionUpdateTime2 = c0z8m.getSessionUpdateTime();
            EnumC881770YiV readStatus2 = c0z8m.getReadStatus();
            boolean showReadStatus2 = c0z8m.getShowReadStatus();
            CharSequence readText2 = c0z8m.getReadText();
            C429270GsP activityStatusViewData2 = c0z8m.getActivityStatusViewData();
            String activityText2 = c0z8m.getActivityText();
            C894700Z8a activityStatusTextWithType2 = c0z8m.getActivityStatusTextWithType();
            C0I3B msgDraft2 = c0z8m.getMsgDraft();
            SystemContent systemContentOfLastMsg2 = c0z8m.getSystemContentOfLastMsg();
            VOLightInteractionEntryConf lightInteractionEntryConf2 = c0z8m.getLightInteractionEntryConf();
            InterfaceC894890Z8t typingIndicatorInboxData2 = c0z8m.getTypingIndicatorInboxData();
            C0Z72 middleViewVO4 = c0z8m.getMiddleViewVO();
            if (middleViewVO4 != null) {
                c886440Yq22 = middleViewVO4.chatStatus;
            } else {
                c886440Yq22 = null;
            }
            C0Z72 middleViewVO5 = c0z8m.getMiddleViewVO();
            if (middleViewVO5 != null) {
                c0z8a2 = middleViewVO5.contentType;
            } else {
                c0z8a2 = null;
            }
            C0Z72 middleViewVO6 = c0z8m.getMiddleViewVO();
            if (middleViewVO6 != null) {
                str3 = middleViewVO6.timestamp;
            } else {
                str3 = null;
            }
            C0Z74 rightViewVO2 = c0z8m.getRightViewVO();
            if (rightViewVO2 != null) {
                vORightOperationType2 = rightViewVO2.rightOperationType;
            }
            VORightOperationType vORightOperationType4 = vORightOperationType2;
            boolean zIsLastMsgFakeMsg2 = c0z8m.isLastMsgFakeMsg();
            boolean hasStreakReminderInlineMsg2 = c0z8m.getHasStreakReminderInlineMsg();
            List<Long> readers = c0z8m.getReaders();
            CharSequence chatHint = c0z8m.getChatHint();
            boolean showStarIcon = c0z8m.getShowStarIcon();
            C887540Yro chatListCameraStatus2 = c0z8m.getChatListCameraStatus();
            String sessionId = c0z8m.getSessionId();
            boolean zIsMute = c0z8m.isMute();
            boolean zIsCheckEmoji = c0z8m.isCheckEmoji();
            long conversationUpdatedAt = c0z8m.getConversationUpdatedAt();
            int priority = c0z8m.getPriority();
            Integer category = c0z8m.getCategory();
            String lastMessageScene = c0z8m.getLastMessageScene();
            int lastMessageMsgType = c0z8m.getLastMessageMsgType();
            C869590Y9l lastMsg = c0z8m.getLastMsg();
            if (lastMsg != null && C0ZDX.LJJJJIZL(lastMsg)) {
                z = true;
            } else {
                z = false;
            }
            return new C0Z8O(pageKey2, c1606306Qr, anonymousClass06172, sortOrder2, sessionUnreadViewState2, name2, content2, c882240YjG, sessionUpdateTime2, readStatus2, readText2, showReadStatus2, activityStatusViewData2, activityText2, activityStatusTextWithType2, msgDraft2, systemContentOfLastMsg2, lightInteractionEntryConf2, typingIndicatorInboxData2, c886440Yq22, c0z8a2, str3, vORightOperationType4, zIsLastMsgFakeMsg2, hasStreakReminderInlineMsg2, showStarIcon, chatListCameraStatus2, readers, chatHint, new C0Z8S(3, 105, sessionId, true, zIsMute, zIsCheckEmoji, conversationUpdatedAt, priority, category, lastMessageScene, lastMessageMsgType, false, 0L, false, false, null, c0z8m.getLastMsgRecalled(), z, c0z8m.getHasUnreadMention(), c0z8m.isBanned(), c0z8m.getMemberIdList(), c0z8m.isValid(), c0z8m.isMember(), c0z8m.isOwner(), 0, false, c0z8m.getPreviewContentType(), c0z8m.isPublicGroup(), c0z8m.isTempConv()));
        }
        if (interfaceC888500YtM instanceof C0Z8P) {
            C0Z8P c0z8p = (C0Z8P) interfaceC888500YtM;
            C878950Ydx pageKey3 = c0z8p.getPageKey();
            C882110Yj3 c882110Yj32 = C882110Yj3.INSTANCE;
            AnonymousClass0617 anonymousClass06173 = new AnonymousClass0617(C0YM2.TIKTOK_SOCIAL_IM, c0z8p.getSessionId());
            long sortOrder3 = c0z8p.getSortOrder();
            AbstractC884010Ym7 sessionUnreadViewState3 = c0z8p.getSessionUnreadViewState();
            String name3 = c0z8p.getName();
            CharSequence content3 = c0z8p.getContent();
            Object avatar3 = c0z8p.getAvatar();
            if (avatar3 instanceof UrlModel) {
                urlModel = (UrlModel) avatar3;
            } else {
                urlModel = null;
            }
            C886430Yq1 c886430Yq12 = new C886430Yq1(urlModel);
            String sessionUpdateTime3 = c0z8p.getSessionUpdateTime();
            EnumC881770YiV readStatus3 = c0z8p.getReadStatus();
            CharSequence readText3 = c0z8p.getReadText();
            boolean showReadStatus3 = c0z8p.getShowReadStatus();
            C0I3B msgDraft3 = c0z8p.getMsgDraft();
            SystemContent systemContentOfLastMsg3 = c0z8p.getSystemContentOfLastMsg();
            InterfaceC894890Z8t typingIndicatorInboxData3 = c0z8p.getTypingIndicatorInboxData();
            C0Z72 middleViewVO7 = c0z8p.getMiddleViewVO();
            if (middleViewVO7 != null) {
                c886440Yq2 = middleViewVO7.chatStatus;
            } else {
                c886440Yq2 = null;
            }
            C0Z72 middleViewVO8 = c0z8p.getMiddleViewVO();
            if (middleViewVO8 != null) {
                c0z8a = middleViewVO8.contentType;
            } else {
                c0z8a = null;
            }
            C0Z72 middleViewVO9 = c0z8p.getMiddleViewVO();
            if (middleViewVO9 != null) {
                str = middleViewVO9.timestamp;
            } else {
                str = null;
            }
            C0Z74 rightViewVO3 = c0z8p.getRightViewVO();
            if (rightViewVO3 != null) {
                vORightOperationType3 = rightViewVO3.rightOperationType;
            }
            return new C0Z8R(pageKey3, c882110Yj32, anonymousClass06173, sortOrder3, sessionUnreadViewState3, name3, content3, c886430Yq12, sessionUpdateTime3, msgDraft3, systemContentOfLastMsg3, c886440Yq2, readStatus3, readText3, showReadStatus3, typingIndicatorInboxData3, c0z8a, str, vORightOperationType3, c0z8p.getTypingStatusText(), c0z8p.isShowingTypingStatus(), new C0Z8U(0, 108, c0z8p.getSessionId(), true, c0z8p.isMute(), c0z8p.isCheckEmoji(), c0z8p.getConversationUpdatedAt(), c0z8p.getPriority(), c0z8p.getCategory(), c0z8p.getLastMessageScene(), c0z8p.getLastMessageMsgType(), false, c0z8p.getLastMsgCreatedAt(), false, false, c0z8p.getLastMsg(), c0z8p.getLastMsgRecalled(), c0z8p.getLastMsgSendBySelf(), c0z8p.getImUser(), c0z8p.isBlock(), c0z8p.isBlocked(), 0, c0z8p.getPreviewContentType(), c0z8p.getUnreadCountForContentPrefix()));
        }
        if (!(interfaceC888500YtM instanceof C0Z3S)) {
            return null;
        }
        C0Z3S c0z3s = (C0Z3S) interfaceC888500YtM;
        C878950Ydx pageKey4 = c0z3s.getPageKey();
        C878910Ydt c878910Ydt = C878910Ydt.INSTANCE;
        C878820Ydk c878820Ydk = C878820Ydk.INSTANCE;
        long sortOrder4 = c0z3s.getSortOrder();
        AbstractC884010Ym7 sessionUnreadViewState4 = c0z3s.getSessionUnreadViewState();
        String name4 = c0z3s.getName();
        CharSequence content4 = c0z3s.getContent();
        Object avatar4 = c0z3s.getAvatar();
        if (avatar4 instanceof Integer) {
            num = (Integer) avatar4;
        }
        return new C887190YrF(pageKey4, c878910Ydt, c878820Ydk, sortOrder4, sessionUnreadViewState4, name4, content4, new C882220YjE(num), c0z3s.getSessionUpdateTime(), c0z3s.getShowRightArrow(), new C0Z3U(2, 107, c0z3s.getSessionId(), false, false, false, c0z3s.getConversationUpdatedAt(), c0z3s.getPriority()));
    }

    public static final C890610Ywl LIZIZ(InterfaceC885810Yp1<?> interfaceC885810Yp1, boolean z) {
        C878950Ydx c878950Ydx;
        C878950Ydx c878950Ydx2;
        C878950Ydx c878950Ydx3;
        CharSequence charSequence = "";
        Object iconRes = null;
        if (interfaceC885810Yp1 instanceof C0Z8N) {
            C0Z8N c0z8n = (C0Z8N) interfaceC885810Yp1;
            int priority = c0z8n.getExtra().getPriority();
            long conversationUpdatedAt = c0z8n.getExtra().getConversationUpdatedAt() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            int viewHolderType = c0z8n.getExtra().getViewHolderType();
            boolean zLIZ = C880320YgA.LIZ(c0z8n.getUnreadViewState());
            InterfaceC879010Ye3 pageKey = c0z8n.getPageKey();
            if (pageKey instanceof C878950Ydx) {
                c878950Ydx3 = (C878950Ydx) pageKey;
            } else {
                c878950Ydx3 = null;
            }
            long sortOrder = c0z8n.getSortOrder();
            AbstractC884010Ym7 unreadViewState = c0z8n.getUnreadViewState();
            String name = c0z8n.getName();
            CharSequence content = c0z8n.getContent();
            String contentType = c0z8n.getExtra().getContentType();
            C886430Yq1 avatar = c0z8n.getAvatar();
            if (avatar != null) {
                iconRes = avatar.getUrlRes();
            }
            String sessionUpdateTime = c0z8n.getSessionUpdateTime();
            EnumC881770YiV readStatus = c0z8n.getReadStatus();
            CharSequence readText = c0z8n.getReadText();
            boolean showReadStatus = c0z8n.getShowReadStatus();
            C429270GsP activityStatusViewData = c0z8n.getActivityStatusViewData();
            String activityText = c0z8n.getActivityText();
            C894700Z8a activityStatusTextWithType = c0z8n.getActivityStatusTextWithType();
            C0I3B msgDraft = c0z8n.getMsgDraft();
            SystemContent systemContentOfLastMsg = c0z8n.getSystemContentOfLastMsg();
            VOLightInteractionEntryConf lightInteractionEntryConf = c0z8n.getLightInteractionEntryConf();
            InterfaceC894890Z8t typingIndicatorInboxData = c0z8n.getTypingIndicatorInboxData();
            if (typingIndicatorInboxData == null) {
                typingIndicatorInboxData = C1517105wn.LIZ;
            }
            boolean showVerifyIcon = c0z8n.getShowVerifyIcon();
            boolean showSayHiButton = c0z8n.getShowSayHiButton();
            boolean showStreakButton = c0z8n.getShowStreakButton();
            String sayHiContent = c0z8n.getSayHiContent();
            C887540Yro chatListCameraStatus = c0z8n.getChatListCameraStatus();
            CharSequence typingStatusText = c0z8n.getTypingStatusText();
            boolean zIsShowingTypingStatus = c0z8n.isShowingTypingStatus();
            boolean showingReactionContent = c0z8n.getShowingReactionContent();
            boolean zIsLastMsgFakeMsg = c0z8n.isLastMsgFakeMsg();
            boolean hasStreakReminderInlineMsg = c0z8n.getHasStreakReminderInlineMsg();
            List<C880460YgO> chatLabels = c0z8n.getChatLabels();
            boolean showStarIcon = c0z8n.getShowStarIcon();
            String sessionId = c0z8n.getExtra().getSessionId();
            boolean zIsSupportMute = c0z8n.getExtra().isSupportMute();
            boolean zIsMute = c0z8n.getExtra().isMute();
            boolean zIsCheckEmoji = c0z8n.getExtra().isCheckEmoji();
            long conversationUpdatedAt2 = c0z8n.getExtra().getConversationUpdatedAt();
            int priority2 = c0z8n.getExtra().getPriority();
            C1722406oo recentActivity = c0z8n.getRecentActivity();
            RelationshipCelebrationTarget storyFriendAnniversary = c0z8n.getStoryFriendAnniversary();
            ThoughtInfo thoughtBubble = c0z8n.getThoughtBubble();
            Integer category = c0z8n.getExtra().getCategory();
            int lastMessageMsgType = c0z8n.getExtra().getLastMessageMsgType();
            long lastMsgCreatedAt = c0z8n.getExtra().getLastMsgCreatedAt();
            boolean lastMsgSendBySelf = c0z8n.getExtra().getLastMsgSendBySelf();
            IMUser imUser = c0z8n.getExtra().getImUser();
            boolean zIsTCM = c0z8n.getExtra().isTCM();
            boolean lastMsgRecalled = c0z8n.getExtra().getLastMsgRecalled();
            boolean zIsBlock = c0z8n.getExtra().isBlock();
            boolean zIsBlocked = c0z8n.getExtra().isBlocked();
            String lastMessageScene = c0z8n.getExtra().getLastMessageScene();
            C869590Y9l lastMsg = c0z8n.getExtra().getLastMsg();
            int chatType = c0z8n.getExtra().getChatType();
            C894790Z8j c894790Z8j = new C894790Z8j(c0z8n.getAvatar());
            String sessionId2 = c0z8n.getExtra().getSessionId();
            String name2 = c0z8n.getName();
            boolean showVerifyIcon2 = c0z8n.getShowVerifyIcon();
            C886440Yq2 chatStatus = c0z8n.getChatStatus();
            C0Z8A voContentType = c0z8n.getVoContentType();
            if (voContentType == null) {
                voContentType = new C892460Yzk("", "no_content");
            }
            String timestamp = c0z8n.getTimestamp();
            AbstractC884010Ym7 unreadViewState2 = c0z8n.getUnreadViewState();
            CharSequence chatHint = c0z8n.getChatHint();
            if (chatHint == null) {
                chatHint = "";
            }
            C0Z72 c0z72 = new C0Z72(sessionId2, name2, showVerifyIcon2, chatStatus, voContentType, timestamp, unreadViewState2, chatHint);
            VORightOperationType rightOperationType = c0z8n.getRightOperationType();
            if (rightOperationType == null) {
                rightOperationType = C0Z78.INSTANCE;
            }
            C0Z74 c0z74 = new C0Z74(rightOperationType);
            CharSequence chatHint2 = c0z8n.getChatHint();
            if (chatHint2 != null) {
                charSequence = chatHint2;
            }
            return new C0Z7H(priority, viewHolderType, conversationUpdatedAt, new C0Z8L(c878950Ydx3, activityStatusViewData, activityText, showVerifyIcon, lastMsgCreatedAt, lastMsgSendBySelf, showSayHiButton, showStreakButton, sayHiContent, typingStatusText, zIsShowingTypingStatus, typingIndicatorInboxData, imUser, zIsTCM, readStatus, readText, showReadStatus, showingReactionContent, sessionId, name, content, contentType, lastMsgRecalled, iconRes, unreadViewState, c0z8n.getExtra().getUnreadCountForContentPrefix(), zIsBlock, zIsBlocked, zIsSupportMute, zIsMute, zIsCheckEmoji, sessionUpdateTime, priority2, sortOrder, conversationUpdatedAt2, z, msgDraft, lastMsg, lastMessageScene, lastMessageMsgType, category, activityStatusTextWithType, systemContentOfLastMsg, lightInteractionEntryConf, showStarIcon, chatListCameraStatus, zIsLastMsgFakeMsg, hasStreakReminderInlineMsg, c894790Z8j, c0z72, c0z74, false, recentActivity, storyFriendAnniversary, thoughtBubble, chatType, chatLabels, charSequence, 0, 524288, null), null, zLIZ, false, true, false, false);
        }
        if (interfaceC885810Yp1 instanceof C0Z8O) {
            C0Z8O c0z8o = (C0Z8O) interfaceC885810Yp1;
            int priority3 = c0z8o.getExtra().getPriority();
            long conversationUpdatedAt3 = c0z8o.getExtra().getConversationUpdatedAt() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            int viewHolderType2 = c0z8o.getExtra().getViewHolderType();
            boolean zLIZ2 = C880320YgA.LIZ(c0z8o.getUnreadViewState());
            InterfaceC879010Ye3 pageKey2 = c0z8o.getPageKey();
            if (pageKey2 instanceof C878950Ydx) {
                c878950Ydx2 = (C878950Ydx) pageKey2;
            } else {
                c878950Ydx2 = null;
            }
            long sortOrder2 = c0z8o.getSortOrder();
            AbstractC884010Ym7 unreadViewState3 = c0z8o.getUnreadViewState();
            String name3 = c0z8o.getName();
            CharSequence content2 = c0z8o.getContent();
            String contentType2 = c0z8o.getExtra().getContentType();
            C882240YjG avatar2 = c0z8o.getAvatar();
            if (avatar2 != null) {
                iconRes = avatar2.getUrlString();
            }
            String sessionUpdateTime2 = c0z8o.getSessionUpdateTime();
            EnumC881770YiV readStatus2 = c0z8o.getReadStatus();
            CharSequence readText2 = c0z8o.getReadText();
            boolean showReadStatus2 = c0z8o.getShowReadStatus();
            C429270GsP activityStatusViewData2 = c0z8o.getActivityStatusViewData();
            String activityText2 = c0z8o.getActivityText();
            C894700Z8a activityStatusTextWithType2 = c0z8o.getActivityStatusTextWithType();
            C0I3B msgDraft2 = c0z8o.getMsgDraft();
            C887540Yro chatListCameraStatus2 = c0z8o.getChatListCameraStatus();
            SystemContent systemContentOfLastMsg2 = c0z8o.getSystemContentOfLastMsg();
            VOLightInteractionEntryConf lightInteractionEntryConf2 = c0z8o.getLightInteractionEntryConf();
            InterfaceC894890Z8t typingIndicatorInboxData2 = c0z8o.getTypingIndicatorInboxData();
            if (typingIndicatorInboxData2 == null) {
                typingIndicatorInboxData2 = C1517105wn.LIZ;
            }
            boolean zIsLastMsgFakeMsg2 = c0z8o.isLastMsgFakeMsg();
            boolean hasStreakReminderInlineMsg2 = c0z8o.getHasStreakReminderInlineMsg();
            List<Long> readers = c0z8o.getReaders();
            CharSequence chatHint3 = c0z8o.getChatHint();
            if (chatHint3 == null) {
                chatHint3 = "";
            }
            boolean showStarIcon2 = c0z8o.getShowStarIcon();
            String sessionId3 = c0z8o.getExtra().getSessionId();
            boolean zIsSupportMute2 = c0z8o.getExtra().isSupportMute();
            boolean zIsMute2 = c0z8o.getExtra().isMute();
            boolean zIsCheckEmoji2 = c0z8o.getExtra().isCheckEmoji();
            long conversationUpdatedAt4 = c0z8o.getExtra().getConversationUpdatedAt();
            int priority4 = c0z8o.getExtra().getPriority();
            Integer category2 = c0z8o.getExtra().getCategory();
            boolean hasUnreadMention = c0z8o.getExtra().getHasUnreadMention();
            boolean zIsPublicGroup = c0z8o.getExtra().isPublicGroup();
            int lastMessageMsgType2 = c0z8o.getExtra().getLastMessageMsgType();
            boolean zIsBanned = c0z8o.getExtra().isBanned();
            List<String> memberIdList = c0z8o.getExtra().getMemberIdList();
            boolean zIsValid = c0z8o.getExtra().isValid();
            boolean zIsMember = c0z8o.getExtra().isMember();
            boolean zIsOwner = c0z8o.getExtra().isOwner();
            String lastMessageScene2 = c0z8o.getExtra().getLastMessageScene();
            C894790Z8j c894790Z8j2 = new C894790Z8j(c0z8o.getAvatar());
            String sessionId4 = c0z8o.getExtra().getSessionId();
            String name4 = c0z8o.getName();
            C886440Yq2 chatStatus2 = c0z8o.getChatStatus();
            C0Z8A voContentType2 = c0z8o.getVoContentType();
            if (voContentType2 == null) {
                voContentType2 = new C892460Yzk("", "no_content");
            }
            String timestamp2 = c0z8o.getTimestamp();
            AbstractC884010Ym7 unreadViewState4 = c0z8o.getUnreadViewState();
            CharSequence chatHint4 = c0z8o.getChatHint();
            if (chatHint4 != null) {
                charSequence = chatHint4;
            }
            C0Z72 c0z722 = new C0Z72(sessionId4, name4, false, chatStatus2, voContentType2, timestamp2, unreadViewState4, charSequence);
            VORightOperationType rightOperationType2 = c0z8o.getRightOperationType();
            if (rightOperationType2 == null) {
                rightOperationType2 = C0Z78.INSTANCE;
            }
            return new C0Z7I(priority3, viewHolderType2, conversationUpdatedAt3, new C0Z8M(c878950Ydx2, hasUnreadMention, zIsPublicGroup, c0z8o.getExtra().isTempConv(), readers, showReadStatus2, readStatus2, readText2, sessionId3, name3, content2, contentType2, iconRes, unreadViewState3, zIsBanned, zIsSupportMute2, zIsMute2, zIsCheckEmoji2, sessionUpdateTime2, priority4, sortOrder2, conversationUpdatedAt4, activityStatusViewData2, activityText2, activityStatusTextWithType2, memberIdList, typingIndicatorInboxData2, zIsValid, zIsMember, z, category2, msgDraft2, zIsOwner, systemContentOfLastMsg2, chatHint3, lightInteractionEntryConf2, showStarIcon2, c0z8o.getExtra().getLastMsg(), lastMessageScene2, lastMessageMsgType2, chatListCameraStatus2, zIsLastMsgFakeMsg2, hasStreakReminderInlineMsg2, c0z8o.getExtra().getLastMsgRecalled(), c894790Z8j2, c0z722, new C0Z74(rightOperationType2), false, 0, 32768, null), null, zLIZ2, false, true, false, false);
        }
        if (interfaceC885810Yp1 instanceof C0Z8R) {
            C0Z8R c0z8r = (C0Z8R) interfaceC885810Yp1;
            int priority5 = c0z8r.getExtra().getPriority();
            long conversationUpdatedAt5 = c0z8r.getExtra().getConversationUpdatedAt() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            int viewHolderType3 = c0z8r.getExtra().getViewHolderType();
            boolean zLIZ3 = C880320YgA.LIZ(c0z8r.getUnreadViewState());
            InterfaceC879010Ye3 pageKey3 = c0z8r.getPageKey();
            if (pageKey3 instanceof C878950Ydx) {
                c878950Ydx = (C878950Ydx) pageKey3;
            } else {
                c878950Ydx = null;
            }
            long sortOrder3 = c0z8r.getSortOrder();
            AbstractC884010Ym7 unreadViewState5 = c0z8r.getUnreadViewState();
            String name5 = c0z8r.getName();
            CharSequence content3 = c0z8r.getContent();
            String contentType3 = c0z8r.getExtra().getContentType();
            C886430Yq1 avatar3 = c0z8r.getAvatar();
            if (avatar3 != null) {
                iconRes = avatar3.getUrlRes();
            }
            String sessionUpdateTime3 = c0z8r.getSessionUpdateTime();
            EnumC881770YiV readStatus3 = c0z8r.getReadStatus();
            CharSequence readText3 = c0z8r.getReadText();
            boolean showReadStatus3 = c0z8r.getShowReadStatus();
            C0I3B msgDraft3 = c0z8r.getMsgDraft();
            SystemContent systemContentOfLastMsg3 = c0z8r.getSystemContentOfLastMsg();
            InterfaceC894890Z8t typingIndicatorInboxData3 = c0z8r.getTypingIndicatorInboxData();
            if (typingIndicatorInboxData3 == null) {
                typingIndicatorInboxData3 = C1517105wn.LIZ;
            }
            CharSequence typingStatusText2 = c0z8r.getTypingStatusText();
            boolean zIsShowingTypingStatus2 = c0z8r.isShowingTypingStatus();
            String sessionId5 = c0z8r.getExtra().getSessionId();
            boolean zIsSupportMute3 = c0z8r.getExtra().isSupportMute();
            boolean zIsMute3 = c0z8r.getExtra().isMute();
            boolean zIsCheckEmoji3 = c0z8r.getExtra().isCheckEmoji();
            long conversationUpdatedAt6 = c0z8r.getExtra().getConversationUpdatedAt();
            int priority6 = c0z8r.getExtra().getPriority();
            Integer category3 = c0z8r.getExtra().getCategory();
            int lastMessageMsgType3 = c0z8r.getExtra().getLastMessageMsgType();
            long lastMsgCreatedAt2 = c0z8r.getExtra().getLastMsgCreatedAt();
            boolean lastMsgSendBySelf2 = c0z8r.getExtra().getLastMsgSendBySelf();
            IMUser imUser2 = c0z8r.getExtra().getImUser();
            boolean lastMsgRecalled2 = c0z8r.getExtra().getLastMsgRecalled();
            boolean zIsBlock2 = c0z8r.getExtra().isBlock();
            boolean zIsBlocked2 = c0z8r.getExtra().isBlocked();
            String lastMessageScene3 = c0z8r.getExtra().getLastMessageScene();
            C869590Y9l lastMsg2 = c0z8r.getExtra().getLastMsg();
            int chatType2 = c0z8r.getExtra().getChatType();
            C894790Z8j c894790Z8j3 = new C894790Z8j(c0z8r.getAvatar());
            String sessionId6 = c0z8r.getExtra().getSessionId();
            String name6 = c0z8r.getName();
            C886440Yq2 chatStatus3 = c0z8r.getChatStatus();
            C0Z8A voContentType3 = c0z8r.getVoContentType();
            if (voContentType3 == null) {
                voContentType3 = new C892460Yzk("", "no_content");
            }
            C0Z72 c0z723 = new C0Z72(sessionId6, name6, false, chatStatus3, voContentType3, c0z8r.getTimestamp(), c0z8r.getUnreadViewState(), "");
            VORightOperationType rightOperationType3 = c0z8r.getRightOperationType();
            if (rightOperationType3 == null) {
                rightOperationType3 = C0Z78.INSTANCE;
            }
            return new C0Z7G(priority5, viewHolderType3, conversationUpdatedAt5, new C0Z8P(c878950Ydx, lastMsgCreatedAt2, lastMsgSendBySelf2, typingStatusText2, zIsShowingTypingStatus2, typingIndicatorInboxData3, imUser2, readStatus3, readText3, showReadStatus3, sessionId5, name5, content3, contentType3, lastMsgRecalled2, iconRes, unreadViewState5, c0z8r.getExtra().getUnreadCountForContentPrefix(), zIsBlock2, zIsBlocked2, zIsSupportMute3, zIsMute3, zIsCheckEmoji3, sessionUpdateTime3, priority6, sortOrder3, conversationUpdatedAt6, z, msgDraft3, lastMsg2, lastMessageScene3, lastMessageMsgType3, category3, systemContentOfLastMsg3, c894790Z8j3, c0z723, new C0Z74(rightOperationType3), false, chatType2), null, zLIZ3, false, false, false, !C19212010Ec.LIZJ.LIZLLL());
        }
        if (!(interfaceC885810Yp1 instanceof C887190YrF)) {
            return null;
        }
        C887190YrF c887190YrF = (C887190YrF) interfaceC885810Yp1;
        int priority7 = c887190YrF.getExtra().getPriority();
        long conversationUpdatedAt7 = c887190YrF.getExtra().getConversationUpdatedAt() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        int viewHolderType4 = c887190YrF.getExtra().getViewHolderType();
        boolean zLIZ4 = C880320YgA.LIZ(c887190YrF.getUnreadViewState());
        long sortOrder4 = c887190YrF.getSortOrder();
        AbstractC884010Ym7 unreadViewState6 = c887190YrF.getUnreadViewState();
        String name7 = c887190YrF.getName();
        CharSequence content4 = c887190YrF.getContent();
        C882220YjE avatar4 = c887190YrF.getAvatar();
        if (avatar4 != null) {
            iconRes = avatar4.getIconRes();
        }
        return new C0Z3M(priority7, conversationUpdatedAt7, viewHolderType4, zLIZ4, new C0Z3S(null, c887190YrF.getShowRightArrow(), c887190YrF.getExtra().getSessionId(), name7, content4, null, iconRes, c887190YrF.getExtra().isSupportMute(), c887190YrF.getExtra().isMute(), c887190YrF.getExtra().isCheckEmoji(), c887190YrF.getSessionUpdateTime(), c887190YrF.getExtra().getPriority(), sortOrder4, c887190YrF.getExtra().getConversationUpdatedAt(), unreadViewState6, false), false, false);
    }
}
