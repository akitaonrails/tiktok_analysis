package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0QVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671460QVk implements Serializable {
    public static final int $stable = 0;
    public final Integer backFromSearch;
    public final Integer hasEffectiveClick;
    public final String lastGroupId;
    public final String lastSearchQuery;
    public final String lastSearchSource;
    public final String lastSuggestWords;
    public final Long totalPlayTime;

    public C671460QVk(String str, Long l, Integer num, Integer num2, String str2, String str3, String str4) {
        this.lastGroupId = str;
        this.totalPlayTime = l;
        this.hasEffectiveClick = num;
        this.backFromSearch = num2;
        this.lastSuggestWords = str2;
        this.lastSearchQuery = str3;
        this.lastSearchSource = str4;
    }
}
