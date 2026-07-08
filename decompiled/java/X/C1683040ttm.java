package X;

import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0ttm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683040ttm extends AbstractC20055413dY implements InterfaceC20052813d8 {
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public float LLJJJJJIL;
    public long LLJJJJLIIL;
    public InterfaceC1680710tq1 LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public AbstractC1683790tuz LLJL;
    public long LLJLIL;
    public long LLJLILLLLZIIL;
    public int LLJLL;
    public final AwS604S0100000_25 LLJLLIL = new AwS604S0100000_25(this, 15);

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZJ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZLLL(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.LLJJ);
        sb.append(", scaleY=");
        sb.append(this.LLJJI);
        sb.append(", alpha = ");
        sb.append(this.LLJJIII);
        sb.append(", translationX=");
        sb.append(this.LLJJIJI);
        sb.append(", translationY=");
        sb.append(this.LLJJIJIIJIL);
        sb.append(", shadowElevation=");
        sb.append(this.LLJJIJIL);
        sb.append(", rotationX=");
        sb.append(this.LLJJJ);
        sb.append(", rotationY=");
        sb.append(this.LLJJJIL);
        sb.append(", rotationZ=");
        sb.append(this.LLJJJJ);
        sb.append(", cameraDistance=");
        sb.append(this.LLJJJJJIL);
        sb.append(", transformOrigin=");
        sb.append((Object) C1676680tjW.LIZLLL(this.LLJJJJLIIL));
        sb.append(", shape=");
        sb.append(this.LLJJL);
        sb.append(", clip=");
        sb.append(this.LLJJLIIIJLLLLLLLZ);
        sb.append(", renderEffect=");
        sb.append(this.LLJL);
        sb.append(", ambientShadowColor=");
        sb.append((Object) C1685910tyP.LJIIJJI(this.LLJLIL));
        sb.append(", spotShadowColor=");
        sb.append((Object) C1685910tyP.LJIIJJI(this.LLJLILLLLZIIL));
        sb.append(", compositingStrategy=");
        int i = this.LLJLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompositingStrategy(value=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        sb.append((Object) C2188811AlT.LIZIZ(sbLIZ));
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j);
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, abstractC1686530tzPLJJJJZ.LLILLJJLI, C2097608Jq.LJ(), new AwS391S0200000_25(abstractC1686530tzPLJJJJZ, this, 11));
    }

    public C1683040ttm(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC1680710tq1 interfaceC1680710tq1, boolean z, AbstractC1683790tuz abstractC1683790tuz, long j2, long j3, int i) {
        this.LLJJ = f;
        this.LLJJI = f2;
        this.LLJJIII = f3;
        this.LLJJIJI = f4;
        this.LLJJIJIIJIL = f5;
        this.LLJJIJIL = f6;
        this.LLJJJ = f7;
        this.LLJJJIL = f8;
        this.LLJJJJ = f9;
        this.LLJJJJJIL = f10;
        this.LLJJJJLIIL = j;
        this.LLJJL = interfaceC1680710tq1;
        this.LLJJLIIIJLLLLLLLZ = z;
        this.LLJL = abstractC1683790tuz;
        this.LLJLIL = j2;
        this.LLJLILLLLZIIL = j3;
        this.LLJLL = i;
    }
}
