package X;

/* JADX INFO: renamed from: X.0Vwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC814180Vwm implements C0WDB {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    public final int LL;

    @Override // X.C0WDB
    public int getNumber() {
        return this.LL;
    }

    public static EnumC814180Vwm valueOf(String str) {
        return (EnumC814180Vwm) C08FF.LIZ(EnumC814180Vwm.class, str);
    }

    EnumC814180Vwm(int i) {
        this.LL = i;
    }
}
