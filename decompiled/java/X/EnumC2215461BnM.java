package X;

/* JADX INFO: renamed from: X.1BnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2215461BnM {
    DEFAULT,
    INT,
    FLOAT,
    STRING;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC2215461BnM fromString(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -891985903:
                if (str.equals("string")) {
                    return STRING;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    return INT;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    return FLOAT;
                }
                break;
        }
        return DEFAULT;
    }

    public static EnumC2215461BnM valueOf(String str) {
        return (EnumC2215461BnM) C08FF.LIZ(EnumC2215461BnM.class, str);
    }
}
