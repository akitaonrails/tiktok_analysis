package X;

/* JADX INFO: renamed from: X.0jO4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1278980jO4 {
    Offline(-1),
    Unknown(0),
    Good(1),
    Poor(2),
    Bad(3);

    public static final C1279150jOL Companion = new Object() { // from class: X.0jOL
    };
    public final int LL;

    public static EnumC1278980jO4 valueOf(String str) {
        return (EnumC1278980jO4) C08FF.LIZ(EnumC1278980jO4.class, str);
    }

    public final int getCode() {
        return this.LL;
    }

    EnumC1278980jO4(int i) {
        this.LL = i;
    }
}
