package X;

import com.bytedance.im.core.proto.UrlStruct;
import java.io.Serializable;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YA1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YA1 implements Serializable {
    public ByteString bizExtra = ByteString.EMPTY;
    public transient Object bizExtraCache;
    public String conversationId;
    public long createTimeMicros;
    public int deleted;
    public String idempotent_id;
    public String key;
    public String msgUuid;
    public String sec_uid;
    public int status;
    public Long uid;
    public transient UrlStruct url;
    public String value;
    public long version;

    public long getCreateTimeSeconds() {
        return this.createTimeMicros / 1000000;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalPropertyItem(msgUuid: ");
        sbLIZ.append(this.msgUuid);
        sbLIZ.append(",conversationId: ");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(",uid: ");
        sbLIZ.append(this.uid);
        sbLIZ.append(",sec_uid: ");
        sbLIZ.append(this.sec_uid);
        sbLIZ.append(",createTimeMicros: ");
        sbLIZ.append(this.createTimeMicros);
        sbLIZ.append(",idempotent_id: ");
        sbLIZ.append(this.idempotent_id);
        sbLIZ.append(",key: ");
        sbLIZ.append(this.key);
        sbLIZ.append(",version: ");
        sbLIZ.append(this.version);
        sbLIZ.append(",status: ");
        sbLIZ.append(this.status);
        sbLIZ.append(",deleted: ");
        sbLIZ.append(this.deleted);
        sbLIZ.append(",urlStruct: ");
        sbLIZ.append(this.url);
        sbLIZ.append(" ,bizExtra");
        sbLIZ.append(this.bizExtra);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ByteString getBizExtra() {
        return this.bizExtra;
    }

    public Object getBizExtraCache() {
        return this.bizExtraCache;
    }

    public void setBizExtra(ByteString byteString) {
        this.bizExtra = byteString;
        this.bizExtraCache = null;
    }

    public void setBizExtraCache(Object obj) {
        this.bizExtraCache = obj;
    }

    public void setCreateTimeSeconds(long j) {
        this.createTimeMicros = j * 1000000;
    }

    public void setCreateTime(long j, long j2) {
        if (j != 0) {
            this.createTimeMicros = j;
        } else if (j2 > 2147483647L) {
            this.createTimeMicros = j2 * 1000;
        } else {
            this.createTimeMicros = j2 * 1000000;
        }
    }
}
