package X;

/* JADX INFO: renamed from: X.0WuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC838050WuB {
    INFO(0),
    WARN(2),
    ERROR(3);

    public final int LL;

    public static EnumC838050WuB valueOf(String str) {
        return (EnumC838050WuB) C08FF.LIZ(EnumC838050WuB.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC838050WuB(int i) {
        this.LL = i;
    }
}
