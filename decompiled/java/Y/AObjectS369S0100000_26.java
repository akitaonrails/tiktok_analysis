package Y;

import X.AbstractC1732180vB2;
import X.AbstractC1732350vBJ;
import X.AbstractC19969013Bg;
import X.C1397660mTU;
import X.C1729230v6H;
import X.C1729240v6I;
import X.C2188811AlT;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AObjectS369S0100000_26 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public AObjectS369S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS369S0100000_26 aObjectS369S0100000_26, Object obj) {
        ((C1397660mTU) obj).LIZJ = true;
        Map<String, String> map = C1729240v6I.LIZ;
        C1729240v6I.LJ(((AbstractC1732180vB2) aObjectS369S0100000_26.l0).LJJIL(), C1729240v6I.LJFF(((AbstractC1732180vB2) aObjectS369S0100000_26.l0).LLILZ), AbstractC1732180vB2.LJJIJLIJ(), "not_now");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS369S0100000_26 aObjectS369S0100000_26, Object obj) {
        String strValueOf;
        AbstractC19969013Bg abstractC19969013Bg = (AbstractC19969013Bg) aObjectS369S0100000_26.l0;
        Map.Entry entry = (Map.Entry) obj;
        abstractC19969013Bg.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Object key = entry.getKey();
        String strValueOf2 = "(this Map)";
        if (key == abstractC19969013Bg) {
            strValueOf = "(this Map)";
        } else {
            strValueOf = String.valueOf(key);
        }
        sbLIZ.append(strValueOf);
        sbLIZ.append('=');
        Object value = entry.getValue();
        if (value != abstractC19969013Bg) {
            strValueOf2 = String.valueOf(value);
        }
        sbLIZ.append(strValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AObjectS369S0100000_26 aObjectS369S0100000_26, Object obj) {
        String str;
        ((C1397660mTU) obj).LIZJ = true;
        Map<String, String> map = C1729230v6H.LIZ;
        String strLJJIJIIJI = ((AbstractC1732350vBJ) aObjectS369S0100000_26.l0).LJJIJIIJI();
        if (((AbstractC1732350vBJ) aObjectS369S0100000_26.l0).LLILZ == 0) {
            str = "before_live";
        } else {
            str = "during_live";
        }
        C1729230v6H.LIZJ(strLJJIJIIJI, str, AbstractC1732350vBJ.LJJIJ(), "not_now");
        return Unit.LIZ;
    }
}
