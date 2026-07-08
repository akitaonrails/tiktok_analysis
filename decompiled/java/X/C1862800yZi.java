package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0yZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862800yZi implements Serializable {
    public static final int $stable = 0;
    public final Long botId;
    public final Integer botSource;
    public final String enterFrom;
    public final String enterMethod;
    public final String nickName;
    public final String processId;
    public final String shareId;
    public final String takoChatId;
    public final String takoSessionId;

    public C1862800yZi() {
        this("", "", "", "", "", "", "", 0L, 0);
    }

    public C1862800yZi(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Integer num) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.processId = str3;
        this.takoSessionId = str4;
        this.takoChatId = str5;
        this.shareId = str6;
        this.nickName = str7;
        this.botId = l;
        this.botSource = num;
    }
}
