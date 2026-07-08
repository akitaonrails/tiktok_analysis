package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1583310rIv {
    public static final EnumC1583310rIv DEFAULT;
    public static final /* synthetic */ EnumC1583310rIv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1583310rIv PROFILE;
    public static final EnumC1583310rIv SEARCH;
    public static final EnumC1583310rIv STORY;

    public static InterfaceC2044707zh<EnumC1583310rIv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1583310rIv enumC1583310rIv = new EnumC1583310rIv(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1583310rIv;
        EnumC1583310rIv enumC1583310rIv2 = new EnumC1583310rIv("SEARCH", 1);
        SEARCH = enumC1583310rIv2;
        EnumC1583310rIv enumC1583310rIv3 = new EnumC1583310rIv("PROFILE", 2);
        PROFILE = enumC1583310rIv3;
        EnumC1583310rIv enumC1583310rIv4 = new EnumC1583310rIv("STORY", 3);
        STORY = enumC1583310rIv4;
        EnumC1583310rIv[] enumC1583310rIvArr = {enumC1583310rIv, enumC1583310rIv2, enumC1583310rIv3, enumC1583310rIv4};
        LL = enumC1583310rIvArr;
        LLILLJJLI = new C2254308sP(enumC1583310rIvArr);
    }

    public static EnumC1583310rIv[] values() {
        return (EnumC1583310rIv[]) LL.clone();
    }

    public static EnumC1583310rIv valueOf(String str) {
        return (EnumC1583310rIv) C08FF.LIZ(EnumC1583310rIv.class, str);
    }

    public EnumC1583310rIv(String str, int i) {
    }
}
