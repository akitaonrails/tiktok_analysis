package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0ti3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675770ti3 extends C09AY implements InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function1 LLILLL;
    public final /* synthetic */ Function1 LLILZ;
    public final /* synthetic */ Function1 LLILZIL;
    public final /* synthetic */ Function1 LLILZLL;
    public final /* synthetic */ Function1 LLIZ;
    public final /* synthetic */ Function1 LLIZLLLIL;
    public final /* synthetic */ C05P0 LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675770ti3(List list, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, C05P0 c05p0) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLILZIL = function13;
        this.LLILZLL = function14;
        this.LLIZ = function15;
        this.LLIZLLLIL = function16;
        this.LLJ = c05p0;
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
            ThoughtAggregatedModel thoughtAggregatedModel = (ThoughtAggregatedModel) ListProtector.get(this.LL, iIntValue);
            interfaceC1680500tpg2.LJJIIJZLJL(817635067);
            boolean z2 = this.LLILLJJLI;
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = Boolean.valueOf(((Boolean) this.LLJ.getValue()).booleanValue());
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            boolean zBooleanValue = ((Boolean) objLJJ).booleanValue();
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = interfaceC1680500tpg2.LJJIIJ(this.LLILLL) | interfaceC1680500tpg2.LJII(thoughtAggregatedModel);
            Object objLJJ2 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS426S0200000_25(this.LLILLL, (Function1<? super ThoughtAggregatedModel, Unit>) thoughtAggregatedModel, (ThoughtAggregatedModel) 71);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
            }
            Function0 function0 = (Function0) objLJJ2;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ2 = interfaceC1680500tpg2.LJJIIJ(this.LLILZ) | interfaceC1680500tpg2.LJII(thoughtAggregatedModel);
            Object objLJJ3 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS426S0200000_25(this.LLILZ, (Function1<? super ThoughtAggregatedModel, Unit>) thoughtAggregatedModel, (ThoughtAggregatedModel) 72);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ3);
            }
            Function0 function02 = (Function0) objLJJ3;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ3 = interfaceC1680500tpg2.LJJIIJ(this.LLILZIL) | interfaceC1680500tpg2.LJII(thoughtAggregatedModel);
            Object objLJJ4 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ3 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS426S0200000_25(this.LLILZIL, (Function1<? super ThoughtAggregatedModel, Unit>) thoughtAggregatedModel, (ThoughtAggregatedModel) 73);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ4);
            }
            Function0 function03 = (Function0) objLJJ4;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(-1746271574);
            boolean zLJJIIJ4 = interfaceC1680500tpg2.LJJIIJ(this.LLILZLL) | interfaceC1680500tpg2.LJII(thoughtAggregatedModel) | interfaceC1680500tpg2.LJJIIJ(this.LLIZ);
            Object objLJJ5 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ4 || objLJJ5 == c1680520tpi) {
                objLJJ5 = new AwS234S0300000_25(this.LLILZLL, (Function1<? super ThoughtAggregatedModel, Unit>) thoughtAggregatedModel, (ThoughtAggregatedModel) this.LLIZ, (Function1<? super C1378605aS, Unit>) 17);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ5);
            }
            Function1 function1 = (Function1) objLJJ5;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ5 = interfaceC1680500tpg2.LJJIIJ(this.LLIZLLLIL) | interfaceC1680500tpg2.LJII(thoughtAggregatedModel);
            Object objLJJ6 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ5 || objLJJ6 == c1680520tpi) {
                objLJJ6 = new AwS426S0200000_25(this.LLIZLLLIL, (Function1<? super ThoughtAggregatedModel, Unit>) thoughtAggregatedModel, (ThoughtAggregatedModel) 74);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ6);
            }
            interfaceC1680500tpg2.LJ();
            C1675710thx.LIZ(thoughtAggregatedModel, iIntValue, z2, zBooleanValue, function0, function02, function03, function1, (Function0) objLJJ6, interfaceC1680500tpg2, ((i4 >> 6) & 14) | 3072 | (i4 & 112));
            interfaceC1680500tpg2.LJ();
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
