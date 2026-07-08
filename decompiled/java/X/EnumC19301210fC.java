package X;

/* JADX INFO: renamed from: X.10fC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public enum EnumC19301210fC {
    VERTICAL(0),
    HORIZONTAL(1);

    public final int LL;

    public static EnumC19301210fC valueOf(String str) {
        return (EnumC19301210fC) C08FF.LIZ(EnumC19301210fC.class, str);
    }

    public final int getType() {
        return this.LL;
    }

    EnumC19301210fC(int i) {
        this.LL = i;
    }
}
