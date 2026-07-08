package X;

/* JADX INFO: renamed from: X.0jMR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1277970jMR {
    GENERAL_ERROR(1),
    CONFIG_INVALID(2),
    DATA_SOURCE_INVALID(3),
    TOKEN_INVALID(4),
    RENDERER_INIT_FAILED(5);

    public final int LL;

    public static EnumC1277970jMR valueOf(String str) {
        return (EnumC1277970jMR) C08FF.LIZ(EnumC1277970jMR.class, str);
    }

    public final int getCode() {
        return this.LL;
    }

    public final int value() {
        return this.LL;
    }

    EnumC1277970jMR(int i) {
        this.LL = i;
    }
}
