package Y;

import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.C1682380tsi;
import X.C817403Hg;
import X.InterfaceC1672350tcX;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS2S0501000_25 implements Function1 {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS2S0501000_25 aObjectS2S0501000_25, Object obj) {
        List list = (List) aObjectS2S0501000_25.l0;
        List list2 = (List) aObjectS2S0501000_25.l1;
        C1682380tsi c1682380tsi = (C1682380tsi) aObjectS2S0501000_25.l2;
        int i = aObjectS2S0501000_25.i5;
        InterfaceC1672350tcX interfaceC1672350tcX = (InterfaceC1672350tcX) aObjectS2S0501000_25.l3;
        C817403Hg c817403Hg = (C817403Hg) aObjectS2S0501000_25.l4;
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1683310tuD.LJFF(abstractC1683310tuD, (AbstractC1686530tzP) ListProtector.get(list, i2), 0, 0);
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC1683310tuD.LJFF(abstractC1683310tuD, (AbstractC1686530tzP) ListProtector.get(list2, i3), C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ) - i, interfaceC1672350tcX.LJLLJ(c817403Hg.element));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS2S0501000_25 aObjectS2S0501000_25, Object obj) {
        List list = (List) aObjectS2S0501000_25.l0;
        List list2 = (List) aObjectS2S0501000_25.l1;
        C1682380tsi c1682380tsi = (C1682380tsi) aObjectS2S0501000_25.l2;
        int i = aObjectS2S0501000_25.i5;
        InterfaceC1672350tcX interfaceC1672350tcX = (InterfaceC1672350tcX) aObjectS2S0501000_25.l3;
        C817403Hg c817403Hg = (C817403Hg) aObjectS2S0501000_25.l4;
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1683310tuD.LJFF(abstractC1683310tuD, (AbstractC1686530tzP) ListProtector.get(list, i2), 0, 0);
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC1683310tuD.LJFF(abstractC1683310tuD, (AbstractC1686530tzP) ListProtector.get(list2, i3), C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ) - i, interfaceC1672350tcX.LJLLJ(c817403Hg.element));
        }
        return Unit.LIZ;
    }

    public AObjectS2S0501000_25(List list, List list2, C1682380tsi c1682380tsi, int i, InterfaceC1672350tcX interfaceC1672350tcX, C817403Hg c817403Hg, int i2) {
        this.$t = i2;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c1682380tsi;
        this.i5 = i;
        this.l3 = interfaceC1672350tcX;
        this.l4 = c817403Hg;
    }
}
