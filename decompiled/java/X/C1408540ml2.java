package X;

/* JADX INFO: renamed from: X.0ml2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408540ml2 {
    public final String LIZ;
    public final int LIZIZ;
    public final InterfaceC1409980mnM LIZJ;
    public final InterfaceC21297218Wc LIZLLL;
    public final C375830EoP<Boolean> LJ;
    public final C375830EoP<Boolean> LJFF;

    public static C1408540ml2 LIZ(C1408540ml2 c1408540ml2, int i, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i2) {
        String str;
        InterfaceC1409980mnM interfaceC1409980mnM;
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        int i3 = i;
        InterfaceC21297218Wc interfaceC21297218Wc = null;
        if ((i2 & 1) != 0) {
            str = c1408540ml2.LIZ;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i3 = c1408540ml2.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            interfaceC1409980mnM = c1408540ml2.LIZJ;
        } else {
            interfaceC1409980mnM = null;
        }
        if ((i2 & 8) != 0) {
            interfaceC21297218Wc = c1408540ml2.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c375830EoP4 = c1408540ml2.LJ;
        }
        if ((i2 & 32) != 0) {
            c375830EoP3 = c1408540ml2.LJFF;
        }
        c1408540ml2.getClass();
        return new C1408540ml2(str, i3, interfaceC1409980mnM, interfaceC21297218Wc, c375830EoP4, c375830EoP3);
    }

    public C1408540ml2(String str, int i, InterfaceC1409980mnM interfaceC1409980mnM, InterfaceC21297218Wc interfaceC21297218Wc, C375830EoP<Boolean> c375830EoP, C375830EoP<Boolean> c375830EoP2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = interfaceC1409980mnM;
        this.LIZLLL = interfaceC21297218Wc;
        this.LJ = c375830EoP;
        this.LJFF = c375830EoP2;
    }
}
