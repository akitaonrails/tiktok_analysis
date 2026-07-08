package X;

/* JADX INFO: renamed from: X.12zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19938412zm {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    public final boolean LL;

    public static EnumC19938412zm valueOf(String str) {
        return (EnumC19938412zm) C08FF.LIZ(EnumC19938412zm.class, str);
    }

    EnumC19938412zm(boolean z) {
        this.LL = z;
    }
}
