package X;

/* JADX INFO: renamed from: X.0UWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public enum EnumC773550UWb {
    DEFAULT(0),
    TESTING(1),
    GOOD_CONNECTION(2),
    BAD_CONNECTION(3),
    PROBE_FAILED(4);

    public final int LL;

    public int value() {
        return this.LL;
    }

    public static EnumC773550UWb valueOf(String str) {
        return (EnumC773550UWb) C08FF.LIZ(EnumC773550UWb.class, str);
    }

    EnumC773550UWb(int i) {
        this.LL = i;
    }
}
