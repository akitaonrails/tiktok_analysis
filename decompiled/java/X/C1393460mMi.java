package X;

import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393460mMi {
    public static final C1393480mMk LJ = new Comparator<C1393470mMj>() { // from class: X.0mMk
        @Override // java.util.Comparator
        public final int compare(C1393470mMj c1393470mMj, C1393470mMj c1393470mMj2) {
            long j = c1393470mMj.LIZIZ;
            long j2 = c1393470mMj2.LIZIZ;
            if (j == j2) {
                return 0;
            }
            if (j > j2) {
                return -1;
            }
            return 1;
        }
    };
    public static final C1393490mMl LJFF = new C0J6I<C1393460mMi>() { // from class: X.0mMl
        @Override // X.C0J6I
        public final C1393460mMi LIZ() {
            return new C1393460mMi();
        }
    };
    public final SharedPreferences LIZ;
    public final List<C1393470mMj> LIZIZ;
    public final long LIZJ;
    public long LIZLLL;

    public final void LIZLLL() {
        JSONArray jSONArray = new JSONArray();
        for (C1393470mMj c1393470mMj : (ArrayList) this.LIZIZ) {
            c1393470mMj.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", c1393470mMj.LIZ);
                jSONObject.put("time", c1393470mMj.LIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            jSONArray.put(jSONObject);
        }
        this.LIZ.edit().putString("push_list", jSONArray.toString()).apply();
    }

    public C1393460mMi() {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        this.LIZJ = 604800000L;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C460020I2e.LIZ, 0, "app_push_info");
        this.LIZ = sharedPreferencesLIZJ;
        String string = sharedPreferencesLIZJ.getString("push_list", "[]");
        arrayList.clear();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        C1393470mMj c1393470mMjLIZ = C1393470mMj.LIZ(jSONObjectOptJSONObject);
                        if (!this.LIZIZ.contains(c1393470mMjLIZ)) {
                            this.LIZIZ.add(c1393470mMjLIZ);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final boolean LIZIZ() {
        C1393470mMj c1393470mMj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (jCurrentTimeMillis - this.LIZLLL <= Mp4ScreenVideoLoadTimeout.CONTROL) {
            return false;
        }
        this.LIZLLL = jCurrentTimeMillis;
        Collections.sort(this.LIZIZ, LJ);
        int size = ((ArrayList) this.LIZIZ).size() - 1;
        while (size >= 0) {
            do {
                c1393470mMj = (C1393470mMj) ListProtector.get(this.LIZIZ, size);
            } while (c1393470mMj == null);
            if (jCurrentTimeMillis <= this.LIZJ + c1393470mMj.LIZIZ) {
                break;
            }
            ListProtector.remove(this.LIZIZ, size);
            size--;
            z = true;
        }
        if (z) {
            LIZLLL();
        }
        return z;
    }

    public final void LIZ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!C2093608Ic.LJ(str)) {
            C1393470mMj c1393470mMj = new C1393470mMj();
            c1393470mMj.LIZIZ = jCurrentTimeMillis;
            c1393470mMj.LIZ = str;
            synchronized (this) {
                try {
                    if (!((ArrayList) this.LIZIZ).contains(c1393470mMj)) {
                        ((ArrayList) this.LIZIZ).add(c1393470mMj);
                    }
                    if (!LIZIZ()) {
                        LIZLLL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LIZJ(String str, List list) {
        if (list == null) {
            return;
        }
        synchronized (this) {
            try {
                LIZIZ();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Aweme aweme = (Aweme) it2.next();
                    if (aweme != null && !C2093608Ic.LIZJ(str, aweme.getAid())) {
                        for (C1393470mMj c1393470mMj : (ArrayList) this.LIZIZ) {
                            if (c1393470mMj != null && C2093608Ic.LIZJ(c1393470mMj.LIZ, aweme.getAid())) {
                                it2.remove();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
