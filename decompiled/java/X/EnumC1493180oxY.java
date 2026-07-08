package X;

/* JADX INFO: renamed from: X.0oxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1493180oxY {
    DEFAULT(0),
    SUCCESS(1),
    FAILED(2),
    DEFERRED_UNSUITABLE_NETWORK(3),
    ACTIVATION_IN_PROGRESS(4);

    public final int code;

    public int getCode() {
        return this.code;
    }

    public static EnumC1493180oxY valueOf(String str) {
        return (EnumC1493180oxY) C08FF.LIZ(EnumC1493180oxY.class, str);
    }

    EnumC1493180oxY(int i) {
        this.code = i;
    }
}
