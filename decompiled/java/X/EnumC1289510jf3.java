package X;

/* JADX INFO: renamed from: X.0jf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1289510jf3 {
    Info("info"),
    Warn("warn"),
    Error("error");

    public final String value;

    public static EnumC1289510jf3 valueOf(String str) {
        return (EnumC1289510jf3) C08FF.LIZ(EnumC1289510jf3.class, str);
    }

    EnumC1289510jf3(String str) {
        this.value = str;
    }
}
