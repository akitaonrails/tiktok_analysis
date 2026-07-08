package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Uqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC785080Uqw {
    public static final EnumC785080Uqw DEFAULT;
    public static final /* synthetic */ EnumC785080Uqw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC785080Uqw SHOP_BAG_AGGREGATE;

    public static InterfaceC2044707zh<EnumC785080Uqw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC785080Uqw enumC785080Uqw = new EnumC785080Uqw(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC785080Uqw;
        EnumC785080Uqw enumC785080Uqw2 = new EnumC785080Uqw("SHOP_BAG_AGGREGATE", 1);
        SHOP_BAG_AGGREGATE = enumC785080Uqw2;
        EnumC785080Uqw[] enumC785080UqwArr = {enumC785080Uqw, enumC785080Uqw2};
        LL = enumC785080UqwArr;
        LLILLJJLI = new C2254308sP(enumC785080UqwArr);
    }

    public static EnumC785080Uqw[] values() {
        return (EnumC785080Uqw[]) LL.clone();
    }

    public static EnumC785080Uqw valueOf(String str) {
        return (EnumC785080Uqw) C08FF.LIZ(EnumC785080Uqw.class, str);
    }

    public EnumC785080Uqw(String str, int i) {
    }
}
