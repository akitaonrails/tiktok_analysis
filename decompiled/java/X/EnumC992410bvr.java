package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992410bvr {
    public static final /* synthetic */ EnumC992410bvr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992410bvr TYPE_CONTEXT_ERROR;
    public static final EnumC992410bvr TYPE_DATA_ERROR;
    public static final EnumC992410bvr TYPE_DEEPLINK_ERROR;
    public static final EnumC992410bvr TYPE_DEVICE_ERROR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC992410bvr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992410bvr enumC992410bvr = new EnumC992410bvr("TYPE_DATA_ERROR", 0, "xiaomi_card_data_error");
        TYPE_DATA_ERROR = enumC992410bvr;
        EnumC992410bvr enumC992410bvr2 = new EnumC992410bvr("TYPE_DEVICE_ERROR", 1, "xiaomi_card_device_error");
        TYPE_DEVICE_ERROR = enumC992410bvr2;
        EnumC992410bvr enumC992410bvr3 = new EnumC992410bvr("TYPE_CONTEXT_ERROR", 2, "xiaomi_card_context_error");
        TYPE_CONTEXT_ERROR = enumC992410bvr3;
        EnumC992410bvr enumC992410bvr4 = new EnumC992410bvr("TYPE_DEEPLINK_ERROR", 3, "xiaomi_card_deeplink_error");
        TYPE_DEEPLINK_ERROR = enumC992410bvr4;
        EnumC992410bvr[] enumC992410bvrArr = {enumC992410bvr, enumC992410bvr2, enumC992410bvr3, enumC992410bvr4};
        LLILLJJLI = enumC992410bvrArr;
        LLILLL = new C2254308sP(enumC992410bvrArr);
    }

    public static EnumC992410bvr[] values() {
        return (EnumC992410bvr[]) LLILLJJLI.clone();
    }

    public final String getLabelName() {
        return this.LL;
    }

    public static EnumC992410bvr valueOf(String str) {
        return (EnumC992410bvr) C08FF.LIZ(EnumC992410bvr.class, str);
    }

    public EnumC992410bvr(String str, int i, String str2) {
        this.LL = str2;
    }
}
