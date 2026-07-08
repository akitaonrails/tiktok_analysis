package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC773710UWr {
    public static final EnumC773710UWr DEFAULT;
    public static final /* synthetic */ EnumC773710UWr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC773710UWr ZOOM_IN;
    public static final EnumC773710UWr ZOOM_OUT;

    public static InterfaceC2044707zh<EnumC773710UWr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC773710UWr enumC773710UWr = new EnumC773710UWr("ZOOM_IN", 0);
        ZOOM_IN = enumC773710UWr;
        EnumC773710UWr enumC773710UWr2 = new EnumC773710UWr("ZOOM_OUT", 1);
        ZOOM_OUT = enumC773710UWr2;
        EnumC773710UWr enumC773710UWr3 = new EnumC773710UWr(LivePreviewCTASmartDisplayManager.DEFAULT, 2);
        DEFAULT = enumC773710UWr3;
        EnumC773710UWr[] enumC773710UWrArr = {enumC773710UWr, enumC773710UWr2, enumC773710UWr3};
        LL = enumC773710UWrArr;
        LLILLJJLI = new C2254308sP(enumC773710UWrArr);
    }

    public static EnumC773710UWr[] values() {
        return (EnumC773710UWr[]) LL.clone();
    }

    public static EnumC773710UWr valueOf(String str) {
        return (EnumC773710UWr) C08FF.LIZ(EnumC773710UWr.class, str);
    }

    public EnumC773710UWr(String str, int i) {
    }
}
