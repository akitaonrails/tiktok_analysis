package X;

/* JADX INFO: renamed from: X.0uJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public enum EnumC1699190uJp {
    VeLivePlayerDrmTypeNone(0),
    VeLivePlayerDrmTypeWidevine(2);

    public final int LL;

    @Override // java.lang.Enum
    public String toString() {
        return this.LL != 2 ? "none" : "widevine";
    }

    public int getValue() {
        return this.LL;
    }

    public static EnumC1699190uJp valueOf(String str) {
        return (EnumC1699190uJp) C08FF.LIZ(EnumC1699190uJp.class, str);
    }

    EnumC1699190uJp(int i) {
        this.LL = i;
    }
}
