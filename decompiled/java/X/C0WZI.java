package X;

import com.bytedance.pumbaa.pipeline.EventPipeline;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS414S0200000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WZI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WZI implements C0WZU {
    @Override // X.C0WZU
    public final C0WSU LIZ(C0WZJ c0wzj) {
        int iIntValue;
        PrivacyEvent privacyEventLIZ;
        Integer num;
        int iIntValue2;
        Integer num2;
        if (C0WSD.LIZ(c0wzj.LJIIIIZZ, "create_event")) {
            return null;
        }
        C0WSC c0wsc = c0wzj.LJIIIIZZ;
        String str = "ApiCalling";
        if (c0wsc == null) {
            Object objLIZIZ = c0wzj.LJFF.LIZIZ("trigger_id");
            if ((objLIZIZ instanceof Integer) && (num2 = (Integer) objLIZIZ) != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = c0wzj.LIZ;
            }
            C0WRC c0wrc = PrivacyEvent.Companion;
            String strValueOf = String.valueOf(iIntValue2);
            String str2 = c0wzj.LJII;
            if (str2 != null) {
                str = str2;
            }
            c0wrc.getClass();
            privacyEventLIZ = C0WRC.LIZ(strValueOf, str);
            privacyEventLIZ.setPerformanceNode(c0wzj.LJIIIIZZ);
        } else {
            C0WS7 c0ws7LJFF = c0wsc.LJFF("create_event");
            Object objLIZIZ2 = c0wzj.LJFF.LIZIZ("trigger_id");
            if ((objLIZIZ2 instanceof Integer) && (num = (Integer) objLIZIZ2) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c0wzj.LIZ;
            }
            C0WRC c0wrc2 = PrivacyEvent.Companion;
            String strValueOf2 = String.valueOf(iIntValue);
            String str3 = c0wzj.LJII;
            if (str3 != null) {
                str = str3;
            }
            c0wrc2.getClass();
            privacyEventLIZ = C0WRC.LIZ(strValueOf2, str);
            privacyEventLIZ.setPerformanceNode(c0wzj.LJIIIIZZ);
            C0WSF c0wsfLJII = c0wsc.LJII();
            C0WSF c0wsf = C0WSF.EXCEEDED;
            if (c0wsfLJII == c0wsf) {
                c0ws7LJFF.LJFF = c0wsf;
            }
            c0ws7LJFF.stop();
        }
        if (C0WSD.LIZ(c0wzj.LJIIIIZZ, "add_call_site_info")) {
            return null;
        }
        C0WSC c0wsc2 = c0wzj.LJIIIIZZ;
        if (c0wsc2 == null) {
            Map<String, C0WR6> map = c0wzj.LJI;
            if (map != null) {
                for (Map.Entry<String, C0WR6> entry : map.entrySet()) {
                    privacyEventLIZ.addCallSiteInfo(entry.getKey(), entry.getValue());
                }
            }
        } else {
            C0WS7 c0ws7LJFF2 = c0wsc2.LJFF("add_call_site_info");
            Map<String, C0WR6> map2 = c0wzj.LJI;
            if (map2 != null) {
                for (Map.Entry<String, C0WR6> entry2 : map2.entrySet()) {
                    privacyEventLIZ.addCallSiteInfo(entry2.getKey(), entry2.getValue());
                }
            }
            C0WSF c0wsfLJII2 = c0wsc2.LJII();
            C0WSF c0wsf2 = C0WSF.EXCEEDED;
            if (c0wsfLJII2 == c0wsf2) {
                c0ws7LJFF2.LJFF = c0wsf2;
            }
            c0ws7LJFF2.stop();
        }
        for (C0WRN c0wrn : EventPipeline.handleEvent(privacyEventLIZ, null)) {
            if (Intrinsics.LJFF(c0wrn.LIZ.LIZIZ, C825410WZn.LIZIZ)) {
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("PB_API_CALLING", new AwS414S0200000_13(c0wzj, c0wrn, 16), 6, null);
                return new C0WSU(true, C826570Wbf.LIZ(c0wzj.LIZLLL));
            }
        }
        return null;
    }
}
