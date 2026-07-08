package X;

/* JADX INFO: renamed from: X.0jw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1300100jw8 {
    FATAL("fatal"),
    ERROR("error"),
    WARN("warn"),
    UNDECIDED("undecided");

    public final String LL;

    public static EnumC1300100jw8 valueOf(String str) {
        return (EnumC1300100jw8) C08FF.LIZ(EnumC1300100jw8.class, str);
    }

    EnumC1300100jw8(String str) {
        this.LL = str;
    }
}
