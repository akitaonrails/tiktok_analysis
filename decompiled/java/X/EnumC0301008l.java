package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0301008l {
    public static final EnumC0301008l BASED_ON_TEXT_LENGTH;
    public static final EnumC0301008l DEFAULT;
    public static final EnumC0301008l FRIEND_V2;
    public static final /* synthetic */ EnumC0301008l[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0301008l NOT_CROP_3_BY_4;
    public static final EnumC0301008l RELATED_TO_9_BY_16;
    public static final EnumC0301008l UNKNOWN;

    public static InterfaceC2044707zh<EnumC0301008l> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0301008l enumC0301008l = new EnumC0301008l("UNKNOWN", 0);
        UNKNOWN = enumC0301008l;
        EnumC0301008l enumC0301008l2 = new EnumC0301008l(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = enumC0301008l2;
        EnumC0301008l enumC0301008l3 = new EnumC0301008l("NOT_CROP_3_BY_4", 2);
        NOT_CROP_3_BY_4 = enumC0301008l3;
        EnumC0301008l enumC0301008l4 = new EnumC0301008l("RELATED_TO_9_BY_16", 3);
        RELATED_TO_9_BY_16 = enumC0301008l4;
        EnumC0301008l enumC0301008l5 = new EnumC0301008l("BASED_ON_TEXT_LENGTH", 4);
        BASED_ON_TEXT_LENGTH = enumC0301008l5;
        EnumC0301008l enumC0301008l6 = new EnumC0301008l("FRIEND_V2", 5);
        FRIEND_V2 = enumC0301008l6;
        EnumC0301008l[] enumC0301008lArr = {enumC0301008l, enumC0301008l2, enumC0301008l3, enumC0301008l4, enumC0301008l5, enumC0301008l6};
        LL = enumC0301008lArr;
        LLILLJJLI = new C2254308sP(enumC0301008lArr);
    }

    public static EnumC0301008l[] values() {
        return (EnumC0301008l[]) LL.clone();
    }

    public static EnumC0301008l valueOf(String str) {
        return (EnumC0301008l) C08FF.LIZ(EnumC0301008l.class, str);
    }

    public EnumC0301008l(String str, int i) {
    }
}
