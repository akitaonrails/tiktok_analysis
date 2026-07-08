package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.x;
import com.ss.ttvideoengine.TTVideoEngine;
import com.tiktok.ttkmedia.configcenter.ConfigCenter;
import com.ttkmedia.datacenter.common.DCThreadPool;
import com.ttkmedia.datacenter.settings.StarShipFetcher;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309100kAe {
    public final C1309090kAd LIZ;
    public Context LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public int LJFF;
    public AbstractC1468760oKA LJI;

    public final void LIZIZ() {
        if (!TextUtils.isEmpty(C1309170kAl.LJFF)) {
            if (C1309170kAl.LJFF.equals("singapore")) {
                C1308970kAR.LIZJ = "api.tiktokv.com";
            } else {
                C1308970kAR.LIZJ = C1309170kAl.LJFF;
            }
        }
        HashMap map = new HashMap();
        map.put("aid", Integer.valueOf(C1309170kAl.LIZ));
        map.put("app_name", C1309170kAl.LIZIZ);
        String str = C1309170kAl.LJ;
        if (str == null) {
            str = "";
        }
        map.put("device_id", str);
        map.put("app_channel", C1309170kAl.LIZJ);
        map.put("app_version", C1309170kAl.LIZLLL);
        C1308970kAR.LIZLLL = map;
        HashMap map2 = new HashMap();
        map2.put("sdk_version", "1.10.291.6-mt");
        if (this.LIZJ == null) {
            this.LIZJ = x.LIZLLL(14, "");
        }
        map2.put("player_version", this.LIZJ);
        if (this.LIZLLL == null) {
            this.LIZLLL = C805420Vie.LIZ.LJJIJIL(6);
        }
        map2.put("mdl_version", this.LIZLLL);
        map2.put("st_version", "3.290.1");
        C1308970kAR.LJ = map2;
    }

    public final void LJFF() {
        final C1309090kAd c1309090kAd;
        if (this.LJFF == 0 || this.LIZIZ == null || (c1309090kAd = this.LIZ) == null) {
            return;
        }
        DCThreadPool.addTask(new Runnable() { // from class: X.0kAc
            public final /* synthetic */ String LL = "all";

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                InterfaceC1309140kAi interfaceC1309140kAi;
                C1C7U.LIZ("SettingsManager@6c19.loadLocalAndRefresh$1");
                try {
                    C1309090kAd c1309090kAd2 = c1309090kAd;
                    String str = this.LL;
                    synchronized (c1309090kAd2) {
                        if (c1309090kAd2.LJI < 1) {
                            C1309060kAa c1309060kAa = c1309090kAd2.LJ.get("common");
                            c1309060kAa.LJI(C786410Ut5.N3(c1309090kAd2.LIZJ));
                            try {
                                c1309090kAd2.LJII = c1309060kAa.LIZ("fetch_interval", 0);
                                c1309090kAd2.LJIIIIZZ = c1309060kAa.LIZJ("config_version");
                                c1309090kAd2.LJI = c1309060kAa.LIZJ("local_cache_expire");
                                c1309090kAd2.LJFF = c1309060kAa.LIZ("use_local_cache", 1) > 0;
                                c1309090kAd2.LJIIIZ = c1309060kAa.LIZ("max_fetch_times", c1309090kAd2.LJIIIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                th.toString();
                            }
                            c1309090kAd2.LIZ("vod");
                        }
                        InterfaceC1309140kAi interfaceC1309140kAi2 = c1309090kAd2.LIZLLL;
                        if (interfaceC1309140kAi2 != null) {
                            interfaceC1309140kAi2.setFetchInterval(c1309090kAd2.LJII);
                            c1309090kAd2.LIZLLL.setMaxFetchTimes(c1309090kAd2.LJIIIZ);
                            c1309090kAd2.LIZLLL.setConfigVersion(c1309090kAd2.LJIIIIZZ);
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("use cache: ");
                        sbLIZ.append(c1309090kAd2.LJFF);
                        sbLIZ.append(", expire = ");
                        sbLIZ.append(c1309090kAd2.LJI);
                        sbLIZ.append(", curTimeMs = ");
                        sbLIZ.append(jCurrentTimeMillis);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if ((!c1309090kAd2.LJFF || c1309090kAd2.LJI <= jCurrentTimeMillis) && (interfaceC1309140kAi = c1309090kAd2.LIZLLL) != null) {
                            interfaceC1309140kAi.fetch(str, null, true);
                        }
                        c1309090kAd2.LIZJ(c1309090kAd2.LJII);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SettingsManager@6c19.loadLocalAndRefresh$1");
            }
        });
    }

    public C1309100kAe() {
        C1309090kAd c1309090kAd;
        synchronized (C1309090kAd.class) {
            if (C1309090kAd.LJIILIIL == null) {
                C1309090kAd.LJIILIIL = new C1309090kAd();
            }
            c1309090kAd = C1309090kAd.LJIILIIL;
        }
        this.LIZ = c1309090kAd;
        final C1309090kAd c1309090kAdLJI = C1309090kAd.LJI();
        InterfaceC1309160kAk interfaceC1309160kAk = new InterfaceC1309160kAk(c1309090kAdLJI) { // from class: X.0kAg
            public final WeakReference<C1309090kAd> LIZ;

            {
                this.LIZ = new WeakReference<>(c1309090kAdLJI);
            }

            @Override // X.InterfaceC1309160kAk
            public final void LIZ(String str) {
                if (this.LIZ.get() != null && str.equals("vod")) {
                    C1309100kAe c1309100kAe = C1309150kAj.LIZ;
                    JSONArray jSONArrayLJFF = c1309100kAe.LIZ.LJFF(str, "playback");
                    if (jSONArrayLJFF != null) {
                        ConfigCenter.LJI().LJIIZILJ("playback", jSONArrayLJFF);
                    }
                    JSONArray jSONArrayLJFF2 = c1309100kAe.LIZ.LJFF(str, "mdl");
                    if (jSONArrayLJFF2 != null) {
                        ConfigCenter.LJI().LJIIZILJ("mdl", jSONArrayLJFF2);
                    }
                    TTVideoEngine.LJIIJ(31231, 0);
                }
            }
        };
        c1309090kAd.LIZ.writeLock().lock();
        c1309090kAd.LIZIZ.add(interfaceC1309160kAk);
        c1309090kAd.LIZ.writeLock().unlock();
    }

    public static C1309100kAe LJ() {
        return C1309150kAj.LIZ;
    }

    public final JSONObject LIZLLL(String str) {
        JSONObject jSONObjectOptJSONObject;
        SharedPreferences sharedPreferences;
        if (this.LJFF == 0) {
            return null;
        }
        C1309060kAa c1309060kAa = this.LIZ.LJ.get("playback");
        c1309060kAa.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c1309060kAa.LJI(c1309060kAa.LIZJ);
        if ((c1309060kAa.LJ & 1) > 0) {
            c1309060kAa.LIZ.readLock().lock();
            JSONObject jSONObject = c1309060kAa.LIZIZ;
            if (jSONObject != null) {
                jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            } else {
                jSONObjectOptJSONObject = null;
            }
            c1309060kAa.LIZ.readLock().unlock();
        } else {
            jSONObjectOptJSONObject = null;
        }
        if (jSONObjectOptJSONObject == null) {
            try {
                if ((c1309060kAa.LJ & 2) > 0 && (sharedPreferences = c1309060kAa.LJFF) != null) {
                    String string = sharedPreferences.getString(str, "");
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject2 = new JSONObject(string);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("get jsonObject from SP, key = ");
                        sbLIZ.append(str);
                        sbLIZ.append(", retValue = ");
                        sbLIZ.append(jSONObject2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return jSONObject2;
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                e.toString();
                return null;
            }
        }
        return jSONObjectOptJSONObject;
    }

    public final void LJI(Context context) {
        this.LIZIZ = context;
        C1309090kAd c1309090kAd = this.LIZ;
        if (c1309090kAd != null) {
            int iIntValue = ((Number) C1474810oTv.a2.getValue()).intValue();
            c1309090kAd.LJIIJ = iIntValue;
            if (iIntValue == 1) {
                Iterator<C1309060kAa> it2 = c1309090kAd.LJ.values().iterator();
                while (it2.hasNext()) {
                    it2.next().LJ = 5;
                }
            }
            C1309090kAd c1309090kAd2 = this.LIZ;
            if (c1309090kAd2.LIZJ == null) {
                c1309090kAd2.LIZJ = context;
                Iterator<C1309060kAa> it3 = c1309090kAd2.LJ.values().iterator();
                while (it3.hasNext()) {
                    it3.next().LIZJ = context;
                }
                if (c1309090kAd2.LJIIJ == 1) {
                    c1309090kAd2.LIZLLL = new StarShipFetcher(new C1309070kAb(c1309090kAd2, c1309090kAd2));
                } else {
                    C786410Ut5.N3(context);
                    c1309090kAd2.LIZLLL = new C1309000kAU(new C1309070kAb(c1309090kAd2, c1309090kAd2));
                }
            }
            C1309090kAd c1309090kAd3 = this.LIZ;
            c1309090kAd3.LIZLLL.setDebug(this.LJ);
            C1309090kAd c1309090kAd4 = this.LIZ;
            c1309090kAd4.LIZLLL.setNet(new C1309030kAX(this));
        }
    }

    public static String LIZ(String str, Map map) {
        if (str != null) {
            HashMap map2 = (HashMap) map;
            if (!map2.isEmpty()) {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                for (Map.Entry entry : map2.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                return builderBuildUpon.build().toString();
            }
            return str;
        }
        return str;
    }

    public static final void LJII(int i, String str) {
        if (i != 117) {
            if (i == 118) {
                C1308970kAR.LIZ = str;
                return;
            }
            return;
        }
        C1308970kAR.LIZIZ = str;
    }

    public final int LIZJ(int i, String str) {
        if (this.LJFF == 0) {
            return i;
        }
        return this.LIZ.LJ.get("playback").LIZ(str, i);
    }
}
