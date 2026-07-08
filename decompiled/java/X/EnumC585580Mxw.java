package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585580Mxw {
    public static final EnumC585580Mxw DEFAULT;
    public static final EnumC585580Mxw D_FEED;
    public static final /* synthetic */ EnumC585580Mxw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585580Mxw T_FEED;
    public static final EnumC585580Mxw T_LITE_FEED;

    public static InterfaceC2044707zh<EnumC585580Mxw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585580Mxw enumC585580Mxw = new EnumC585580Mxw(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC585580Mxw;
        EnumC585580Mxw enumC585580Mxw2 = new EnumC585580Mxw("D_FEED", 1);
        D_FEED = enumC585580Mxw2;
        EnumC585580Mxw enumC585580Mxw3 = new EnumC585580Mxw("T_FEED", 2);
        T_FEED = enumC585580Mxw3;
        EnumC585580Mxw enumC585580Mxw4 = new EnumC585580Mxw("T_LITE_FEED", 3);
        T_LITE_FEED = enumC585580Mxw4;
        EnumC585580Mxw[] enumC585580MxwArr = {enumC585580Mxw, enumC585580Mxw2, enumC585580Mxw3, enumC585580Mxw4};
        LL = enumC585580MxwArr;
        LLILLJJLI = new C2254308sP(enumC585580MxwArr);
    }

    public static EnumC585580Mxw[] values() {
        return (EnumC585580Mxw[]) LL.clone();
    }

    public static EnumC585580Mxw valueOf(String str) {
        return (EnumC585580Mxw) C08FF.LIZ(EnumC585580Mxw.class, str);
    }

    public EnumC585580Mxw(String str, int i) {
    }
}
