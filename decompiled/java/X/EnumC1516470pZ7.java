package X;

/* JADX INFO: renamed from: X.0pZ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1516470pZ7 {
    SG("https://jsb-sg.byteoversea.com/src/server/v2/package"),
    US("https://jsb-va.byteoversea.com/src/server/v2/package");

    public String url;

    public static EnumC1516470pZ7 valueOf(String str) {
        return (EnumC1516470pZ7) C08FF.LIZ(EnumC1516470pZ7.class, str);
    }

    EnumC1516470pZ7(String str) {
        this.url = str;
    }
}
