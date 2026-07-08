package Y;

import X.C2097608Jq;
import X.C2220221Bv2;
import X.C2220231Bv3;
import X.C2220251Bv5;
import X.C2220331BvD;
import X.EnumC2221121BwU;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS81S0201000_34 implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AObjectS81S0201000_34 aObjectS81S0201000_34, Object obj) {
        C2220331BvD c2220331BvD = (C2220331BvD) aObjectS81S0201000_34.l0;
        int i = aObjectS81S0201000_34.i2;
        Function1 function1 = (Function1) aObjectS81S0201000_34.l1;
        C2220221Bv2 c2220221Bv2LIZ = (C2220221Bv2) obj;
        if (c2220221Bv2LIZ == null) {
            c2220221Bv2LIZ = C2220251Bv5.LIZ(EnumC2221121BwU.SYSTEM_ERROR, "");
        }
        C2220231Bv3 c2220231Bv3 = c2220221Bv2LIZ.LIZIZ;
        if (!c2220231Bv3.LIZ) {
            c2220331BvD.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(i), c2220221Bv2LIZ.LIZ());
            return Unit.LIZ;
        }
        Map<String, Object> map = c2220231Bv3.LIZLLL;
        Object obj2 = null;
        if (map != null) {
            obj2 = map.get("data");
        }
        if (!(obj2 instanceof byte[]) || obj2 == null) {
            obj2 = new byte[0];
        }
        function1.invoke(obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS81S0201000_34 aObjectS81S0201000_34, Object obj) {
        C2220331BvD c2220331BvD = (C2220331BvD) aObjectS81S0201000_34.l0;
        int i = aObjectS81S0201000_34.i2;
        byte[] bArr = (byte[]) aObjectS81S0201000_34.l1;
        C2220221Bv2 c2220221Bv2 = (C2220221Bv2) obj;
        if (!c2220221Bv2.LIZIZ.LIZ) {
            c2220331BvD.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(i), c2220221Bv2.LIZ());
            return Unit.LIZ;
        }
        c2220331BvD.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(i), C2220251Bv5.LIZJ(null, C2097608Jq.LJIIIIZZ(new Pair("bytesWritten", Integer.valueOf(bArr.length)), new Pair("written", Integer.valueOf(bArr.length)))).LIZ());
        return Unit.LIZ;
    }

    public AObjectS81S0201000_34(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
