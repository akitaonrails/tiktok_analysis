package X;

/* JADX INFO: renamed from: X.0jdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1288660jdg {
    BACKGROUND(1),
    VISIBLE(2),
    OPACITY(4),
    SIZE(8),
    ATTACH(16),
    AGGREGATED(32);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1288660jdg valueOf(String str) {
        return (EnumC1288660jdg) C08FF.LIZ(EnumC1288660jdg.class, str);
    }

    EnumC1288660jdg(int i) {
        this.LL = i;
    }
}
