package X;

import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message.LiveMessageID;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.ss.ugc.live.sdk.message.data.FullLinkTrack;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageID;
import com.ss.ugc.live.sdk.message.data.MessageSEI;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.util.Map;

/* JADX INFO: renamed from: X.0ffY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1136060ffY extends BaseMessage implements IMessage {
    public transient boolean consumedSEI;
    public transient long decodeEndAtMillis;
    public transient long decodeStartAtMillis;
    public transient long dispatchAtMillis;
    public transient long dispatchTimeoutMilis;
    public transient FullLinkTrack fullLinkTrack;
    public transient int generalMessageType;
    public transient boolean historyMessageFromApi;
    public boolean isFirst;
    public transient boolean isHistoryMessage;
    public volatile Boolean isIntercepted;
    public transient boolean isLocalInsertMsg;
    public int messageFrom;
    public transient long outerMessageId;
    public transient ProtoApiResult.ProtoMessage protoMessage;
    public transient int sampleFlag;

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public int consumingStrategy() {
        return 0;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public int getPriority() {
        return 0;
    }

    public boolean supportDisplayText() {
        return false;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public MessageID getDependID() {
        LiveMessageID liveMessageID;
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData == null || (liveMessageID = commonMessageData.dependID) == null) {
            return null;
        }
        MessageID messageID = new MessageID();
        messageID.primaryID = liveMessageID.primaryID;
        messageID.messageScene = liveMessageID.messageScene;
        return messageID;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public MessageID getDependRootID() {
        LiveMessageID liveMessageID;
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData == null || (liveMessageID = commonMessageData.dependRootID) == null) {
            return null;
        }
        MessageID messageID = new MessageID();
        messageID.primaryID = liveMessageID.primaryID;
        messageID.messageScene = liveMessageID.messageScene;
        return messageID;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public long getDimension() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null) {
            return commonMessageData.roomId;
        }
        return 0L;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public int getDispatchStrategy() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData == null) {
            return 0;
        }
        return commonMessageData.dispatchStrategy;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public int getIntType() {
        return this.type.getIntType();
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public long getMessageId() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null) {
            return commonMessageData.messageId;
        }
        return 0L;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public MessageSEI getMessageSEI() {
        LiveMessageSEI liveMessageSEI;
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData == null || (liveMessageSEI = commonMessageData.messageSEI) == null) {
            return null;
        }
        return liveMessageSEI.LIZ(this.localTimestamp);
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public String getMethodName() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData == null) {
            return null;
        }
        return commonMessageData.method;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public long getOuterMessageId() {
        long j = this.outerMessageId;
        return j == 0 ? getMessageId() : j;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public boolean needMonitor() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.monitor == 0) ? false : true;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public void removeDependID() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null) {
            commonMessageData.dependID = null;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public void removeMessageSEI() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData == null) {
            return;
        }
        if (commonMessageData.messageSEI != null) {
            this.consumedSEI = true;
        }
        commonMessageData.messageSEI = null;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public boolean consumedMessageSEI() {
        return this.consumedSEI;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public long getDecodeEndAtMillis() {
        return this.decodeEndAtMillis;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public long getDecodeStartAtMillis() {
        return this.decodeStartAtMillis;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public long getDispatchAtMillis() {
        return this.dispatchAtMillis;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public long getDispatchTimeoutMillis() {
        return this.dispatchTimeoutMilis;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public Map<String, Object> getExtraParams() {
        return this.mExtraParams;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public FullLinkTrack getFullLinkTrack() {
        return this.fullLinkTrack;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public int getGeneralMessageType() {
        return this.generalMessageType;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public Boolean getIntercepted() {
        return this.isIntercepted;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public long getLocalTimestamp() {
        return this.localTimestamp;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public int getMessageFrom() {
        return this.messageFrom;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public ProtoApiResult.ProtoMessage getProtoMessage() {
        return this.protoMessage;
    }

    public int getSampleFlag() {
        return this.sampleFlag;
    }

    public boolean isHistoryMessage() {
        return this.isHistoryMessage;
    }

    public boolean isHistoryMessageFromApi() {
        return this.historyMessageFromApi;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public void setDecodeEndAtMillis(long j) {
        this.decodeEndAtMillis = j;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public void setDecodeStartAtMillis(long j) {
        this.decodeStartAtMillis = j;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public void setDispatchAtMillis(long j) {
        this.dispatchAtMillis = j;
    }

    public void setDispatchTimeoutMillis(long j) {
        this.dispatchTimeoutMilis = j;
    }

    public void setGeneralMessageType(int i) {
        this.generalMessageType = i;
    }

    public void setHistoryMessage(boolean z) {
        this.isHistoryMessage = z;
    }

    public void setHistoryMessageFromApi(boolean z) {
        this.historyMessageFromApi = z;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public void setIntercepted(Boolean bool) {
        this.isIntercepted = bool;
    }

    public void setMessageFrom(int i) {
        this.messageFrom = i;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public void setOuterMessageId(long j) {
        this.outerMessageId = j;
    }

    @Override // com.ss.ugc.live.sdk.message.data.IMessage
    public void setProtoMessage(ProtoApiResult.ProtoMessage protoMessage) {
        this.protoMessage = protoMessage;
    }

    public void setSampleFlag(int i) {
        this.sampleFlag = i;
    }
}
