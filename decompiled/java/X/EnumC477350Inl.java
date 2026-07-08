package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Inl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC477350Inl {
    public static final EnumC477350Inl DEFAULT;
    public static final EnumC477350Inl EMPTY_DECOR;
    public static final /* synthetic */ EnumC477350Inl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC477350Inl WITHOUT_DECOR;

    public static InterfaceC2044707zh<EnumC477350Inl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC477350Inl enumC477350Inl = new EnumC477350Inl(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC477350Inl;
        EnumC477350Inl enumC477350Inl2 = new EnumC477350Inl("WITHOUT_DECOR", 1);
        WITHOUT_DECOR = enumC477350Inl2;
        EnumC477350Inl enumC477350Inl3 = new EnumC477350Inl("EMPTY_DECOR", 2);
        EMPTY_DECOR = enumC477350Inl3;
        EnumC477350Inl[] enumC477350InlArr = {enumC477350Inl, enumC477350Inl2, enumC477350Inl3};
        LL = enumC477350InlArr;
        LLILLJJLI = new C2254308sP(enumC477350InlArr);
    }

    public static EnumC477350Inl[] values() {
        return (EnumC477350Inl[]) LL.clone();
    }

    public static EnumC477350Inl valueOf(String str) {
        return (EnumC477350Inl) C08FF.LIZ(EnumC477350Inl.class, str);
    }

    public EnumC477350Inl(String str, int i) {
    }
}
