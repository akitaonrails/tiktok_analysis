package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477180oXk implements InterfaceC1477240oXq {
    public static final C1477180oXk LIZIZ = new C1477180oXk();

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ C1477210oXn LIZ(C1477250oXr c1477250oXr) {
        return C1477960oZ0.LIZ(c1477250oXr);
    }

    @Override // X.InterfaceC1477240oXq
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
        return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
    }

    @Override // X.InterfaceC1477240oXq
    public final String getName() {
        return "PersonalVideoQualityOptUrlHook";
    }

    @Override // X.InterfaceC1477240oXq
    public final boolean isValid() {
        return C1474810oTv.LLILZIL();
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
        SimVideoUrlModel simVideoUrlModel;
        SimBitRate simBitRate;
        List<String> listUrlList;
        List<SimBitRate> bitRate;
        List<SimBitRate> bitRate2;
        List<String> urlList;
        C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
        if (c1477270oXt != null && (simVideoUrlModel = c1477270oXt.LIZ) != null) {
            boolean z = c1477270oXt.LIZLLL;
            if (!Intrinsics.LJFF(simVideoUrlModel.getSubTag(), "personal_homepage")) {
                return c1477250oXr.LIZLLL(c1477270oXt);
            }
            if (simVideoUrlModel.getBitRate() != null && !(!r0.isEmpty()) && (urlList = simVideoUrlModel.getUrlList()) != null && !urlList.isEmpty()) {
                return C1477150oXh.LIZ(this, simVideoUrlModel.getUrlList(), simVideoUrlModel, null, Boolean.valueOf(z));
            }
            boolean z2 = !((List) C1474810oTv.Z3.getValue()).isEmpty();
            C1477180oXk c1477180oXk = LIZIZ;
            if (z2 && (bitRate2 = simVideoUrlModel.getBitRate()) != null) {
                for (SimBitRate simBitRate2 : bitRate2) {
                    List<String> listUrlList2 = simBitRate2.urlList();
                    if (listUrlList2 != null && !listUrlList2.isEmpty() && ((List) C1474810oTv.Z3.getValue()).contains(Integer.valueOf(simBitRate2.getQualityType()))) {
                        return C1477150oXh.LIZ(c1477180oXk, simBitRate2.urlList(), simVideoUrlModel, simBitRate2, Boolean.valueOf(z));
                    }
                }
            }
            if (((Number) C1474810oTv.a4.getValue()).longValue() > 0 && (bitRate = simVideoUrlModel.getBitRate()) != null) {
                for (SimBitRate simBitRate3 : bitRate) {
                    List<String> listUrlList3 = simBitRate3.urlList();
                    if (listUrlList3 != null && !listUrlList3.isEmpty() && simBitRate3.getQualityType() == 10000 && ((Number) C1474810oTv.a4.getValue()).longValue() < simBitRate3.getBitRate()) {
                        return C1477150oXh.LIZ(c1477180oXk, simBitRate3.urlList(), simVideoUrlModel, simBitRate3, Boolean.valueOf(z));
                    }
                }
            }
            List<SimBitRate> bitRate3 = simVideoUrlModel.getBitRate();
            if (bitRate3 != null && bitRate3.size() > 0 && (listUrlList = (simBitRate = (SimBitRate) ListProtector.get(simVideoUrlModel.getBitRate(), 0)).urlList()) != null && !listUrlList.isEmpty()) {
                return C1477150oXh.LIZ(this, simBitRate.urlList(), simVideoUrlModel, simBitRate, Boolean.valueOf(z));
            }
            return c1477250oXr.LIZLLL(c1477270oXt);
        }
        return c1477250oXr.LIZLLL(c1477270oXt);
    }
}
