package X;

/* JADX INFO: renamed from: X.1ArS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2192521ArS {
    V3(0),
    V1(1),
    LogData(2),
    Launch(3),
    Terminate(4),
    IMPRESSION(5),
    FORWARD_V3(6),
    UNKNOWN(99);

    public final int LL;

    public int value() {
        return this.LL;
    }

    public static EnumC2192521ArS valueOf(String str) {
        return (EnumC2192521ArS) C08FF.LIZ(EnumC2192521ArS.class, str);
    }

    EnumC2192521ArS(int i) {
        this.LL = i;
    }
}
