package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0hI8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198420hI8 implements Serializable {
    public final String contentPB;
    public final String desc;
    public final String enableLocation;
    public final String enterFrom;
    public final String enterMethod;
    public final String fromUserID;
    public final Integer isPoiPublishNewUser;
    public final String isSystemPrecise;
    public final String shortURL;

    public final Integer isPoiPublishNewUser() {
        return this.isPoiPublishNewUser;
    }

    public final String isSystemPrecise() {
        return this.isSystemPrecise;
    }

    public C1198420hI8(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8) {
        this.contentPB = str;
        this.enterFrom = str2;
        this.enterMethod = str3;
        this.fromUserID = str4;
        this.isSystemPrecise = str5;
        this.isPoiPublishNewUser = num;
        this.enableLocation = str6;
        this.shortURL = str7;
        this.desc = str8;
    }
}
