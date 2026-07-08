package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tU3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667090tU3 extends C09AY implements InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C1303440k1W LLILLL;
    public final /* synthetic */ C05P0 LLILZ;
    public final /* synthetic */ EnumC994870bzp LLILZIL;
    public final /* synthetic */ Function2 LLILZLL;
    public final /* synthetic */ InterfaceC1631620sYq LLIZ;
    public final /* synthetic */ C05P0 LLIZLLLIL;
    public final /* synthetic */ C05P0 LLJ;
    public final /* synthetic */ C05P0 LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667090tU3(List list, float f, C1303440k1W c1303440k1W, C05P0 c05p0, EnumC994870bzp enumC994870bzp, Function2 function2, InterfaceC1631620sYq interfaceC1631620sYq, C05P0 c05p02, C05P0 c05p03, C05P0 c05p04) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = f;
        this.LLILLL = c1303440k1W;
        this.LLILZ = c05p0;
        this.LLILZIL = enumC994870bzp;
        this.LLILZLL = function2;
        this.LLIZ = interfaceC1631620sYq;
        this.LLIZLLLIL = c05p02;
        this.LLJ = c05p03;
        this.LLJI = c05p04;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = num.intValue();
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg2.LJJIIJ(interfaceC1669590tY5)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg2.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg2.LJIJJLI(i & 1, z)) {
            int i4 = (i & 112) | (i & 14);
            RecommendEffectItem recommendEffectItem = (RecommendEffectItem) ListProtector.get(this.LL, iIntValue);
            interfaceC1680500tpg2.LJJIIJZLJL(1804906858);
            interfaceC1680500tpg2.LJJIIJZLJL(-773062683);
            if (iIntValue == 0) {
                C1665790tRx.LIZ(c.LJIILLIIL(InterfaceC1685750ty9.LIZ, this.LLILLJJLI), interfaceC1680500tpg2);
            }
            interfaceC1680500tpg2.LJ();
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 48;
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJIILLIIL(c1685760tyA, f), f);
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new AwS581S0100000_2(this.LLILZ, (C05P0<InterfaceC1692950u9l>) 413);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg2.LJ();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1674000tfC.LIZ(interfaceC1685750ty9LJI, (Function1) objLJJ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg2.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg2.LJJIII();
                if (interfaceC1680500tpg2.LJJIIZ()) {
                    interfaceC1680500tpg2.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg2.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg2, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg2.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg2.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg2.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg2.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                if (recommendEffectItem.id.length() > 0) {
                    if (((Boolean) this.LLIZLLLIL.getValue()).booleanValue() && this.LLILZIL == EnumC994870bzp.SHOW && ((Set) this.LLJ.getValue()).isEmpty()) {
                        this.LLILZLL.invoke("effect_show", Integer.valueOf(iIntValue));
                    }
                    ((Set) this.LLJI.getValue()).add(Integer.valueOf(iIntValue));
                }
                if (iIntValue == 0) {
                    interfaceC1680500tpg2.LJJIIJZLJL(-2071599602);
                    C1667120tU6.LIZ(f, this.LLIZ, interfaceC1680500tpg2, 6);
                    interfaceC1680500tpg2.LJ();
                } else {
                    interfaceC1680500tpg2.LJJIIJZLJL(-2071427738);
                    C1667120tU6.LIZJ(recommendEffectItem, f, iIntValue, this.LLIZ, interfaceC1680500tpg2, 48 | ((i4 >> 6) & 14) | ((i4 << 3) & 896));
                    interfaceC1680500tpg2.LJ();
                }
                interfaceC1680500tpg2.LJIIIZ();
                interfaceC1680500tpg2.LJJIIJZLJL(-773015776);
                if (iIntValue == this.LLILLL.LIZ.size() - 1) {
                    C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, this.LLILLJJLI), interfaceC1680500tpg2);
                }
                interfaceC1680500tpg2.LJ();
                interfaceC1680500tpg2.LJ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
