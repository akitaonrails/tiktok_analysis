package X;

/* JADX INFO: renamed from: X.0WCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC819310WCb implements C0WDB {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int LL;

    @Override // X.C0WDB
    public int getNumber() {
        return this.LL;
    }

    public static EnumC819310WCb valueOf(String str) {
        return (EnumC819310WCb) C08FF.LIZ(EnumC819310WCb.class, str);
    }

    EnumC819310WCb(int i) {
        this.LL = i;
    }
}
