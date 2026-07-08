package X;

import X.C1489850osB;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0orx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1489710orx<T extends C1489850osB> {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final List<Pair<C1489730orz, T>> LIZIZ = new CopyOnWriteArrayList();
    public T LIZJ;

    public abstract String LIZ();

    public abstract T LIZJ(Object obj);

    public static Set LIZLLL(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    hashSet.add(strOptString);
                }
            }
            return hashSet;
        }
        return null;
    }

    public final T LIZIZ(String str) {
        Uri uri;
        C1489730orz c1489730orz;
        if (TextUtils.isEmpty(str) || !this.LIZ.get() || (uri = UriProtector.parse(str)) == null) {
            return null;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(path)) {
            loop0: for (Pair pair : (CopyOnWriteArrayList) this.LIZIZ) {
                if (pair != null && (c1489730orz = (C1489730orz) pair.first) != null) {
                    Set<String> set = c1489730orz.LIZ;
                    boolean z = false;
                    if (set != null && ((HashSet) set).contains(host)) {
                        Logger.debug();
                    } else {
                        boolean z2 = false;
                        Set<String> set2 = c1489730orz.LIZIZ;
                        if (set2 == null) {
                            break;
                        }
                        Iterator it2 = ((HashSet) set2).iterator();
                        while (it2.hasNext()) {
                            if (C2088908Gh.LIZIZ(host, (String) it2.next())) {
                                Logger.debug();
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    Set<String> set3 = c1489730orz.LIZJ;
                    if (set3 != null && ((HashSet) set3).contains(path)) {
                        Logger.debug();
                    } else {
                        Set<String> set4 = c1489730orz.LIZLLL;
                        if (set4 != null) {
                            Iterator it3 = ((HashSet) set4).iterator();
                            while (it3.hasNext()) {
                                if (path.startsWith((String) it3.next())) {
                                    Logger.debug();
                                    break loop0;
                                }
                            }
                        }
                        Set<String> set5 = c1489730orz.LJ;
                        if (set5 != null) {
                            Iterator it4 = ((HashSet) set5).iterator();
                            while (it4.hasNext()) {
                                if (path.contains((String) it4.next())) {
                                    Logger.debug();
                                    break loop0;
                                }
                            }
                        }
                        Set<Pattern> set6 = c1489730orz.LJFF;
                        if (set6 != null) {
                            Iterator it5 = ((HashSet) set6).iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    Pattern pattern = (Pattern) it5.next();
                                    if (pattern != null) {
                                        try {
                                            if (pattern.matcher(path).matches()) {
                                                try {
                                                    Logger.debug();
                                                    break loop0;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    z = true;
                                                    TryCatchGuardChecker.doCheck(th);
                                                }
                                            } else {
                                                continue;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                } else if (!z) {
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    return (T) pair.second;
                }
            }
            Logger.debug();
            return this.LIZJ;
        }
        return null;
    }

    public final boolean LJ(JSONObject jSONObject) {
        boolean z;
        Set<String> set;
        Set<String> set2;
        Set<String> set3;
        Set<Pattern> set4;
        this.LIZ.set(false);
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
        if (jSONObject.length() == 0) {
            return false;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(LIZ());
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) {
            return true;
        }
        AtomicBoolean atomicBoolean = this.LIZ;
        if (jSONObjectOptJSONObject.optInt("enabled", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        atomicBoolean.set(z);
        if (!this.LIZ.get()) {
            return true;
        }
        Object objOpt = jSONObjectOptJSONObject.opt("default");
        if (objOpt != null) {
            this.LIZJ = (T) LIZJ(objOpt);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("rule_list");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() != 0) {
                C1489730orz c1489730orz = new C1489730orz();
                c1489730orz.LIZ = LIZLLL(jSONObjectOptJSONObject2.optJSONArray("host_eq"));
                c1489730orz.LIZIZ = LIZLLL(jSONObjectOptJSONObject2.optJSONArray("host_wc"));
                Set<String> set5 = c1489730orz.LIZ;
                if ((set5 == null || ((HashSet) set5).isEmpty()) && ((set = c1489730orz.LIZIZ) == null || ((HashSet) set).isEmpty())) {
                    Logger.debug();
                } else {
                    c1489730orz.LIZJ = LIZLLL(jSONObjectOptJSONObject2.optJSONArray("path_eq"));
                    c1489730orz.LIZLLL = LIZLLL(jSONObjectOptJSONObject2.optJSONArray("path_prefix"));
                    c1489730orz.LJ = LIZLLL(jSONObjectOptJSONObject2.optJSONArray("path_contain"));
                    Set setLIZLLL = LIZLLL(jSONObjectOptJSONObject2.optJSONArray("path_pattern"));
                    if (setLIZLLL != null) {
                        c1489730orz.LJFF = new HashSet();
                        Iterator it2 = ((HashSet) setLIZLLL).iterator();
                        while (it2.hasNext()) {
                            try {
                                ((HashSet) c1489730orz.LJFF).add(PatternProtector.compile((String) it2.next()));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                    Set<String> set6 = c1489730orz.LIZJ;
                    if ((set6 == null || ((HashSet) set6).isEmpty()) && (((set2 = c1489730orz.LIZLLL) == null || ((HashSet) set2).isEmpty()) && (((set3 = c1489730orz.LJ) == null || ((HashSet) set3).isEmpty()) && ((set4 = c1489730orz.LJFF) == null || ((HashSet) set4).isEmpty())))) {
                        Logger.debug();
                    } else {
                        Object objOpt2 = jSONObjectOptJSONObject2.opt("value");
                        if (objOpt2 == null) {
                            Logger.debug();
                        } else {
                            C1489850osB c1489850osBLIZJ = LIZJ(objOpt2);
                            if (c1489850osBLIZJ == null) {
                                Logger.debug();
                            } else {
                                TextUtils.isEmpty(jSONObjectOptJSONObject2.optString("sign"));
                                ((CopyOnWriteArrayList) this.LIZIZ).add(new Pair(c1489730orz, c1489850osBLIZJ));
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
