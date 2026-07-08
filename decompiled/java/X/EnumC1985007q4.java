package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07q4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1985007q4 {
    public static final EnumC1985007q4 DEFAULT;
    public static final /* synthetic */ EnumC1985007q4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1985007q4 TYPE_FEED;
    public static final EnumC1985007q4 TYPE_PROFILE_PAGE;

    public static InterfaceC2044707zh<EnumC1985007q4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1985007q4 enumC1985007q4 = new EnumC1985007q4(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1985007q4;
        EnumC1985007q4 enumC1985007q42 = new EnumC1985007q4("TYPE_FEED", 1);
        TYPE_FEED = enumC1985007q42;
        EnumC1985007q4 enumC1985007q43 = new EnumC1985007q4("TYPE_PROFILE_PAGE", 2);
        TYPE_PROFILE_PAGE = enumC1985007q43;
        EnumC1985007q4[] enumC1985007q4Arr = {enumC1985007q4, enumC1985007q42, enumC1985007q43};
        LL = enumC1985007q4Arr;
        LLILLJJLI = new C2254308sP(enumC1985007q4Arr);
    }

    public static EnumC1985007q4[] values() {
        return (EnumC1985007q4[]) LL.clone();
    }

    public static EnumC1985007q4 valueOf(String str) {
        return (EnumC1985007q4) C08FF.LIZ(EnumC1985007q4.class, str);
    }

    public EnumC1985007q4(String str, int i) {
    }
}
