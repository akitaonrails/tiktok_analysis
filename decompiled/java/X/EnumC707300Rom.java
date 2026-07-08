package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC707300Rom {
    public static final EnumC707300Rom DEFAULT;
    public static final /* synthetic */ EnumC707300Rom[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC707300Rom PROGRESS_BAR;
    public static final EnumC707300Rom SLIDE;

    public static InterfaceC2044707zh<EnumC707300Rom> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC707300Rom enumC707300Rom = new EnumC707300Rom(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC707300Rom;
        EnumC707300Rom enumC707300Rom2 = new EnumC707300Rom("SLIDE", 1);
        SLIDE = enumC707300Rom2;
        EnumC707300Rom enumC707300Rom3 = new EnumC707300Rom("PROGRESS_BAR", 2);
        PROGRESS_BAR = enumC707300Rom3;
        EnumC707300Rom[] enumC707300RomArr = {enumC707300Rom, enumC707300Rom2, enumC707300Rom3};
        LL = enumC707300RomArr;
        LLILLJJLI = new C2254308sP(enumC707300RomArr);
    }

    public static EnumC707300Rom[] values() {
        return (EnumC707300Rom[]) LL.clone();
    }

    public static EnumC707300Rom valueOf(String str) {
        return (EnumC707300Rom) C08FF.LIZ(EnumC707300Rom.class, str);
    }

    public EnumC707300Rom(String str, int i) {
    }
}
