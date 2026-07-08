package X;

/* JADX INFO: renamed from: X.1Al7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2188591Al7 {
    LESS_THAN_1G(1073741824),
    LESS_THAN_1_75G(1879048192),
    LESS_THAN_1_8G(1932735283),
    LESS_THAN_2G(2147483648L),
    LESS_THAN_3G(3221225472L),
    LESS_THAN_3_5G(3758096384L),
    LESS_THAN_4G(4294967296L);

    public final long LL;

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemRamSize{size=");
        sbLIZ.append(this.LL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public long getSize() {
        return this.LL;
    }

    public static EnumC2188591Al7 valueOf(String str) {
        return (EnumC2188591Al7) C08FF.LIZ(EnumC2188591Al7.class, str);
    }

    EnumC2188591Al7(long j) {
        this.LL = j;
    }
}
