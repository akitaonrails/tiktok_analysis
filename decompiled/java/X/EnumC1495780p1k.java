package X;

/* JADX INFO: renamed from: X.0p1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1495780p1k {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public final String LL;

    public String javaName() {
        return this.LL;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1495780p1k forJavaName(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    return TLS_1_1;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    return TLS_1_2;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    return TLS_1_3;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    return SSL_3_0;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    return TLS_1_0;
                }
                break;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected TLS version: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static EnumC1495780p1k valueOf(String str) {
        return (EnumC1495780p1k) C08FF.LIZ(EnumC1495780p1k.class, str);
    }

    EnumC1495780p1k(String str) {
        this.LL = str;
    }
}
