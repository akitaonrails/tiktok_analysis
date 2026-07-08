package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0jvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299560jvG extends C09AY implements InterfaceC1685430txd<Boolean, String, Integer, String, String, Long, Unit> {
    public final /* synthetic */ EnumC1299600jvK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1299560jvG(EnumC1299600jvK enumC1299600jvK) {
        super(6);
        this.LL = enumC1299600jvK;
    }

    @Override // X.InterfaceC1685430txd
    public final Unit invoke(Boolean bool, String str, Integer num, String str2, String str3, Long l) {
        final String strValueOf;
        final boolean zBooleanValue = bool.booleanValue();
        final String str4 = str;
        final int iIntValue = num.intValue();
        final String str5 = str2;
        final String str6 = str3;
        long jLongValue = l.longValue();
        final EnumC1299600jvK enumC1299600jvK = this.LL;
        TraceEvent.LJIIJ(1L, "LynxSettingsDownloader.fetchSettings.finish");
        final String strValueOf2 = "";
        try {
            strValueOf = String.valueOf(C1299550jvF.LIZIZ().getLong("lynx_settings_last_sync_time", 0L));
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            strValueOf = "";
        }
        try {
            strValueOf2 = String.valueOf(C1299550jvF.LIZIZ().getLong("lynx_settings_experiment_update_timestamp", 0L));
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LynxEventReporter.onEvent("lynxsdk_settings_fetch_event", -1, new InterfaceC1289180jeW() { // from class: X.0jvL
            @Override // X.InterfaceC1289180jeW
            public final Map build() {
                List listLJJLIIIJILLIZJL;
                EnumC1299600jvK enumC1299600jvK2 = enumC1299600jvK;
                String str7 = strValueOf;
                String str8 = strValueOf2;
                String str9 = str4;
                boolean z = zBooleanValue;
                int i = iIntValue;
                String str10 = str5;
                String str11 = str6;
                HashMap map = new HashMap();
                map.put("base_source", enumC1299600jvK2.LL);
                map.put("base_current_time", String.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                map.put("base_last_check_time", str7);
                C1522030pi5 c1522030pi5 = C1299550jvF.LIZLLL;
                Map map2 = null;
                if (c1522030pi5 == null) {
                    c1522030pi5 = null;
                }
                map.put("base_app_id", c1522030pi5.LIZLLL);
                map.put("base_experiment_update_timestamp", str8);
                URL url = new URL(str9);
                map.put("request_host", url.getHost());
                map.put("request_scheme", url.getProtocol());
                map.put("request_path", url.getPath());
                String query = url.getQuery();
                if (query != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(query, new String[]{"&"}, 0, 6)) != null) {
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                    while (it2.hasNext()) {
                        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                        Pair pair = new Pair(ListProtector.get(listLJJLIIIJILLIZJL2, 0), ListProtector.get(listLJJLIIIJILLIZJL2, 1));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str12 = (String) entry.getKey();
                        Object value = entry.getValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("request_query_");
                        sbLIZ.append(str12);
                        map.put(C2188811AlT.LIZIZ(sbLIZ), value);
                    }
                }
                map.put("response_succeed", z ? "1" : CardStruct.IStatusCode.DEFAULT);
                map.put("response_error_code", String.valueOf(i));
                if (str10 == null) {
                    str10 = "";
                }
                map.put("response_error_domain", str10);
                map.put("response_json", str11 != null ? str11 : "");
                if (str11 != null) {
                    try {
                        new p();
                        map2 = (Map) new Gson().LIZLLL(p.LIZJ(str11).LJIILIIL().LJJIJ("data").LJJIJ("settings").LJJIJ("lynx_common"), new TypeToken<Map<String, ? extends Object>>() { // from class: X.00Vz
                        }.getType());
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("report fetch event parse error: ");
                        sbLIZ2.append(th);
                        LynxLog.e("LynxSettingsDownloader", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (map2 != null) {
                        map.putAll(map2);
                    }
                }
                return map;
            }
        });
        if (zBooleanValue) {
            TraceEvent.LJIIJ(1L, "LynxSettingsDownloader.updateSettingsData");
            if (str6 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Will update settings: ");
                sbLIZ.append(str6);
                LynxLog.i("LynxSettingsDownloader", C2188811AlT.LIZIZ(sbLIZ));
                C1299250jul.LIZJ().LJ(str6, jLongValue);
                C1299550jvF.LIZIZ().edit().putLong("lynx_settings_last_sync_time", System.currentTimeMillis()).apply();
            }
            C1299550jvF.LJI = 3;
            C1299550jvF.LIZJ(AbstractC19994813Le.Default.nextLong(86400000L, 259200000L));
        } else {
            LynxLog.e("LynxSettingsDownloader", "Download settings failed");
            int i = C1299550jvF.LJI;
            if (i > 0) {
                C1299550jvF.LJI = i - 1;
                C1299550jvF.LIZJ(30000L);
            } else {
                C1299550jvF.LJI = 3;
                C1299550jvF.LIZJ(AbstractC19994813Le.Default.nextLong(86400000L, 259200000L));
            }
        }
        return Unit.LIZ;
    }
}
