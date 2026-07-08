package X;

/* JADX INFO: renamed from: X.12kV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19843712kV implements InterfaceC19843912kX {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);

    public final int LL;

    @Override // X.InterfaceC19843912kX
    public int getAlgoValue() {
        return this.LL;
    }

    public static EnumC19843712kV valueOf(String str) {
        return (EnumC19843712kV) C08FF.LIZ(EnumC19843712kV.class, str);
    }

    EnumC19843712kV(int i) {
        this.LL = i;
    }
}
