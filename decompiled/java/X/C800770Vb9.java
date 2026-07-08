package X;

import android.net.Uri;
import com.bytedance.helios.network.pipeline.recognize.NetworkDomainRecognize;
import com.bytedance.pumbaa.pipeline.EventPipeline;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800770Vb9 {
    public C800770Vb9() {
        EventPipeline.INSTANCE.registerDecisionAction(C0WRJ.LIZIZ);
    }

    public static void LIZ(C800800VbC c800800VbC) {
        int i = C800780VbA.LIZ[c800800VbC.LIZ.ordinal()];
        String str = "";
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Map<String, Object> map = c800800VbC.LIZIZ;
                    Object obj = map.get("injectName");
                    String host = ((Uri) map.get("uri")).getHost();
                    if (host != null) {
                        str = host;
                    }
                    String strDomainIdentityRecognize = NetworkDomainRecognize.domainIdentityRecognize(str);
                    Object obj2 = map.get("risk_key");
                    Object obj3 = map.get("risk_datatype");
                    int iIntValue = ((Integer) map.get("dataflowId")).intValue();
                    PrivacyEvent.Companion.getClass();
                    PrivacyEvent privacyEventLIZ = C0WRC.LIZ("11024", "OnDeviceRiskDetection");
                    EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
                    privacyEventLIZ.addCallSiteInfo("inject_name", new C0WQ8(enumC823400WRu, obj));
                    privacyEventLIZ.addCallSiteInfo("domain_type", new C0WQ8(enumC823400WRu, strDomainIdentityRecognize));
                    privacyEventLIZ.addCallSiteInfo("risk_key", new C0WQ8(enumC823400WRu, obj2));
                    privacyEventLIZ.addCallSiteInfo("risk_datatype", new C0WQ8(enumC823400WRu, obj3));
                    privacyEventLIZ.addCallSiteInfo("dataflowId", new C0WQ8(enumC823400WRu, String.valueOf(iIntValue)));
                    privacyEventLIZ.addCallSiteInfo("event_type", new C0WQ8(enumC823400WRu, "IABJSInjectionParams"));
                    EventPipeline.handleEvent(privacyEventLIZ, null);
                    return;
                }
                return;
            }
            Map<String, Object> map2 = c800800VbC.LIZIZ;
            Uri uri = (Uri) map2.get("uri");
            String host2 = uri.getHost();
            if (host2 != null) {
                str = host2;
            }
            Object obj4 = map2.get("dfid");
            String strDomainIdentityRecognize2 = NetworkDomainRecognize.domainIdentityRecognize(str);
            PrivacyEvent.Companion.getClass();
            PrivacyEvent privacyEventLIZ2 = C0WRC.LIZ("11024", "OnDeviceRiskDetection");
            EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.String;
            privacyEventLIZ2.addCallSiteInfo("dfid", new C0WQ8(enumC823400WRu2, obj4));
            privacyEventLIZ2.addCallSiteInfo("url", new C0WQ8(enumC823400WRu2, uri.toString()));
            privacyEventLIZ2.addCallSiteInfo("domain", new C0WQ8(enumC823400WRu2, str));
            privacyEventLIZ2.addCallSiteInfo("domain_type", new C0WQ8(enumC823400WRu2, strDomainIdentityRecognize2));
            privacyEventLIZ2.addCallSiteInfo("path", new C0WQ8(enumC823400WRu2, uri.getPath()));
            privacyEventLIZ2.addCallSiteInfo("event_type", new C0WQ8(enumC823400WRu2, "WebRouting"));
            EventPipeline.handleEvent(privacyEventLIZ2, null);
            return;
        }
        Map<String, Object> map3 = c800800VbC.LIZIZ;
        Object obj5 = map3.get("injectName");
        boolean zBooleanValue = ((Boolean) map3.get("blocked")).booleanValue();
        Uri uri2 = (Uri) map3.get("uri");
        Object obj6 = map3.get("containerName");
        Object obj7 = map3.get("containerType");
        String host3 = uri2.getHost();
        if (host3 != null) {
            str = host3;
        }
        String strDomainIdentityRecognize3 = NetworkDomainRecognize.domainIdentityRecognize(str);
        PrivacyEvent.Companion.getClass();
        PrivacyEvent privacyEventLIZ3 = C0WRC.LIZ("11024", "OnDeviceRiskDetection");
        EnumC823400WRu enumC823400WRu3 = EnumC823400WRu.String;
        privacyEventLIZ3.addCallSiteInfo("webrouter_container_name", new C0WQ8(enumC823400WRu3, obj6));
        privacyEventLIZ3.addCallSiteInfo("webrouter_container_type", new C0WQ8(enumC823400WRu3, obj7));
        privacyEventLIZ3.addCallSiteInfo("inject_name", new C0WQ8(enumC823400WRu3, obj5));
        privacyEventLIZ3.addCallSiteInfo("inject_blocked", new C0WQ8(EnumC823400WRu.Bool, Boolean.valueOf(zBooleanValue)));
        privacyEventLIZ3.addCallSiteInfo("url", new C0WQ8(enumC823400WRu3, uri2.toString()));
        privacyEventLIZ3.addCallSiteInfo("domain", new C0WQ8(enumC823400WRu3, str));
        privacyEventLIZ3.addCallSiteInfo("domain_type", new C0WQ8(enumC823400WRu3, strDomainIdentityRecognize3));
        privacyEventLIZ3.addCallSiteInfo("path", new C0WQ8(enumC823400WRu3, uri2.getPath()));
        privacyEventLIZ3.addCallSiteInfo("event_type", new C0WQ8(enumC823400WRu3, "IABJSInjection"));
        EventPipeline.handleEvent(privacyEventLIZ3, null);
    }
}
