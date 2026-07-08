package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0osE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489880osE implements InterfaceC1489890osF {
    public static volatile C1489880osE LJ;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final Map<String, AbstractC1489970osN> LIZIZ = new ConcurrentHashMap();
    public AbstractC1489970osN LIZJ = new C1489600orm();
    public final ReadWriteLock LIZLLL = new ReentrantReadWriteLock();

    public static C1489880osE LJ() {
        if (LJ == null) {
            synchronized (C1490100osa.class) {
                try {
                    if (LJ == null) {
                        LJ = new C1489880osE();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    @Override // X.InterfaceC1489890osF
    public final Request LIZ(Request request) {
        if (this.LIZ.get() && request != null) {
            return this.LIZJ.LIZ(request);
        }
        return request;
    }

    @Override // X.InterfaceC1489890osF
    public final void LIZJ(Request request) {
        Logger.debug();
        if ((this.LIZ.get() || this.LIZJ.LJII() == EnumC1489930osJ.DEFAULT) && request != null && !TextUtils.isEmpty(request.getPath())) {
            this.LIZJ.LIZJ(request);
        }
    }

    @Override // X.InterfaceC1489890osF
    public final void LIZLLL(Request request) {
        if (this.LIZ.get() && request != null) {
            this.LIZJ.LIZLLL(request);
        }
    }

    public final void LJIIIIZZ(AbstractC1489970osN abstractC1489970osN) {
        ((ReentrantReadWriteLock) this.LIZLLL).writeLock().lock();
        try {
            this.LIZJ.LJI();
            if (abstractC1489970osN == null) {
                abstractC1489970osN = new C1489600orm();
            }
            this.LIZJ = abstractC1489970osN;
            abstractC1489970osN.LJFF();
            Logger.debug();
            ((ReentrantReadWriteLock) this.LIZLLL).writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) this.LIZLLL).writeLock().unlock();
            throw th;
        }
    }

    public static Integer LJFF(String str, Map map) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (String str2 : map.keySet()) {
            if (str.startsWith(str2)) {
                return (Integer) map.get(str2);
            }
        }
        return null;
    }

    public static Set LJI(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray(str)) == null) {
            return copyOnWriteArraySet;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                copyOnWriteArraySet.add(strOptString);
            }
        }
        return copyOnWriteArraySet;
    }

    public static boolean LJII(String str, Set set) {
        if (TextUtils.isEmpty(str) || set == null) {
            return false;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (str.startsWith((String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1489890osF
    public final boolean LIZIZ(Request request, Executor executor, C1494560ozm c1494560ozm) {
        Logger.debug();
        if ((!this.LIZ.get() && this.LIZJ.LJII() != EnumC1489930osJ.DEFAULT) || request == null || TextUtils.isEmpty(request.getPath())) {
            return false;
        }
        return this.LIZJ.LIZIZ(request, executor, c1494560ozm);
    }
}
