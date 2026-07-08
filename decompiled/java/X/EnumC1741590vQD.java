package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vQD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1741590vQD {
    public static final EnumC1741590vQD BOTTOM_TAB_BUBBLE;
    public static final EnumC1741590vQD BOTTOM_TAB_ICON;
    public static final EnumC1741590vQD BOTTOM_TAB_REDDOT;
    public static final EnumC1741590vQD CART;
    public static final EnumC1741590vQD DEFAULT;
    public static final /* synthetic */ EnumC1741590vQD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1741590vQD TOP_TAB_BUBBLE;
    public static final EnumC1741590vQD TOP_TAB_REDDOT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1741590vQD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1741590vQD enumC1741590vQD = new EnumC1741590vQD(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "d0");
        DEFAULT = enumC1741590vQD;
        EnumC1741590vQD enumC1741590vQD2 = new EnumC1741590vQD("CART", 1, "d8150");
        CART = enumC1741590vQD2;
        EnumC1741590vQD enumC1741590vQD3 = new EnumC1741590vQD("BOTTOM_TAB_BUBBLE", 2, "d2581");
        BOTTOM_TAB_BUBBLE = enumC1741590vQD3;
        EnumC1741590vQD enumC1741590vQD4 = new EnumC1741590vQD("BOTTOM_TAB_ICON", 3, "d09115");
        BOTTOM_TAB_ICON = enumC1741590vQD4;
        EnumC1741590vQD enumC1741590vQD5 = new EnumC1741590vQD("BOTTOM_TAB_REDDOT", 4, "d83373");
        BOTTOM_TAB_REDDOT = enumC1741590vQD5;
        EnumC1741590vQD enumC1741590vQD6 = new EnumC1741590vQD("TOP_TAB_BUBBLE", 5, "d6125");
        TOP_TAB_BUBBLE = enumC1741590vQD6;
        EnumC1741590vQD enumC1741590vQD7 = new EnumC1741590vQD("TOP_TAB_REDDOT", 6, "d0342");
        TOP_TAB_REDDOT = enumC1741590vQD7;
        EnumC1741590vQD[] enumC1741590vQDArr = {enumC1741590vQD, enumC1741590vQD2, enumC1741590vQD3, enumC1741590vQD4, enumC1741590vQD5, enumC1741590vQD6, enumC1741590vQD7};
        LLILLJJLI = enumC1741590vQDArr;
        LLILLL = new C2254308sP(enumC1741590vQDArr);
    }

    public static EnumC1741590vQD[] values() {
        return (EnumC1741590vQD[]) LLILLJJLI.clone();
    }

    public final String getDCode() {
        return this.LL;
    }

    public static EnumC1741590vQD valueOf(String str) {
        return (EnumC1741590vQD) C08FF.LIZ(EnumC1741590vQD.class, str);
    }

    public EnumC1741590vQD(String str, int i, String str2) {
        this.LL = str2;
    }
}
