package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07t7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2003907t7 {
    public static final EnumC2003907t7 DEFAULT;
    public static final /* synthetic */ EnumC2003907t7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2003907t7 WHITE_BG_DARK_CONTENT;

    public static InterfaceC2044707zh<EnumC2003907t7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2003907t7 enumC2003907t7 = new EnumC2003907t7(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC2003907t7;
        EnumC2003907t7 enumC2003907t72 = new EnumC2003907t7("WHITE_BG_DARK_CONTENT", 1);
        WHITE_BG_DARK_CONTENT = enumC2003907t72;
        EnumC2003907t7[] enumC2003907t7Arr = {enumC2003907t7, enumC2003907t72};
        LL = enumC2003907t7Arr;
        LLILLJJLI = new C2254308sP(enumC2003907t7Arr);
    }

    public static EnumC2003907t7[] values() {
        return (EnumC2003907t7[]) LL.clone();
    }

    public static EnumC2003907t7 valueOf(String str) {
        return (EnumC2003907t7) C08FF.LIZ(EnumC2003907t7.class, str);
    }

    public EnumC2003907t7(String str, int i) {
    }
}
