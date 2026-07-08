package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587050N0t {
    public static final EnumC587050N0t DEFAULT;
    public static final /* synthetic */ EnumC587050N0t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC587050N0t SCROLL_TO_BOTTOM;
    public static final EnumC587050N0t SCROLL_TO_TOP;

    public static InterfaceC2044707zh<EnumC587050N0t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC587050N0t enumC587050N0t = new EnumC587050N0t(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC587050N0t;
        EnumC587050N0t enumC587050N0t2 = new EnumC587050N0t("SCROLL_TO_TOP", 1);
        SCROLL_TO_TOP = enumC587050N0t2;
        EnumC587050N0t enumC587050N0t3 = new EnumC587050N0t("SCROLL_TO_BOTTOM", 2);
        SCROLL_TO_BOTTOM = enumC587050N0t3;
        EnumC587050N0t[] enumC587050N0tArr = {enumC587050N0t, enumC587050N0t2, enumC587050N0t3};
        LL = enumC587050N0tArr;
        LLILLJJLI = new C2254308sP(enumC587050N0tArr);
    }

    public static EnumC587050N0t[] values() {
        return (EnumC587050N0t[]) LL.clone();
    }

    public static EnumC587050N0t valueOf(String str) {
        return (EnumC587050N0t) C08FF.LIZ(EnumC587050N0t.class, str);
    }

    public EnumC587050N0t(String str, int i) {
    }
}
