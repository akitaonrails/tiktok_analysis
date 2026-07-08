package X;

/* JADX INFO: renamed from: X.0Waz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC826150Waz {
    HYBRID("hybrid"),
    SDK("sdk"),
    NATIVE("native");

    public final String LL;

    public static EnumC826150Waz valueOf(String str) {
        return (EnumC826150Waz) C08FF.LIZ(EnumC826150Waz.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    EnumC826150Waz(String str) {
        this.LL = str;
    }
}
