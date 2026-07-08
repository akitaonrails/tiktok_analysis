package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10t8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19387610t8 {
    public static final EnumC19387610t8 DEFAULT;
    public static final EnumC19387610t8 DYNAMIC;
    public static final EnumC19387610t8 HOLIDAY;
    public static final /* synthetic */ EnumC19387610t8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19387610t8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19387610t8 enumC19387610t8 = new EnumC19387610t8(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC19387610t8;
        EnumC19387610t8 enumC19387610t82 = new EnumC19387610t8("HOLIDAY", 1);
        HOLIDAY = enumC19387610t82;
        EnumC19387610t8 enumC19387610t83 = new EnumC19387610t8("DYNAMIC", 2);
        DYNAMIC = enumC19387610t83;
        EnumC19387610t8[] enumC19387610t8Arr = {enumC19387610t8, enumC19387610t82, enumC19387610t83};
        LL = enumC19387610t8Arr;
        LLILLJJLI = new C2254308sP(enumC19387610t8Arr);
    }

    public static EnumC19387610t8[] values() {
        return (EnumC19387610t8[]) LL.clone();
    }

    public static EnumC19387610t8 valueOf(String str) {
        return (EnumC19387610t8) C08FF.LIZ(EnumC19387610t8.class, str);
    }

    public EnumC19387610t8(String str, int i) {
    }
}
