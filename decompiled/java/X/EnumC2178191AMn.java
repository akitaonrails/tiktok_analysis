package X;

/* JADX INFO: renamed from: X.1AMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2178191AMn {
    SINGLE("single"),
    ORDER("order"),
    LIST("list");

    public final String LL;

    public static EnumC2178191AMn valueOf(String str) {
        return (EnumC2178191AMn) C08FF.LIZ(EnumC2178191AMn.class, str);
    }

    public final String getDesc() {
        return this.LL;
    }

    EnumC2178191AMn(String str) {
        this.LL = str;
    }
}
