package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.IAppService;
import com.google.gson.n;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474760oTq implements IAppService {
    public final WeakReference<C1469160oKo> LIZ;

    public C1474760oTq(C1469160oKo c1469160oKo) {
        this.LIZ = new WeakReference<>(c1469160oKo);
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final String getGearPortrait(String str) {
        List<InterfaceC1474770oTr> list;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getGearPortrait: mediaId = ");
        sbLIZ.append(str);
        TTVideoEngineLog.d("VCStrategy", C2188811AlT.LIZIZ(sbLIZ));
        IDimensionBitrateCurveConfig dimensionBitrateCurveConfig = C582130MsN.LIZ().getConfig().getDimensionBitrateCurveConfig();
        n nVar = new n();
        if (dimensionBitrateCurveConfig != null && dimensionBitrateCurveConfig.enable() && (list = dimensionBitrateCurveConfig.config().LJ) != null && !list.isEmpty()) {
            for (InterfaceC1474770oTr interfaceC1474770oTr : list) {
                if (interfaceC1474770oTr != null) {
                    nVar.LJJIIJ(interfaceC1474770oTr.key(), interfaceC1474770oTr.LIZ(str));
                }
            }
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getGearPortrait: res = ");
        sbLIZ2.append(nVar.toString());
        TTVideoEngineLog.d("VCStrategy", C2188811AlT.LIZIZ(sbLIZ2));
        return nVar.toString();
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final String getPortrait(String str, String str2) {
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && c1469160oKo.LIZJ != null) {
            HashMap map = new HashMap();
            map.put("type", "one");
            map.put("from", str);
            map.put("name", str2);
            HashMap map2 = (HashMap) C1474720oTm.LIZ(map);
            if (map2.containsKey(str2)) {
                return (String) map2.get(str2);
            }
            return "";
        }
        return null;
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final String getPortraits(String str, String str2) {
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && c1469160oKo.LIZJ != null) {
            HashMap map = new HashMap();
            map.put("type", "group");
            map.put("name", str2);
            map.put("from", str);
            return C786410Ut5.J3(new JSONObject(C1474720oTm.LIZ(map)));
        }
        return null;
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final void addGroupConfig(String str, String str2, String str3) {
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && c1469160oKo.LIZJ != null) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str3);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            HashMap map = new HashMap();
            map.put("from", str);
            map.put("name", str2);
            c1469160oKo.LIZJ.getClass();
            C1474730oTn c1474730oTn = C0NEL.LIZ;
            c1474730oTn.getClass();
            if (!map.isEmpty() && !arrayList.isEmpty()) {
                String str4 = (String) map.get("from");
                String str5 = (String) map.get("name");
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    if (c1474730oTn.LIZ != null && "smart".equals(str4)) {
                        c1474730oTn.LIZ.addGroupConfig(str5, arrayList2);
                    } else if ("video".equals(str4)) {
                        ((HashMap) c1474730oTn.LIZIZ).put(str5, arrayList2);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final String getMediaPortrait(String str, String str2, String str3) {
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && c1469160oKo.LIZJ != null) {
            HashMap map = new HashMap();
            map.put("type", "one");
            map.put("name", str3);
            map.put("video_id", str2);
            map.put("from", str);
            return C786410Ut5.J3(new JSONObject(C1474720oTm.LIZ(map)));
        }
        return null;
    }

    @Override // com.bytedance.vcloud.strategy.IAppService
    public final String getMediaPortraits(String str, String str2, String str3) {
        C1469160oKo c1469160oKo = this.LIZ.get();
        if (c1469160oKo != null && c1469160oKo.LIZJ != null) {
            HashMap map = new HashMap();
            map.put("type", "group");
            map.put("name", str3);
            map.put("video_id", str2);
            map.put("from", str);
            return C786410Ut5.J3(new JSONObject(C1474720oTm.LIZ(map)));
        }
        return null;
    }
}
