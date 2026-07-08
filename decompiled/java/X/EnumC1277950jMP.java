package X;

/* JADX INFO: renamed from: X.0jMP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1277950jMP {
    Success(0),
    InvalidArguments(-1),
    FrequencyLimited(-2),
    OtherError(-3);

    public static final C1279160jOM Companion = new Object() { // from class: X.0jOM
    };
    public final int code;

    public static EnumC1277950jMP valueOf(String str) {
        return (EnumC1277950jMP) C08FF.LIZ(EnumC1277950jMP.class, str);
    }

    public static final EnumC1277950jMP fromCode(int i) {
        Companion.getClass();
        for (EnumC1277950jMP enumC1277950jMP : values()) {
            if (enumC1277950jMP.code == i) {
                return enumC1277950jMP;
            }
        }
        return OtherError;
    }

    EnumC1277950jMP(int i) {
        this.code = i;
    }
}
