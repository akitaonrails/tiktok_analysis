package X;

/* JADX INFO: renamed from: X.0XE1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0XE1 {
    CONNECTION_UNKNOWN(1),
    CONNECTING(2),
    CONNECT_FAILED(4),
    CONNECT_CLOSED(8),
    CONNECTED(16);

    public final int LL;

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConnectionState{State=");
        sbLIZ.append(this.LL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getTypeValue() {
        return this.LL;
    }

    public static C0XE1 valueOf(String str) {
        return (C0XE1) C08FF.LIZ(C0XE1.class, str);
    }

    C0XE1(int i) {
        this.LL = i;
    }
}
