package X;

/* JADX INFO: renamed from: X.0WxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC839930WxD {
    SOURCE("source"),
    API_ID("api_id"),
    IS_REFLECTION("is_reflection"),
    CLASS_NAME("class_name"),
    MEMBER_NAME("member_name"),
    RETURN_TYPE("return_type");

    public final String LL;

    public static EnumC839930WxD valueOf(String str) {
        return (EnumC839930WxD) C08FF.LIZ(EnumC839930WxD.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    EnumC839930WxD(String str) {
        this.LL = str;
    }
}
