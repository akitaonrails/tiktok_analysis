package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0Y8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869220Y8a implements Serializable {
    public String basicExtInfo;
    public String senderNickName;
    public String senderPortrait;

    public String getBasicExtInfo() {
        return this.basicExtInfo;
    }

    public String getSenderNickName() {
        return this.senderNickName;
    }

    public String getSenderPortrait() {
        return this.senderPortrait;
    }

    public C869220Y8a(String str, String str2, String str3) {
        this.senderPortrait = str;
        this.senderNickName = str2;
        this.basicExtInfo = str3;
    }
}
