package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0osn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490230osn {
    public static volatile C1490230osn LJIIL;
    public static final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public final AtomicInteger LIZ;
    public final CopyOnWriteArrayList<String> LIZIZ;
    public final AtomicBoolean LIZJ;
    public final AtomicBoolean LIZLLL;
    public final AtomicInteger LJ;
    public final AtomicInteger LJFF;
    public final AtomicBoolean LJI;
    public final CopyOnWriteArrayList<Integer> LJII;
    public final CopyOnWriteArrayList<String> LJIIIIZZ;
    public final C1490220osm LJIIIZ;
    public final List<String> LJIIJ;
    public final AtomicBoolean LJIIJJI;

    public static C1490230osn LIZIZ() {
        if (LJIIL == null) {
            synchronized (C1490230osn.class) {
                try {
                    if (LJIIL == null) {
                        LJIIL = new C1490230osn();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIL;
    }

    public C1490230osn() {
        new AtomicInteger(10000);
        this.LIZ = new AtomicInteger(C538540LAe.LLJJJIL);
        this.LIZIZ = new CopyOnWriteArrayList<>();
        this.LIZJ = new AtomicBoolean(true);
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new AtomicInteger(320);
        this.LJFF = new AtomicInteger(0);
        this.LJI = new AtomicBoolean(false);
        this.LJII = new CopyOnWriteArrayList<>();
        this.LJIIIIZZ = new CopyOnWriteArrayList<>();
        this.LJIIIZ = new C1490220osm();
        this.LJIIJ = new CopyOnWriteArrayList();
        this.LJIIJJI = new AtomicBoolean(false);
    }

    public static boolean LIZ(String str, List<String> list) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LIZJ(String str, List list, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (TextUtils.isEmpty(str) || (jSONArrayOptJSONArray = jSONObject.optJSONArray(str)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                arrayList.add(strOptString);
            }
        }
        list.clear();
        list.addAll(arrayList);
    }
}
