package X;

/* JADX INFO: renamed from: X.0jyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1301470jyL {
    PENDING("Pending"),
    RESOLVED("Resolved"),
    REJECTED("Rejected");

    public final String LL;

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC1301470jyL valueOf(String str) {
        return (EnumC1301470jyL) C08FF.LIZ(EnumC1301470jyL.class, str);
    }

    EnumC1301470jyL(String str) {
        this.LL = str;
    }
}
