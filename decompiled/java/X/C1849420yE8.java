package X;

import com.ss.android.ugc.aweme.nxet.ITracingService;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS216S0000000_27;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yE8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849420yE8 extends FeatureProducer {
    public static final C1849420yE8 LIZIZ = new C1849420yE8();
    public static String LIZJ = "f_nxet_features";
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(255));

    static {
        InterfaceC1848550yCj interfaceC1848550yCjLJIJ;
        C1847770yBT c1847770yBTLIZ;
        InterfaceC1848340yCO interfaceC1848340yCO = new InterfaceC1848340yCO() { // from class: X.0yE7
            @Override // X.InterfaceC1848340yCO
            public final void LIZ(EnumC1847910yBh enumC1847910yBh, C1847770yBT c1847770yBT, String str) {
                if (enumC1847910yBh == EnumC1847910yBh.SHOW && c1847770yBT.LJIIIIZZ()) {
                    C1849420yE8.LIZIZ.getClass();
                    C1849420yE8.LIZ().setFeature("nxet_cur_page_oid", c1847770yBT.LJI());
                    C1849420yE8.LIZ().setFeature("nxet_cur_page_spm", c1847770yBT.LJII());
                    ArrayList arrayList = new ArrayList(c1847770yBT.getMultirefers());
                    arrayList.add(c1847770yBT.LJII());
                    C1849420yE8.LIZ().setFeature("nxet_page_spm_list", arrayList);
                }
            }
        };
        C1848530yCh.LIZ.getClass();
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LIZJ(interfaceC1848340yCO);
        }
        ITracingService iTracingServiceLIZ2 = C1845210y7L.LIZ();
        if (iTracingServiceLIZ2 == null || (interfaceC1848550yCjLJIJ = iTracingServiceLIZ2.LJIJ()) == null || (c1847770yBTLIZ = interfaceC1848550yCjLJIJ.LIZ()) == null) {
            return;
        }
        LIZ().setFeature("nxet_cur_page_oid", c1847770yBTLIZ.LJI());
        LIZ().setFeature("nxet_cur_page_spm", c1847770yBTLIZ.LJII());
        ArrayList arrayList = new ArrayList(c1847770yBTLIZ.getMultirefers());
        arrayList.add(c1847770yBTLIZ.LJII());
        LIZ().setFeature("nxet_page_spm_list", arrayList);
    }

    public static C1849430yE9 LIZ() {
        return (C1849430yE9) LIZLLL.getValue();
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        if (returnCode != null) {
            returnCode.code = 200;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1147228737) {
            if (iHashCode != -1147224667) {
                if (iHashCode == -303451209 && str.equals("nxet_page_spm_list")) {
                    return LIZ().getFeature("nxet_page_spm_list");
                }
            } else if (str.equals("nxet_cur_page_spm")) {
                return LIZ().getFeature("nxet_cur_page_spm");
            }
        } else if (str.equals("nxet_cur_page_oid")) {
            return LIZ().getFeature("nxet_cur_page_oid");
        }
        if (returnCode != null) {
            returnCode.code = 1;
            return null;
        }
        return null;
    }
}
