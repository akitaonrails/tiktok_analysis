package X;

/* JADX INFO: renamed from: X.1BAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2200651BAx implements InterfaceC19912512vb {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    public final int LL;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.LL);
    }

    @Override // X.InterfaceC19912512vb
    public final int zza() {
        return this.LL;
    }

    EnumC2200651BAx(int i) {
        this.LL = i;
    }
}
