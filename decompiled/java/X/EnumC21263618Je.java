package X;

/* JADX INFO: renamed from: X.18Je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21263618Je {
    INFINITE(0),
    SHORT(15000),
    LONG(60000),
    ACTIVITY_DESTORY(-1);

    public final long LL;

    public static EnumC21263618Je valueOf(String str) {
        return (EnumC21263618Je) C08FF.LIZ(EnumC21263618Je.class, str);
    }

    public final long getDelay() {
        return this.LL;
    }

    EnumC21263618Je(long j) {
        this.LL = j;
    }
}
