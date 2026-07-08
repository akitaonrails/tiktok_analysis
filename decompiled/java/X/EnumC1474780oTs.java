package X;

/* JADX INFO: renamed from: X.0oTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1474780oTs {
    EXCELLENT("excellent"),
    GOOD("good"),
    REGULAR("regular");

    public final String LL;

    public static EnumC1474780oTs valueOf(String str) {
        return (EnumC1474780oTs) C08FF.LIZ(EnumC1474780oTs.class, str);
    }

    public final String getDesc() {
        return this.LL;
    }

    EnumC1474780oTs(String str) {
        this.LL = str;
    }
}
