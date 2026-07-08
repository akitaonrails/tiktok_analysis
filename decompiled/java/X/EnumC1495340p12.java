package X;

/* JADX INFO: renamed from: X.0p12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1495340p12 {
    GZIP(1),
    BROTLI(2),
    ZSTD(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1495340p12 valueOf(String str) {
        return (EnumC1495340p12) C08FF.LIZ(EnumC1495340p12.class, str);
    }

    EnumC1495340p12(int i) {
        this.LL = i;
    }
}
