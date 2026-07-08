package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wVI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783180wVI {
    public static final /* synthetic */ EnumC1783180wVI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1783180wVI PRODUCT_DETAIL_DATA;
    public static final EnumC1783180wVI PRODUCT_ID;
    public static final EnumC1783180wVI WEB_URL;

    public static InterfaceC2044707zh<EnumC1783180wVI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1783180wVI enumC1783180wVI = new EnumC1783180wVI("WEB_URL", 0);
        WEB_URL = enumC1783180wVI;
        EnumC1783180wVI enumC1783180wVI2 = new EnumC1783180wVI("PRODUCT_ID", 1);
        PRODUCT_ID = enumC1783180wVI2;
        EnumC1783180wVI enumC1783180wVI3 = new EnumC1783180wVI("PRODUCT_DETAIL_DATA", 2);
        PRODUCT_DETAIL_DATA = enumC1783180wVI3;
        EnumC1783180wVI[] enumC1783180wVIArr = {enumC1783180wVI, enumC1783180wVI2, enumC1783180wVI3};
        LL = enumC1783180wVIArr;
        LLILLJJLI = new C2254308sP(enumC1783180wVIArr);
    }

    public static EnumC1783180wVI[] values() {
        return (EnumC1783180wVI[]) LL.clone();
    }

    public static EnumC1783180wVI valueOf(String str) {
        return (EnumC1783180wVI) C08FF.LIZ(EnumC1783180wVI.class, str);
    }

    public EnumC1783180wVI(String str, int i) {
    }
}
