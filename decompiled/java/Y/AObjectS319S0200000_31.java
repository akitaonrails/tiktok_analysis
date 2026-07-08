package Y;

import X.C15G2;
import X.C20490015Fq;
import X.C20490215Fs;
import X.C2239171CkV;
import X.InterfaceC20343514iv;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AObjectS319S0200000_31 implements Function1 {
    public final int $t;
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

    public static final Object invoke$0(AObjectS319S0200000_31 aObjectS319S0200000_31, Object obj) {
        C20490015Fq c20490015Fq = (C20490015Fq) aObjectS319S0200000_31.l0;
        C20490215Fs c20490215Fs = (C20490215Fs) aObjectS319S0200000_31.l1;
        c20490015Fq.getClass();
        Class<? extends NextLiveData> cls = c20490215Fs.LIZ;
        if (cls != null && obj != null && ((HashMap) c20490015Fq.LIZJ).keySet().contains(cls) && ((HashMap) c20490015Fq.LIZJ).get(cls) != null) {
            ((C15G2) ((HashMap) c20490015Fq.LIZJ).get(cls)).LIZ(c20490015Fq.LIZIZ, obj);
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS319S0200000_31 aObjectS319S0200000_31, Object obj) {
        C2239171CkV c2239171CkV = (C2239171CkV) aObjectS319S0200000_31.l0;
        InterfaceC20343514iv interfaceC20343514iv = (InterfaceC20343514iv) aObjectS319S0200000_31.l1;
        int iFloatValue = (int) (((Float) obj).floatValue() * 100);
        c2239171CkV.LJI = iFloatValue;
        interfaceC20343514iv.onProgress((int) ((((double) iFloatValue) * 0.7d) + 30.0d));
        return Unit.LIZ;
    }

    public AObjectS319S0200000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
