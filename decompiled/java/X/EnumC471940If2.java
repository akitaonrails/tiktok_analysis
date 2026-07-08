package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0If2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC471940If2 {
    public static final EnumC471940If2 DEFAULT;
    public static final EnumC471940If2 FEED_LOAD_MORE;
    public static final EnumC471940If2 FEED_REFRESH;
    public static final /* synthetic */ EnumC471940If2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC471940If2 SEARCH_LOAD_MORE;
    public static final EnumC471940If2 SEARCH_REFRESH;

    public static InterfaceC2044707zh<EnumC471940If2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC471940If2 enumC471940If2 = new EnumC471940If2(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC471940If2;
        EnumC471940If2 enumC471940If22 = new EnumC471940If2("SEARCH_REFRESH", 1);
        SEARCH_REFRESH = enumC471940If22;
        EnumC471940If2 enumC471940If23 = new EnumC471940If2("SEARCH_LOAD_MORE", 2);
        SEARCH_LOAD_MORE = enumC471940If23;
        EnumC471940If2 enumC471940If24 = new EnumC471940If2("FEED_REFRESH", 3);
        FEED_REFRESH = enumC471940If24;
        EnumC471940If2 enumC471940If25 = new EnumC471940If2("FEED_LOAD_MORE", 4);
        FEED_LOAD_MORE = enumC471940If25;
        EnumC471940If2[] enumC471940If2Arr = {enumC471940If2, enumC471940If22, enumC471940If23, enumC471940If24, enumC471940If25};
        LL = enumC471940If2Arr;
        LLILLJJLI = new C2254308sP(enumC471940If2Arr);
    }

    public static EnumC471940If2[] values() {
        return (EnumC471940If2[]) LL.clone();
    }

    public static EnumC471940If2 valueOf(String str) {
        return (EnumC471940If2) C08FF.LIZ(EnumC471940If2.class, str);
    }

    public EnumC471940If2(String str, int i) {
    }
}
