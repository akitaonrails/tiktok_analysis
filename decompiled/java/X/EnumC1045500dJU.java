package X;

/* JADX INFO: renamed from: X.0dJU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC1045500dJU {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");

    public final String LL;

    EnumC1045500dJU(String str) {
        this.LL = str;
    }

    public static EnumC1045500dJU valueOf(String str) {
        return (EnumC1045500dJU) C08FF.LIZ(EnumC1045500dJU.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }
}
