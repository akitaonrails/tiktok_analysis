package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import defpackage.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Q0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0Q0Y implements InterfaceC663520Q0w {
    public CompletionBlock<x.c> LIZ;
    public InterfaceC634840OvC LIZIZ;

    public final void LJ() {
        InterfaceC634840OvC interfaceC634840OvC = this.LIZIZ;
        String containerID = interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null;
        CompletionBlock<x.c> completionBlock = this.LIZ;
        if (completionBlock != null) {
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(x.c.class, containerID), "");
        }
    }

    @Override // X.InterfaceC663520Q0w
    public final void LIZ(InterfaceC634840OvC interfaceC634840OvC) {
        this.LIZIZ = interfaceC634840OvC;
    }

    @Override // X.InterfaceC663520Q0w
    public void LIZIZ(x.b bVar) {
        Map linkedHashMap;
        String string;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(bVar.getLogParams());
        String strValueOf = String.valueOf(linkedHashMap3.get("enter_from"));
        Object objRemove = linkedHashMap3.remove("pass_through_log_params");
        linkedHashMap3.remove("aweme_pass_through_log_params");
        for (Object obj : linkedHashMap3.keySet()) {
            Object obj2 = linkedHashMap3.get(obj);
            if (obj2 != null) {
                linkedHashMap2.put(obj, obj2.toString());
            }
        }
        if (C1ER1.LIZIZ.LJJJLL(strValueOf)) {
            linkedHashMap2.put("is_search_scene", "1");
        }
        C651970Phj.LLILLL.getClass();
        C651980Phk.LJFF(linkedHashMap2, false);
        if (C123100dR.LIZ(null) ? ((List) C1237404sm.LIZIZ.getValue()).contains(null) : !((List) C1237404sm.LIZIZ.getValue()).isEmpty()) {
            if (objRemove == null || !(objRemove instanceof Map)) {
                objRemove = null;
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            if (!(objRemove instanceof Map) || (linkedHashMap = (Map) objRemove) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                Map map = (Map) entry.getValue();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry2 : map.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value = entry2.getValue();
                    if (value == null || (string = value.toString()) == null) {
                        string = "";
                    }
                    arrayList.add(new Pair(key2, string));
                }
                linkedHashMap4.put(key, new LinkedHashMap(C2097608Jq.LJIILLIIL(arrayList)));
            }
            C651970Phj.LLILLL.getClass();
            C651980Phk.LJ(linkedHashMap4);
        }
    }

    @Override // X.InterfaceC663520Q0w
    public final void LIZJ(CompletionBlock<x.c> completionBlock) {
        this.LIZ = completionBlock;
    }

    public final Bundle LIZLLL(x.b bVar) {
        Object obj;
        Object obj2;
        Bundle bundle = new Bundle();
        Map<String, Object> bundleParams = bVar.getBundleParams();
        View view = null;
        if (bundleParams != null) {
            obj = bundleParams.get("awemeId");
        } else {
            obj = null;
        }
        Map<String, Object> extra = bVar.getExtra();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://aweme/detaillist/");
        sbLIZ.append(obj);
        C0XI4 c0xi4 = new C0XI4(C2188811AlT.LIZIZ(sbLIZ));
        if (extra != null && (obj2 = extra.get("btm")) != null) {
            Object obj3 = extra.get("bcm");
            if (obj3 == null) {
                obj3 = "";
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = obj2.toString();
            InterfaceC634840OvC interfaceC634840OvC = this.LIZIZ;
            if (interfaceC634840OvC != null) {
                view = interfaceC634840OvC.getView();
            }
            c21244318Bt.LIZIZ = PageFinder.via(view);
            C212367188v c212367188v = BcmParams.Companion;
            String string = obj3.toString();
            c212367188v.getClass();
            c21244318Bt.LIZJ = C212367188v.LIZ(string);
            String strCreateJumpSourceBtmTokenForJSB = btmSDK.createJumpSourceBtmTokenForJSB(c21244318Bt);
            if (strCreateJumpSourceBtmTokenForJSB != null && strCreateJumpSourceBtmTokenForJSB.length() != 0) {
                c0xi4.LJ("source_btm_token", strCreateJumpSourceBtmTokenForJSB);
                C786410Ut5.LJJJI("source_btm_token", strCreateJumpSourceBtmTokenForJSB, bundle);
            }
        }
        return bundle;
    }
}
