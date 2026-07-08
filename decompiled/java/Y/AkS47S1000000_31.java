package Y;

import X.AbstractC19484711Kz;
import X.AbstractC2197911B0j;
import X.C0WIY;
import X.C2197881B0g;
import X.C2197981B0q;
import X.C500260Jjc;
import X.InterfaceC1487280oo2;

/* JADX INFO: loaded from: classes32.dex */
public class AkS47S1000000_31 implements InterfaceC1487280oo2 {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS47S1000000_31(String str, int i) {
        this.$t = i;
        if (i != 0) {
            this.s0 = str;
        } else {
            this.s0 = str;
        }
    }

    public static final Object apply$0(AkS47S1000000_31 akS47S1000000_31, Object obj) {
        return new C0WIY(akS47S1000000_31.s0, obj);
    }

    public static final Object apply$1(AkS47S1000000_31 akS47S1000000_31, Object obj) {
        Throwable c2197981B0q = (Throwable) obj;
        C2197881B0g.LIZJ(C500260Jjc.LJIIIZ(c2197981B0q), c2197981B0q.getMessage(), akS47S1000000_31.s0);
        if (!(c2197981B0q instanceof AbstractC2197911B0j)) {
            c2197981B0q = new C2197981B0q(c2197981B0q.getMessage(), c2197981B0q);
        }
        return AbstractC19484711Kz.LJIILLIIL(c2197981B0q);
    }
}
