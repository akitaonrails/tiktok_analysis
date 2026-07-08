package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC804603Ci {
    public static final EnumC804603Ci DEFAULT;
    public static final /* synthetic */ EnumC804603Ci[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC804603Ci SALE_PROP_WITH_QUANTITY;
    public static final EnumC804603Ci WITH_QUANTITY_CONTROLLER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC804603Ci> getEntries() {
        return LLILLL;
    }

    static {
        EnumC804603Ci enumC804603Ci = new EnumC804603Ci(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC804603Ci;
        EnumC804603Ci enumC804603Ci2 = new EnumC804603Ci("WITH_QUANTITY_CONTROLLER", 1, 1);
        WITH_QUANTITY_CONTROLLER = enumC804603Ci2;
        EnumC804603Ci enumC804603Ci3 = new EnumC804603Ci("SALE_PROP_WITH_QUANTITY", 2, 2);
        SALE_PROP_WITH_QUANTITY = enumC804603Ci3;
        EnumC804603Ci[] enumC804603CiArr = {enumC804603Ci, enumC804603Ci2, enumC804603Ci3};
        LLILLJJLI = enumC804603CiArr;
        LLILLL = new C2254308sP(enumC804603CiArr);
    }

    public static EnumC804603Ci[] values() {
        return (EnumC804603Ci[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC804603Ci valueOf(String str) {
        return (EnumC804603Ci) C08FF.LIZ(EnumC804603Ci.class, str);
    }

    public EnumC804603Ci(String str, int i, int i2) {
        this.LL = i2;
    }
}
