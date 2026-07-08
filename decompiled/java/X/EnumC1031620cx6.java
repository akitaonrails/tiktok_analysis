package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1031620cx6 {
    public static final EnumC1031620cx6 DEFAULT;
    public static final EnumC1031620cx6 DIRECT;
    public static final /* synthetic */ EnumC1031620cx6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1031620cx6 VIDEO_FINISH_AUTO_EXPAND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1031620cx6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1031620cx6 enumC1031620cx6 = new EnumC1031620cx6(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC1031620cx6;
        EnumC1031620cx6 enumC1031620cx62 = new EnumC1031620cx6("DIRECT", 1, "direct");
        DIRECT = enumC1031620cx62;
        EnumC1031620cx6 enumC1031620cx63 = new EnumC1031620cx6("VIDEO_FINISH_AUTO_EXPAND", 2, "video_finish_auto_expand");
        VIDEO_FINISH_AUTO_EXPAND = enumC1031620cx63;
        EnumC1031620cx6[] enumC1031620cx6Arr = {enumC1031620cx6, enumC1031620cx62, enumC1031620cx63};
        LLILLJJLI = enumC1031620cx6Arr;
        LLILLL = new C2254308sP(enumC1031620cx6Arr);
    }

    public static EnumC1031620cx6[] values() {
        return (EnumC1031620cx6[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1031620cx6 valueOf(String str) {
        return (EnumC1031620cx6) C08FF.LIZ(EnumC1031620cx6.class, str);
    }

    public EnumC1031620cx6(String str, int i, String str2) {
        this.LL = str2;
    }
}
