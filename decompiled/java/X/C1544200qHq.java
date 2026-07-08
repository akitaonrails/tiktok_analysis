package X;

import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.ss.android.ugc.aweme.hybridkit.experiment.HybridJsbBtmParserInterceptorSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544200qHq {
    public static void LIZ(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
        String string;
        String string2;
        LinkedHashMap linkedHashMap;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        HybridJsbBtmParserInterceptorSettings.HybridJsbBtmParserInterceptorModel hybridJsbBtmParserInterceptorModel = HybridJsbBtmParserInterceptorSettings.LIZ;
        HybridJsbBtmParserInterceptorSettings.HybridJsbBtmParserInterceptorModel hybridJsbBtmParserInterceptorModel2 = (HybridJsbBtmParserInterceptorSettings.HybridJsbBtmParserInterceptorModel) settingsManagerLIZLLL.LJIIIIZZ("hybrid_jsb_btm_parser_interceptor", HybridJsbBtmParserInterceptorSettings.HybridJsbBtmParserInterceptorModel.class, hybridJsbBtmParserInterceptorModel);
        if (hybridJsbBtmParserInterceptorModel2 != null) {
            hybridJsbBtmParserInterceptorModel = hybridJsbBtmParserInterceptorModel2;
        }
        if (hybridJsbBtmParserInterceptorModel.enable) {
            try {
                Object obj = c1543910qHN.LJIIIIZZ;
                View viewLIZ = null;
                if (obj instanceof JSONObject) {
                    if (((JSONObject) obj).has("_btmConfig")) {
                        string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject((JSONObject) c1543910qHN.LJIIIIZZ, "_btmConfig"), "btmC");
                        string2 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject((JSONObject) c1543910qHN.LJIIIIZZ, "_btmConfig"), "btmD");
                        InterfaceC1544190qHp interfaceC1544190qHp = c1543190qGD.LJ;
                        if (interfaceC1544190qHp != null) {
                            viewLIZ = interfaceC1544190qHp.LIZ();
                        }
                        JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject((JSONObject) c1543910qHN.LJIIIIZZ, "_bcmConfig");
                        linkedHashMap = new LinkedHashMap();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (jSONObject.opt(next) instanceof String) {
                                linkedHashMap.put(next, jSONObject.optString(next));
                            }
                        }
                    } else {
                        return;
                    }
                } else if (obj instanceof ReadableMap) {
                    ReadableMap map = ((ReadableMap) obj).getMap("data");
                    if (map == null) {
                        map = (ReadableMap) c1543910qHN.LJIIIIZZ;
                    }
                    if (map.hasKey("_btmConfig")) {
                        string = map.getMap("_btmConfig").getString("btmC");
                        string2 = map.getMap("_btmConfig").getString("btmD");
                        viewLIZ = c1543190qGD.LJFF;
                        ReadableMap map2 = map.getMap("_bcmConfig");
                        linkedHashMap = new LinkedHashMap();
                        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map2.keySetIterator();
                        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                            if (map2.getString(strNextKey) != null) {
                                linkedHashMap.put(strNextKey, map2.getString(strNextKey));
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                if (viewLIZ != null && string != null && string2 != null) {
                    C2211631BhB.LJIJ(viewLIZ, string, string2, null, null);
                    C2211631BhB.LIZ(viewLIZ, linkedHashMap);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
