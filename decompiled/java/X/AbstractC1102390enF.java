package X;

import X.C1102400enG;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyMockEnabledSetting;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyPublicCommonParams;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyQuota;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0enF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1102390enF<T extends C1102400enG> {
    public final int LIZ;
    public Map<String, T> LIZIZ;
    public final ConcurrentHashMap<Integer, C1102450enL> LIZJ = new ConcurrentHashMap<>();
    public final Map<Long, Long> LIZLLL = new LinkedHashMap();

    public boolean LJI(C1102400enG c1102400enG) {
        return false;
    }

    public abstract T LJII(T t, int i, int i2, int i3, NotifyQuota notifyQuota, int i4, long j);

    public AbstractC1102390enF(int i) {
        this.LIZ = i;
    }

    public void LIZIZ(long j) {
        this.LIZLLL.put(Long.valueOf(j), Long.valueOf(SystemClock.uptimeMillis()));
        Map<String, T> map = this.LIZIZ;
        if (map != null && (r3 = ((LinkedHashMap) map).entrySet().iterator()) != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                ((C1102400enG) entry.getValue()).LJII = ((C1102400enG) entry.getValue()).LJIIIIZZ;
            }
        }
        C1102370enD.LIZLLL("init_early_quota", this, j);
    }

    public void LJFF(long j) {
        this.LIZLLL.remove(Long.valueOf(j));
        Map<String, T> map = this.LIZIZ;
        if (map != null) {
            Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
            while (it2.hasNext()) {
                ((C1102400enG) ((Map.Entry) it2.next()).getValue()).LJI.remove(Long.valueOf(j));
            }
        }
        Iterator<Map.Entry<Integer, C1102450enL>> it3 = this.LIZJ.entrySet().iterator();
        while (it3.hasNext()) {
            if (it3.next().getValue().LIZIZ == j) {
                it3.remove();
            }
        }
    }

    public C1102330en9 LJIIIIZZ(C1102400enG c1102400enG) {
        return new C1102360enC(EnumC1102380enE.QUOTA_CHECK_EXEMPTED);
    }

    public final void LJIIJ(long j) {
        if (!this.LIZJ.isEmpty()) {
            for (Map.Entry<Integer, C1102450enL> entry : this.LIZJ.entrySet()) {
                C1102450enL value = entry.getValue();
                int iIntValue = entry.getKey().intValue();
                Map linkedHashMap = this.LIZIZ;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.LIZIZ = linkedHashMap;
                }
                List<NotifyQuota> list = value.LIZ.quotaList;
                if (list != null) {
                    for (NotifyQuota notifyQuota : list) {
                        NotifyPublicCommonParams notifyPublicCommonParams = notifyQuota.publicCommonParams;
                        if (notifyPublicCommonParams != null) {
                            String strLIZLLL = LIZLLL(notifyPublicCommonParams.component, notifyPublicCommonParams.biz, notifyPublicCommonParams.scene);
                            int i = notifyPublicCommonParams.userType;
                            if (i == this.LIZ || i == 0) {
                                linkedHashMap.put(strLIZLLL, LJII((C1102400enG) linkedHashMap.get(strLIZLLL), notifyPublicCommonParams.component, notifyPublicCommonParams.biz, notifyPublicCommonParams.scene, notifyQuota, iIntValue, value.LIZIZ));
                            }
                        }
                    }
                }
            }
            this.LIZJ.clear();
            C1102370enD.LIZLLL("resolve_quota_data", this, j);
        }
    }

    public static String LIZLLL(int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(i2);
        sbLIZ.append('_');
        sbLIZ.append(i3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static long LJIIIZ(long j, Long l, Long l2) {
        if (l != null) {
            l.longValue();
            if (l2 != null) {
                l2.longValue();
                if (j != -1 && l.longValue() != -1 && l2.longValue() != -1) {
                    return Math.max(0L, (l.longValue() + j) - l2.longValue());
                }
                return j;
            }
            return j;
        }
        return j;
    }

    public final void LJIIJJI(NotifyFCConfig notifyFCConfig, int i, long j) {
        String str;
        Object objFromJson;
        if (notifyFCConfig != null) {
            this.LIZJ.put(Integer.valueOf(i), new C1102450enL(notifyFCConfig, j));
        }
        boolean z = C1102370enD.LIZ;
        JSONObject jSONObject = new JSONObject();
        String str2 = "unknown";
        if (i != 0) {
            if (i == 1) {
                str = "config";
            } else if (i != 2) {
                if (i != 3) {
                    str = "unknown";
                } else {
                    str = "sync";
                }
            } else {
                str = "room";
            }
        } else {
            str = "none";
        }
        jSONObject.put("update_level", str);
        int i2 = this.LIZ;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = "viewer";
                }
            } else {
                str2 = "anchor";
            }
        } else {
            str2 = "all";
        }
        jSONObject.put("user_type", str2);
        if (notifyFCConfig != null) {
            objFromJson = GsonProtectorUtils.fromJson(C293501Bt.LIZ(), GsonProtectorUtils.toJson(C293501Bt.LIZ(), notifyFCConfig), new TypeToken<NotifyFCConfig>() { // from class: X.0UnP
            }.getType());
        } else {
            objFromJson = null;
        }
        jSONObject.put("config", objFromJson);
        if (C1102370enD.LIZ || LiveEffectNotifyMockEnabledSetting.enable()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlive_effect_notify_frequency_control_");
            sbLIZ.append("update_quota_config");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            jSONObject.put("action", "update_quota_config");
            C1CC2.LJIIL(0, strLIZIZ, jSONObject);
        }
    }

    public static C1102400enG LJ(Map map, int i, int i2, int i3) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        C1102400enG c1102400enG = (C1102400enG) linkedHashMap.get(LIZLLL(i, i2, i3));
        if (c1102400enG == null) {
            C1102400enG c1102400enG2 = (C1102400enG) linkedHashMap.get(LIZLLL(i, i2, 0));
            if (c1102400enG2 == null) {
                return (C1102400enG) linkedHashMap.get(LIZLLL(i, 0, 0));
            }
            return c1102400enG2;
        }
        return c1102400enG;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r20, int r21, int r22, long r23) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1102390enF.LIZ(int, int, int, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1102330en9 LIZJ(int r13, int r14, int r15, long r16) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1102390enF.LIZJ(int, int, int, long):X.0en9");
    }
}
