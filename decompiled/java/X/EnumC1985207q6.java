package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07q6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1985207q6 {
    public static final EnumC1985207q6 AVAILABLE;
    public static final EnumC1985207q6 DEFAULT;
    public static final /* synthetic */ EnumC1985207q6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1985207q6 UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC1985207q6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1985207q6 enumC1985207q6 = new EnumC1985207q6(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1985207q6;
        EnumC1985207q6 enumC1985207q62 = new EnumC1985207q6("AVAILABLE", 1);
        AVAILABLE = enumC1985207q62;
        EnumC1985207q6 enumC1985207q63 = new EnumC1985207q6("UNAVAILABLE", 2);
        UNAVAILABLE = enumC1985207q63;
        EnumC1985207q6[] enumC1985207q6Arr = {enumC1985207q6, enumC1985207q62, enumC1985207q63};
        LL = enumC1985207q6Arr;
        LLILLJJLI = new C2254308sP(enumC1985207q6Arr);
    }

    public static EnumC1985207q6[] values() {
        return (EnumC1985207q6[]) LL.clone();
    }

    public static EnumC1985207q6 valueOf(String str) {
        return (EnumC1985207q6) C08FF.LIZ(EnumC1985207q6.class, str);
    }

    public EnumC1985207q6(String str, int i) {
    }
}
