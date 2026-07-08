package X;

/* JADX INFO: renamed from: X.0Vtm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC812320Vtm {
    NONE(0),
    SDK(1),
    GLOBAL(2),
    COMBINED(3);

    public final int LL;

    public int getCode() {
        return this.LL;
    }

    public static EnumC812320Vtm valueOf(String str) {
        return (EnumC812320Vtm) C08FF.LIZ(EnumC812320Vtm.class, str);
    }

    EnumC812320Vtm(int i) {
        this.LL = i;
    }
}
