package X;

/* JADX INFO: renamed from: X.0oTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1474790oTt {
    EXCELLENT("excellent"),
    GOOD("good"),
    REGULAR("regular");

    public final String LL;

    public static EnumC1474790oTt valueOf(String str) {
        return (EnumC1474790oTt) C08FF.LIZ(EnumC1474790oTt.class, str);
    }

    public final String getDesc() {
        return this.LL;
    }

    EnumC1474790oTt(String str) {
        this.LL = str;
    }
}
