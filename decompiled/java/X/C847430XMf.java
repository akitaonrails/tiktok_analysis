package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0XMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847430XMf {
    public final Collection<String> LIZ;
    public final Collection<String> LIZIZ;
    public final Collection<String> LIZJ;
    public final Collection<String> LIZLLL;
    public final boolean LJ;

    public static HashSet<String> LIZ(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            HashSet<String> hashSet = new HashSet<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    hashSet.add(strOptString);
                }
            }
            return hashSet;
        }
        return null;
    }

    public static HashSet<String> LIZIZ(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            HashSet<String> hashSet = new HashSet<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    if (!strOptString.endsWith("/")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strOptString);
                        sbLIZ.append("/");
                        strOptString = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    hashSet.add(strOptString);
                }
            }
            return hashSet;
        }
        return null;
    }

    public final void LIZJ(HashSet<String> hashSet) {
        this.LIZIZ.clear();
        if (hashSet == null) {
            this.LIZIZ.addAll(this.LIZLLL);
        } else {
            this.LIZIZ.addAll(hashSet);
        }
        if (this.LJ) {
            synchronized (this) {
                try {
                    this.LIZJ.clear();
                    this.LIZJ.addAll(this.LIZ);
                    this.LIZJ.addAll(this.LIZIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        this.LIZJ.clear();
        this.LIZJ.addAll(this.LIZ);
        this.LIZJ.addAll(this.LIZIZ);
    }

    public final void LIZLLL(JSONArray jSONArray) {
        if (this.LJ) {
            synchronized (this) {
                try {
                    LIZJ(LIZ(jSONArray));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        LIZJ(LIZ(jSONArray));
    }

    public final void LJ(JSONArray jSONArray) {
        if (this.LJ) {
            synchronized (this) {
                try {
                    LIZJ(LIZIZ(jSONArray));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        LIZJ(LIZIZ(jSONArray));
    }

    public C847430XMf(Collection<String> collection, boolean z) {
        this.LJ = z;
        collection = collection == null ? new HashSet<>() : collection;
        this.LIZLLL = collection;
        if (z) {
            this.LIZ = new HashSet();
            this.LIZIZ = new HashSet();
            this.LIZJ = new HashSet();
        } else {
            this.LIZ = new CopyOnWriteArraySet();
            this.LIZIZ = new CopyOnWriteArraySet();
            this.LIZJ = new CopyOnWriteArraySet();
        }
        if (!collection.isEmpty()) {
            this.LIZIZ.addAll(collection);
            this.LIZJ.addAll(this.LIZIZ);
        }
    }
}
