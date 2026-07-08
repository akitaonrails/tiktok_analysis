package X;

/* JADX INFO: renamed from: X.1C7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2225211C7j {
    Runnable(0),
    Stage(1),
    JavaStack(2),
    JavaBackStack(3),
    NativeStack(4),
    Custom(100);

    public final int LL;

    public static EnumC2225211C7j valueOf(String str) {
        return (EnumC2225211C7j) C08FF.LIZ(EnumC2225211C7j.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC2225211C7j(int i) {
        this.LL = i;
    }
}
