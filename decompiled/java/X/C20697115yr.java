package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.15yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20697115yr implements Serializable {
    public String describe;
    public String enterFrom;
    public String hashTagName;
    public boolean isEnterpriseUser;
    public boolean isHashTag;
    public String objectId;
    public String title;
    public int type;
    public String webDes;
    public String webImage;
    public String webUrl;

    public C20697115yr() {
    }

    public String getWebDes() {
        return this.webDes;
    }

    public String getWebImage() {
        return this.webImage;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setWebDes(String str) {
        this.webDes = str;
    }

    public void setWebImage(String str) {
        this.webImage = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public C20697115yr(int i, String str, String str2) {
        this.type = i;
        this.objectId = str;
        this.hashTagName = "";
        this.enterFrom = str2;
    }

    public C20697115yr(int i, String str, boolean z, String str2, String str3) {
        this.type = i;
        this.objectId = str;
        this.isHashTag = z;
        this.hashTagName = str2;
        this.enterFrom = str3;
    }
}
