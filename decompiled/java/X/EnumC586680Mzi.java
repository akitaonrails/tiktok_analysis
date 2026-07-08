package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586680Mzi {
    public static final EnumC586680Mzi DEFAULT;
    public static final /* synthetic */ EnumC586680Mzi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586680Mzi REPOST_IN_FRIENDS_WATERFALL;

    public static InterfaceC2044707zh<EnumC586680Mzi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586680Mzi enumC586680Mzi = new EnumC586680Mzi(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC586680Mzi;
        EnumC586680Mzi enumC586680Mzi2 = new EnumC586680Mzi("REPOST_IN_FRIENDS_WATERFALL", 1);
        REPOST_IN_FRIENDS_WATERFALL = enumC586680Mzi2;
        EnumC586680Mzi[] enumC586680MziArr = {enumC586680Mzi, enumC586680Mzi2};
        LL = enumC586680MziArr;
        LLILLJJLI = new C2254308sP(enumC586680MziArr);
    }

    public static EnumC586680Mzi[] values() {
        return (EnumC586680Mzi[]) LL.clone();
    }

    public static EnumC586680Mzi valueOf(String str) {
        return (EnumC586680Mzi) C08FF.LIZ(EnumC586680Mzi.class, str);
    }

    public EnumC586680Mzi(String str, int i) {
    }
}
