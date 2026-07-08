package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993180bx6 {
    public static final EnumC993180bx6 BOTH_SUCCEED;
    public static final EnumC993180bx6 DEFAULT;
    public static final EnumC993180bx6 FAILED;
    public static final /* synthetic */ EnumC993180bx6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993180bx6 SUCCEED;

    public static InterfaceC2044707zh<EnumC993180bx6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993180bx6 enumC993180bx6 = new EnumC993180bx6(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC993180bx6;
        EnumC993180bx6 enumC993180bx62 = new EnumC993180bx6("SUCCEED", 1);
        SUCCEED = enumC993180bx62;
        EnumC993180bx6 enumC993180bx63 = new EnumC993180bx6("FAILED", 2);
        FAILED = enumC993180bx63;
        EnumC993180bx6 enumC993180bx64 = new EnumC993180bx6("BOTH_SUCCEED", 3);
        BOTH_SUCCEED = enumC993180bx64;
        EnumC993180bx6[] enumC993180bx6Arr = {enumC993180bx6, enumC993180bx62, enumC993180bx63, enumC993180bx64};
        LL = enumC993180bx6Arr;
        LLILLJJLI = new C2254308sP(enumC993180bx6Arr);
    }

    public static EnumC993180bx6[] values() {
        return (EnumC993180bx6[]) LL.clone();
    }

    public static EnumC993180bx6 valueOf(String str) {
        return (EnumC993180bx6) C08FF.LIZ(EnumC993180bx6.class, str);
    }

    public EnumC993180bx6(String str, int i) {
    }
}
