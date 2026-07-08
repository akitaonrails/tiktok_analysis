package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994860bzo {
    public static final EnumC994860bzo DEFAULT;
    public static final EnumC994860bzo EDITOR_TAB;
    public static final /* synthetic */ EnumC994860bzo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC994860bzo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994860bzo enumC994860bzo = new EnumC994860bzo(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC994860bzo;
        EnumC994860bzo enumC994860bzo2 = new EnumC994860bzo("EDITOR_TAB", 1);
        EDITOR_TAB = enumC994860bzo2;
        EnumC994860bzo[] enumC994860bzoArr = {enumC994860bzo, enumC994860bzo2};
        LL = enumC994860bzoArr;
        LLILLJJLI = new C2254308sP(enumC994860bzoArr);
    }

    public static EnumC994860bzo[] values() {
        return (EnumC994860bzo[]) LL.clone();
    }

    public static EnumC994860bzo valueOf(String str) {
        return (EnumC994860bzo) C08FF.LIZ(EnumC994860bzo.class, str);
    }

    public EnumC994860bzo(String str, int i) {
    }
}
