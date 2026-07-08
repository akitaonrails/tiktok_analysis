package Y;

import X.C0NWB;
import X.C0NWC;
import X.C0NWJ;
import X.C0NWK;
import X.C1668650tWZ;
import X.C1673090tdj;
import X.C1682380tsi;
import X.InterfaceC1690500u5o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS1S0300001_25 implements Function1 {
    public final int $t;
    public float f3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AObjectS1S0300001_25 aObjectS1S0300001_25, Object obj) {
        float fLJJJJLL;
        C0NWJ c0nwj = (C0NWJ) aObjectS1S0300001_25.l0;
        C1682380tsi c1682380tsi = (C1682380tsi) aObjectS1S0300001_25.l1;
        InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) aObjectS1S0300001_25.l2;
        float f = aObjectS1S0300001_25.f3;
        C1673090tdj c1673090tdj = (C1673090tdj) obj;
        C0NWK c0nwk = (C0NWK) c0nwj;
        if (C1668650tWZ.LIZJ(c0nwk.LIZIZ, Float.NaN)) {
            fLJJJJLL = C1682380tsi.LJII(c1682380tsi.LIZ) * 0.73f;
        } else {
            fLJJJJLL = interfaceC1690500u5o.LJJJJLL(c0nwk.LIZIZ);
        }
        if (f <= fLJJJJLL) {
            fLJJJJLL = f;
        }
        c1673090tdj.LIZ(f - fLJJJJLL, C0NWB.LIZ);
        c1673090tdj.LIZ(f, C0NWC.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS1S0300001_25 aObjectS1S0300001_25, Object obj) {
        C1682380tsi c1682380tsi = (C1682380tsi) aObjectS1S0300001_25.l0;
        C0NWJ c0nwj = (C0NWJ) aObjectS1S0300001_25.l1;
        float f = aObjectS1S0300001_25.f3;
        InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) aObjectS1S0300001_25.l2;
        C1673090tdj c1673090tdj = (C1673090tdj) obj;
        float fLJII = C1682380tsi.LJII(c1682380tsi.LIZ) * 0.95f;
        c0nwj.getClass();
        if (C1668650tWZ.LIZJ(0.0f, Float.NaN)) {
            if (f <= fLJII) {
                fLJII = f;
            }
            c1673090tdj.LIZ(f - fLJII, C0NWB.LIZ);
        } else {
            c1673090tdj.LIZ(f - interfaceC1690500u5o.LJJJJLL(0.0f), C0NWB.LIZ);
        }
        c1673090tdj.LIZ(f, C0NWC.LIZ);
        return Unit.LIZ;
    }

    public AObjectS1S0300001_25(float f, C1682380tsi c1682380tsi, InterfaceC1690500u5o interfaceC1690500u5o, C0NWJ c0nwj, int i) {
        this.$t = i;
        if (i != 0) {
            this.l0 = c1682380tsi;
            this.l1 = c0nwj;
            this.f3 = f;
            this.l2 = interfaceC1690500u5o;
            return;
        }
        this.l0 = c0nwj;
        this.l1 = c1682380tsi;
        this.l2 = interfaceC1690500u5o;
        this.f3 = f;
    }
}
