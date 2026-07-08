package X;

import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.o;
import com.google.gson.s;
import com.ss.android.ugc.aweme.user.UserStore;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848290XPn<T> {
    public final Class<? extends T> LIZ;
    public final String LIZIZ;
    public final ArrayList<T> LIZJ;
    public boolean LIZLLL;
    public T LJ;

    public final void LIZ() {
        Iterator<T> it2 = this.LIZJ.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            UserStore.LIZ.getClass();
            SharedPreferences.Editor editor = UserStore.LJ;
            if (next == null) {
                editor.remove(this.LIZIZ);
            } else {
                editor.putString(this.LIZIZ, GsonProtectorUtils.toJson((Gson) UserStore.LIZJ.getValue(), next));
            }
            editor.apply();
        }
        this.LIZJ.clear();
    }

    public final void LIZIZ() {
        UserStore.LIZ.getClass();
        SharedPreferences.Editor editor = UserStore.LJ;
        editor.putString(this.LIZIZ, GsonProtectorUtils.toJson((Gson) UserStore.LIZJ.getValue(), LIZJ()));
        editor.apply();
    }

    public final T LIZJ() {
        JSONObject jSONObject;
        T tLIZLLL;
        if (this.LIZLLL) {
            return this.LJ;
        }
        UserStore.LIZ.getClass();
        String string = UserStore.LIZLLL.getString(this.LIZIZ, "");
        if (string == null || string.length() == 0) {
            tLIZLLL = null;
        } else {
            try {
                C1150504el.LIZ().LIZLLL("method_user_load_gson_duration", false);
                tLIZLLL = LIZLLL(string);
                C1150504el.LIZ().LJI("method_user_load_gson_duration", false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!(e instanceof s) && !(e instanceof o)) {
                    if (!(e instanceof NullPointerException)) {
                        throw e;
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        jSONObject = new JSONObject();
                    }
                    C794240VDq.LIZJ("user_store_load_npe", jSONObject);
                }
                tLIZLLL = null;
            }
        }
        this.LJ = tLIZLLL;
        this.LIZLLL = true;
        return tLIZLLL;
    }

    public final T LIZLLL(String str) {
        boolean z;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            UserStore.LIZ.getClass();
            Gson gson = (Gson) UserStore.LIZJ.getValue();
            Class<? extends T> cls = this.LIZ;
            if (str.length() != 0) {
                z2 = false;
            }
            if (z2) {
                return null;
            }
            return (T) GsonProtectorUtils.fromJson(C2333909Cn.LIZ(gson), str, (Type) cls);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            UserStore.LIZ.getClass();
            return (T) GsonProtectorUtils.fromJson((Gson) UserStore.LIZJ.getValue(), str, (Type) this.LIZ);
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            UserStore.LIZ.getClass();
            return (T) GsonProtectorUtils.fromJson((Gson) UserStore.LIZJ.getValue(), str, (Type) this.LIZ);
        } catch (NoClassDefFoundError e3) {
            TryCatchGuardChecker.doCheck(e3);
            UserStore.LIZ.getClass();
            return (T) GsonProtectorUtils.fromJson((Gson) UserStore.LIZJ.getValue(), str, (Type) this.LIZ);
        }
    }

    public final void LJ(T t) {
        if (this.LJ != t) {
            this.LJ = t;
            this.LIZJ.clear();
            this.LIZJ.add(t);
            this.LIZLLL = true;
        }
    }

    public C848290XPn(String str, String str2, T t) {
        this.LIZ = (Class<? extends T>) t.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ = new ArrayList<>(1);
    }
}
