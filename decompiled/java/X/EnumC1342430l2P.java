package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1342430l2P {
    public static final EnumC1342430l2P AD_FORBID;
    public static final EnumC1342430l2P COMMENT_CLOSE;
    public static final EnumC1342430l2P COMMENT_DISLIKE;
    public static final EnumC1342430l2P COMMENT_EMPTY;
    public static final EnumC1342430l2P DEFAULT;
    public static final EnumC1342430l2P FILTER_FOOTER;
    public static final EnumC1342430l2P FILTER_STATUS;
    public static final EnumC1342430l2P FOLD;
    public static final /* synthetic */ EnumC1342430l2P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1342430l2P LOADING;
    public static final EnumC1342430l2P LOAD_MORE_ERR;
    public static final EnumC1342430l2P POST_MODE_FULL_PAGE_LOAD_COMPLETE;
    public static final EnumC1342430l2P REFRESH_ERR;

    public static InterfaceC2044707zh<EnumC1342430l2P> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1342430l2P enumC1342430l2P = new EnumC1342430l2P(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1342430l2P;
        EnumC1342430l2P enumC1342430l2P2 = new EnumC1342430l2P("LOADING", 1);
        LOADING = enumC1342430l2P2;
        EnumC1342430l2P enumC1342430l2P3 = new EnumC1342430l2P("REFRESH_ERR", 2);
        REFRESH_ERR = enumC1342430l2P3;
        EnumC1342430l2P enumC1342430l2P4 = new EnumC1342430l2P("LOAD_MORE_ERR", 3);
        LOAD_MORE_ERR = enumC1342430l2P4;
        EnumC1342430l2P enumC1342430l2P5 = new EnumC1342430l2P("COMMENT_CLOSE", 4);
        COMMENT_CLOSE = enumC1342430l2P5;
        EnumC1342430l2P enumC1342430l2P6 = new EnumC1342430l2P("COMMENT_EMPTY", 5);
        COMMENT_EMPTY = enumC1342430l2P6;
        EnumC1342430l2P enumC1342430l2P7 = new EnumC1342430l2P("AD_FORBID", 6);
        AD_FORBID = enumC1342430l2P7;
        EnumC1342430l2P enumC1342430l2P8 = new EnumC1342430l2P("FILTER_STATUS", 7);
        FILTER_STATUS = enumC1342430l2P8;
        EnumC1342430l2P enumC1342430l2P9 = new EnumC1342430l2P("FOLD", 8);
        FOLD = enumC1342430l2P9;
        EnumC1342430l2P enumC1342430l2P10 = new EnumC1342430l2P("FILTER_FOOTER", 9);
        FILTER_FOOTER = enumC1342430l2P10;
        EnumC1342430l2P enumC1342430l2P11 = new EnumC1342430l2P("POST_MODE_FULL_PAGE_LOAD_COMPLETE", 10);
        POST_MODE_FULL_PAGE_LOAD_COMPLETE = enumC1342430l2P11;
        EnumC1342430l2P enumC1342430l2P12 = new EnumC1342430l2P("COMMENT_DISLIKE", 11);
        COMMENT_DISLIKE = enumC1342430l2P12;
        EnumC1342430l2P[] enumC1342430l2PArr = {enumC1342430l2P, enumC1342430l2P2, enumC1342430l2P3, enumC1342430l2P4, enumC1342430l2P5, enumC1342430l2P6, enumC1342430l2P7, enumC1342430l2P8, enumC1342430l2P9, enumC1342430l2P10, enumC1342430l2P11, enumC1342430l2P12};
        LL = enumC1342430l2PArr;
        LLILLJJLI = new C2254308sP(enumC1342430l2PArr);
    }

    public static EnumC1342430l2P[] values() {
        return (EnumC1342430l2P[]) LL.clone();
    }

    public static EnumC1342430l2P valueOf(String str) {
        return (EnumC1342430l2P) C08FF.LIZ(EnumC1342430l2P.class, str);
    }

    public EnumC1342430l2P(String str, int i) {
    }
}
