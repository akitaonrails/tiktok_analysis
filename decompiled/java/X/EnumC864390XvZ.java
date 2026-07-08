package X;

/* JADX INFO: renamed from: X.0XvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC864390XvZ {
    SUCCESS(0),
    ERROR(1);

    public final int LL;

    public int getCode() {
        return this.LL;
    }

    public static EnumC864390XvZ valueOf(String str) {
        return (EnumC864390XvZ) C08FF.LIZ(EnumC864390XvZ.class, str);
    }

    EnumC864390XvZ(int i) {
        this.LL = i;
    }
}
