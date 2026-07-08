package X;

/* JADX INFO: renamed from: X.0wSY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public enum EnumC1781480wSY {
    SILVER(1),
    GOLD(2),
    SUPER(3);

    public final int LL;

    EnumC1781480wSY(int i) {
        this.LL = i;
    }

    public static EnumC1781480wSY valueOf(int i) {
        if (i == 1) {
            return SILVER;
        }
        if (i == 2) {
            return GOLD;
        }
        if (i != 3) {
            return null;
        }
        return SUPER;
    }

    public static EnumC1781480wSY valueOf(String str) {
        return (EnumC1781480wSY) C08FF.LIZ(EnumC1781480wSY.class, str);
    }

    public int getIndex() {
        return this.LL;
    }
}
