package X;

/* JADX INFO: renamed from: X.0p5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1498400p5y {
    DISABLED(0, false),
    DISK(1, true),
    DISK_NO_HTTP(1, false),
    MEMORY(2, true);

    public final int LL;
    public final boolean LLILLJJLI;

    public static EnumC1498400p5y valueOf(String str) {
        return (EnumC1498400p5y) C08FF.LIZ(EnumC1498400p5y.class, str);
    }

    EnumC1498400p5y(int i, boolean z) {
        this.LLILLJJLI = z;
        this.LL = i;
    }
}
