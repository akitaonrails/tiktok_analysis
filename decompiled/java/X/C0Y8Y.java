package X;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y8Y, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8Y implements Serializable {
    public ByteString bizCorePersistentExtra;
    public String conversationId;
    public long creator;
    public String desc;
    public Map<String, String> ext;
    public String extString;
    public long firstMessageTimestamp;
    public String icon;
    public List<String> memberRegions;
    public int mode;
    public String name;
    public String notice;
    public long owner;
    public String secOwner;
    public int silent;
    public int silentNormalOnly;
    public long version;

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

    public String getExtStr() {
        return C09EF.LIZ(this.ext);
    }

    public ByteString getBizCorePersistentExtraRaw() {
        return this.bizCorePersistentExtra;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public long getCreator() {
        return this.creator;
    }

    public String getDesc() {
        return this.desc;
    }

    public long getFirstMessageTimestamp() {
        return this.firstMessageTimestamp;
    }

    public String getIcon() {
        return this.icon;
    }

    public List<String> getMemberRegions() {
        return this.memberRegions;
    }

    public int getMode() {
        return this.mode;
    }

    public String getName() {
        return this.name;
    }

    public String getNotice() {
        return this.notice;
    }

    public long getOwner() {
        return this.owner;
    }

    public String getSecOwner() {
        return this.secOwner;
    }

    public int getSilent() {
        return this.silent;
    }

    public int getSilentNormalOnly() {
        return this.silentNormalOnly;
    }

    public long getVersion() {
        return this.version;
    }

    public String optGetExtStr() {
        return this.extString;
    }

    public void optSetExtStr(String str) {
        this.extString = str;
    }

    public void setBizCorePersistentExtraRaw(ByteString byteString) {
        this.bizCorePersistentExtra = byteString;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setCreator(long j) {
        this.creator = j;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public void setExtStr(String str) {
        this.ext = C09EF.LIZIZ(str);
    }

    public void setFirstMessageTimestamp(long j) {
        this.firstMessageTimestamp = j;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setMemberRegions(List<String> list) {
        this.memberRegions = list;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setOwner(long j) {
        this.owner = j;
    }

    public void setSecOwner(String str) {
        this.secOwner = str;
    }

    public void setSilent(int i) {
        this.silent = i;
    }

    public void setSilentNormalOnly(int i) {
        this.silentNormalOnly = i;
    }

    public void setVersion(long j) {
        this.version = j;
    }
}
