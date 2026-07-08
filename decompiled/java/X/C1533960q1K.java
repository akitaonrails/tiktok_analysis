package X;

import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0q1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533960q1K extends AbstractC1534470q29 {
    public final String LLILLL = "preloadWebContent";

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1533020pzo c1533020pzoLJIILJJIL;
        List<C1533140q00> list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        InterfaceC1541990qEH interfaceC1541990qEH;
        InterfaceC1534550q2H webContent = ((InterfaceC1534770q2d) xBaseParamModel).getWebContent();
        C1537480q70 hybridContext = null;
        if (webContent == null) {
            C2382909Vj.LIZ(completionBlock, -3, "webContent is required", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (interfaceC1541990qEH = (InterfaceC1541990qEH) interfaceC634840OvC.LIZIZ(InterfaceC1541990qEH.class)) != null) {
            hybridContext = interfaceC1541990qEH.getHybridContext();
        }
        webContent.getCustomUA();
        webContent.getWebKey();
        ArrayList arrayList = new ArrayList();
        List<String> css = webContent.getCss();
        int i = 0;
        if (css != null) {
            Iterator<String> it2 = css.iterator();
            while (it2.hasNext()) {
                C1533140q00 c1533140q00 = new C1533140q00(it2.next());
                if (hybridContext != null && (str5 = hybridContext.containerId) != null) {
                    c1533140q00.LIZLLL = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", str5));
                }
                arrayList.add(c1533140q00);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List<String> js = webContent.getJs();
        if (js != null) {
            Iterator<String> it3 = js.iterator();
            while (it3.hasNext()) {
                C1533140q00 c1533140q002 = new C1533140q00(it3.next());
                if (hybridContext != null && (str4 = hybridContext.containerId) != null) {
                    c1533140q002.LIZLLL = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", str4));
                }
                arrayList2.add(c1533140q002);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        List<String> img = webContent.getImg();
        if (img != null) {
            Iterator<String> it4 = img.iterator();
            while (it4.hasNext()) {
                C1533140q00 c1533140q003 = new C1533140q00(it4.next());
                if (hybridContext != null && (str3 = hybridContext.containerId) != null) {
                    c1533140q003.LIZLLL = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", str3));
                }
                arrayList3.add(c1533140q003);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        List<String> universal = webContent.getUniversal();
        if (universal != null) {
            Iterator<String> it5 = universal.iterator();
            while (it5.hasNext()) {
                C1533140q00 c1533140q004 = new C1533140q00(it5.next());
                if (hybridContext != null && (str2 = hybridContext.containerId) != null) {
                    c1533140q004.LIZLLL = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", str2));
                }
                arrayList4.add(c1533140q004);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!arrayList.isEmpty()) {
            linkedHashMap.put("css", arrayList);
        }
        if (!arrayList2.isEmpty()) {
            linkedHashMap.put("script", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            linkedHashMap.put("image", arrayList3);
        }
        if (!arrayList4.isEmpty()) {
            linkedHashMap.put("other", arrayList4);
        }
        String html = webContent.getHtml();
        C1534660q2S c1534660q2S = new C1534660q2S(html, EnumC1534650q2R.WEB, linkedHashMap);
        if (hybridContext != null && (str = hybridContext.containerId) != null) {
            c1534660q2S.LIZLLL = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", str));
        }
        if (hybridContext != null && (c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(hybridContext, false, null, 3)) != null) {
            int i2 = C1533020pzo.LJIIL;
            if (html == null) {
                C1532920pze.LIZJ.LIZJ(AFwS212S0000000_23.get$arr$(270));
            } else {
                C1533140q00 c1533140q005 = new C1533140q00(html);
                c1533140q005.LIZLLL = c1534660q2S.LIZLLL;
                c1533020pzoLJIILJJIL.LJI(c1533140q005, EnumC1533980q1M.WEB_MAIN_DOCUMENT, null, null, "jsb-preload-web-content");
            }
            String[] strArr = {"css", "script", "image", "other"};
            do {
                String str6 = strArr[i];
                Map<String, List<C1533140q00>> map = c1534660q2S.LIZJ;
                if (map != null && (list = map.get(str6)) != null) {
                    Iterator<C1533140q00> it6 = list.iterator();
                    while (it6.hasNext()) {
                        c1533020pzoLJIILJJIL.LJI(it6.next(), EnumC1533980q1M.WEB_CHILD_RESOURCE, null, null, "jsb-preload-web-content");
                    }
                }
                i++;
            } while (i < 4);
            C1490740otc.LIZIZ(C1490740otc.LIZ, "invoke forest preload web content", null, this.LLILLL, 2);
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1534720q2Y.class, null), "");
            return;
        }
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(hybridContext, false);
        if (iResourceServiceXLIZIZ == null) {
            C2382909Vj.LIZ(completionBlock, 0, "Fail to get resource service.", null, 4);
            return;
        }
        iResourceServiceXLIZIZ.preloadContainer(c1534660q2S, (String) null, (String) null, "jsb-preload");
        C1490740otc.LIZIZ(C1490740otc.LIZ, "invoke forest preload web content", null, this.LLILLL, 2);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1534720q2Y.class, null), "");
    }
}
