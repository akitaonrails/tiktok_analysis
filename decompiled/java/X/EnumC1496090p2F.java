package X;

/* JADX INFO: renamed from: X.0p2F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1496090p2F {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public final int httpCode;

    public static EnumC1496090p2F fromHttp2(int i) {
        for (EnumC1496090p2F enumC1496090p2F : values()) {
            if (enumC1496090p2F.httpCode == i) {
                return enumC1496090p2F;
            }
        }
        return null;
    }

    public static EnumC1496090p2F valueOf(String str) {
        return (EnumC1496090p2F) C08FF.LIZ(EnumC1496090p2F.class, str);
    }

    EnumC1496090p2F(int i) {
        this.httpCode = i;
    }
}
