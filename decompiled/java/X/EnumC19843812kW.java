package X;

/* JADX INFO: renamed from: X.12kW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19843812kW implements InterfaceC19843912kX {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);

    public final int LL;

    @Override // X.InterfaceC19843912kX
    public int getAlgoValue() {
        return this.LL;
    }

    public static EnumC19843812kW valueOf(String str) {
        return (EnumC19843812kW) C08FF.LIZ(EnumC19843812kW.class, str);
    }

    EnumC19843812kW(int i) {
        this.LL = i;
    }
}
