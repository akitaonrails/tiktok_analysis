package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13cD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20047113cD implements InterfaceC1672350tcX {
    public EnumC1671200tag LL = EnumC1671200tag.Rtl;
    public float LLILLJJLI;
    public float LLILLL;
    public final /* synthetic */ C20037513af LLILZ;

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJJLIIIJLJLI(long j) {
        return C1682420tsm.LIZLLL(j, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJLI(long j) {
        return C1682420tsm.LIZIZ(j, this);
    }

    @Override // X.InterfaceC1689940u4u
    public final /* synthetic */ InterfaceC1690350u5Z LJLJJL(int i, int i2, Map map, Function1 function1) {
        return C1691220u6y.LIZ(this, i, i2, map, function1);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ long LJLJLJ(float f) {
        return C1685230txJ.LIZIZ(this, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ int LJLLJ(float f) {
        return C1682420tsm.LIZ(f, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ float LJLLL(long j) {
        return C1682420tsm.LIZJ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ float LLI(long j) {
        return C1685230txJ.LIZ(this, j);
    }

    @Override // X.InterfaceC1676350tiz
    public final boolean LLIILII() {
        EnumC20047813cK enumC20047813cK = this.LLILZ.LL.LLJLLL.LIZLLL;
        return enumC20047813cK == EnumC20047813cK.LookaheadLayingOut || enumC20047813cK == EnumC20047813cK.LookaheadMeasuring;
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1676350tiz
    public final EnumC1671200tag getLayoutDirection() {
        return this.LL;
    }

    public C20047113cD(C20037513af c20037513af) {
        this.LLILZ = c20037513af;
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return f / getDensity();
    }

    @Override // X.InterfaceC1672350tcX
    public final List<InterfaceC1673370teB> LJJLIL(Object obj, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        C20037513af c20037513af = this.LLILZ;
        c20037513af.LIZIZ();
        EnumC20047813cK enumC20047813cK = c20037513af.LL.LLJLLL.LIZLLL;
        EnumC20047813cK enumC20047813cK2 = EnumC20047813cK.Measuring;
        if (enumC20047813cK != enumC20047813cK2 && enumC20047813cK != EnumC20047813cK.LayingOut && enumC20047813cK != EnumC20047813cK.LookaheadMeasuring && enumC20047813cK != EnumC20047813cK.LookaheadLayingOut) {
            C1696250uF5.LIZIZ("subcompose can only be used inside the measure or layout blocks");
        }
        C19991913Kb<Object, C20053713dH> c19991913Kb = c20037513af.LLIZ;
        C20053713dH c20053713dHLIZLLL = c19991913Kb.LIZLLL(obj);
        if (c20053713dHLIZLLL == null) {
            c20053713dHLIZLLL = c20037513af.LLJI.LJIIIZ(obj);
            if (c20053713dHLIZLLL != null) {
                if (c20037513af.LLJJ <= 0) {
                    C1696250uF5.LIZIZ("Check failed.");
                }
                c20037513af.LLJJ--;
            } else {
                c20053713dHLIZLLL = c20037513af.LJFF(obj);
                if (c20053713dHLIZLLL == null) {
                    int i = c20037513af.LLILZ;
                    c20053713dHLIZLLL = new C20053713dH(true, 2, 0);
                    C20053713dH c20053713dH = c20037513af.LL;
                    c20053713dH.LLJJIII = true;
                    c20053713dH.LJJJI(i, c20053713dHLIZLLL);
                    c20053713dH.LLJJIII = false;
                }
            }
            c19991913Kb.LJIIJJI(obj, c20053713dHLIZLLL);
        }
        C20053713dH c20053713dH2 = c20053713dHLIZLLL;
        if (C13LP.LJJJLZIJ(c20037513af.LLILZ, c20037513af.LL.LJJIIZ()) != c20053713dH2) {
            int iIndexOf = c20037513af.LL.LJJIIZ().indexOf(c20053713dH2);
            if (iIndexOf < c20037513af.LLILZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Key \"");
                sbLIZ.append(obj);
                sbLIZ.append("\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                C1696250uF5.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            int i2 = c20037513af.LLILZ;
            if (i2 != iIndexOf) {
                C20053713dH c20053713dH3 = c20037513af.LL;
                c20053713dH3.LLJJIII = true;
                c20053713dH3.LJJJJLI(iIndexOf, i2, 1);
                c20053713dH3.LLJJIII = false;
            }
        }
        c20037513af.LLILZ++;
        c20037513af.LJ(c20053713dH2, obj, function2);
        if (enumC20047813cK != enumC20047813cK2 && enumC20047813cK != EnumC20047813cK.LayingOut) {
            return c20053713dH2.LJJIII();
        }
        return c20053713dH2.LJJIIJ();
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
        final C20037513af c20037513af = this.LLILZ;
        return new InterfaceC1690350u5Z() { // from class: X.13cG
            public final /* synthetic */ Function1<Object, Unit> LIZLLL = null;

            @Override // X.InterfaceC1690350u5Z
            public final void LJIILLIIL() {
                AbstractC20050413ck abstractC20050413ck;
                if (!this.LLIILII() || (abstractC20050413ck = c20037513af.LL.LLJLLIL.LIZIZ.LLLIIIL) == null) {
                    function1.invoke(c20037513af.LL.LLJLLIL.LIZIZ.LLJ);
                } else {
                    function1.invoke(abstractC20050413ck.LLJ);
                }
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
