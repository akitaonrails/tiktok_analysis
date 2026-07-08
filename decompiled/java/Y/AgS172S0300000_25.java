package Y;

import X.C05P1;
import X.C1133630fbd;
import X.C13LP;
import X.C1645200suk;
import X.C1676910tjt;
import X.C1684920two;
import X.C1684970twt;
import X.C1690050u55;
import X.C2296808zG;
import X.EnumC1676720tja;
import X.InterfaceC1364105Vn;
import X.InterfaceC1685080tx4;
import X.InterfaceC345960DhK;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AgS172S0300000_25 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS172S0300000_25 agS172S0300000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int iLJI;
        if (((Boolean) obj).booleanValue()) {
            C1133630fbd c1133630fbd = ((C1684970twt) agS172S0300000_25.l0).LJ.LIZ;
            c1133630fbd.getClass();
            c1133630fbd.LJIIJJI = System.currentTimeMillis();
        } else {
            C1684970twt c1684970twt = (C1684970twt) agS172S0300000_25.l0;
            C1133630fbd c1133630fbd2 = c1684970twt.LJ.LIZ;
            String str = c1684970twt.LIZ;
            int iLJI2 = ((C1690050u55) agS172S0300000_25.l1).LJI();
            InterfaceC1685080tx4 interfaceC1685080tx4 = (InterfaceC1685080tx4) C13LP.LJJLIIIJL(((C1690050u55) agS172S0300000_25.l1).LJIIIZ().LJII());
            if (interfaceC1685080tx4 != null) {
                iLJI = interfaceC1685080tx4.getIndex();
            } else {
                iLJI = ((C1690050u55) agS172S0300000_25.l1).LJI();
            }
            C05P1 c05p1 = (C05P1) agS172S0300000_25.l2;
            int i = C1684920two.LJ;
            c1133630fbd2.LIZLLL(iLJI2, iLJI, str, (List) c05p1.getValue());
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS172S0300000_25 agS172S0300000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Boolean) obj).booleanValue();
        if (C2296808zG.LJI((InterfaceC497601wk) agS172S0300000_25.l0)) {
            ((C1645200suk) agS172S0300000_25.l1).B3((Effect) agS172S0300000_25.l2);
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS172S0300000_25 agS172S0300000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue;
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        InterfaceC345960DhK interfaceC345960DhK = (InterfaceC345960DhK) agS172S0300000_25.l0;
        if (zBooleanValue2) {
            zBooleanValue = ((Boolean) ((Function2) ((C05P1) agS172S0300000_25.l2).getValue()).invoke(((C1676910tjt) agS172S0300000_25.l1).LIZJ(), ((C1676910tjt) agS172S0300000_25.l1).LJI())).booleanValue();
        } else {
            zBooleanValue = false;
        }
        interfaceC345960DhK.setValue(Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS172S0300000_25(Object obj, InterfaceC345960DhK<Boolean> interfaceC345960DhK, C1676910tjt<EnumC1676720tja> c1676910tjt, C05P1<? extends Function2<? super EnumC1676720tja, ? super EnumC1676720tja, Boolean>> c05p1) {
        this.$t = c05p1;
        this.l0 = obj;
        this.l1 = interfaceC345960DhK;
        this.l2 = c1676910tjt;
    }
}
