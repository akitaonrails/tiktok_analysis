package X;

/* JADX INFO: renamed from: X.0Vwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC814170Vwl implements C0WDB {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final int LL;

    @Override // X.C0WDB
    public int getNumber() {
        return this.LL;
    }

    public static EnumC814170Vwl valueOf(String str) {
        return (EnumC814170Vwl) C08FF.LIZ(EnumC814170Vwl.class, str);
    }

    EnumC814170Vwl(int i) {
        this.LL = i;
    }
}
