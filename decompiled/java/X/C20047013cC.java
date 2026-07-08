package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13cC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20047013cC implements InterfaceC1672350tcX, InterfaceC1689940u4u {
    public final /* synthetic */ C20047113cD LL;
    public final /* synthetic */ C20037513af LLILLJJLI;

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return this.LL.LJJI(i);
    }

    @Override // X.InterfaceC1690500u5o
    public final long LJJLIIIJLJLI(long j) {
        C20047113cD c20047113cD = this.LL;
        c20047113cD.getClass();
        return C1682420tsm.LIZLLL(j, c20047113cD);
    }

    @Override // X.InterfaceC1690500u5o
    public final long LJLI(long j) {
        C20047113cD c20047113cD = this.LL;
        c20047113cD.getClass();
        return C1682420tsm.LIZIZ(j, c20047113cD);
    }

    @Override // X.InterfaceC1689940u4u
    public final InterfaceC1690350u5Z LJLJJL(int i, int i2, Map<C115T, Integer> map, Function1<? super AbstractC1683310tuD, Unit> function1) {
        C20047113cD c20047113cD = this.LL;
        c20047113cD.getClass();
        return C1691220u6y.LIZ(c20047113cD, i, i2, map, function1);
    }

    @Override // X.InterfaceC1681050tqZ
    public final long LJLJLJ(float f) {
        C20047113cD c20047113cD = this.LL;
        c20047113cD.getClass();
        return C1685230txJ.LIZIZ(c20047113cD, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final int LJLLJ(float f) {
        C20047113cD c20047113cD = this.LL;
        c20047113cD.getClass();
        return C1682420tsm.LIZ(f, c20047113cD);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJLLL(long j) {
        C20047113cD c20047113cD = this.LL;
        c20047113cD.getClass();
        return C1682420tsm.LIZJ(j, c20047113cD);
    }

    @Override // X.InterfaceC1689940u4u
    public final InterfaceC1690350u5Z LJZI(int i, int i2, Map map, Function1 function1) {
        return this.LL.LJZI(i, i2, map, function1);
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LLI(long j) {
        C20047113cD c20047113cD = this.LL;
        c20047113cD.getClass();
        return C1685230txJ.LIZ(c20047113cD, j);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return this.LL.LLIIIJ(f);
    }

    @Override // X.InterfaceC1676350tiz
    public final boolean LLIILII() {
        return this.LL.LLIILII();
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LL.LLILLL;
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LL.LLILLJJLI;
    }

    @Override // X.InterfaceC1676350tiz
    public final EnumC1671200tag getLayoutDirection() {
        return this.LL.LL;
    }

    public C20047013cC(C20037513af c20037513af) {
        this.LLILLJJLI = c20037513af;
        this.LL = c20037513af.LLIZLLLIL;
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * this.LL.getDensity();
    }

    @Override // X.InterfaceC1672350tcX
    public final List<InterfaceC1673370teB> LJJLIL(Object obj, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        C20053713dH c20053713dHLIZLLL = this.LLILLJJLI.LLIZ.LIZLLL(obj);
        if (c20053713dHLIZLLL != null && this.LLILLJJLI.LL.LJJIIZ().indexOf(c20053713dHLIZLLL) < this.LLILLJJLI.LLILZ) {
            return c20053713dHLIZLLL.LJJIIJ();
        }
        C20037513af c20037513af = this.LLILLJJLI;
        if (c20037513af.LLJILJILJ.LLILLL < c20037513af.LLILZIL) {
            C1696250uF5.LIZ("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        C19968013Aw<Object> c19968013Aw = c20037513af.LLJILJILJ;
        int i = c19968013Aw.LLILLL;
        int i2 = c20037513af.LLILZIL;
        if (i == i2) {
            c19968013Aw.LIZLLL(obj);
        } else {
            c19968013Aw.LL[i2] = obj;
        }
        c20037513af.LLILZIL++;
        if (!c20037513af.LLJI.LIZ(obj)) {
            c20037513af.LLJILJIL.LJIIJJI(obj, c20037513af.LIZLLL(obj, function2));
            C20053713dH c20053713dH = c20037513af.LL;
            if (c20053713dH.LLJLLL.LIZLLL == EnumC20047813cK.LayingOut) {
                c20053713dH.LJJJLZIJ(true);
            } else {
                C20053713dH.LJJJZ(c20053713dH, true, 6);
            }
        }
        C20053713dH c20053713dHLIZLLL2 = c20037513af.LLJI.LIZLLL(obj);
        if (c20053713dHLIZLLL2 != null) {
            List<C20053813dI> listLJJLJLI = c20053713dHLIZLLL2.LLJLLL.LJIILL.LJJLJLI();
            int i3 = ((C19967913Av) listLJJLJLI).LL.LLILLL;
            for (int i4 = 0; i4 < i3; i4++) {
                ((C20053813dI) ListProtector.get(listLJJLJLI, i4)).LLILZLL.LIZIZ = true;
            }
            return listLJJLJLI;
        }
        return C13BV.INSTANCE;
    }
}
