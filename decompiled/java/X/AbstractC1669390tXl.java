package X;

/* JADX INFO: renamed from: X.0tXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1669390tXl implements InterfaceC1680710tq1 {
    public final InterfaceC1160240gIY LIZ;
    public final InterfaceC1160240gIY LIZIZ;
    public final InterfaceC1160240gIY LIZJ;
    public final InterfaceC1160240gIY LIZLLL;

    public abstract AbstractC1680810tqB LIZIZ(long j, float f, float f2, float f3, float f4, EnumC1671200tag enumC1671200tag);

    @Override // X.InterfaceC1680710tq1
    public final AbstractC1680810tqB LIZ(long j, EnumC1671200tag enumC1671200tag, InterfaceC1690500u5o interfaceC1690500u5o) {
        float fLIZ = this.LIZ.LIZ(j, interfaceC1690500u5o);
        float fLIZ2 = this.LIZIZ.LIZ(j, interfaceC1690500u5o);
        float fLIZ3 = this.LIZJ.LIZ(j, interfaceC1690500u5o);
        float fLIZ4 = this.LIZLLL.LIZ(j, interfaceC1690500u5o);
        float fLIZJ = C1680770tq7.LIZJ(j);
        float f = fLIZ + fLIZ4;
        if (f > fLIZJ) {
            float f2 = fLIZJ / f;
            fLIZ *= f2;
            fLIZ4 *= f2;
        }
        float f3 = fLIZ2 + fLIZ3;
        if (f3 > fLIZJ) {
            float f4 = fLIZJ / f3;
            fLIZ2 *= f4;
            fLIZ3 *= f4;
        }
        if (fLIZ < 0.0f || fLIZ2 < 0.0f || fLIZ3 < 0.0f || fLIZ4 < 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Corner size in Px can't be negative(topStart = ");
            sbLIZ.append(fLIZ);
            sbLIZ.append(", topEnd = ");
            sbLIZ.append(fLIZ2);
            sbLIZ.append(", bottomEnd = ");
            sbLIZ.append(fLIZ3);
            sbLIZ.append(", bottomStart = ");
            sbLIZ.append(fLIZ4);
            sbLIZ.append(")!");
            C1691080u6k.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return LIZIZ(j, fLIZ, fLIZ2, fLIZ3, fLIZ4, enumC1671200tag);
    }

    public AbstractC1669390tXl(InterfaceC1160240gIY interfaceC1160240gIY, InterfaceC1160240gIY interfaceC1160240gIY2, InterfaceC1160240gIY interfaceC1160240gIY3, InterfaceC1160240gIY interfaceC1160240gIY4) {
        this.LIZ = interfaceC1160240gIY;
        this.LIZIZ = interfaceC1160240gIY2;
        this.LIZJ = interfaceC1160240gIY3;
        this.LIZLLL = interfaceC1160240gIY4;
    }
}
