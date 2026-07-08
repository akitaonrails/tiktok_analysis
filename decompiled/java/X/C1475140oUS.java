package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0oUS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475140oUS {
    public static String LIZ(List list, Map map, C1477120oXe c1477120oXe, C1477120oXe c1477120oXe2) {
        boolean z;
        String str;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        if ((c1477120oXe != null && c1477120oXe2 != null && c1477120oXe.getBitRate() != c1477120oXe2.getBitRate()) || ((c1477120oXe == null && c1477120oXe2 != null) || (c1477120oXe != null && c1477120oXe2 == null))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "same";
        }
        StringBuilder sb = new StringBuilder("bitrate=[");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(((InterfaceC1477220oXo) it2.next()).getBitRate());
            sb.append(",");
        }
        sb.append(e3.f);
        if (C582130MsN.LIZ().getConfig().getCommonConfig().isUseLastNetworkSpeed()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) map.get("sim_video_url_model");
        if (C1476990oXR.LIZLLL == null) {
            C1476990oXR.LIZLLL = new Integer(C582130MsN.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed());
        }
        sb.append("&config_quality=1&use_last_network_speed=");
        sb.append(str);
        sb.append("&curve_adjust_mode=");
        sb.append(C1474810oTv.LJIIJ());
        sb.append("&curve_adjust_factor=");
        float f = 1.0f;
        if (simVideoUrlModel != null && !TextUtils.isEmpty(simVideoUrlModel.getMeta())) {
            try {
                JSONObject json = C1473210oRL.from(simVideoUrlModel.getMeta()).getJson();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
                sbLIZ.append(1.0f);
                String strOptString = json.optString("qprf", C2188811AlT.LIZIZ(sbLIZ));
                if (!TextUtils.isEmpty(strOptString)) {
                    f = CastFloatProtector.parseFloat(strOptString);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        sb.append(f);
        sb.append("&initial_speed=");
        sb.append(C1476990oXR.LIZLLL);
        sb.append("&internet_speed=");
        sb.append(map.get("internet_speed"));
        InterfaceC1475360oUo interfaceC1475360oUo = (InterfaceC1475360oUo) map.get("bitrate_curve");
        if (interfaceC1475360oUo != null) {
            sb.append("&param_a=");
            sb.append(interfaceC1475360oUo.LIZLLL());
            sb.append("&param_b=");
            sb.append(interfaceC1475360oUo.LIZJ());
            sb.append("&param_c=");
            sb.append(interfaceC1475360oUo.LJ());
            sb.append("&param_d=");
            sb.append(interfaceC1475360oUo.LIZIZ());
            sb.append("&min_bitrate=");
            sb.append(interfaceC1475360oUo.LIZ());
        }
        sb.append("&origin_res=");
        Object objValueOf4 = "NA";
        if (c1477120oXe == null) {
            objValueOf = "NA";
        } else {
            objValueOf = Integer.valueOf(c1477120oXe.getBitRate());
        }
        sb.append(objValueOf);
        sb.append("&native_res=");
        if (c1477120oXe2 == null) {
            objValueOf2 = "NA";
        } else {
            objValueOf2 = Integer.valueOf(c1477120oXe2.getBitRate());
        }
        sb.append(objValueOf2);
        sb.append("&origin_cal=");
        if (c1477120oXe == null) {
            objValueOf3 = "NA";
        } else {
            objValueOf3 = Double.valueOf(c1477120oXe.LLILZLL);
        }
        sb.append(objValueOf3);
        sb.append("&native_cal=");
        if (c1477120oXe2 != null) {
            objValueOf4 = Double.valueOf(c1477120oXe2.LLILZLL);
        }
        sb.append(objValueOf4);
        return sb.toString();
    }
}
