package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13Mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19997513Mf {
    public static final void LIZLLL(InterfaceC1633730scF interfaceC1633730scF, boolean z, C13RD c13rd, Map<String, ? extends Object> map) {
        Pair[] pairArr = new Pair[1];
        String str = c13rd.LJIIJ;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("app_id", str);
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(map);
        interfaceC1633730scF.monitorStatusRate("effect_download_info", !z ? 1 : 0, mapLJIIJ);
    }

    public static final void LJII(InterfaceC1633730scF interfaceC1633730scF, boolean z, C13RD c13rd, String str, String str2) {
        Pair[] pairArr = new Pair[2];
        String str3 = c13rd.LJIIJ;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[0] = new Pair("app_id", str3);
        pairArr[1] = new Pair("model_name", str);
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            mapLJIIJ.put("error_msg", str2);
        }
        interfaceC1633730scF.monitorStatusRate("find_model_success_rate", !z ? 1 : 0, mapLJIIJ);
    }

    public static final void LIZ(InterfaceC1633730scF interfaceC1633730scF, boolean z, String str, C13RD c13rd, Map<String, ? extends Object> map, String str2) {
        Pair[] pairArr = new Pair[2];
        String str3 = c13rd.LJIIJ;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[0] = new Pair("app_id", str3);
        pairArr[1] = new Pair("event_name", str);
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            mapLJIIJ.put("error_msg", str2);
        }
        interfaceC1633730scF.monitorStatusRate("ep_common_event", !z ? 1 : 0, mapLJIIJ);
    }

    public static final void LIZJ(Effect effect, C13RD c13rd, InterfaceC1633730scF interfaceC1633730scF, String str, Map map, boolean z) {
        Pair[] pairArr = new Pair[6];
        String str2 = c13rd.LJIIJ;
        if (str2 == null) {
            str2 = "";
        }
        int iIntValue = 0;
        pairArr[0] = new Pair("app_id", str2);
        pairArr[1] = new Pair("effect_id", effect.getEffect_id());
        Integer url_sub_type = effect.getFile_url().getUrl_sub_type();
        if (url_sub_type != null) {
            iIntValue = url_sub_type.intValue();
        }
        pairArr[2] = new Pair("effect_type", Integer.valueOf(iIntValue));
        pairArr[3] = new Pair("source", Integer.valueOf(effect.getSource()));
        pairArr[4] = new Pair("panel", effect.getPanel());
        String strExpectedMd5 = EffectKt.expectedMd5(effect);
        if (strExpectedMd5 == null) {
            strExpectedMd5 = "";
        }
        pairArr[5] = new Pair("md5", strExpectedMd5);
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(map);
        if (!z) {
            if (str == null) {
                str = "";
            }
            mapLJIIJ.put("error_msg", str);
        }
        interfaceC1633730scF.monitorStatusRate("effect_download_success_rate", !z ? 1 : 0, mapLJIIJ);
    }

    public static final void LJ(Effect effect, C13RD c13rd, InterfaceC1633730scF interfaceC1633730scF, String str, Map map, boolean z) {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("effect_id", effect.getEffect_id());
        pairArr[1] = new Pair("effect_name", effect.getName());
        String str2 = c13rd.LJIIJ;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("app_id", str2);
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(map);
        if (!z) {
            if (str == null) {
                str = "";
            }
            mapLJIIJ.put("error_info", str);
        }
        interfaceC1633730scF.monitorStatusRate("effect_resource_unzip_success_rate", 1 ^ (z ? 1 : 0), mapLJIIJ);
    }

    public static final void LJI(InterfaceC1633730scF interfaceC1633730scF, boolean z, C13RD c13rd, Effect effect, String str, String str2, String str3, Map<String, ? extends Object> map, String str4) {
        Pair[] pairArr = new Pair[6];
        String str5 = c13rd.LJIIJ;
        if (str5 == null) {
            str5 = "";
        }
        pairArr[0] = new Pair("app_id", str5);
        pairArr[1] = new Pair("effect_id", effect.getEffect_id());
        pairArr[2] = new Pair("panel", effect.getPanel());
        pairArr[3] = new Pair("model_name", str);
        pairArr[4] = new Pair("resource_type", str3);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[5] = new Pair("model_version", str2);
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(map);
        if (!z) {
            if (str4 == null) {
                str4 = "";
            }
            mapLJIIJ.put("error_msg", str4);
        }
        interfaceC1633730scF.monitorStatusRate("model_download_success_rate", !z ? 1 : 0, mapLJIIJ);
    }
}
