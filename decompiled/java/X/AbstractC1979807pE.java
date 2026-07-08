package X;

/* JADX INFO: renamed from: X.07pE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1979807pE implements InterfaceC1979907pF {
    public InterfaceC1979907pF LIZ;
    public InterfaceC1979907pF LIZIZ;
    public final EnumC1979607pC LIZJ;

    @Override // X.InterfaceC1979907pF
    public final String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LIZJ());
        sbLIZ.append(this.LIZJ.getLiterals());
        sbLIZ.append(this.LIZIZ.LIZJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String toString() {
        return LIZJ();
    }

    @Override // X.InterfaceC1979907pF
    public final InterfaceC205300qh LIZIZ() {
        return EnumC1983107pl.OPERATOR_RESULT;
    }

    public AbstractC1979807pE(EnumC1979607pC enumC1979607pC) {
        this.LIZJ = enumC1979607pC;
    }
}
