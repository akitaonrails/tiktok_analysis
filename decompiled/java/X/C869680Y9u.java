package X;

import android.util.SparseArray;
import com.bytedance.im.core.proto.ReferenceInfo;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C869680Y9u {
    public final C869590Y9l msg;

    public C869590Y9l newMessage() {
        return new C869590Y9l();
    }

    public C869590Y9l build() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C869590Y9l c869590Y9l = this.msg;
        if (c869590Y9l.createdAt <= 0) {
            c869590Y9l.createdAt = jCurrentTimeMillis;
        }
        if (c869590Y9l.localCreatedAt <= 0) {
            c869590Y9l.localCreatedAt = jCurrentTimeMillis;
        }
        c869590Y9l.instantiatedAt = jCurrentTimeMillis;
        c869590Y9l.msgStatus = 0;
        return c869590Y9l;
    }

    public C869680Y9u attachments(List<C0YC6> list) {
        this.msg.attachments = list;
        return this;
    }

    public C869680Y9u content(String str) {
        this.msg.content = str;
        return this;
    }

    public C869680Y9u contentPB(ByteString byteString) {
        this.msg.contentPB = byteString;
        return this;
    }

    public C869680Y9u conversation(C0Y8T c0y8t) {
        this.msg.conversationId = c0y8t.getConversationId();
        this.msg.conversationShortId = c0y8t.getConversationShortId();
        this.msg.conversationType = c0y8t.getConversationType();
        this.msg.orderIndex = C1759406um.LIZJ(c0y8t);
        this.msg.index = C1759406um.LIZIZ(c0y8t);
        C869590Y9l c869590Y9l = this.msg;
        c869590Y9l.indexInConversationV2 = -1L;
        c869590Y9l.addLocalExt("s:message_index_is_local", "1");
        return this;
    }

    public C869680Y9u createdAt(long j) {
        if (j > 0) {
            this.msg.createdAt = j;
        }
        return this;
    }

    public C869680Y9u ext(Map<String, String> map) {
        if (map != null) {
            this.msg.putExt(map);
        }
        return this;
    }

    public C869680Y9u localCache(SparseArray<Object> sparseArray) {
        if (sparseArray != null) {
            SparseArray<Object> sparseArray2 = this.msg.localCache;
            if (sparseArray2 != null) {
                sparseArray2.clear();
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                this.msg.putLocalCache(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
        return this;
    }

    public C869680Y9u localExt(Map<String, String> map) {
        this.msg.localExt.clear();
        if (map != null) {
            this.msg.localExt.putAll(map);
        }
        return this;
    }

    public C869680Y9u msgType(int i) {
        this.msg.msgType = i;
        return this;
    }

    public C869680Y9u orderIndex(long j) {
        this.msg.orderIndex = j;
        return this;
    }

    public C869680Y9u persistentExt(ByteString byteString) {
        this.msg.setPersistentExtra(byteString);
        return this;
    }

    public C869680Y9u referenceInfo(ReferenceInfo referenceInfo) {
        C869590Y9l c869590Y9l = this.msg;
        c869590Y9l.referenceInfo = referenceInfo;
        c869590Y9l.setRefMsg(referenceInfo);
        return this;
    }

    public C869680Y9u scene(String str) {
        this.msg.scene = str;
        return this;
    }

    public C869680Y9u sender(long j) {
        this.msg.sender = j;
        return this;
    }

    public C869680Y9u source(String str) {
        this.msg.source = str;
        return this;
    }

    public C869680Y9u toStringPrivacyFilter(boolean z) {
        this.msg.toStringPrivacyFilter = z;
        return this;
    }

    public C869680Y9u transientExt(ByteString byteString) {
        this.msg.setTransientExt(byteString);
        return this;
    }

    public C869680Y9u(long j, String str) {
        C869590Y9l c869590Y9lNewMessage = newMessage();
        this.msg = c869590Y9lNewMessage;
        c869590Y9lNewMessage.sender = j;
        if (str != null) {
            c869590Y9lNewMessage.secSender = str;
        }
    }
}
