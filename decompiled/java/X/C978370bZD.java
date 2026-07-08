package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978370bZD implements InterfaceC774000UXu {
    public final String LIZ;
    public final C474500IjA LIZIZ;
    public final Map<String, String> LIZJ = new LinkedHashMap();
    public final Map<EnumC499801x6, List<String>> LIZLLL;

    @Override // X.InterfaceC488740JEq
    public final void LIZ() {
        Object next;
        EnumC499801x6 enumC499801x6;
        String strLJJLIIIJ;
        List listLJLJJLL;
        List listLJLJJLL2;
        Iterator it2 = ((LinkedHashMap) this.LIZLLL).entrySet().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!((List) ((Map.Entry) next).getValue()).contains(this.LIZ));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (enumC499801x6 = (EnumC499801x6) entry.getKey()) != null) {
            Map<String, String> map = this.LIZJ;
            C978380bZE c978380bZE = C978380bZE.LIZ;
            try {
                EnumC499801x6 enumC499801x62 = EnumC499801x6.ALL;
                C13E8 c13e8 = enumC499801x6 != enumC499801x62 ? (C13E8) ((LinkedHashMap) C978380bZE.LIZIZ).get(enumC499801x62) : new C13E8();
                ArrayList arrayList = new ArrayList();
                if (c13e8 != null && (listLJLJJLL2 = C13LP.LJLJJLL(c13e8)) != null) {
                    arrayList.addAll(listLJLJJLL2);
                }
                C13E8 c13e82 = (C13E8) ((LinkedHashMap) C978380bZE.LIZIZ).get(enumC499801x6);
                if (c13e82 != null && (listLJLJJLL = C13LP.LJLJJLL(c13e82)) != null) {
                    arrayList.addAll(listLJLJJLL);
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJJJJLI(arrayList), "->", null, null, 0, null, new C978400bZG(), 30);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                strLJJLIIIJ = "";
            }
            map.put("track_from", strLJJLIIIJ);
            C20411014to c20411014to = C20411014to.LIZ;
            String strLIZ = c20411014to.LIZ(EnumC20429914wr.PAGE, enumC499801x6);
            if (!this.LIZJ.containsKey("panel_page") && strLIZ.length() > 0) {
                this.LIZJ.put("panel_page", strLIZ);
            }
            String strLIZ2 = c20411014to.LIZ(EnumC20429914wr.ENTRANCE, enumC499801x6);
            if (!this.LIZJ.containsKey("panel_entrance") && strLIZ2.length() > 0) {
                this.LIZJ.put("panel_entrance", strLIZ2);
            }
        }
        this.LIZIZ.LJJIIZI(this.LIZJ);
        this.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC488740JEq
    public final C474500IjA LIZJ() {
        C474500IjA c474500IjA = this.LIZIZ;
        c474500IjA.LJIL();
        return c474500IjA;
    }

    public C978370bZD(String str) {
        this.LIZ = str;
        this.LIZIZ = new C474500IjA(str, true, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZLLL = linkedHashMap;
        linkedHashMap.put(EnumC499801x6.PLAYBOOK, C1697810uHb.LJIILJJIL("livesdk_multi_anchor_funkit_icon", "livesdk_anchor_playbook_entrance_show", "livesdk_multi_anchor_golive_fun_kit_entrance", "livesdk_multi_anchor_playbook_module_show", "livesdk_multi_anchor_playbook_favorites_module", "livesdk_multi_anchor_playbook_list", "livesdk_multi_anchor_playbook_detail", "livesdk_multiguest_playbook_feature_set", "livesdk_multiguest_playbook_banner", "livesdk_multi_anchor_playbook_feature_entrance", "livesdk_multiguest_request_panel_fun_kit_entrance", "livesdk_multi_anchor_playbook_apply", "livesdk_multi_anchor_playbook_apply_over", "livesdk_multi_anchor_playbook_list_module_show", "livesdk_multi_anchor_playbook_ugc_page_all", "livesdk_multi_anchor_playbook_ugc_icon_all", "livesdk_multi_anchor_playbook_ugc_edit_success", "livesdk_multi_anchor_playbook_ugc_create_success", "livesdk_multi_function_call_result", "livesdk_multi_anchor_playbook_generate", "livesdk_multi_anchor_playbook_auto_icon", "livesdk_multi_anchor_playbook_feature_auto_apply", "livesdk_multi_anchor_playbook_design_feature_icon", "livesdk_multi_anchor_playbook_design_feature_apply"));
        linkedHashMap.put(EnumC499801x6.GUEST_SHOWDOWN, C1697810uHb.LJIIJJI("livesdk_multi_anchor_guest_showdown_entrance", "livesdk_multi_anchor_guest_showdown_page", "livesdk_multi_anchor_guest_showdown_apply", "livesdk_multi_anchor_guest_showdown_end", "livesdk_multi_guest_guest_showdown_apply", "livesdk_multi_guest_guest_showdown_end"));
    }

    @Override // X.InterfaceC488740JEq
    public final InterfaceC488740JEq LIZIZ(Map map) {
        if (map != null) {
            this.LIZJ.putAll(map);
        }
        return this;
    }

    @Override // X.InterfaceC774000UXu
    public final C978370bZD LIZLLL(DataChannel dataChannel) {
        Object objGg0;
        C474500IjA c474500IjA = this.LIZIZ;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(C1087000eOQ.class);
        } else {
            objGg0 = null;
        }
        InterfaceC474510IjB interfaceC474510IjB = c474500IjA.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILJJIL(objGg0);
        }
        return this;
    }

    @Override // X.InterfaceC774000UXu, X.InterfaceC488740JEq
    public final C978370bZD LIZIZ(Map map) {
        this.LIZJ.putAll(map);
        return this;
    }

    public final C978370bZD LJ(Object obj, String str) {
        this.LIZIZ.LJJII(obj, str);
        return this;
    }
}
