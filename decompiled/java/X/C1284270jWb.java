package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284270jWb implements InterfaceC1284280jWc {
    public final Object LIZ = new Object();
    public final Object LIZIZ = new Object();
    public final LinkedList<Pair<String, JSONObject>> LIZJ = new LinkedList<>();
    public final LinkedList<Pair<String, Map<String, Object>>> LIZLLL = new LinkedList<>();

    public final JSONObject LIZ(String str) {
        try {
            synchronized (this.LIZ) {
                try {
                    if (!TextUtils.isEmpty(str) && !this.LIZJ.isEmpty()) {
                        for (int size = this.LIZJ.size() - 1; size >= 0; size--) {
                            Pair<String, JSONObject> pair = this.LIZJ.get(size);
                            if (TextUtils.equals(str, (CharSequence) pair.first)) {
                                return (JSONObject) pair.second;
                            }
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1475000oUE.LIZIZ() != null && C1475000oUE.LIZIZ().isDebug()) {
                throw new RuntimeException(e);
            }
            return null;
        }
    }

    public final void LIZIZ(String str, Map map) {
        try {
            synchronized (this.LIZIZ) {
                try {
                    if (!TextUtils.isEmpty(str) && map != null) {
                        if (this.LIZLLL.size() > 5) {
                            this.LIZLLL.remove(0);
                        }
                        this.LIZLLL.add(new Pair<>(str, map));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1475000oUE.LIZIZ() != null && C1475000oUE.LIZIZ().isDebug()) {
                throw new RuntimeException(e);
            }
        }
    }
}
