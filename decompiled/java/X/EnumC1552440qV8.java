package X;

/* JADX INFO: renamed from: X.0qV8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1552440qV8 {
    lv_1(1),
    lv_2(2),
    lv_3(3);

    public final int LL;

    public int getLevel() {
        return this.LL;
    }

    public static EnumC1552440qV8 valueOf(String str) {
        return (EnumC1552440qV8) C08FF.LIZ(EnumC1552440qV8.class, str);
    }

    EnumC1552440qV8(int i) {
        this.LL = i;
    }
}
