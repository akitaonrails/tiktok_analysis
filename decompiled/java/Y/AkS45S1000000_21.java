package Y;

import X.AbstractC19483511Kn;
import X.InterfaceC1254030ijp;
import X.InterfaceC1487280oo2;

/* JADX INFO: loaded from: classes22.dex */
public class AkS45S1000000_21 implements InterfaceC1487280oo2 {
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

    public AkS45S1000000_21(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(AkS45S1000000_21 akS45S1000000_21, Object obj) {
        final String str = (String) obj;
        final String str2 = akS45S1000000_21.s0;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lwR
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(new C1371430lnB(str, str2, 4));
            }
        });
    }

    public static final Object apply$1(AkS45S1000000_21 akS45S1000000_21, Object obj) {
        final String str = (String) obj;
        final String str2 = akS45S1000000_21.s0;
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lwS
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(new C1371430lnB(str, str2, 4));
            }
        });
    }
}
