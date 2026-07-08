package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC648990Pcv {
    public static final EnumC648990Pcv DEFAULT;
    public static final /* synthetic */ EnumC648990Pcv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC648990Pcv SEARCH_HUB;
    public static final EnumC648990Pcv SEARCH_MIDDLE;

    public static InterfaceC2044707zh<EnumC648990Pcv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC648990Pcv enumC648990Pcv = new EnumC648990Pcv(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC648990Pcv;
        EnumC648990Pcv enumC648990Pcv2 = new EnumC648990Pcv("SEARCH_MIDDLE", 1);
        SEARCH_MIDDLE = enumC648990Pcv2;
        EnumC648990Pcv enumC648990Pcv3 = new EnumC648990Pcv("SEARCH_HUB", 2);
        SEARCH_HUB = enumC648990Pcv3;
        EnumC648990Pcv[] enumC648990PcvArr = {enumC648990Pcv, enumC648990Pcv2, enumC648990Pcv3};
        LL = enumC648990PcvArr;
        LLILLJJLI = new C2254308sP(enumC648990PcvArr);
    }

    public static EnumC648990Pcv[] values() {
        return (EnumC648990Pcv[]) LL.clone();
    }

    public static EnumC648990Pcv valueOf(String str) {
        return (EnumC648990Pcv) C08FF.LIZ(EnumC648990Pcv.class, str);
    }

    public EnumC648990Pcv(String str, int i) {
    }
}
