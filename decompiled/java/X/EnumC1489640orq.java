package X;

/* JADX INFO: renamed from: X.0orq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1489640orq {
    NormalStart(-1),
    ColdStart(0),
    HotStart(1),
    WarmStart(2),
    WeakNet(3),
    Default(4);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1489640orq valueOf(String str) {
        return (EnumC1489640orq) C08FF.LIZ(EnumC1489640orq.class, str);
    }

    EnumC1489640orq(int i) {
        this.LL = i;
    }
}
