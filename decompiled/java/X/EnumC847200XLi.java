package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0XLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC847200XLi {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public final String LL;

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC847200XLi get(String str) throws IOException {
        EnumC847200XLi enumC847200XLi = HTTP_1_0;
        if (str.equals(enumC847200XLi.LL)) {
            return enumC847200XLi;
        }
        EnumC847200XLi enumC847200XLi2 = HTTP_1_1;
        if (str.equals(enumC847200XLi2.LL)) {
            return enumC847200XLi2;
        }
        EnumC847200XLi enumC847200XLi3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC847200XLi3.LL)) {
            return enumC847200XLi3;
        }
        EnumC847200XLi enumC847200XLi4 = HTTP_2;
        if (str.equals(enumC847200XLi4.LL)) {
            return enumC847200XLi4;
        }
        EnumC847200XLi enumC847200XLi5 = SPDY_3;
        if (str.equals(enumC847200XLi5.LL)) {
            return enumC847200XLi5;
        }
        EnumC847200XLi enumC847200XLi6 = QUIC;
        if (str.equals(enumC847200XLi6.LL)) {
            return enumC847200XLi6;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected protocol: ");
        sbLIZ.append(str);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static EnumC847200XLi valueOf(String str) {
        return (EnumC847200XLi) C08FF.LIZ(EnumC847200XLi.class, str);
    }

    EnumC847200XLi(String str) {
        this.LL = str;
    }
}
