package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YA6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YA6 implements Serializable, Cloneable {
    public String clientMessageId;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public int inboxType;
    public boolean isResend;
    public C0YAO modifyMsgPropertyStatus;
    public int msgType;
    public boolean mute;
    public List<C0YAQ> propertyContentList;
    public long serverMessageId;

    public C0YA6 copy() {
        C0YA6 c0ya6 = new C0YA6();
        c0ya6.conversationId = getConversationId();
        c0ya6.conversationShortId = getConversationShortId();
        c0ya6.conversationType = getConversationType();
        c0ya6.inboxType = getInboxType();
        c0ya6.serverMessageId = getServerMessageId();
        c0ya6.clientMessageId = getClientMessageId();
        c0ya6.msgType = getMsgType();
        c0ya6.propertyContentList = getLocalPropertyContentList();
        c0ya6.modifyMsgPropertyStatus = getModifyMsgPropertyStatus();
        c0ya6.isResend = isResend();
        return c0ya6;
    }

    public List<ModifyPropertyContent> getPropertyContentList() {
        List<C0YAQ> list = this.propertyContentList;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C0YAQ> it2 = this.propertyContentList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        return arrayList;
    }

    public boolean invalid() {
        return TextUtils.isEmpty(this.conversationId);
    }

    public String toString() {
        return GsonProtectorUtils.toJson(C09EF.LIZ, this);
    }

    public String getClientMessageId() {
        return this.clientMessageId;
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

    public int getInboxType() {
        return this.inboxType;
    }

    public List<C0YAQ> getLocalPropertyContentList() {
        return this.propertyContentList;
    }

    public C0YAO getModifyMsgPropertyStatus() {
        return this.modifyMsgPropertyStatus;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public boolean getMute() {
        return this.mute;
    }

    public long getServerMessageId() {
        return this.serverMessageId;
    }

    public boolean isResend() {
        return this.isResend;
    }

    public void addPropertyContent(C0YA1 c0ya1) {
        C0YS6 c0ys6;
        C0YAP c0yap;
        ByteString bizExtra;
        if (c0ya1 == null) {
            return;
        }
        if (c0ya1.deleted == 1) {
            c0ys6 = C0YS6.REMOVE_PROPERTY_ITEM;
        } else {
            c0ys6 = C0YS6.ADD_PROPERTY_ITEM;
        }
        if (c0ya1.key.equals("e:love")) {
            c0yap = C0YAP.MESSAGE_REACTION_TYPE_LEGACY_EMOJI;
        } else if (c0ya1.key.startsWith("e:")) {
            c0yap = C0YAP.MESSAGE_REACTION_TYPE_EMOJI;
        } else if (c0ya1.key.startsWith("3:")) {
            c0yap = C0YAP.MESSAGE_REACTION_TYPE_AI_MOJI;
        } else {
            c0yap = C0YAP.MESSAGE_REACTION_TYPE_UNKNOWN;
        }
        String str = c0ya1.key;
        String str2 = c0ya1.value;
        String str3 = c0ya1.idempotent_id;
        if (c0ya1.getBizExtra() == null) {
            bizExtra = ByteString.EMPTY;
        } else {
            bizExtra = c0ya1.getBizExtra();
        }
        addPropertyContent(new C0YAQ(new ModifyPropertyContent(c0ys6, str, str2, str3, c0yap, bizExtra), c0ya1.url));
    }

    public void removePropertyContent(C0YA1 c0ya1) {
        List<C0YAQ> list;
        if (c0ya1 != null && (list = this.propertyContentList) != null && !list.isEmpty()) {
            int size = this.propertyContentList.size();
            for (int i = 0; i < size; i++) {
                C0YAQ c0yaq = (C0YAQ) ListProtector.get(this.propertyContentList, i);
                if (c0yaq != null && TextUtils.equals(c0ya1.key, c0yaq.LIZ.key) && TextUtils.equals(c0ya1.idempotent_id, c0yaq.LIZ.idempotent_id)) {
                    ListProtector.remove(this.propertyContentList, i);
                    return;
                }
            }
        }
    }

    public void setClientMessageId(String str) {
        this.clientMessageId = str;
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

    public void setInboxType(int i) {
        this.inboxType = i;
    }

    public void setModifyMsgPropertyStatus(C0YAO c0yao) {
        this.modifyMsgPropertyStatus = c0yao;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setMute(boolean z) {
        this.mute = z;
    }

    public void setPropertyContentList(List<C0YAQ> list) {
        this.propertyContentList = list;
    }

    public void setResend(boolean z) {
        this.isResend = z;
    }

    public void setServerMessageId(long j) {
        this.serverMessageId = j;
    }

    public void addPropertyContent(C0YAQ c0yaq) {
        if (this.propertyContentList == null) {
            this.propertyContentList = new CopyOnWriteArrayList();
        }
        this.propertyContentList.add(c0yaq);
    }
}
