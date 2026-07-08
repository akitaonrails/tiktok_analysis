package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1036160d4Q {
    public static final C1036200d4U Companion;
    public static final EnumC1036160d4Q DEFAULT;
    public static final EnumC1036160d4Q FROM_CLICK_BOTTOM_BANNER;
    public static final EnumC1036160d4Q FROM_CUSTOM;
    public static final EnumC1036160d4Q FROM_FEED_AD_FLING;
    public static final EnumC1036160d4Q FROM_REWARD_AD_FLING;
    public static final EnumC1036160d4Q FROM_SCROLL_VIEW_PAGER;
    public static final EnumC1036160d4Q FROM_SPLIT_SCREEN;
    public static final /* synthetic */ EnumC1036160d4Q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static final EnumC1036160d4Q fromName(String str) {
        Companion.getClass();
        return C1036200d4U.LIZ(str);
    }

    public static InterfaceC2044707zh<EnumC1036160d4Q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1036160d4Q enumC1036160d4Q = new EnumC1036160d4Q("FROM_FEED_AD_FLING", 0);
        FROM_FEED_AD_FLING = enumC1036160d4Q;
        EnumC1036160d4Q enumC1036160d4Q2 = new EnumC1036160d4Q("FROM_REWARD_AD_FLING", 1);
        FROM_REWARD_AD_FLING = enumC1036160d4Q2;
        EnumC1036160d4Q enumC1036160d4Q3 = new EnumC1036160d4Q("FROM_CLICK_BOTTOM_BANNER", 2);
        FROM_CLICK_BOTTOM_BANNER = enumC1036160d4Q3;
        EnumC1036160d4Q enumC1036160d4Q4 = new EnumC1036160d4Q("FROM_SCROLL_VIEW_PAGER", 3);
        FROM_SCROLL_VIEW_PAGER = enumC1036160d4Q4;
        EnumC1036160d4Q enumC1036160d4Q5 = new EnumC1036160d4Q("FROM_CUSTOM", 4);
        FROM_CUSTOM = enumC1036160d4Q5;
        EnumC1036160d4Q enumC1036160d4Q6 = new EnumC1036160d4Q("FROM_SPLIT_SCREEN", 5);
        FROM_SPLIT_SCREEN = enumC1036160d4Q6;
        EnumC1036160d4Q enumC1036160d4Q7 = new EnumC1036160d4Q(LivePreviewCTASmartDisplayManager.DEFAULT, 6);
        DEFAULT = enumC1036160d4Q7;
        EnumC1036160d4Q[] enumC1036160d4QArr = {enumC1036160d4Q, enumC1036160d4Q2, enumC1036160d4Q3, enumC1036160d4Q4, enumC1036160d4Q5, enumC1036160d4Q6, enumC1036160d4Q7};
        LL = enumC1036160d4QArr;
        LLILLJJLI = new C2254308sP(enumC1036160d4QArr);
        Companion = new C1036200d4U();
    }

    public static EnumC1036160d4Q[] values() {
        return (EnumC1036160d4Q[]) LL.clone();
    }

    public static EnumC1036160d4Q valueOf(String str) {
        return (EnumC1036160d4Q) C08FF.LIZ(EnumC1036160d4Q.class, str);
    }

    public EnumC1036160d4Q(String str, int i) {
    }
}
