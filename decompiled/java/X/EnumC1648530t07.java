package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t07, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1648530t07 {
    public static final EnumC1648530t07 DEFAULT;
    public static final /* synthetic */ EnumC1648530t07[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1648530t07 PHOTO;
    public static final EnumC1648530t07 STORY;

    public static InterfaceC2044707zh<EnumC1648530t07> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1648530t07 enumC1648530t07 = new EnumC1648530t07(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1648530t07;
        EnumC1648530t07 enumC1648530t072 = new EnumC1648530t07("PHOTO", 1);
        PHOTO = enumC1648530t072;
        EnumC1648530t07 enumC1648530t073 = new EnumC1648530t07("STORY", 2);
        STORY = enumC1648530t073;
        EnumC1648530t07[] enumC1648530t07Arr = {enumC1648530t07, enumC1648530t072, enumC1648530t073};
        LL = enumC1648530t07Arr;
        LLILLJJLI = new C2254308sP(enumC1648530t07Arr);
    }

    public static EnumC1648530t07[] values() {
        return (EnumC1648530t07[]) LL.clone();
    }

    public static EnumC1648530t07 valueOf(String str) {
        return (EnumC1648530t07) C08FF.LIZ(EnumC1648530t07.class, str);
    }

    public EnumC1648530t07(String str, int i) {
    }
}
