package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.xsearch.config.SearchEcomDecouplingChannelSettings;
import defpackage.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Q0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663490Q0t extends x {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(633));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(632));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str;
        boolean zLIZ;
        View view;
        Map<String, Object> logParams;
        LinkedHashMap linkedHashMap;
        Set<String> setKeySet;
        Object obj;
        View view2;
        Map<String, Object> logParams2;
        LinkedHashMap linkedHashMap2;
        Set<String> setKeySet2;
        Object obj2;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        C1543110qG5 c1543110qG5;
        x.b bVar = (x.b) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null && (c1543110qG5 = c1543190qGD.LJIIIIZZ) != null) {
            str = c1543110qG5.LIZIZ;
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name: ");
        sbLIZ.append(getName());
        sbLIZ.append(" channel: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str == null) {
            zLIZ = false;
        } else {
            zLIZ = SearchEcomDecouplingChannelSettings.LIZ(str);
        }
        String str2 = "search open schema fail";
        if (zLIZ) {
            this.LLILZ.getValue().getClass();
            try {
                if (((IECommerceArchService) ServiceManager.get().getService(IECommerceArchService.class)).LIZ()) {
                    String schema = bVar.getSchema();
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        view2 = interfaceC634840OvC2.getView();
                    } else {
                        view2 = null;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (String str3 : bVar.getLogParams().keySet()) {
                        Object obj3 = bVar.getLogParams().get(str3);
                        if (obj3 != null) {
                            linkedHashMap3.put(str3, obj3.toString());
                        }
                    }
                    Map<String, Object> pageData = bVar.getPageData();
                    if (pageData != null && (setKeySet2 = pageData.keySet()) != null) {
                        for (String str4 : setKeySet2) {
                            Map<String, Object> pageData2 = bVar.getPageData();
                            if (pageData2 != null && (obj2 = pageData2.get(str4)) != null) {
                                linkedHashMap3.put(str4, obj2.toString());
                            }
                        }
                    }
                    if (C0BYT.LIZ()) {
                        try {
                            logParams2 = bVar.getLogParams();
                            linkedHashMap2 = new LinkedHashMap();
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            Object obj4 = logParams2.get("search_id");
                            Object obj5 = logParams2.get("search_result_id");
                            Object obj6 = logParams2.get("search_entrance");
                            if (obj4 != null) {
                                linkedHashMap2.put("search_id", obj4.toString());
                            }
                            if (obj5 != null) {
                                linkedHashMap2.put("search_result_id", obj5.toString());
                            }
                            if (obj6 != null) {
                                linkedHashMap2.put("search_entrance", obj6.toString());
                            }
                            linkedHashMap3 = linkedHashMap2;
                        } catch (Exception e2) {
                            e = e2;
                            linkedHashMap3 = linkedHashMap2;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    C663500Q0u.LIZIZ(schema, view2, linkedHashMap3);
                }
                int i = C0Q11.LIZ[enumC1063300dmC.ordinal()];
                if (i != 1 && i != 2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Unsupported engine type: ");
                    sbLIZ2.append(enumC1063300dmC);
                    C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
                    return;
                }
                C663500Q0u.LIZ(this, bVar, completionBlock);
                return;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                String message = e3.getMessage();
                if (message != null) {
                    str2 = message;
                }
                C2382909Vj.LIZ(completionBlock, 0, str2, null, 4);
                return;
            }
        }
        this.LLILLL.getValue().getClass();
        try {
            if (((IECommerceArchService) ServiceManager.get().getService(IECommerceArchService.class)).LIZ()) {
                String schema2 = bVar.getSchema();
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    view = interfaceC634840OvC3.getView();
                } else {
                    view = null;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (String str5 : bVar.getLogParams().keySet()) {
                    Object obj7 = bVar.getLogParams().get(str5);
                    if (obj7 != null) {
                        linkedHashMap4.put(str5, obj7.toString());
                    }
                }
                Map<String, Object> pageData3 = bVar.getPageData();
                if (pageData3 != null && (setKeySet = pageData3.keySet()) != null) {
                    for (String str6 : setKeySet) {
                        Map<String, Object> pageData4 = bVar.getPageData();
                        if (pageData4 != null && (obj = pageData4.get(str6)) != null) {
                            linkedHashMap4.put(str6, obj.toString());
                        }
                    }
                }
                if (C0BYT.LIZ()) {
                    try {
                        logParams = bVar.getLogParams();
                        linkedHashMap = new LinkedHashMap();
                    } catch (Exception e4) {
                        e = e4;
                    }
                    try {
                        Object obj8 = logParams.get("search_id");
                        Object obj9 = logParams.get("search_result_id");
                        Object obj10 = logParams.get("search_entrance");
                        if (obj8 != null) {
                            linkedHashMap.put("search_id", obj8.toString());
                        }
                        if (obj9 != null) {
                            linkedHashMap.put("search_result_id", obj9.toString());
                        }
                        if (obj10 != null) {
                            linkedHashMap.put("search_entrance", obj10.toString());
                        }
                        linkedHashMap4 = linkedHashMap;
                    } catch (Exception e5) {
                        e = e5;
                        linkedHashMap4 = linkedHashMap;
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                C663510Q0v.LIZIZ(schema2, view, linkedHashMap4);
            }
            int i2 = C0Q12.LIZ[enumC1063300dmC.ordinal()];
            if (i2 != 1 && i2 != 2) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Unsupported engine type: ");
                sbLIZ3.append(enumC1063300dmC);
                C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ3), null, 4);
                return;
            }
            C663510Q0v.LIZ(this, bVar, completionBlock);
        } catch (Exception e6) {
            TryCatchGuardChecker.doCheck(e6);
            String message2 = e6.getMessage();
            if (message2 != null) {
                str2 = message2;
            }
            C2382909Vj.LIZ(completionBlock, 0, str2, null, 4);
        }
    }
}
