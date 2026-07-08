package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1418280n0k {
    public static final EnumC1418280n0k ANCHOR;
    public static final EnumC1418280n0k DEFAULT;
    public static final EnumC1418280n0k EDIT_PAGE;
    public static final /* synthetic */ EnumC1418280n0k[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1418280n0k MUSIC_DETAIL;
    public static final EnumC1418280n0k PREVIEW_PAGE;
    public static final EnumC1418280n0k SHOOT_PAGE_EDIT_TAB;
    public static final EnumC1418280n0k UPLOAD_PAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1418280n0k> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1418280n0k enumC1418280n0k = new EnumC1418280n0k(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1418280n0k;
        EnumC1418280n0k enumC1418280n0k2 = new EnumC1418280n0k("UPLOAD_PAGE", 1, 1);
        UPLOAD_PAGE = enumC1418280n0k2;
        EnumC1418280n0k enumC1418280n0k3 = new EnumC1418280n0k("PREVIEW_PAGE", 2, 2);
        PREVIEW_PAGE = enumC1418280n0k3;
        EnumC1418280n0k enumC1418280n0k4 = new EnumC1418280n0k("EDIT_PAGE", 3, 3);
        EDIT_PAGE = enumC1418280n0k4;
        EnumC1418280n0k enumC1418280n0k5 = new EnumC1418280n0k("ANCHOR", 4, 4);
        ANCHOR = enumC1418280n0k5;
        EnumC1418280n0k enumC1418280n0k6 = new EnumC1418280n0k("MUSIC_DETAIL", 5, 5);
        MUSIC_DETAIL = enumC1418280n0k6;
        EnumC1418280n0k enumC1418280n0k7 = new EnumC1418280n0k("SHOOT_PAGE_EDIT_TAB", 6, 6);
        SHOOT_PAGE_EDIT_TAB = enumC1418280n0k7;
        EnumC1418280n0k[] enumC1418280n0kArr = {enumC1418280n0k, enumC1418280n0k2, enumC1418280n0k3, enumC1418280n0k4, enumC1418280n0k5, enumC1418280n0k6, enumC1418280n0k7};
        LLILLJJLI = enumC1418280n0kArr;
        LLILLL = new C2254308sP(enumC1418280n0kArr);
    }

    public static EnumC1418280n0k[] values() {
        return (EnumC1418280n0k[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1418280n0k valueOf(String str) {
        return (EnumC1418280n0k) C08FF.LIZ(EnumC1418280n0k.class, str);
    }

    public EnumC1418280n0k(String str, int i, int i2) {
        this.LL = i2;
    }
}
