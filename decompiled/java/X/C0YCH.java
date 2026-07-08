package X;

/* JADX INFO: renamed from: X.0YCH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YCH {
    SUCCESS(0),
    CLIENT_ERROR(1),
    SERVER_ERROR(2),
    CHECK_CODE_ERROR(3),
    CLIENT_CANCEL(4);

    public final int code;

    public static C0YCH valueOf(String str) {
        return (C0YCH) C08FF.LIZ(C0YCH.class, str);
    }

    C0YCH(int i) {
        this.code = i;
    }
}
