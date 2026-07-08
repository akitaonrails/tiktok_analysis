package X;

/* JADX INFO: renamed from: X.0j9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1270230j9x {
    Keep(0),
    Up(1),
    Down(2);

    public final int LL;

    public static EnumC1270230j9x valueOf(String str) {
        return (EnumC1270230j9x) C08FF.LIZ(EnumC1270230j9x.class, str);
    }

    public final int getCode() {
        return this.LL;
    }

    EnumC1270230j9x(int i) {
        this.LL = i;
    }
}
