package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Rcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699910Rcr {
    public static final Object LIZJ = new Object();
    public static final Map<String, Long> LIZLLL = new LinkedHashMap();
    public static final Map<String, Long> LJ = new LinkedHashMap();
    public static final Set<String> LJFF = new LinkedHashSet();
    public static final Map<String, WeakReference<IPlayerComponentAbility>> LJI = new LinkedHashMap();
    public final String LIZ;
    public final C699920Rcs LIZIZ;

    public final void LIZ(Map<String, String> map) {
        String strLIZIZ;
        long jLongValue;
        long j;
        String strLIZIZ2 = LIZIZ("group_id", map);
        if (strLIZIZ2 == null || strLIZIZ2.length() == 0 || !Intrinsics.LJFF(strLIZIZ2, this.LIZ) || (strLIZIZ = LIZIZ("component_key", map)) == null || !u.LJJIIJZLJL(strLIZIZ, "bottom_button", false) || !C699930Rct.LIZLLL(strLIZIZ2, strLIZIZ)) {
            return;
        }
        String strLIZ = C699930Rct.LIZ(strLIZIZ2, strLIZIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (LIZJ) {
            try {
                Long lRemove = LIZLLL.remove(strLIZ);
                if (lRemove != null) {
                    jLongValue = lRemove.longValue();
                } else {
                    jLongValue = jCurrentTimeMillis;
                }
                j = jCurrentTimeMillis - jLongValue;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (map != null) {
            map.put("exit_type", "click_exit");
            map.put("show_time", String.valueOf(j));
            map.remove("component_show_time");
            map.remove("video_duration");
            map.remove("video_play_time");
            map.remove("click_stay_time");
            C20684815ws.LJIILLIIL("core_fdmt_component_exit", map);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Rcs] */
    public C699910Rcr(String str, IPlayerComponentAbility iPlayerComponentAbility) {
        this.LIZ = str;
        synchronized (LIZJ) {
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        LJI.put(str, new WeakReference<>(iPlayerComponentAbility));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LIZIZ = new InterfaceC20685415wy() { // from class: X.0Rcs
            @Override // X.InterfaceC20685415wy
            public void onEvent(String str2) {
            }

            @Override // X.InterfaceC20685415wy
            public final void onEvent(String str2, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC20685415wy
            public final void LIZ(String str2, Map<String, String> map) {
                String strLIZIZ;
                String strLIZ;
                C699910Rcr c699910Rcr = this.LIZ;
                Object obj = C699910Rcr.LIZJ;
                c699910Rcr.getClass();
                if (C299710Bov.LIZ()) {
                    if (Intrinsics.LJFF(str2, "show_core_fdmt_component")) {
                        String strLIZIZ2 = C699910Rcr.LIZIZ("group_id", map);
                        if (strLIZIZ2 != null && strLIZIZ2.length() != 0 && Intrinsics.LJFF(strLIZIZ2, c699910Rcr.LIZ) && (strLIZIZ = C699910Rcr.LIZIZ("component_key", map)) != null && (strLIZ = C699930Rct.LIZ(strLIZIZ2, strLIZIZ)) != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            synchronized (C699910Rcr.LIZJ) {
                                try {
                                    C699910Rcr.LIZLLL.put(strLIZ, Long.valueOf(jCurrentTimeMillis));
                                    C699910Rcr.LJFF.remove(strLIZ);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    if (Intrinsics.LJFF(str2, "click_core_fdmt_component")) {
                        c699910Rcr.LIZ(map);
                    }
                }
            }
        };
    }

    public static String LIZIZ(String str, Map map) {
        String str2;
        if (map == null || (str2 = (String) map.get(str)) == null || str2.length() == 0) {
            return null;
        }
        return str2;
    }
}
