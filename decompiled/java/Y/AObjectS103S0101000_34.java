package Y;

import X.C21346018gE;
import X.C2219681BuA;
import X.C2219731BuF;
import X.C2220011Buh;
import X.C2220021Bui;
import X.C2220181Buy;
import X.C2220191Buz;
import X.C2220391BvJ;
import X.C2221081BwQ;
import X.C2221091BwR;
import X.EnumC1304340k2y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS103S0101000_34 implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS103S0101000_34 aObjectS103S0101000_34) {
        return ((C2221091BwR) aObjectS103S0101000_34.l0).LJIJ(aObjectS103S0101000_34.i1);
    }

    public static final Object invoke$1(AObjectS103S0101000_34 aObjectS103S0101000_34) {
        return ((C2221081BwQ) aObjectS103S0101000_34.l0).LJI(aObjectS103S0101000_34.i1);
    }

    public static final Object invoke$2(AObjectS103S0101000_34 aObjectS103S0101000_34) {
        boolean z;
        C2219681BuA c2219681BuA = (C2219681BuA) aObjectS103S0101000_34.l0;
        int i = aObjectS103S0101000_34.i1;
        C2219731BuF c2219731BuF = c2219681BuA.LIZLLL;
        boolean z2 = c2219731BuF.LIZJ;
        if (i < 4) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            c2219731BuF.LIZJ = z;
            c2219681BuA.LJLIL(EnumC1304340k2y.OnNetworkWeakChange, c2219731BuF);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS103S0101000_34 aObjectS103S0101000_34) {
        return ((C2221091BwR) aObjectS103S0101000_34.l0).LJI(aObjectS103S0101000_34.i1);
    }

    public static final Object invoke$4(AObjectS103S0101000_34 aObjectS103S0101000_34) {
        return ((C2221081BwQ) aObjectS103S0101000_34.l0).LJIJ(aObjectS103S0101000_34.i1);
    }

    public static final Object invoke$5(AObjectS103S0101000_34 aObjectS103S0101000_34) {
        ((C2220391BvJ) aObjectS103S0101000_34.l0).LIZIZ.LJJLIIJ(Integer.valueOf(aObjectS103S0101000_34.i1), C2220181Buy.LIZLLL);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS103S0101000_34 aObjectS103S0101000_34) {
        C2220011Buh c2220011Buh = (C2220011Buh) aObjectS103S0101000_34.l0;
        int i = aObjectS103S0101000_34.i1;
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        c2220011Buh.LIZIZ.LJJLIIJ(Integer.valueOf(i), C2220191Buz.LIZIZ(new JSONObject().put("errMsg", "setDeviceOrientation:ok")));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS103S0101000_34 aObjectS103S0101000_34) throws JSONException {
        C2220021Bui c2220021Bui = (C2220021Bui) aObjectS103S0101000_34.l0;
        int i = aObjectS103S0101000_34.i1;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errMsg", "setScreenBrightness:ok");
        C21346018gE c21346018gE = c2220021Bui.LIZIZ;
        Integer numValueOf = Integer.valueOf(i);
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        c21346018gE.LJJLIIJ(numValueOf, C2220191Buz.LIZIZ(jSONObject));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS103S0101000_34 aObjectS103S0101000_34) throws JSONException {
        C2220021Bui c2220021Bui = (C2220021Bui) aObjectS103S0101000_34.l0;
        int i = aObjectS103S0101000_34.i1;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errMsg", "setKeepScreenOn:ok");
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        c2220021Bui.LIZIZ.LJJLIIJ(Integer.valueOf(i), C2220191Buz.LIZIZ(jSONObject));
        return Unit.LIZ;
    }

    public AObjectS103S0101000_34(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
