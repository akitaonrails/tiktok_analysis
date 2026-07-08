package X;

/* JADX INFO: renamed from: X.0osy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1490340osy {
    NONE(0),
    SLARDAR(1),
    APPLOG(2);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1490340osy valueOf(String str) {
        return (EnumC1490340osy) C08FF.LIZ(EnumC1490340osy.class, str);
    }

    EnumC1490340osy(int i) {
        this.LL = i;
    }
}
