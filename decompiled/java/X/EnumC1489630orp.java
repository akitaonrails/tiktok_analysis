package X;

/* JADX INFO: renamed from: X.0orp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1489630orp {
    NormalStart(-1),
    ColdStart(0),
    HotStart(1),
    WarmStart(2);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1489630orp valueOf(String str) {
        return (EnumC1489630orp) C08FF.LIZ(EnumC1489630orp.class, str);
    }

    EnumC1489630orp(int i) {
        this.LL = i;
    }
}
