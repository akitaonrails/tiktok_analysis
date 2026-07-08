package X;

/* JADX INFO: renamed from: X.0prh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1527990prh {
    CONNECTION_UNKNOWN(1),
    CONNECTING(2),
    CONNECT_FAILED(4),
    CONNECT_CLOSED(8),
    CONNECTED(16),
    CONNECT_TIMEOUT(32);

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

    public static EnumC1527990prh valueOf(String str) {
        return (EnumC1527990prh) C08FF.LIZ(EnumC1527990prh.class, str);
    }

    EnumC1527990prh(int i) {
        this.LL = i;
    }
}
