package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1462160o9W {
    public static final EnumC1462160o9W ARTICLE;
    public static final EnumC1462160o9W CUSTOM;
    public static final EnumC1462160o9W DONATION;
    public static final EnumC1462160o9W HASHTAG;
    public static final EnumC1462160o9W INFO;
    public static final EnumC1462160o9W LIVE_CD;
    public static final /* synthetic */ EnumC1462160o9W[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1462160o9W MENTION;
    public static final EnumC1462160o9W POLL;

    public static InterfaceC2044707zh<EnumC1462160o9W> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1462160o9W enumC1462160o9W = new EnumC1462160o9W("POLL", 0);
        POLL = enumC1462160o9W;
        EnumC1462160o9W enumC1462160o9W2 = new EnumC1462160o9W("DONATION", 1);
        DONATION = enumC1462160o9W2;
        EnumC1462160o9W enumC1462160o9W3 = new EnumC1462160o9W("LIVE_CD", 2);
        LIVE_CD = enumC1462160o9W3;
        EnumC1462160o9W enumC1462160o9W4 = new EnumC1462160o9W("MENTION", 3);
        MENTION = enumC1462160o9W4;
        EnumC1462160o9W enumC1462160o9W5 = new EnumC1462160o9W("HASHTAG", 4);
        HASHTAG = enumC1462160o9W5;
        EnumC1462160o9W enumC1462160o9W6 = new EnumC1462160o9W("CUSTOM", 5);
        CUSTOM = enumC1462160o9W6;
        EnumC1462160o9W enumC1462160o9W7 = new EnumC1462160o9W("INFO", 6);
        INFO = enumC1462160o9W7;
        EnumC1462160o9W enumC1462160o9W8 = new EnumC1462160o9W("ARTICLE", 7);
        ARTICLE = enumC1462160o9W8;
        EnumC1462160o9W[] enumC1462160o9WArr = {enumC1462160o9W, enumC1462160o9W2, enumC1462160o9W3, enumC1462160o9W4, enumC1462160o9W5, enumC1462160o9W6, enumC1462160o9W7, enumC1462160o9W8};
        LL = enumC1462160o9WArr;
        LLILLJJLI = new C2254308sP(enumC1462160o9WArr);
    }

    public static EnumC1462160o9W[] values() {
        return (EnumC1462160o9W[]) LL.clone();
    }

    public static EnumC1462160o9W valueOf(String str) {
        return (EnumC1462160o9W) C08FF.LIZ(EnumC1462160o9W.class, str);
    }

    public EnumC1462160o9W(String str, int i) {
    }
}
