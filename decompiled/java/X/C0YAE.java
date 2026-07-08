package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0YAE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAE implements Serializable {
    public String alias;
    public String conversationId;
    public int conversationType;
    public int role;
    public String secUid;
    public int silent;
    public long silentTime;
    public long sortOrder;
    public long uid;

    public int hashCode() {
        if (this.conversationId == null || this.uid == 0) {
            return 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.conversationId);
        sbLIZ.append("_");
        sbLIZ.append(this.uid);
        return C2188811AlT.LIZIZ(sbLIZ).hashCode();
    }

    public String getAlias() {
        return this.alias;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public int getRole() {
        return this.role;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public int getSilent() {
        return this.silent;
    }

    public long getSilentTime() {
        return this.silentTime;
    }

    public long getSortOrder() {
        return this.sortOrder;
    }

    public long getUid() {
        return this.uid;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0YAE.class != obj.getClass()) {
            return false;
        }
        C0YAE c0yae = (C0YAE) obj;
        String str = this.conversationId;
        if (str != null) {
            if (!str.equals(c0yae.conversationId)) {
                return false;
            }
        } else if (c0yae.conversationId != null) {
            return false;
        }
        if (this.uid == c0yae.uid) {
            return true;
        }
        return false;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setRole(int i) {
        this.role = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSilent(int i) {
        this.silent = i;
    }

    public void setSilentTime(long j) {
        this.silentTime = j;
    }

    public void setSortOrder(long j) {
        this.sortOrder = j;
    }

    public void setUid(long j) {
        this.uid = j;
    }
}
