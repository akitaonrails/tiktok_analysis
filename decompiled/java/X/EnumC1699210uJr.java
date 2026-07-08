package X;

/* JADX INFO: renamed from: X.0uJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public enum EnumC1699210uJr {
    IN_ROOM(0),
    IN_FEED(1);

    public final int LL;

    public int getCode() {
        return this.LL;
    }

    public static EnumC1699210uJr valueOf(String str) {
        return (EnumC1699210uJr) C08FF.LIZ(EnumC1699210uJr.class, str);
    }

    EnumC1699210uJr(int i) {
        this.LL = i;
    }
}
