package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0ZIK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZIK implements Serializable {
    public String aid;
    public String enterMethod;
    public int isPrivateAccount;
    public String nickname;
    public int privateStatus;
    public final String secUid;
    public final int subType;
    public String uniqueId;
    public final String userId;

    public final int isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setPrivateAccount(int i) {
        this.isPrivateAccount = i;
    }

    public final void setPrivateStatus(int i) {
        this.privateStatus = i;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public C0ZIK(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        this.uniqueId = str;
        this.nickname = str2;
        this.userId = str3;
        this.secUid = str4;
        this.aid = str5;
        this.privateStatus = i;
        this.isPrivateAccount = i2;
        this.subType = i3;
        this.enterMethod = str6;
    }
}
