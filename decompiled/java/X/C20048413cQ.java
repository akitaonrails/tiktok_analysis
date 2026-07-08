package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13cQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20048413cQ implements InterfaceC1676350tiz, InterfaceC1689940u4u {
    public final C20052713d7 LL;
    public InterfaceC20052913d9 LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LL.LJJ();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return this.LL.LJJI(i);
    }

    @Override // X.InterfaceC1690500u5o
    public final long LJJLIIIJLJLI(long j) {
        C20052713d7 c20052713d7 = this.LL;
        c20052713d7.getClass();
        return C1682420tsm.LIZLLL(j, c20052713d7);
    }

    @Override // X.InterfaceC1690500u5o
    public final long LJLI(long j) {
        C20052713d7 c20052713d7 = this.LL;
        c20052713d7.getClass();
        return C1682420tsm.LIZIZ(j, c20052713d7);
    }

    @Override // X.InterfaceC1689940u4u
    public final InterfaceC1690350u5Z LJLJJL(int i, int i2, Map<C115T, Integer> map, Function1<? super AbstractC1683310tuD, Unit> function1) {
        C20052713d7 c20052713d7 = this.LL;
        c20052713d7.getClass();
        return C1691220u6y.LIZ(c20052713d7, i, i2, map, function1);
    }

    @Override // X.InterfaceC1681050tqZ
    public final long LJLJLJ(float f) {
        C20052713d7 c20052713d7 = this.LL;
        c20052713d7.getClass();
        return C1685230txJ.LIZIZ(c20052713d7, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final int LJLLJ(float f) {
        C20052713d7 c20052713d7 = this.LL;
        c20052713d7.getClass();
        return C1682420tsm.LIZ(f, c20052713d7);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJLLL(long j) {
        C20052713d7 c20052713d7 = this.LL;
        c20052713d7.getClass();
        return C1682420tsm.LIZJ(j, c20052713d7);
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LLI(long j) {
        C20052713d7 c20052713d7 = this.LL;
        c20052713d7.getClass();
        return C1685230txJ.LIZ(c20052713d7, j);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return this.LL.LLIIIJ(f);
    }

    @Override // X.InterfaceC1676350tiz
    public final boolean LLIILII() {
        return false;
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LL.getDensity();
    }

    @Override // X.InterfaceC1676350tiz
    public final EnumC1671200tag getLayoutDirection() {
        return this.LL.LLJILJILJ.LLJJL;
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * this.LL.getDensity();
    }

    public C20048413cQ(C20052713d7 c20052713d7, InterfaceC20052913d9 interfaceC20052913d9) {
        this.LL = c20052713d7;
        this.LLILLJJLI = interfaceC20052913d9;
    }

    @Override // X.InterfaceC1689940u4u
    public final InterfaceC1690350u5Z LJZI(final int i, final int i2, final Map map, final Function1 function1) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Size(");
            sbLIZ.append(i);
            sbLIZ.append(" x ");
            sbLIZ.append(i2);
            sbLIZ.append(") is out of range. Each dimension must be between 0 and 16777215.");
            C1696250uF5.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return new InterfaceC1690350u5Z(i, i2, map, function1, this) { // from class: X.13cR
            public final int LIZ;
            public final int LIZIZ;
            public final Map<C115T, Integer> LIZJ;
            public final Function1<Object, Unit> LIZLLL = null;
            public final /* synthetic */ Function1<AbstractC1683310tuD, Unit> LJ;
            public final /* synthetic */ C20048413cQ LJFF;

            @Override // X.InterfaceC1690350u5Z
            public final void LJIILLIIL() {
                this.LJ.invoke(this.LJFF.LL.LLJ);
            }

            @Override // X.InterfaceC1690350u5Z
            public final Map<C115T, Integer> LJIILL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1690350u5Z
            public final Function1<Object, Unit> LJIIZILJ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1690350u5Z
            public final int getHeight() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1690350u5Z
            public final int getWidth() {
                return this.LIZ;
            }

            {
                this.LJ = function1;
                this.LJFF = this;
                this.LIZ = i;
                this.LIZIZ = i2;
                this.LIZJ = map;
            }
        };
    }
}
