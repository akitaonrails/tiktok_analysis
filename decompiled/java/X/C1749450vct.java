package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749450vct {
    public static final C1749450vct LIZ = new C1749450vct();

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDP3F6laqF/t9iirYGWlArIuYsgi6A==", null));
    }

    public static void LIZLLL(Map map, Map map2) throws JSONException {
        LJ("click", map, map2);
        if (C13LP.LJJJJ(map.get("click_position"), C1697810uHb.LJIIJJI("call", "send_email"))) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", map.get("panel_type"));
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, map.get("leads_id"));
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "contact_popup_interact"));
        }
    }

    public static void LJ(String str, Map map, Map map2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_dm_leads_contact_panel");
        c474500IjALIZ.LJJII(map.get("anchor_id"), "anchor_id");
        c474500IjALIZ.LJJII(map.get("show_entrance"), "show_entrance");
        c474500IjALIZ.LJJII(map.get("panel_type"), "panel_type");
        c474500IjALIZ.LJJII(str, "action_type");
        if (Intrinsics.LJFF(str, "click")) {
            c474500IjALIZ.LJJII(map.get("click_position"), "click_position");
        }
        for (Map.Entry entry : map2.entrySet()) {
            c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(Context context, Map map, EnumC1749470vcv enumC1749470vcv, Map map2) throws JSONException {
        ClipboardManager clipboardManager;
        Object objH2 = C786410Ut5.H2(context, "clipboard");
        if ((objH2 instanceof ClipboardManager) && (clipboardManager = (ClipboardManager) objH2) != null) {
            try {
                Cert certFindCert = CertProviderManagerKt.findCert("bpea-anchor_contacts", 1476399139);
                String str = (String) map.get("toast");
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = (String) map.get("text");
                if (str3 != null) {
                    str2 = str3;
                }
                C20145713s7.LIZJ(clipboardManager, ClipData.newPlainText(C497740JfY.LJIJI(R.string.drg), str2), certFindCert);
                if (Build.VERSION.SDK_INT < 33) {
                    C766270U4b.LJIIJJI(str);
                }
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (enumC1749470vcv == EnumC1749470vcv.CONTACT_SHEET) {
                map.put("click_position", "copy");
                LIZLLL(map, map2);
            }
        }
    }

    public static void LJFF(Context context, Map map, EnumC1749470vcv enumC1749470vcv, Map map2) {
        String str = (String) map.get("phone_number");
        if (str == null) {
            str = "";
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tel:");
        sbLIZ.append(str);
        intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        try {
            LIZ(context, intent);
            if (enumC1749470vcv == EnumC1749470vcv.CONTACT_SHEET) {
                map.put("click_position", "call");
                LIZLLL(map, map2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
