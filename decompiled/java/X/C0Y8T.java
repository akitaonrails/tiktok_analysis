package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y8T, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8T implements Serializable, Comparable<C0Y8T>, Cloneable {
    public int badgeCount;
    public long badgeVersion;
    public ByteString bizExt;
    public String conversationId;
    public long conversationRankVersion;
    public long conversationShortId;
    public int conversationType;
    public C0Y8Y coreInfo;
    public String draftContent;
    public long draftTime;
    public int fakeUnreadCount;
    public boolean hasMore = true;
    public int inboxType;
    public boolean isInBox;
    public boolean isMember;
    public boolean isPreview;
    public boolean isRisky;
    public boolean isStranger;
    public long lastMessageIndex;
    public long lastMessageOrderIndex;
    public C869590Y9l lastShowMessage;
    public String lastShowMessageUuid;
    public Map<String, String> localExt;
    public String localExtString;
    public long maxIndexV2;
    public C0YAE member;
    public int memberCount;
    public List<Long> memberIds;
    public String memberString;
    public List<C0YAE> members;
    public long minIndex;
    public long minIndexV2;
    public int readBadgeCount;
    public long readIndex;
    public long readIndexV2;
    public C0Y8W settingInfo;
    public List<C0YAE> singleChatMembers;
    public long sortOrder;
    public int status;
    public long unreadCount;
    public List<C869590Y9l> unreadSelfMentionedMessages;
    public long updatedTime;

    public void clearLastShowMessage() {
        this.lastShowMessage = null;
        this.lastShowMessageUuid = null;
    }

    public synchronized Map<String, String> getExt() {
        C0Y8W c0y8w;
        c0y8w = this.settingInfo;
        return c0y8w != null ? c0y8w.getExt() : null;
    }

    public synchronized Map<String, String> getLocalExt() {
        if (this.localExt == null) {
            String str = this.localExtString;
            if (str == null) {
                this.localExt = new ConcurrentHashMap();
            } else {
                setLocalExtStr(str);
                this.localExtString = null;
                if (this.localExt == null) {
                    this.localExt = new ConcurrentHashMap();
                }
            }
        }
        return this.localExt;
    }

    public int getCategory() {
        C0Y8W c0y8w = this.settingInfo;
        return c0y8w != null ? c0y8w.getCategory() : EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_PRIMARY.getValue();
    }

    public Set<String> getConversationTags() {
        C0Y8W c0y8w = this.settingInfo;
        return c0y8w != null ? c0y8w.getConversationTags() : new HashSet();
    }

    public String getLocalExtStr() {
        return C09EF.LIZ(this.localExt);
    }

    public C0YAE getMember() {
        String str;
        if (this.member == null && (str = this.memberString) != null) {
            setMemberStr(str);
            this.memberString = null;
        }
        return this.member;
    }

    public List<Long> getMemberIds() {
        List<Long> list = this.memberIds;
        return list == null ? new ArrayList() : list;
    }

    public String getMemberStr() {
        C0YAE c0yae = this.member;
        if (c0yae == null) {
            return "";
        }
        try {
            return C09EF.LIZ.LJIILL(c0yae);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public int getMuted() {
        C0Y8W c0y8w = this.settingInfo;
        if (c0y8w != null) {
            return c0y8w.getMute();
        }
        return 0;
    }

    public int getStickTop() {
        C0Y8W c0y8w = this.settingInfo;
        if (c0y8w != null) {
            return c0y8w.getStickTop();
        }
        return 0;
    }

    public int hashCode() {
        String str = this.conversationId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isDissolved() {
        return this.status == 1;
    }

    public boolean isFavorite() {
        C0Y8W c0y8w = this.settingInfo;
        return c0y8w != null && c0y8w.isFavor();
    }

    public boolean isGroupChat() {
        return this.conversationType == AbstractC1711506n3.LIZIZ;
    }

    public boolean isHide() {
        Map<String, String> map = this.localExt;
        if (map != null && map.containsKey("s:hide_conv_when_msg_index")) {
            try {
                return CastLongProtector.parseLong(this.localExt.get("s:hide_conv_when_msg_index")) >= this.lastMessageIndex;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public boolean isHideOpt() {
        int iIndexOf;
        String str = this.localExtString;
        if (str != null && (iIndexOf = str.indexOf("s:hide_conv_when_msg_index")) != -1) {
            int i = iIndexOf + 26;
            try {
                return CastLongProtector.parseLong(this.localExtString.substring(i + 3, i + 19)) >= this.lastMessageIndex;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public boolean isLocal() {
        return this.conversationShortId <= 0;
    }

    public boolean isMute() {
        C0Y8W c0y8w = this.settingInfo;
        return c0y8w != null && c0y8w.isMute();
    }

    public boolean isSingleChat() {
        return this.conversationType == AbstractC1711506n3.LIZ;
    }

    public boolean isStickTop() {
        C0Y8W c0y8w = this.settingInfo;
        return c0y8w != null && c0y8w.isStickTop();
    }

    public boolean isTemp() {
        return this.conversationShortId <= 0 || this.status == -1000;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C0Y8T m37clone() {
        try {
            return (C0Y8T) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public boolean isWaitingInfo() {
        Map<String, String> localExt = getLocalExt();
        return localExt != null && localExt.containsKey("s:conv_wait_info");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Conversation{conversationId='");
        sbLIZ.append(this.conversationId);
        sbLIZ.append('\'');
        sbLIZ.append(", conversationShortId=");
        sbLIZ.append(this.conversationShortId);
        sbLIZ.append(", conversationType=");
        sbLIZ.append(this.conversationType);
        sbLIZ.append(", isMember=");
        sbLIZ.append(this.isMember);
        sbLIZ.append(", memberCount=");
        sbLIZ.append(this.memberCount);
        sbLIZ.append(", unreadCount=");
        sbLIZ.append(this.unreadCount);
        sbLIZ.append(", fakeUnreadCount=");
        sbLIZ.append(this.fakeUnreadCount);
        sbLIZ.append(", updatedTime=");
        sbLIZ.append(this.updatedTime);
        sbLIZ.append(", readIndex=");
        sbLIZ.append(this.readIndex);
        sbLIZ.append(", lastMessageIndex=");
        sbLIZ.append(this.lastMessageIndex);
        sbLIZ.append(", inboxType=");
        sbLIZ.append(this.inboxType);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", draftTime=");
        sbLIZ.append(this.draftTime);
        sbLIZ.append(", draftContent='");
        sbLIZ.append(this.draftContent);
        sbLIZ.append('\'');
        sbLIZ.append(", sortOrder=");
        sbLIZ.append(this.sortOrder);
        sbLIZ.append(", localExt=");
        sbLIZ.append(this.localExt);
        sbLIZ.append(", memberIds=");
        sbLIZ.append(this.memberIds);
        sbLIZ.append(", lastMessage=");
        sbLIZ.append(this.lastShowMessage);
        sbLIZ.append(", member=");
        sbLIZ.append(this.member);
        sbLIZ.append(", isStranger=");
        sbLIZ.append(this.isStranger);
        sbLIZ.append(", isInBox=");
        sbLIZ.append(this.isInBox);
        sbLIZ.append(", members=");
        sbLIZ.append(this.members);
        sbLIZ.append(", isPreview=");
        sbLIZ.append(this.isPreview);
        sbLIZ.append(", badgeCount=");
        sbLIZ.append(this.badgeCount);
        sbLIZ.append(", readBadgeCount=");
        sbLIZ.append(this.readBadgeCount);
        sbLIZ.append(", conversationRankVersion=");
        sbLIZ.append(this.conversationRankVersion);
        sbLIZ.append(", badgeVersion=");
        sbLIZ.append(this.badgeVersion);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getBadgeCount() {
        return this.badgeCount;
    }

    public long getBadgeVersion() {
        return this.badgeVersion;
    }

    public ByteString getBizExt() {
        return this.bizExt;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public long getConversationRankVersion() {
        return this.conversationRankVersion;
    }

    public long getConversationShortId() {
        return this.conversationShortId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public C0Y8Y getCoreInfo() {
        return this.coreInfo;
    }

    public String getDraftContent() {
        return this.draftContent;
    }

    public long getDraftTime() {
        return this.draftTime;
    }

    public int getFakeUnreadCount() {
        return this.fakeUnreadCount;
    }

    public int getInboxType() {
        return this.inboxType;
    }

    public long getLastMessageIndex() {
        return this.lastMessageIndex;
    }

    public long getLastMessageOrderIndex() {
        return this.lastMessageOrderIndex;
    }

    public C869590Y9l getLastShowMessage() {
        return this.lastShowMessage;
    }

    public String getLastShowMessageUuid() {
        return this.lastShowMessageUuid;
    }

    public long getMaxIndexV2() {
        return this.maxIndexV2;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public List<C0YAE> getMembers() {
        return this.members;
    }

    public long getMinIndex() {
        return this.minIndex;
    }

    public long getMinIndexV2() {
        return this.minIndexV2;
    }

    public int getReadBadgeCount() {
        return this.readBadgeCount;
    }

    public long getReadIndex() {
        return this.readIndex;
    }

    public long getReadIndexV2() {
        return this.readIndexV2;
    }

    public C0Y8W getSettingInfo() {
        return this.settingInfo;
    }

    public List<C0YAE> getSingleChatMembers() {
        return this.singleChatMembers;
    }

    public long getSortOrder() {
        return this.sortOrder;
    }

    public int getStatus() {
        return this.status;
    }

    public long getUnreadCount() {
        return this.unreadCount;
    }

    public List<C869590Y9l> getUnreadSelfMentionedMessages() {
        return this.unreadSelfMentionedMessages;
    }

    public long getUpdatedTime() {
        return this.updatedTime;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public boolean isInBox() {
        return this.isInBox;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isRisky() {
        return this.isRisky;
    }

    public boolean isStranger() {
        return this.isStranger;
    }

    public String optGetLocalExtStr() {
        return this.localExtString;
    }

    public String optGetMemberStr() {
        return this.memberString;
    }

    private Map<String, String> convertToSynchronizedMap(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map instanceof ConcurrentHashMap) {
            return map;
        }
        try {
            return new ConcurrentHashMap(map);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    concurrentHashMap.put(entry.getKey(), entry.getValue());
                } else if (entry.getKey() != null) {
                    concurrentHashMap.put(entry.getKey(), "");
                }
            }
            return concurrentHashMap;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(C0Y8T c0y8t) {
        if (c0y8t.getStickTop() != getStickTop()) {
            return c0y8t.getStickTop() - getStickTop();
        }
        long jMax = Math.max(c0y8t.getUpdatedTime(), c0y8t.getDraftTime()) - Math.max(getUpdatedTime(), getDraftTime());
        if (jMax > 0) {
            return 1;
        }
        if (jMax < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0Y8T.class != obj.getClass()) {
            return false;
        }
        String str = this.conversationId;
        String str2 = ((C0Y8T) obj).conversationId;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public void optSetLocalExtStr(String str) {
        this.localExtString = str;
    }

    public void optSetMemberStr(String str) {
        this.memberString = str;
    }

    public boolean removeMentionMessage(String str) {
        List<C869590Y9l> list = this.unreadSelfMentionedMessages;
        if (list != null && !list.isEmpty()) {
            for (C869590Y9l c869590Y9l : this.unreadSelfMentionedMessages) {
                if (TextUtils.equals(str, c869590Y9l.getUuid())) {
                    this.unreadSelfMentionedMessages.remove(c869590Y9l);
                    return true;
                }
            }
        }
        return false;
    }

    public void setBizExt(ByteString byteString) {
        this.bizExt = byteString;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationRankVersion(long j) {
        this.conversationRankVersion = j;
    }

    public void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setCoreInfo(C0Y8Y c0y8y) {
        this.coreInfo = c0y8y;
    }

    public void setDraftContent(String str) {
        this.draftContent = str;
    }

    public void setDraftTime(long j) {
        this.draftTime = j;
    }

    public void setFakeUnreadCount(int i) {
        this.fakeUnreadCount = i;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setInBox(boolean z) {
        this.isInBox = z;
    }

    public void setInboxType(int i) {
        this.inboxType = i;
    }

    public void setIsMember(boolean z) {
        this.isMember = z;
    }

    public void setLastMessageIndex(long j) {
        if (this.lastMessageIndex < j) {
            this.lastMessageIndex = j;
        }
    }

    public void setLastMessageOrderIndex(long j) {
        if (this.lastMessageOrderIndex < j) {
            this.lastMessageOrderIndex = j;
        }
    }

    public boolean setLastShowMessage(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return false;
        }
        C869590Y9l c869590Y9l2 = this.lastShowMessage;
        if (c869590Y9l2 != null && c869590Y9l2.getOrderIndex() > c869590Y9l.getOrderIndex() && !this.lastShowMessage.isDeleted() && !this.lastShowMessage.isRecalled() && this.lastShowMessage.getSvrStatus() == 0) {
            return false;
        }
        setLastMessageOrderIndex(c869590Y9l.getOrderIndex());
        setLastShowMessageUuid(c869590Y9l.getUuid());
        this.lastShowMessage = c869590Y9l;
        return true;
    }

    public void setLastShowMessageUuid(String str) {
        this.lastShowMessageUuid = str;
    }

    public void setLocalExt(Map<String, String> map) {
        this.localExt = convertToSynchronizedMap(map);
    }

    public void setLocalExtStr(String str) {
        this.localExt = convertToSynchronizedMap(C09EF.LIZIZ(str));
    }

    public void setMaxIndexV2(long j) {
        if (j > this.maxIndexV2) {
            this.maxIndexV2 = j;
        }
    }

    public void setMember(C0YAE c0yae) {
        this.member = c0yae;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setMemberIds(List<Long> list) {
        this.memberIds = list;
    }

    public void setMemberStr(String str) {
        C0YAE c0yae = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                c0yae = (C0YAE) C09EF.LIZ.LJII(str, C0YAE.class);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.member = c0yae;
    }

    public void setMembers(List<C0YAE> list) {
        this.members = list;
    }

    public void setMinIndex(long j) {
        setMinIndex(j, false);
    }

    public void setMinIndexV2(long j) {
        if (j > this.minIndexV2) {
            this.minIndexV2 = j;
        }
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setReadBadgeCount(int i) {
        if (i > this.readBadgeCount) {
            this.readBadgeCount = i;
        }
    }

    public void setReadIndex(long j) {
        this.readIndex = j;
    }

    public void setReadIndexV2(long j) {
        if (j > this.readIndexV2) {
            this.readIndexV2 = j;
        }
    }

    public void setRisky(boolean z) {
        this.isRisky = z;
    }

    public void setSettingInfo(C0Y8W c0y8w) {
        this.settingInfo = c0y8w;
    }

    public void setSingleChatMembers(List<C0YAE> list) {
        this.singleChatMembers = list;
    }

    public void setSortOrder(long j) {
        this.sortOrder = j;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStranger(boolean z) {
        this.isStranger = z;
    }

    public void setUnreadCount(long j) {
        this.unreadCount = j;
    }

    public void setUnreadSelfMentionedMessages(List<C869590Y9l> list) {
        this.unreadSelfMentionedMessages = list;
    }

    public void setUpdatedTime(long j) {
        this.updatedTime = j;
    }

    public void setMinIndex(long j, boolean z) {
        if (j > this.minIndex || z) {
            this.minIndex = j;
        }
    }

    public void updateBadgeCount(int i, long j) {
        if (j > this.badgeVersion && i > 0) {
            this.badgeCount = i;
            this.badgeVersion = j;
        }
    }
}
