package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ci5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1022310ci5 {
    public static final EnumC1022310ci5 DEFAULT;
    public static final EnumC1022310ci5 FOLLOWING_FEED;
    public static final /* synthetic */ EnumC1022310ci5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1022310ci5 POPULAR_FEED;
    public static final EnumC1022310ci5 RECOMMEND_FEED;
    public static final EnumC1022310ci5 SEARCH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1022310ci5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1022310ci5 enumC1022310ci5 = new EnumC1022310ci5(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1022310ci5;
        EnumC1022310ci5 enumC1022310ci52 = new EnumC1022310ci5("RECOMMEND_FEED", 1, 1);
        RECOMMEND_FEED = enumC1022310ci52;
        EnumC1022310ci5 enumC1022310ci53 = new EnumC1022310ci5("SEARCH", 2, 2);
        SEARCH = enumC1022310ci53;
        EnumC1022310ci5 enumC1022310ci54 = new EnumC1022310ci5("FOLLOWING_FEED", 3, 3);
        FOLLOWING_FEED = enumC1022310ci54;
        EnumC1022310ci5 enumC1022310ci55 = new EnumC1022310ci5("POPULAR_FEED", 4, 4);
        POPULAR_FEED = enumC1022310ci55;
        EnumC1022310ci5[] enumC1022310ci5Arr = {enumC1022310ci5, enumC1022310ci52, enumC1022310ci53, enumC1022310ci54, enumC1022310ci55};
        LLILLJJLI = enumC1022310ci5Arr;
        LLILLL = new C2254308sP(enumC1022310ci5Arr);
    }

    public static EnumC1022310ci5[] values() {
        return (EnumC1022310ci5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1022310ci5 valueOf(String str) {
        return (EnumC1022310ci5) C08FF.LIZ(EnumC1022310ci5.class, str);
    }

    public EnumC1022310ci5(String str, int i, int i2) {
        this.LL = i2;
    }
}
