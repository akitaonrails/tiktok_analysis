package X;

/* JADX INFO: renamed from: X.0dKL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC1046030dKL {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");

    public final String LL;

    EnumC1046030dKL(String str) {
        this.LL = str;
    }

    public static EnumC1046030dKL valueOf(String str) {
        return (EnumC1046030dKL) C08FF.LIZ(EnumC1046030dKL.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }
}
