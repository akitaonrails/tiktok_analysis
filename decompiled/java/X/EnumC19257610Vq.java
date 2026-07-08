package X;

/* JADX INFO: renamed from: X.10Vq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public enum EnumC19257610Vq {
    REGISTRATION(0),
    EXISTING(1),
    EDIT(2);

    public final int LL;

    public static EnumC19257610Vq valueOf(String str) {
        return (EnumC19257610Vq) C08FF.LIZ(EnumC19257610Vq.class, str);
    }

    public final int getScenario() {
        return this.LL;
    }

    EnumC19257610Vq(int i) {
        this.LL = i;
    }
}
