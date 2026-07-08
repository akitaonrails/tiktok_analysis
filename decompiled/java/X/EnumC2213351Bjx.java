package X;

/* JADX INFO: renamed from: X.1Bjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2213351Bjx {
    SUCCESS(0),
    ENGINE_IS_NULL(1),
    PARAM_IS_NULL(2),
    DOWNLOAD_MODEL_FAIL(3),
    RUN_MODEL_ERROR(4),
    ENV_NOT_READY(5),
    TARS_ID_IS_NULL(6);

    public final int LL;

    public static EnumC2213351Bjx valueOf(String str) {
        return (EnumC2213351Bjx) C08FF.LIZ(EnumC2213351Bjx.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC2213351Bjx(int i) {
        this.LL = i;
    }
}
