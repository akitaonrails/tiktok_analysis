package X;

import com.bytedance.lynx.hybrid.webkit.GlobalProps;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WTD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WTD implements InterfaceC1059260dfg {
    @Override // X.InterfaceC1059260dfg
    public void LIZ(InterfaceC1541990qEH interfaceC1541990qEH, List<String> list) {
        JSONObject jSONObject;
        if ((interfaceC1541990qEH instanceof WebKitView) && interfaceC1541990qEH != null) {
            WebKitView webKitView = (WebKitView) interfaceC1541990qEH;
            if (!((ArrayList) list).isEmpty()) {
                Object tag = webKitView.getTag(R.id.jti);
                if (tag == null) {
                    C1490740otc.LIZ.LIZ("GlobalProps not set, just ignore", EnumC1490770otf.D, "webkit");
                } else if (!(tag instanceof GlobalProps)) {
                    C1490740otc c1490740otc = C1490740otc.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("removeGlobalProps:type mismatch, current type is ");
                    sbLIZ.append(tag.getClass());
                    c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "webkit");
                } else {
                    C1490740otc.LIZ.LIZ("removeGlobalProps:already set", EnumC1490770otf.D, "webkit");
                    GlobalProps globalProps = (GlobalProps) tag;
                    String str = globalProps.LIZ;
                    if (str != null) {
                        jSONObject = new JSONObject(str);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        jSONObject.remove((String) it2.next());
                    }
                    globalProps.LIZ = C786410Ut5.J3(jSONObject);
                }
            }
            C1541480qDS initParams = webKitView.getInitParams();
            if (initParams != null) {
                Iterator it3 = ((ArrayList) list).iterator();
                while (it3.hasNext()) {
                    initParams.LJIIIIZZ().remove(it3.next());
                }
            }
            webKitView.LIZ("globalPropsUpdated", null);
        }
    }

    @Override // X.InterfaceC1059260dfg
    public void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH, Map<String, Object> map) {
        if ((interfaceC1541990qEH instanceof WebKitView) && interfaceC1541990qEH != null) {
            C0WTB.LIZ((WebKitView) interfaceC1541990qEH, map);
        }
    }

    @Override // X.InterfaceC1059260dfg
    public void LIZJ(InterfaceC1541990qEH interfaceC1541990qEH, Map<String, Object> map) {
        LinkedHashMap linkedHashMap;
        JSONObject jSONObject;
        Map mapLJIIZILJ;
        JSONObject jSONObject2;
        Map mapLJIIZILJ2;
        if ((interfaceC1541990qEH instanceof WebKitView) && interfaceC1541990qEH != null) {
            WebKitView webKitView = (WebKitView) interfaceC1541990qEH;
            if (map != null && !map.isEmpty()) {
                Object tag = webKitView.getTag(R.id.jti);
                if (tag == null) {
                    C0WTB.LIZ(webKitView, map);
                    C1490740otc.LIZ.LIZ("GlobalProps not set, just call inject", EnumC1490770otf.D, "webkit");
                } else if (!(tag instanceof GlobalProps)) {
                    C1490740otc c1490740otc = C1490740otc.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateGlobalProps:type mismatch, current type is ");
                    sbLIZ.append(tag.getClass());
                    c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "webkit");
                } else {
                    C1490740otc.LIZ.LIZ("updateGlobalProps:already set", EnumC1490770otf.D, "webkit");
                    Map<String, ? extends Object> map2 = ((GlobalProps) tag).LIZIZ;
                    if (map2 != null) {
                        linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.putAll(map);
                    } else {
                        linkedHashMap = null;
                    }
                    try {
                        GlobalProps globalProps = (GlobalProps) tag;
                        if (linkedHashMap != null && (mapLJIIZILJ2 = C2097608Jq.LJIIZILJ(linkedHashMap)) != null) {
                            jSONObject2 = new JSONObject(mapLJIIZILJ2);
                        } else {
                            jSONObject2 = null;
                        }
                        globalProps.LIZ = String.valueOf(jSONObject2);
                        ((GlobalProps) tag).LIZIZ = linkedHashMap;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1490740otc c1490740otc2 = C1490740otc.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateGlobalProps:toString failed, retry, error=");
                        sbLIZ2.append(e.getMessage());
                        c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.E, "webkit");
                        try {
                            GlobalProps globalProps2 = (GlobalProps) tag;
                            if (linkedHashMap != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(linkedHashMap)) != null) {
                                jSONObject = new JSONObject(mapLJIIZILJ);
                            } else {
                                jSONObject = null;
                            }
                            globalProps2.LIZ = String.valueOf(jSONObject);
                            ((GlobalProps) tag).LIZIZ = linkedHashMap;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C1490740otc c1490740otc3 = C1490740otc.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("updateGlobalProps:toString retry failed, error=");
                            sbLIZ3.append(e2.getMessage());
                            c1490740otc3.LIZ(C2188811AlT.LIZIZ(sbLIZ3), EnumC1490770otf.E, "webkit");
                        }
                    }
                }
            }
            C1541480qDS initParams = webKitView.getInitParams();
            if (initParams != null) {
                initParams.LIZLLL(map);
            }
            webKitView.LIZ("globalPropsUpdated", null);
        }
    }
}
