package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1031630cx7 {
    public static final EnumC1031630cx7 DEFAULT;
    public static final EnumC1031630cx7 DIRECT;
    public static final /* synthetic */ EnumC1031630cx7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1031630cx7 VIDEO_FINISH_AUTO_EXPAND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1031630cx7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1031630cx7 enumC1031630cx7 = new EnumC1031630cx7(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC1031630cx7;
        EnumC1031630cx7 enumC1031630cx72 = new EnumC1031630cx7("DIRECT", 1, "direct");
        DIRECT = enumC1031630cx72;
        EnumC1031630cx7 enumC1031630cx73 = new EnumC1031630cx7("VIDEO_FINISH_AUTO_EXPAND", 2, "video_finish_auto_expand");
        VIDEO_FINISH_AUTO_EXPAND = enumC1031630cx73;
        EnumC1031630cx7[] enumC1031630cx7Arr = {enumC1031630cx7, enumC1031630cx72, enumC1031630cx73};
        LLILLJJLI = enumC1031630cx7Arr;
        LLILLL = new C2254308sP(enumC1031630cx7Arr);
    }

    public static EnumC1031630cx7[] values() {
        return (EnumC1031630cx7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1031630cx7 valueOf(String str) {
        return (EnumC1031630cx7) C08FF.LIZ(EnumC1031630cx7.class, str);
    }

    public EnumC1031630cx7(String str, int i, String str2) {
        this.LL = str2;
    }
}
