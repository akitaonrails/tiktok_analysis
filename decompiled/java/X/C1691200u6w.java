package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691200u6w implements InterfaceC1689940u4u, InterfaceC1676350tiz {
    public final EnumC1671200tag LL;
    public final /* synthetic */ InterfaceC1676350tiz LLILLJJLI;

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LLILLJJLI.LJJ();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return this.LLILLJJLI.LJJI(i);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return this.LLILLJJLI.LJJJJLL(f);
    }

    @Override // X.InterfaceC1690500u5o
    public final long LJJLIIIJLJLI(long j) {
        return this.LLILLJJLI.LJJLIIIJLJLI(j);
    }

    @Override // X.InterfaceC1690500u5o
    public final long LJLI(long j) {
        return this.LLILLJJLI.LJLI(j);
    }

    @Override // X.InterfaceC1689940u4u
    public final /* synthetic */ InterfaceC1690350u5Z LJLJJL(int i, int i2, Map map, Function1 function1) {
        return C1691220u6y.LIZ(this, i, i2, map, function1);
    }

    @Override // X.InterfaceC1681050tqZ
    public final long LJLJLJ(float f) {
        return this.LLILLJJLI.LJLJLJ(f);
    }

    @Override // X.InterfaceC1690500u5o
    public final int LJLLJ(float f) {
        return this.LLILLJJLI.LJLLJ(f);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJLLL(long j) {
        return this.LLILLJJLI.LJLLL(j);
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LLI(long j) {
        return this.LLILLJJLI.LLI(j);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return this.LLILLJJLI.LLIIIJ(f);
    }

    @Override // X.InterfaceC1676350tiz
    public final boolean LLIILII() {
        return this.LLILLJJLI.LLIILII();
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LLILLJJLI.getDensity();
    }

    @Override // X.InterfaceC1676350tiz
    public final EnumC1671200tag getLayoutDirection() {
        return this.LL;
    }

    public C1691200u6w(InterfaceC1676350tiz interfaceC1676350tiz, EnumC1671200tag enumC1671200tag) {
        this.LL = enumC1671200tag;
        this.LLILLJJLI = interfaceC1676350tiz;
    }

    @Override // X.InterfaceC1689940u4u
    public final InterfaceC1690350u5Z LJZI(final int i, final int i2, final Map map, Function1 function1) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Size(");
            sbLIZ.append(i);
            sbLIZ.append(" x ");
            sbLIZ.append(i2);
            sbLIZ.append(") is out of range. Each dimension must be between 0 and 16777215.");
            C1696250uF5.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return new InterfaceC1690350u5Z() { // from class: X.0u6x
            public final /* synthetic */ Function1<Object, Unit> LIZLLL = null;

            @Override // X.InterfaceC1690350u5Z
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1690350u5Z
            public final Map<C115T, Integer> LJIILL() {
                return map;
            }

            @Override // X.InterfaceC1690350u5Z
            public final Function1<Object, Unit> LJIIZILJ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1690350u5Z
            public final int getHeight() {
                return i2;
            }

            @Override // X.InterfaceC1690350u5Z
            public final int getWidth() {
                return i;
            }
        };
    }
}
