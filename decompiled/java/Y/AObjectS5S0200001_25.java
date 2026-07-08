package Y;

import X.C0NWB;
import X.C0NWC;
import X.C0NWE;
import X.C0NWI;
import X.C0NWJ;
import X.C1396405dK;
import X.C1668650tWZ;
import X.C1673090tdj;
import X.C1682380tsi;
import X.InterfaceC1690500u5o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS5S0200001_25 implements Function1 {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AObjectS5S0200001_25 aObjectS5S0200001_25, Object obj) {
        C0NWJ c0nwj = (C0NWJ) aObjectS5S0200001_25.l0;
        InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) aObjectS5S0200001_25.l1;
        float f = aObjectS5S0200001_25.f2;
        C1673090tdj c1673090tdj = (C1673090tdj) obj;
        c0nwj.getClass();
        if (C1668650tWZ.LIZJ(0.0f, Float.NaN)) {
            c1673090tdj.LIZ(0.0f, C0NWB.LIZ);
        } else {
            c1673090tdj.LIZ(f - interfaceC1690500u5o.LJJJJLL(0.0f), C0NWB.LIZ);
        }
        if (!C1668650tWZ.LIZJ(0.0f, Float.NaN)) {
            c1673090tdj.LIZ(f - interfaceC1690500u5o.LJJJJLL(0.0f), C0NWE.LIZ);
        }
        c1673090tdj.LIZ(f, C0NWC.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS5S0200001_25 aObjectS5S0200001_25, Object obj) {
        C0NWJ c0nwj = (C0NWJ) aObjectS5S0200001_25.l0;
        InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) aObjectS5S0200001_25.l1;
        float f = aObjectS5S0200001_25.f2;
        C1673090tdj c1673090tdj = (C1673090tdj) obj;
        C0NWI c0nwi = (C0NWI) c0nwj;
        if (C1668650tWZ.LIZJ(c0nwi.LIZ, Float.NaN)) {
            c1673090tdj.LIZ(0.0f, C0NWB.LIZ);
        } else {
            c1673090tdj.LIZ(f - interfaceC1690500u5o.LJJJJLL(c0nwi.LIZ), C0NWB.LIZ);
        }
        c1673090tdj.LIZ(f, C0NWC.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS5S0200001_25 aObjectS5S0200001_25, Object obj) {
        C1682380tsi c1682380tsi = (C1682380tsi) aObjectS5S0200001_25.l0;
        C0NWJ c0nwj = (C0NWJ) aObjectS5S0200001_25.l1;
        float f = aObjectS5S0200001_25.f2;
        C1673090tdj c1673090tdj = (C1673090tdj) obj;
        float fLJII = C1682380tsi.LJII(c1682380tsi.LIZ) * ((C1396405dK) c0nwj).LIZ;
        c1673090tdj.LIZ(f - C1682380tsi.LJII(c1682380tsi.LIZ), C0NWB.LIZ);
        c1673090tdj.LIZ(f - fLJII, C0NWE.LIZ);
        c1673090tdj.LIZ(f, C0NWC.LIZ);
        return Unit.LIZ;
    }

    public AObjectS5S0200001_25(Object obj, Object obj2, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.f2 = f;
    }
}
