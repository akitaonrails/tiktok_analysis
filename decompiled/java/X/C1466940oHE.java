package X;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0oHE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466940oHE extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466940oHE(C347660Dk4 c347660Dk4, C1450140nq8 c1450140nq8, int i) {
        super(4);
        this.$t = i;
        this.l0 = c347660Dk4;
        this.l1 = c1450140nq8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466940oHE(InterfaceC1419480n2g interfaceC1419480n2g, C23186096q c23186096q, int i) {
        super(4);
        this.$t = i;
        this.l0 = interfaceC1419480n2g;
        this.l1 = c23186096q;
    }

    public static final Object invoke$0(C1466940oHE c1466940oHE, Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        long jLongValue3 = ((Number) obj3).longValue();
        long jLongValue4 = ((Number) obj4).longValue();
        C347660Dk4 c347660Dk4 = (C347660Dk4) c1466940oHE.l0;
        c347660Dk4.LJFF = jLongValue;
        c347660Dk4.LJI = jLongValue2;
        c347660Dk4.LIZLLL = jLongValue3;
        c347660Dk4.LJ = jLongValue4;
        C1450140nq8 c1450140nq8 = (C1450140nq8) c1466940oHE.l1;
        c1450140nq8.LIZ = (int) jLongValue;
        c1450140nq8.LIZIZ = (int) jLongValue4;
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1466940oHE c1466940oHE, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        String str = (String) obj3;
        String str2 = (String) obj4;
        String str3 = C1419410n2Z.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" errorMsg=");
        sbLIZ.append(str);
        C201955140j.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C306440Bzm.LIZ() && iIntValue == 5000 && (iIntValue2 == -199 || iIntValue2 == -106)) {
            linkedHashMap.put("weak_net", "weak_net");
        }
        linkedHashMap.put("sub_error_code", String.valueOf(iIntValue2));
        InterfaceC1419480n2g interfaceC1419480n2g = (InterfaceC1419480n2g) c1466940oHE.l0;
        if (interfaceC1419480n2g != null) {
            String strLIZ = ((C23186096q) c1466940oHE.l1).LIZ();
            ((C23186096q) c1466940oHE.l1).getClass();
            String str4 = ((C23186096q) c1466940oHE.l1).LJIILJJIL.get("autocut_template_type");
            String str5 = ((C23186096q) c1466940oHE.l1).LJIILJJIL.get("source");
            String str6 = ((C23186096q) c1466940oHE.l1).LJIILJJIL.get("enable_preloading");
            if (str6 != null) {
                z = Boolean.parseBoolean(str6);
            } else {
                z = false;
            }
            interfaceC1419480n2g.LIZLLL(false, iIntValue, iIntValue2, str, strLIZ, "GetRenderConfigAutoCut", str2, null, null, null, str4, str5, z);
        }
        return new C096G(5, "", str, linkedHashMap);
    }
}
