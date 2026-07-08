package X;

/* JADX INFO: renamed from: X.0u5E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690140u5E {
    public final InterfaceC1676320tiw LIZ;
    public final InterfaceC1676320tiw LIZIZ;
    public boolean LIZJ;
    public Object LIZLLL;
    public final C1690310u5V LJ;

    public C1690140u5E(int i, int i2) {
        this.LIZ = C1696870uG5.LIZ(i);
        this.LIZIZ = C1696870uG5.LIZ(i2);
        this.LJ = new C1690310u5V(i, 30, 100);
    }

    public final void LIZ(int i, int i2) {
        if (i < 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Index should be non-negative (");
            sbLIZ.append(i);
            sbLIZ.append(')');
            C1691080u6k.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        ((C13FG) this.LIZ).LJIIJ(i);
        this.LJ.LJIIL(i);
        ((C13FG) this.LIZIZ).LJIIJ(i2);
    }
}
