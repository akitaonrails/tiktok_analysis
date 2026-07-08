package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10t6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19387410t6 {
    public static final EnumC19387410t6 ALBUM;
    public static final EnumC19387410t6 DEFAULT;
    public static final EnumC19387410t6 GIPHY;
    public static final EnumC19387410t6 GIPHY_REUSE;
    public static final /* synthetic */ EnumC19387410t6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19387410t6 PHOTO;

    public static InterfaceC2044707zh<EnumC19387410t6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19387410t6 enumC19387410t6 = new EnumC19387410t6("ALBUM", 0);
        ALBUM = enumC19387410t6;
        EnumC19387410t6 enumC19387410t62 = new EnumC19387410t6("GIPHY", 1);
        GIPHY = enumC19387410t62;
        EnumC19387410t6 enumC19387410t63 = new EnumC19387410t6("PHOTO", 2);
        PHOTO = enumC19387410t63;
        EnumC19387410t6 enumC19387410t64 = new EnumC19387410t6("GIPHY_REUSE", 3);
        GIPHY_REUSE = enumC19387410t64;
        EnumC19387410t6 enumC19387410t65 = new EnumC19387410t6(LivePreviewCTASmartDisplayManager.DEFAULT, 4);
        DEFAULT = enumC19387410t65;
        EnumC19387410t6[] enumC19387410t6Arr = {enumC19387410t6, enumC19387410t62, enumC19387410t63, enumC19387410t64, enumC19387410t65};
        LL = enumC19387410t6Arr;
        LLILLJJLI = new C2254308sP(enumC19387410t6Arr);
    }

    public static EnumC19387410t6[] values() {
        return (EnumC19387410t6[]) LL.clone();
    }

    public static EnumC19387410t6 valueOf(String str) {
        return (EnumC19387410t6) C08FF.LIZ(EnumC19387410t6.class, str);
    }

    public EnumC19387410t6(String str, int i) {
    }
}
