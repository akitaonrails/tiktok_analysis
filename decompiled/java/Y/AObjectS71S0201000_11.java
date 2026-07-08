package Y;

import X.AbstractC714940S2q;
import X.C1954807lC;
import X.C714930S2p;
import X.C714960S2s;
import X.C786410Ut5;
import X.EnumC714970S2t;
import X.InterfaceC714910S2n;
import android.view.View;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AObjectS71S0201000_11 implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS71S0201000_11 aObjectS71S0201000_11) {
        EnumC714970S2t enumC714970S2t;
        int i = aObjectS71S0201000_11.i2;
        C714930S2p c714930S2p = (C714930S2p) aObjectS71S0201000_11.l0;
        AbstractC714940S2q abstractC714940S2q = (AbstractC714940S2q) aObjectS71S0201000_11.l1;
        if (i != 4 && i != 8) {
            c714930S2p.LJI(abstractC714940S2q).remove(abstractC714940S2q);
            if (!r0.isEmpty()) {
                enumC714970S2t = EnumC714970S2t.NONE;
            } else {
                enumC714970S2t = EnumC714970S2t.NONE;
            }
            int i2 = C714960S2s.LIZ[enumC714970S2t.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        c714930S2p.LJIIIZ(abstractC714940S2q, 8);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    Iterator<AbstractC714940S2q> it2 = c714930S2p.LJI(abstractC714940S2q).iterator();
                    while (it2.hasNext()) {
                        c714930S2p.LJIIIZ(it2.next(), 8);
                    }
                    c714930S2p.LJI(abstractC714940S2q).clear();
                    c714930S2p.LJIIJJI(abstractC714940S2q);
                }
            } else {
                c714930S2p.LJIIJJI(abstractC714940S2q);
            }
        } else {
            c714930S2p.LJI(abstractC714940S2q).remove(abstractC714940S2q);
            c714930S2p.LJIIIZ(abstractC714940S2q, i);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS71S0201000_11 aObjectS71S0201000_11) {
        View view;
        InterfaceC714910S2n interfaceC714910S2n;
        InterfaceC714910S2n interfaceC714910S2n2;
        C714930S2p c714930S2p = (C714930S2p) aObjectS71S0201000_11.l0;
        AbstractC714940S2q abstractC714940S2q = (AbstractC714940S2q) aObjectS71S0201000_11.l1;
        int i = aObjectS71S0201000_11.i2;
        c714930S2p.getClass();
        if (abstractC714940S2q.LJFF) {
            if (i != 8 && (interfaceC714910S2n = abstractC714940S2q.LIZLLL) != null && !interfaceC714910S2n.LIZJ() && (interfaceC714910S2n2 = abstractC714940S2q.LIZLLL) != null) {
                interfaceC714910S2n2.LJ(abstractC714940S2q.LIZJ, abstractC714940S2q.LJII, c714930S2p.LIZ);
            }
            if (!abstractC714940S2q.LIZ() && abstractC714940S2q.LJII.getVisibility() != i && (view = abstractC714940S2q.LJII) != null) {
                C786410Ut5.LJLLLLLL(i, view);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS71S0201000_11 aObjectS71S0201000_11) {
        InterfaceC714910S2n interfaceC714910S2n;
        AbstractC714940S2q abstractC714940S2q = (AbstractC714940S2q) aObjectS71S0201000_11.l0;
        C714930S2p c714930S2p = (C714930S2p) aObjectS71S0201000_11.l1;
        int i = aObjectS71S0201000_11.i2;
        if (!abstractC714940S2q.LJFF) {
            c714930S2p.getClass();
            C714930S2p.LIZ(abstractC714940S2q);
            abstractC714940S2q.LJFF = true;
        }
        c714930S2p.getClass();
        if (abstractC714940S2q.LJ && (interfaceC714910S2n = abstractC714940S2q.LIZLLL) != null) {
            interfaceC714910S2n.LJ(abstractC714940S2q.LIZJ, abstractC714940S2q.LJII, c714930S2p.LIZ);
        }
        if (!abstractC714940S2q.LIZ()) {
            C786410Ut5.LJLLLLLL(i, abstractC714940S2q.LJII);
        }
        return Unit.LIZ;
    }

    public AObjectS71S0201000_11(int i, C714930S2p c714930S2p, AbstractC714940S2q abstractC714940S2q, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
                this.i2 = i;
                this.l0 = c714930S2p;
                this.l1 = abstractC714940S2q;
                break;
            case 1:
                this.l0 = c714930S2p;
                this.l1 = abstractC714940S2q;
                this.i2 = i;
                break;
            default:
                this.l0 = abstractC714940S2q;
                this.l1 = c714930S2p;
                this.i2 = i;
                break;
        }
    }
}
