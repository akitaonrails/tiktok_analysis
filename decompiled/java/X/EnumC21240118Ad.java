package X;

/* JADX INFO: renamed from: X.18Ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21240118Ad {
    UNDEFINED(0),
    ENUM(1),
    ID(2),
    NAME(3);

    public final int LL;

    public static EnumC21240118Ad valueOf(String str) {
        return (EnumC21240118Ad) C08FF.LIZ(EnumC21240118Ad.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC21240118Ad(int i) {
        this.LL = i;
    }
}
