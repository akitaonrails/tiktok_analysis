package X;

/* JADX INFO: renamed from: X.0jJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1276340jJo {
    DISPATCH_SUCCESS(0),
    DISPATCH_INVALID_ORIGIN_URL(1),
    DISPATCH_CRONET_NOT_INIT(2),
    DISPATCH_TIMEOUT(3),
    DISPATCH_INVALID_FINAL_URL(4),
    DISPATCH_WRONG_FORMAT(5),
    DISPATCH_OKHTTP_DISPATCH_FAILED(6),
    DISPATCH_NOT_REACHED(7);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1276340jJo valueOf(String str) {
        return (EnumC1276340jJo) C08FF.LIZ(EnumC1276340jJo.class, str);
    }

    EnumC1276340jJo(int i) {
        this.LL = i;
    }
}
