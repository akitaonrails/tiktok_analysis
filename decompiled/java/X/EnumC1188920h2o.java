package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1188920h2o {
    public static final EnumC1188920h2o DEFAULT;
    public static final /* synthetic */ EnumC1188920h2o[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1188920h2o PRODUCT_DETAIL;
    public static final EnumC1188920h2o PRODUCT_SHELVES_FULL_SCREEN;
    public static final EnumC1188920h2o PRODUCT_SHELVES_POPUP;

    public static InterfaceC2044707zh<EnumC1188920h2o> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1188920h2o enumC1188920h2o = new EnumC1188920h2o(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1188920h2o;
        EnumC1188920h2o enumC1188920h2o2 = new EnumC1188920h2o("PRODUCT_DETAIL", 1);
        PRODUCT_DETAIL = enumC1188920h2o2;
        EnumC1188920h2o enumC1188920h2o3 = new EnumC1188920h2o("PRODUCT_SHELVES_POPUP", 2);
        PRODUCT_SHELVES_POPUP = enumC1188920h2o3;
        EnumC1188920h2o enumC1188920h2o4 = new EnumC1188920h2o("PRODUCT_SHELVES_FULL_SCREEN", 3);
        PRODUCT_SHELVES_FULL_SCREEN = enumC1188920h2o4;
        EnumC1188920h2o[] enumC1188920h2oArr = {enumC1188920h2o, enumC1188920h2o2, enumC1188920h2o3, enumC1188920h2o4};
        LL = enumC1188920h2oArr;
        LLILLJJLI = new C2254308sP(enumC1188920h2oArr);
    }

    public static EnumC1188920h2o[] values() {
        return (EnumC1188920h2o[]) LL.clone();
    }

    public static EnumC1188920h2o valueOf(String str) {
        return (EnumC1188920h2o) C08FF.LIZ(EnumC1188920h2o.class, str);
    }

    public EnumC1188920h2o(String str, int i) {
    }
}
