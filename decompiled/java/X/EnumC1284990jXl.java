package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1284990jXl {
    public static final EnumC1284990jXl DEFAULT;
    public static final EnumC1284990jXl HORIZONTAL;
    public static final /* synthetic */ EnumC1284990jXl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1284990jXl THREE_FOLD;
    public static final EnumC1284990jXl UNKNOWN;
    public static final EnumC1284990jXl VERTICAL;

    public static InterfaceC2044707zh<EnumC1284990jXl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1284990jXl enumC1284990jXl = new EnumC1284990jXl(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1284990jXl;
        EnumC1284990jXl enumC1284990jXl2 = new EnumC1284990jXl("HORIZONTAL", 1);
        HORIZONTAL = enumC1284990jXl2;
        EnumC1284990jXl enumC1284990jXl3 = new EnumC1284990jXl("VERTICAL", 2);
        VERTICAL = enumC1284990jXl3;
        EnumC1284990jXl enumC1284990jXl4 = new EnumC1284990jXl("THREE_FOLD", 3);
        THREE_FOLD = enumC1284990jXl4;
        EnumC1284990jXl enumC1284990jXl5 = new EnumC1284990jXl("UNKNOWN", 4);
        UNKNOWN = enumC1284990jXl5;
        EnumC1284990jXl[] enumC1284990jXlArr = {enumC1284990jXl, enumC1284990jXl2, enumC1284990jXl3, enumC1284990jXl4, enumC1284990jXl5};
        LL = enumC1284990jXlArr;
        LLILLJJLI = new C2254308sP(enumC1284990jXlArr);
    }

    public static EnumC1284990jXl[] values() {
        return (EnumC1284990jXl[]) LL.clone();
    }

    public static EnumC1284990jXl valueOf(String str) {
        return (EnumC1284990jXl) C08FF.LIZ(EnumC1284990jXl.class, str);
    }

    public EnumC1284990jXl(String str, int i) {
    }
}
