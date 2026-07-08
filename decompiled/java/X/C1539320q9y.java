package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdui.serializedData.common.event.GlobalEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539320q9y {
    public static final C1539320q9y LIZ = new C1539320q9y();
    public static final C1539200q9m LIZIZ = new InterfaceC1538750q93<C1539250q9r>() { // from class: X.0q9m
        @Override // X.InterfaceC1538750q93
        public final EnumC1067640dtC getViewType() {
            return EnumC1067640dtC.SDUI;
        }

        @Override // X.InterfaceC1538750q93
        public final InterfaceC1541990qEH LIZ(HybridSchemaParam hybridSchemaParam, C1537480q70 c1537480q70, Context context, AbstractC1537870q7d abstractC1537870q7d) {
            Integer num;
            InterfaceC1538820q9A interfaceC1538820q9ALIZIZ;
            String strJ3;
            Uri uri = UriProtector.parse(hybridSchemaParam.getUrl());
            if (uri.isOpaque()) {
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uri);
                sbLIZ.append(" isn't a hierarchical URI.");
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "SDUIKitViewProvider");
                return null;
            }
            C1537790q7V c1537790q7V = new C1537790q7V(c1537480q70, abstractC1537870q7d);
            c1537790q7V.LJLJJI();
            C1539210q9n c1539210q9n = (C1539210q9n) c1537480q70.hybridParams;
            hybridSchemaParam.getUrl();
            C1317160kNe c1317160kNe = new C1317160kNe();
            Integer num2 = c1539210q9n.LJI;
            if ((num2 == null || num2.intValue() != -1) && ((num = c1539210q9n.LJFF) == null || num.intValue() != -1)) {
                int iIntValue = c1539210q9n.LJI.intValue();
                c1317160kNe.LJI = c1539210q9n.LJFF.intValue();
                c1317160kNe.LJFF = iIntValue;
            }
            C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
            InterfaceC1075390e5h interfaceC1075390e5h = (InterfaceC1075390e5h) C1075530e5v.LIZIZ().LIZIZ(InterfaceC1075390e5h.class, c1537480q70.bidFrom);
            if (interfaceC1075390e5h != null) {
                interfaceC1538820q9ALIZIZ = interfaceC1075390e5h.LIZIZ();
            } else {
                interfaceC1538820q9ALIZIZ = null;
            }
            c1539210q9n.LJII = interfaceC1538820q9ALIZIZ;
            c1317160kNe.LIZIZ = new C1543710qH3();
            ((HashMap) c1317160kNe.LIZJ.LIZ).put("hybridMonitor", new InterfaceC1314850kJv(c1537480q70) { // from class: X.0pib
                public final C1537480q70 LIZ;

                @Override // X.InterfaceC1314850kJv
                public final void onDestroy() {
                }

                {
                    this.LIZ = c1537480q70;
                }

                @Override // X.InterfaceC1314850kJv
                public final void LIZ(String str, String str2) throws JSONException {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    Uri uriLIZ;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                    Uri uriLIZ2;
                    if (Intrinsics.LJFF(str, "reportJSError")) {
                        JSONObject jSONObject = new JSONObject();
                        InterfaceC1531560pxS interfaceC1531560pxS = this.LIZ.hybridParams;
                        String str3 = "";
                        if (interfaceC1531560pxS == null || (uriLIZ2 = interfaceC1531560pxS.LIZ()) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZ2, "uri")) == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                        }
                        jSONObject.put("page_path", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        jSONObject.put("bid", this.LIZ.bid);
                        jSONObject.put("server_version", "1");
                        jSONObject.put("client_version", "0.0.1-rc.48");
                        jSONObject.put("page_version", "1");
                        jSONObject.put("schema", this.LIZ.LJIJI());
                        jSONObject.put("error_code", -1);
                        jSONObject.put("error_msg", str2);
                        jSONObject.put("enter_from", "jsError");
                        C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
                        C1520360pfO c1520360pfO = new C1520360pfO("bd_hybrid_monitor_sdui_error_event");
                        InterfaceC1531560pxS interfaceC1531560pxS2 = this.LIZ.hybridParams;
                        if (interfaceC1531560pxS2 != null && (uriLIZ = interfaceC1531560pxS2.LIZ()) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZ, "uri")) != null) {
                            str3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                        }
                        c1520360pfO.LIZ = str3;
                        C1537480q70 c1537480q702 = this.LIZ;
                        c1520360pfO.LIZIZ = c1537480q702.bid;
                        c1520360pfO.LJIIIIZZ = c1537480q702.containerId;
                        c1520360pfO.LIZLLL = jSONObject;
                        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                        c1520200pf8.getClass();
                        C1520200pf8.LIZ(c1520350pfNLIZ);
                    }
                }
            });
            for (Map.Entry entry : ((LinkedHashMap) c1539210q9n.LIZJ).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                GlobalEvent globalEvent = new GlobalEvent();
                globalEvent.LIZ = str;
                if (jSONObject != null) {
                    strJ3 = C786410Ut5.J3(jSONObject);
                } else {
                    strJ3 = "{}";
                }
                globalEvent.LIZIZ = strJ3;
                ((ArrayList) c1317160kNe.LIZLLL).add(globalEvent);
            }
            long jLIZJ = C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_COMPONENT_START}, null);
            C1537540q76.LIZ(c1537480q70, hybridSchemaParam);
            C1539250q9r c1539250q9r = new C1539250q9r(context, c1539210q9n, c1537480q70, c1317160kNe, c1537790q7V);
            c1537790q7V.LJLILLLLZI();
            c1537790q7V.LJLJI(c1539250q9r);
            C1537540q76.LIZIZ(c1539250q9r, c1539210q9n, c1537480q70, 0, jLIZJ, hybridSchemaParam);
            return c1539250q9r;
        }
    };
    public static boolean LIZJ;
}
