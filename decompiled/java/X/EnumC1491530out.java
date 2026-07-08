package X;

/* JADX INFO: renamed from: X.0out, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1491530out {
    MEMORY_ONLY(1),
    MEMORY_AND_DISK(2);

    public final long LL;

    public static EnumC1491530out valueOf(String str) {
        return (EnumC1491530out) C08FF.LIZ(EnumC1491530out.class, str);
    }

    public final long getNativeValue() {
        return this.LL;
    }

    EnumC1491530out(long j) {
        this.LL = j;
    }
}
