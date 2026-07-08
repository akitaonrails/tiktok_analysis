package X;

/* JADX INFO: renamed from: X.0jeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1289080jeM {
    HIGH(-100),
    DEFAULT(0),
    LOW(100);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1289080jeM valueOf(String str) {
        return (EnumC1289080jeM) C08FF.LIZ(EnumC1289080jeM.class, str);
    }

    EnumC1289080jeM(int i) {
        this.LL = i;
    }
}
