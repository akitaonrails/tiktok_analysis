package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0Pkb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653750Pkb implements Serializable {
    public final String groupPosition;
    public final String innerRsDocRank;
    public final String isInner;
    public final String isPlayMusic;
    public final String wordsPosition;
    public final String wordsType;

    public final String isInner() {
        return this.isInner;
    }

    public final String isPlayMusic() {
        return this.isPlayMusic;
    }

    public C653750Pkb(String str, String str2, String str3, String str4, String str5, String str6) {
        this.wordsType = str;
        this.isInner = str2;
        this.isPlayMusic = str3;
        this.groupPosition = str4;
        this.wordsPosition = str5;
        this.innerRsDocRank = str6;
    }
}
