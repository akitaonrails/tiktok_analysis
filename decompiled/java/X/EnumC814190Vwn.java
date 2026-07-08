package X;

/* JADX INFO: renamed from: X.0Vwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC814190Vwn implements C0WDB {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    public final int LL;

    @Override // X.C0WDB
    public int getNumber() {
        return this.LL;
    }

    public static EnumC814190Vwn valueOf(String str) {
        return (EnumC814190Vwn) C08FF.LIZ(EnumC814190Vwn.class, str);
    }

    EnumC814190Vwn(int i) {
        this.LL = i;
    }
}
