package X;

import Y.ARunnableS3S2200000_12;
import Y.ARunnableS6S2100000_12;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0T8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742070T8z {
    public final Context LIZ;
    public final C0T92 LIZIZ;
    public final Set<String> LIZJ;
    public Set<String> LJ;
    public final Set<String> LJFF;
    public String LJI;
    public String LJII;
    public Map<String, String> LJIIIIZZ;
    public final Set<String> LIZLLL = new ConcurrentSkipListSet();
    public final Map<String, Map<String, String>> LJIIIZ = new ConcurrentHashMap();
    public final List<String> LJIIJ = new CopyOnWriteArrayList();

    public final void LIZJ() {
        String string;
        if (this.LIZJ.isEmpty() && this.LJ.isEmpty() && this.LIZLLL.isEmpty() && this.LJFF.isEmpty()) {
            string = null;
        } else {
            boolean z = true;
            Set[] setArr = {this.LIZJ, this.LJ, this.LIZLLL, this.LJFF};
            StringBuilder sb = new StringBuilder();
            int i = 0;
            do {
                Set set = setArr[i];
                if (set != null) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(',');
                        }
                        sb.append((String) it2.next());
                    }
                }
                i++;
            } while (i < 4);
            string = sb.toString();
        }
        if (TextUtils.equals(string, this.LJII)) {
            return;
        }
        this.LJII = string;
        C0T92 c0t92 = this.LIZIZ;
        if (c0t92 != null) {
            c0t92.LIZ(string);
        }
    }

    public final void LIZ(String str, List<String> list) {
        Map map = (Map) ((ConcurrentHashMap) this.LJIIIZ).get(str);
        for (String str2 : map.keySet()) {
            if (!list.contains(str2)) {
                try {
                    ((ConcurrentSkipListSet) this.LIZLLL).remove(map.get(str2));
                    map.remove(str2);
                    Context context = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SP_CLIENT_EXPOSURE_CACHE$$$");
                    sbLIZ.append(str);
                    C0TKI.LIZ(new ARunnableS6S2100000_12(context, C2188811AlT.LIZIZ(sbLIZ), str2, 0));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public C742070T8z(Context context, C0T92 c0t92, Set<String> set) {
        this.LIZ = context;
        this.LIZIZ = c0t92;
        this.LJFF = set;
        this.LJI = C0T6Q.LIZJ(context, "SP_EXPERIMENT_CACHE").getString("ab_test_current_uid", "");
        this.LIZJ = C0T6Q.LIZLLL(context, "SP_EXPERIMENT_EXPOSURE_CACHE");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SP_EXPERIMENT_EXPOSURE_CACHE_");
        sbLIZ.append(this.LJI);
        this.LJ = C0T6Q.LIZLLL(context, C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIIZZ = C0T6Q.LIZIZ(context, "SP_EXPERIMENT_EXPOSURE_CACHE");
        for (String str : (ConcurrentSkipListSet) C0T6Q.LIZLLL(context, "SP_CLIENT_EXPOSURE_CACHE")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SP_CLIENT_EXPOSURE_CACHE$$$");
            sbLIZ2.append(str);
            Map<String, String> mapLIZIZ = C0T6Q.LIZIZ(context, C2188811AlT.LIZIZ(sbLIZ2));
            ((ConcurrentHashMap) this.LJIIIZ).put(str, mapLIZIZ);
            this.LIZLLL.addAll(((ConcurrentHashMap) mapLIZIZ).values());
        }
        LIZJ();
        C0TKI.LIZ.schedule(new Runnable() { // from class: X.0T91
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExposureManager@5453.<init>$1");
                try {
                    C742070T8z c742070T8z = this.LL;
                    c742070T8z.LIZ("ab_test_noapt_module_name", c742070T8z.LJIIJ);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExposureManager@5453.<init>$1");
            }
        }, Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS);
    }

    public final <T> void LIZIZ(final String str, C0TKB<T> c0tkb, final String str2) {
        if (c0tkb == null) {
            return;
        }
        String str3 = c0tkb.LIZLLL;
        if (!((ConcurrentHashMap) this.LJIIIZ).containsKey(str3)) {
            ((ConcurrentHashMap) this.LJIIIZ).put(str3, new ConcurrentHashMap());
            C0TKI.LIZ(new ARunnableS3S2200000_12(this.LIZ, "SP_CLIENT_EXPOSURE_CACHE", ((ConcurrentHashMap) this.LJIIIZ).keySet(), 1));
        }
        String[] strArr = c0tkb.LJ;
        if (strArr != null) {
            LIZ(str3, Arrays.asList(strArr));
        } else {
            ((CopyOnWriteArrayList) this.LJIIJ).add(str);
        }
        Map map = (Map) ((ConcurrentHashMap) this.LJIIIZ).get(str3);
        String str4 = (String) map.get(str);
        if (!TextUtils.equals(str4, str2)) {
            if (!TextUtils.isEmpty(str4)) {
                ((ConcurrentSkipListSet) this.LIZLLL).remove(str4);
                map.remove(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                ((ConcurrentSkipListSet) this.LIZLLL).add(str2);
                map.put(str, str2);
            }
            final Context context = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SP_CLIENT_EXPOSURE_CACHE$$$");
            sbLIZ.append(str3);
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0TKI.LIZ(new Runnable() { // from class: X.0T6P
                public final void LIZ() {
                    if (str2 == null) {
                        C0T6Q.LIZJ(context, strLIZIZ).edit().remove(str).apply();
                    } else {
                        C0T6Q.LIZJ(context, strLIZIZ).edit().putString(str, str2).apply();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CacheRepository@34a7.saveString$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CacheRepository@34a7.saveString$1");
                }
            });
            LIZJ();
        }
    }
}
