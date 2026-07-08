package X;

/* JADX INFO: renamed from: X.0wnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public enum EnumC1794260wnA {
    UNKNOWN(0),
    NOMAL(2),
    EXTRA_TOKEN(3),
    EXTRA_QUERY(4);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1794260wnA valueOf(String str) {
        return (EnumC1794260wnA) C08FF.LIZ(EnumC1794260wnA.class, str);
    }

    EnumC1794260wnA(int i) {
        this.LL = i;
    }
}
