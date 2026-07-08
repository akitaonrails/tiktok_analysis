package X;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C869590Y9l implements Serializable, Comparable<C869590Y9l>, Cloneable {
    public List<C0YC6> attachments;

    @C09EE
    public String content;

    @C09EE
    public ByteString contentPB;
    public int convRankUpdateRule;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public long createdAt;
    public int deleted;
    public Map<String, String> ext;
    public String extString;
    public long index;
    public long indexInConversationV2;
    public long instantiatedAt;
    public transient SparseArray<Object> localCache;
    public long localCreatedAt;
    public final Map<String, String> localExt;
    public String localExtString;
    public transient SparseArray<WeakReference<Object>> mKeyedTags;
    public C0YUT messageStatus;
    public long msgId;
    public int msgStatus;
    public int msgType;
    public long orderIndex;

    @C09EE
    public ByteString persistentExt;
    public long prevIndex;
    public Map<String, List<C0YA1>> propertyItemListMap;
    public int readStatus;
    public ReferenceInfo referenceInfo;
    public String referenceInfoString;
    public long rowid;
    public String scene;
    public String secSender;
    public long sender;
    public C869220Y8a senderInfo;
    public String source;
    public Integer sourceAppId;
    public String sourceVregion;
    public int svrStatus;
    public long tableFlag;
    public boolean toStringPrivacyFilter;

    @C09EE
    public ByteString transientExt;
    public long ttl;
    public String uuid;
    public long version;

    public synchronized SparseArray<Object> getAllLocalCache() {
        return this.localCache;
    }

    public synchronized Map<String, String> getExt() {
        if (this.ext == null) {
            String str = this.extString;
            if (str == null) {
                this.ext = new HashMap();
            } else {
                setExtStr(str);
                this.extString = null;
                if (this.ext == null) {
                    this.ext = new HashMap();
                }
            }
        }
        return this.ext;
    }

    private String[] getMentionIdsFromExt() {
        Map<String, String> map = this.ext;
        if (map == null || !map.containsKey("a:mentioned_uids")) {
            return null;
        }
        String str = this.ext.get("a:mentioned_uids");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(",");
    }

    private Gson getToStringGsonByLogPrivacy() {
        return this.toStringPrivacyFilter ? C09EF.LIZIZ : C09EF.LIZ;
    }

    public void clearAllMentionIds() {
        this.ext.remove("a:mentioned_uids");
    }

    public String getExtStr() {
        return C09EF.LIZ(this.ext);
    }

    public Map<String, String> getLocalExt() {
        String str = this.localExtString;
        if (str != null) {
            setLocalExtStr(str);
            this.localExtString = null;
        }
        return this.localExt;
    }

    public String getLocalExtStr() {
        return C09EF.LIZ(this.localExt);
    }

    public C0YUT getMessageStatus() {
        C0YUT c0yut = this.messageStatus;
        return c0yut == null ? isDeleted() ? C0YUT.DELETED : isRecalled() ? C0YUT.RECALLED : C0YUT.AVAILABLE : c0yut;
    }

    public Map<String, List<C0YA1>> getPropertyItemListMap() {
        if (this.propertyItemListMap == null) {
            setPropertyItemListMap(new HashMap());
        }
        return this.propertyItemListMap;
    }

    public long getRefMsgId() {
        String str;
        ReferenceInfo referenceInfo = this.referenceInfo;
        if ((referenceInfo == null || referenceInfo.referenced_message_id.longValue() <= 0) && (str = this.referenceInfoString) != null) {
            setRefMsg((ReferenceInfo) GsonProtectorUtils.fromJson(C09EF.LIZ, str, ReferenceInfo.class));
            this.referenceInfoString = null;
        }
        String str2 = getLocalExt().get("s:sdk_ref_msg_id");
        if (TextUtils.isEmpty(str2)) {
            return -1L;
        }
        try {
            return CastLongProtector.parseLong(str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1L;
        }
    }

    public ReferenceInfo getReferenceInfo() {
        String str;
        ReferenceInfo referenceInfo = this.referenceInfo;
        if ((referenceInfo == null || referenceInfo.referenced_message_id.longValue() <= 0) && (str = this.referenceInfoString) != null) {
            setRefMsg((ReferenceInfo) GsonProtectorUtils.fromJson(C09EF.LIZ, str, ReferenceInfo.class));
            this.referenceInfoString = null;
        }
        return this.referenceInfo;
    }

    public String getSecSender() {
        if (TextUtils.isEmpty(this.secSender)) {
            this.secSender = "";
        }
        return this.secSender;
    }

    public int hashCode() {
        String str = this.uuid;
        return str != null ? str.hashCode() : super.hashCode();
    }

    public boolean invalid() {
        return this.sender <= 0 || TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.uuid);
    }

    public boolean isDeleted() {
        return this.deleted == 1;
    }

    public boolean isSentByServer() {
        String extValue = getExtValue("a:sys_msg_source");
        return extValue != null && extValue.equals("resend_failed_msg");
    }

    public boolean isSuccessStatus() {
        return C0YE1.LIZ.contains(Integer.valueOf(this.msgStatus));
    }

    public long optGetRefMsgId() {
        int iIndexOf;
        String str = this.localExtString;
        if (str == null || (iIndexOf = str.indexOf("s:sdk_ref_msg_id")) == -1) {
            return -1L;
        }
        try {
            int i = iIndexOf + 16;
            return CastLongProtector.parseLong(this.localExtString.substring(i + 3, i + 22));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1L;
        }
    }

    public C869590Y9l() {
        ByteString byteString = ByteString.EMPTY;
        this.contentPB = byteString;
        this.persistentExt = byteString;
        this.transientExt = byteString;
        this.secSender = "";
        this.uuid = UUID.randomUUID().toString();
        this.localExt = new ConcurrentHashMap();
        this.toStringPrivacyFilter = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.createdAt = jCurrentTimeMillis;
        this.instantiatedAt = jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C869590Y9l m38clone() {
        try {
            return (C869590Y9l) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public String getCreationUuid() {
        return getLocalExt().get("s:media_creation_uuid");
    }

    public boolean getHasMention() {
        return getLocalExt().get("a:mentioned") != null;
    }

    public List<Long> getMentionIds() {
        String[] mentionIdsFromExt = getMentionIdsFromExt();
        if (mentionIdsFromExt == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : mentionIdsFromExt) {
            try {
                arrayList.add(Long.valueOf(CastLongProtector.parseLong(str)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return arrayList;
    }

    public boolean isIndexLocal() {
        return "1".equals(getLocalExt().get("s:message_index_is_local"));
    }

    public boolean isRecalled() {
        return "1".equals(getExt().get("s:is_recalled")) || "true".equals(getExt().get("s:recalled"));
    }

    public String toString() {
        return GsonProtectorUtils.toJson(getToStringGsonByLogPrivacy(), this);
    }

    public List<C0YC6> getAttachments() {
        return this.attachments;
    }

    public String getContent() {
        return this.content;
    }

    public ByteString getContentPB() {
        return this.contentPB;
    }

    public int getConvRankUpdateRule() {
        return this.convRankUpdateRule;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public long getConversationShortId() {
        return this.conversationShortId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public int getDeleted() {
        return this.deleted;
    }

    public long getIndex() {
        return this.index;
    }

    public long getIndexInConversationV2() {
        return this.indexInConversationV2;
    }

    public long getInstantiatedAt() {
        return this.instantiatedAt;
    }

    public long getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public int getMsgStatus() {
        return this.msgStatus;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public long getOrderIndex() {
        return this.orderIndex;
    }

    public ByteString getPersistentExtra() {
        return this.persistentExt;
    }

    public long getPrevIndex() {
        return this.prevIndex;
    }

    public int getReadStatus() {
        return this.readStatus;
    }

    public long getRowId() {
        return this.rowid;
    }

    public String getScene() {
        return this.scene;
    }

    public long getSender() {
        return this.sender;
    }

    public C869220Y8a getSenderInfo() {
        return this.senderInfo;
    }

    public String getSource() {
        return this.source;
    }

    public Integer getSourceAppId() {
        return this.sourceAppId;
    }

    public String getSourceVregion() {
        return this.sourceVregion;
    }

    public int getSvrStatus() {
        return this.svrStatus;
    }

    public long getTableFlag() {
        return this.tableFlag;
    }

    public ByteString getTransientExt() {
        return this.transientExt;
    }

    public long getTtl() {
        return this.ttl;
    }

    public String getUuid() {
        return this.uuid;
    }

    public long getVersion() {
        return this.version;
    }

    public String optGetExtStr() {
        return this.extString;
    }

    public String optGetLocalExtStr() {
        return this.localExtString;
    }

    public String optGetRefMsgStr() {
        return this.referenceInfoString;
    }

    private void setRefMsgId(String str) {
        getLocalExt().put("s:sdk_ref_msg_id", str);
    }

    public void clearLocalExt(String str) {
        this.localExt.remove(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(C869590Y9l c869590Y9l) {
        if (equals(c869590Y9l)) {
            return 0;
        }
        long orderIndex = c869590Y9l.getOrderIndex() - getOrderIndex();
        if (orderIndex > 0) {
            return 1;
        }
        if (orderIndex < 0) {
            return -1;
        }
        long createdAt = c869590Y9l.getCreatedAt() - getCreatedAt();
        if (createdAt > 0) {
            return 1;
        }
        if (createdAt >= 0) {
            return 0;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.uuid;
        String str2 = ((C869590Y9l) obj).uuid;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public String getExtValue(String str) {
        return getMapValue(this.ext, str);
    }

    public synchronized Object getLocalCache(int i) {
        SparseArray<Object> sparseArray = this.localCache;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    public String getLocalExtValue(String str) {
        return getMapValue(this.localExt, str);
    }

    public Object getTag(int i) {
        SparseArray<WeakReference<Object>> sparseArray = this.mKeyedTags;
        if (sparseArray != null && sparseArray.get(i) != null) {
            return this.mKeyedTags.get(i).get();
        }
        return null;
    }

    public boolean isMention(long j) {
        List<Long> mentionIds = getMentionIds();
        if (mentionIds != null) {
            if (mentionIds.contains(Long.valueOf(j)) || mentionIds.contains(0L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isSelf(long j) {
        if (j == this.sender) {
            return true;
        }
        return false;
    }

    public void optSetExtStr(String str) {
        this.extString = str;
    }

    public void optSetLocalExtStr(String str) {
        this.localExtString = str;
    }

    public void optSetRefMsgStr(String str) {
        this.referenceInfoString = str;
    }

    public synchronized void putExt(Map<String, String> map) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.putAll(map);
    }

    public void putLocalExt(Map<String, String> map) {
        this.localExt.putAll(map);
    }

    public synchronized void setAllLocalCache(SparseArray<Object> sparseArray) {
        this.localCache = sparseArray;
    }

    public void setAttachments(List<C0YC6> list) {
        this.attachments = list;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setContentPB(ByteString byteString) {
        this.contentPB = byteString;
    }

    public void setConvRankUpdateRule(int i) {
        this.convRankUpdateRule = i;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public void setCreationUuid(String str) {
        addLocalExt("s:media_creation_uuid", str);
    }

    public void setDeleted(int i) {
        this.deleted = i;
    }

    public void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public void setExtStr(String str) {
        this.ext = C09EF.LIZIZ(str);
    }

    public void setIndex(long j) {
        this.index = j;
    }

    public void setIndexInConversationV2(long j) {
        if (this.indexInConversationV2 < j) {
            this.indexInConversationV2 = j;
        }
    }

    public void setLocalCreatedAt(long j) {
        this.localCreatedAt = j;
    }

    public void setLocalExt(Map<String, String> map) {
        this.localExt.clear();
        if (map != null) {
            this.localExt.putAll(map);
        }
    }

    public void setLocalExtStr(String str) {
        Map<String, String> mapLIZIZ = C09EF.LIZIZ(str);
        if (mapLIZIZ == null) {
            return;
        }
        this.localExt.clear();
        this.localExt.putAll(mapLIZIZ);
    }

    public void setMessageStatus(C0YUT c0yut) {
        this.messageStatus = c0yut;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setMsgStatus(int i) {
        this.msgStatus = i;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setOrderIndex(long j) {
        if (this.orderIndex < j) {
            this.orderIndex = j;
        }
    }

    public void setPersistentExtra(ByteString byteString) {
        this.persistentExt = byteString;
    }

    public void setPrevIndex(long j) {
        this.prevIndex = j;
    }

    public void setPropertyItemListMap(Map<String, List<C0YA1>> map) {
        if (map == null) {
            this.propertyItemListMap = new HashMap();
        } else {
            this.propertyItemListMap = map;
        }
    }

    public void setReadStatus(int i) {
        this.readStatus = i;
    }

    public void setRefMsg(ReferenceInfo referenceInfo) {
        if (referenceInfo != null && referenceInfo.referenced_message_id.longValue() > 0) {
            this.referenceInfo = referenceInfo.newBuilder().build();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(referenceInfo.referenced_message_id);
            sbLIZ.append("");
            setRefMsgId(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.referenceInfo = null;
        setRefMsgId("");
    }

    public void setRowId(long j) {
        this.rowid = j;
    }

    public void setScene(String str) {
        this.scene = str;
    }

    public void setSecSender(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.secSender = str;
    }

    public void setSender(long j) {
        this.sender = j;
    }

    public void setSenderInfo(C869220Y8a c869220Y8a) {
        this.senderInfo = c869220Y8a;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSourceAppId(Integer num) {
        this.sourceAppId = num;
    }

    public void setSourceVregion(String str) {
        this.sourceVregion = str;
    }

    public void setSvrStatus(int i) {
        this.svrStatus = i;
    }

    public void setSvrStatusFromServer(MessageBody messageBody) {
        Integer num = messageBody.status;
        if (num != null && num.intValue() == 1) {
            this.svrStatus = messageBody.status.intValue();
        } else {
            this.svrStatus = 0;
        }
    }

    public void setTableFlag(long j) {
        this.tableFlag = j;
    }

    public void setTransientExt(ByteString byteString) {
        this.transientExt = byteString;
    }

    public void setTtl(long j) {
        this.ttl = j;
    }

    public void setUuid(String str) {
        if (str == null) {
            return;
        }
        this.uuid = str;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public void updateMentionLocalExt(long j) {
        if (isMention(j)) {
            addLocalExt("a:mentioned", "");
        }
    }

    public void updatePropertyFromServer(MessageBody messageBody) {
        Long l;
        if (messageBody != null && (l = messageBody.version) != null && l.longValue() >= this.version) {
            this.propertyItemListMap = C0YA8.LIZ(messageBody, this.uuid, this.conversationId);
        }
    }

    private String getMapValue(Map<String, String> map, String str) {
        if (map != null && !map.isEmpty() && !TextUtils.isEmpty(str)) {
            return map.get(str);
        }
        return null;
    }

    public synchronized void addExt(String str, String str2) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(str, str2);
    }

    public void addLocalExt(String str, String str2) {
        this.localExt.put(str, str2);
    }

    public synchronized void putLocalCache(int i, Object obj) {
        if (this.localCache == null) {
            this.localCache = new SparseArray<>(1);
        }
        this.localCache.put(i, obj);
    }

    public void setTag(int i, Object obj) {
        if (this.mKeyedTags == null) {
            this.mKeyedTags = new SparseArray<>(2);
        }
        this.mKeyedTags.put(i, new WeakReference<>(obj));
    }

    public void forceUpdateIndexes(Long l, Long l2, Long l3, Integer num, Long l4) {
        if (l != null) {
            this.index = l.longValue();
        }
        if (l2 != null) {
            this.prevIndex = l2.longValue();
        }
        if (l3 != null) {
            this.orderIndex = l3.longValue();
        }
        if (num != null) {
            this.msgStatus = num.intValue();
        }
        if (l4 != null) {
            this.version = l4.longValue();
        }
    }
}
