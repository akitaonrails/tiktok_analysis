package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493640oyI {
    public static volatile C1493640oyI LIZJ;
    public volatile int LIZ;
    public final List<C1493660oyK> LIZIZ = new CopyOnWriteArrayList();

    public static C1493640oyI LIZJ() {
        if (LIZJ == null) {
            synchronized (C1493640oyI.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1493640oyI();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final C1493660oyK LIZ(String str) {
        for (C1493660oyK c1493660oyK : (CopyOnWriteArrayList) this.LIZIZ) {
            if (c1493660oyK.LJIIIIZZ.equals(str)) {
                return c1493660oyK;
            }
        }
        return null;
    }

    public final void LJ(String str) {
        Logger.debug();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.LIZ = jSONObject.optInt("enabled_v2", 0);
            ((CopyOnWriteArrayList) this.LIZIZ).clear();
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "match_rules");
            for (int i = 0; i < jSONArray.length(); i++) {
                LJI((JSONObject) jSONArray.get(i));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logger.debug();
        }
    }

    public final void LJI(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        LJFF("host_group", arrayList, jSONObject);
        ArrayList arrayList2 = new ArrayList();
        LJFF("concurrent_hosts", arrayList2, jSONObject);
        if (!arrayList.isEmpty() && arrayList2.size() >= 2) {
            C1493660oyK c1493660oyK = new C1493660oyK(arrayList, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            if (LJFF("equal_group", arrayList3, jSONObject)) {
                c1493660oyK.LIZJ = arrayList3;
            }
            ArrayList arrayList4 = new ArrayList();
            if (LJFF("prefix_group", arrayList4, jSONObject)) {
                c1493660oyK.LIZLLL = arrayList4;
            }
            ArrayList arrayList5 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pattern_group");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (!TextUtils.isEmpty(strOptString)) {
                        try {
                            arrayList5.add(PatternProtector.compile(strOptString, 2));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                c1493660oyK.LJ = arrayList5;
            }
            c1493660oyK.LJII = jSONObject.optInt("fail_count", Integer.MAX_VALUE);
            c1493660oyK.LJI = jSONObject.optInt("forbid_seconds", 0);
            c1493660oyK.LJIIL = jSONObject.optInt("connect_interval_millis", 4000);
            boolean z3 = true;
            if (jSONObject.optInt("bypass_rs_enabled", 1) > 0) {
                z = true;
            } else {
                z = false;
            }
            c1493660oyK.LJIILJJIL = z;
            String strOptString2 = jSONObject.optString("concurrent_route");
            c1493660oyK.LJIILL = strOptString2;
            if (TextUtils.isEmpty(strOptString2)) {
                c1493660oyK.LJIILL = jSONObject.optString("rs_name", null);
            }
            if (jSONObject.optInt("fin_fix_enabled", 0) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1493660oyK.LJIILLIIL = z2;
            c1493660oyK.LJIIZILJ = jSONObject.optInt("max_wait_seconds", 0);
            if (c1493660oyK.LJIIL <= 0) {
                return;
            }
            if (jSONObject.optInt("retry_for_not_2xx_code", 0) <= 0) {
                z3 = false;
            }
            c1493660oyK.LJIILIIL = z3;
            HashSet hashSet = new HashSet();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("block_code_list");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    hashSet.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i2)));
                }
                c1493660oyK.LJFF = hashSet;
            }
            ((CopyOnWriteArrayList) this.LIZIZ).add(c1493660oyK);
        }
    }

    public final boolean LIZIZ(int i, String str) {
        C1493660oyK c1493660oyKLIZ;
        Set<Integer> set;
        if (i != 0 && !TextUtils.isEmpty(str) && (c1493660oyKLIZ = LIZ(str)) != null && (set = c1493660oyKLIZ.LJFF) != null) {
            return ((HashSet) set).contains(Integer.valueOf(i));
        }
        return false;
    }

    public final void LIZLLL(String str, boolean z) {
        C1493660oyK c1493660oyKLIZ;
        if (TextUtils.isEmpty(str) || (c1493660oyKLIZ = LIZ(str)) == null) {
            return;
        }
        Logger.debug();
        if (z) {
            if (c1493660oyKLIZ.LJIIIZ == 0 && !c1493660oyKLIZ.LJIIJJI) {
                return;
            }
            c1493660oyKLIZ.LJIIIZ = 0;
            c1493660oyKLIZ.LJIIJJI = false;
            return;
        }
        int i = c1493660oyKLIZ.LJIIIZ + 1;
        c1493660oyKLIZ.LJIIIZ = i;
        if (i < c1493660oyKLIZ.LJII) {
            return;
        }
        if (!c1493660oyKLIZ.LJIIJJI) {
            c1493660oyKLIZ.LJIIJJI = true;
            c1493660oyKLIZ.LJIIJ = SystemClock.uptimeMillis();
        }
        Logger.debug();
    }

    public static boolean LJFF(String str, List list, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject == null || TextUtils.isEmpty(str) || (jSONArrayOptJSONArray = jSONObject.optJSONArray(str)) == null) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                ((ArrayList) list).add(strOptString);
            }
        }
        return true;
    }
}
