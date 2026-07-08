package X;

/* JADX INFO: renamed from: X.0kBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1309890kBv {
    SUCCESS("success"),
    CANCEL_BY_USER_INTERACTION("cancelByUserInteraction"),
    CANCEL_BY_TIMEOUT("timeout"),
    STOP("stop"),
    ERROR("error");

    public final String LL;

    public String getValue() {
        return this.LL;
    }

    public static EnumC1309890kBv fromValue(String str) {
        for (EnumC1309890kBv enumC1309890kBv : values()) {
            if (enumC1309890kBv.LL.equals(str)) {
                return enumC1309890kBv;
            }
        }
        return null;
    }

    public static EnumC1309890kBv valueOf(String str) {
        return (EnumC1309890kBv) C08FF.LIZ(EnumC1309890kBv.class, str);
    }

    EnumC1309890kBv(String str) {
        this.LL = str;
    }
}
