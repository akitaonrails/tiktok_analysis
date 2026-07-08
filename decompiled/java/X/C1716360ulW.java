package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageMsg;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinSetRouteArg;
import com.ss.android.ugc.aweme.component.verify.pin.set.PinSetFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ulW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716360ulW {
    public static final C1716360ulW LIZ = new C1716360ulW();

    public static void LIZLLL(C1716360ulW c1716360ulW, C19EG c19eg, String str, String str2, String str3, boolean z, Map map, HashMap map2, String str4, final InterfaceC1685420txc interfaceC1685420txc, int i) {
        EnumC989003to enumC989003to;
        String str5;
        String strOptString;
        Object c098200Yq;
        EnumC1714450uiR enumC1714450uiR;
        String str6;
        String str7 = str4;
        HashMap map3 = map2;
        Object obj = null;
        if ((i & 8) != 0) {
            enumC989003to = EnumC989003to.FULL_PAGE;
        } else {
            enumC989003to = null;
        }
        if ((i & 128) != 0) {
            str5 = "default";
        } else {
            str5 = null;
        }
        if ((i & 256) != 0) {
            map3 = new HashMap();
        }
        if ((i & 512) != 0) {
            str7 = null;
        }
        c1716360ulW.getClass();
        String str8 = "";
        try {
            strOptString = new JSONObject(str2).optString("verify_type");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1716310ulR.LJIIIIZZ(C1716310ulR.LIZ, EnumC1716320ulS.PARAM, "parse verify type fail");
            strOptString = "";
        }
        if (strOptString.length() == 0) {
            interfaceC1685420txc.invoke("REJECT", "", "", null, "");
            C1716310ulR.LJIIIIZZ(C1716310ulR.LIZ, EnumC1716320ulS.PARAM, "verify type is empty");
        }
        n nVar = new n();
        nVar.LJJIIJ(Scene.SCENE_SERVICE, str);
        nVar.LJJIIJ("previous_page_id", str3);
        C1716550ulp.LIZ.getClass();
        C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str);
        if (c1717080umgLJFF != null && (str6 = c1717080umgLJFF.LIZJ) != null) {
            str8 = str6;
        }
        nVar.LJJIIJ("source_id", str8);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            nVar.LJJIIJ((String) entry.getKey(), (String) entry.getValue());
        }
        try {
            c098200Yq = new C00IN(map);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            obj = c098200Yq;
        }
        C1713590uh3 c1713590uh3 = new C1713590uh3(new C1713840uhS(nVar, (C00IO) obj), str7, str2);
        C1716550ulp.LIZ.getClass();
        C1713540ugy c1713540ugy = new C1713540ugy(C1716550ulp.LJ(str), 6);
        if (enumC989003to == EnumC989003to.FULL_PAGE) {
            enumC1714450uiR = EnumC1714450uiR.FULL_PAGE;
        } else {
            enumC1714450uiR = EnumC1714450uiR.HALF_PAGE;
        }
        ((IPipoVerifyCenterService) ServiceManager.get().getService(IPipoVerifyCenterService.class)).LIZ(c19eg, new C1713520ugw(c1713590uh3, new C1714040uhm(enumC1714450uiR, null, null, str5, null, z, map3, 22), c1713540ugy), new InterfaceC1713650uh9() { // from class: X.0uhE
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC1713650uh9
            public final void LIZ(C1713690uhD c1713690uhD) {
                String str9 = c1713690uhD.LIZIZ;
                C19EG activity = null;
                switch (str9.hashCode()) {
                    case -1881380961:
                        if (!str9.equals("REJECT")) {
                            return;
                        }
                        break;
                    case 2448401:
                        if (!str9.equals("PASS")) {
                            return;
                        }
                        InterfaceC1685420txc<String, String, String, C19EG, String, Unit> interfaceC1685420txc2 = interfaceC1685420txc;
                        String str10 = c1713690uhD.LIZJ;
                        String str11 = c1713690uhD.LJ;
                        Fragment fragment = c1713690uhD.LIZ;
                        if (fragment != null) {
                            activity = fragment.getActivity();
                        }
                        interfaceC1685420txc2.invoke("PASS", str10, str11, activity, c1713690uhD.LJFF);
                        return;
                    case 35394935:
                        if (!str9.equals("PENDING")) {
                            return;
                        }
                        break;
                    case 1141576252:
                        if (!str9.equals("SESSION_EXPIRED")) {
                            return;
                        }
                        break;
                    case 1980572282:
                        if (!str9.equals("CANCEL")) {
                            return;
                        }
                        InterfaceC1685420txc<String, String, String, C19EG, String, Unit> interfaceC1685420txc3 = interfaceC1685420txc;
                        String str12 = c1713690uhD.LIZJ;
                        String str13 = c1713690uhD.LJ;
                        Fragment fragment2 = c1713690uhD.LIZ;
                        if (fragment2 != null) {
                            activity = fragment2.getActivity();
                        }
                        interfaceC1685420txc3.invoke("CANCEL", str12, str13, activity, c1713690uhD.LJFF);
                        return;
                    default:
                        return;
                }
                InterfaceC1685420txc<String, String, String, C19EG, String, Unit> interfaceC1685420txc4 = interfaceC1685420txc;
                String str14 = c1713690uhD.LIZJ;
                String str15 = c1713690uhD.LJ;
                Fragment fragment3 = c1713690uhD.LIZ;
                if (fragment3 != null) {
                    activity = fragment3.getActivity();
                }
                interfaceC1685420txc4.invoke("REJECT", str14, str15, activity, c1713690uhD.LJFF);
            }
        });
    }

    public static void LIZ(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HintPageMsg hintPageMsg, String str10) {
        String strLJ;
        if (hintPageMsg != null) {
            try {
                strLJ = JsonParseUtils.LJ(hintPageMsg);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                strLJ = null;
            }
        } else {
            strLJ = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//verify_center/offline_pin");
        smartRouteBuildRoute.withParam("KEY_OFFLINE_PIN_URL", str4);
        smartRouteBuildRoute.withParam("KEY_OFFLINE_PIN_MODE", str3);
        smartRouteBuildRoute.withParam("host", str6);
        smartRouteBuildRoute.withParam("session_id", str7);
        smartRouteBuildRoute.withParam("merchant_id", str8);
        smartRouteBuildRoute.withParam("merchant_user_id", str9);
        smartRouteBuildRoute.withParam("pipo_product_code", str2);
        smartRouteBuildRoute.withParam("previous_page_id", str);
        smartRouteBuildRoute.withParam("KEY_EVENT_PARAM", str5);
        smartRouteBuildRoute.withParam("hint_page_msg", strLJ);
        smartRouteBuildRoute.withParam("theme", str10);
        smartRouteBuildRoute.open();
    }

    public static void LIZIZ(Context context, EnumC1717460unI enumC1717460unI, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, String str14, HashMap map, String str15, String str16, String str17, String str18, String str19, String str20, String str21, boolean z2, String str22, String str23, final InterfaceC1631620sYq interfaceC1631620sYq) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//verify_center/set_pin");
        smartRouteBuildRoute.withNavArg(new PinSetRouteArg(enumC1717460unI, list, str, str2, str3, str4, str5, str6, str7, "", z, str8, str9, str10, str11, str12, str13, str14, map, str15, str16, str17, str18, str19, str20, str21, z2, str22, str23));
        smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.0upS
            @Override // com.bytedance.router.OpenResultCallback
            public final void onActionResult(Object obj) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onEmpty() {
                C1951107kb.LIZ(this);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onFail(String str24, String str25) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onIntercept(String str24) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMatched(String str24) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMissed(String str24) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onOpen(Intent intent) {
                C1951107kb.LIZIZ(this, intent);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                String str24 = PinSetFragment._pnsPageId;
                final InterfaceC1631620sYq<EnumC1718480uow, C19EG, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                PinSetFragment.LLJIJIL = new InterfaceC1718890upb() { // from class: X.0upT
                    @Override // X.InterfaceC1718890upb
                    public final void LIZ(EnumC1718480uow enumC1718480uow, C19EG c19eg, String str25) {
                        interfaceC1631620sYq2.invoke(enumC1718480uow, c19eg, str25);
                    }
                };
            }
        });
        smartRouteBuildRoute.open(100);
    }
}
