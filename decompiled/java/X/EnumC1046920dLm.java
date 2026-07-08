package X;

/* JADX INFO: renamed from: X.0dLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC1046920dLm {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    public final String LL;

    EnumC1046920dLm(String str) {
        this.LL = str;
    }

    public static EnumC1046920dLm valueOf(String str) {
        return (EnumC1046920dLm) C08FF.LIZ(EnumC1046920dLm.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }
}
