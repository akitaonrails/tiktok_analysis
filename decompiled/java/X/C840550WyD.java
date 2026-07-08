package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0WyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840550WyD implements InterfaceC840590WyH {
    public static final C840550WyD LIZ;
    public static final LruCache<String, Set<String>> LIZIZ;
    public static Map<String, Set<String>> LIZJ;

    static {
        C840550WyD c840550WyD = new C840550WyD();
        LIZ = c840550WyD;
        LIZIZ = new LruCache<>(100);
        LIZJ = new LinkedHashMap();
        ((ArrayList) C840560WyE.LIZIZ).add(c840550WyD);
    }

    public static void LIZIZ(n nVar) {
        Object c098200Yq;
        if (nVar == null) {
            c098200Yq = null;
        } else {
            try {
                LIZJ = (Map) new Gson().LIZLLL(nVar, new TypeToken<Map<String, Set<? extends String>>>() { // from class: X.0WyC
                }.getType());
                c098200Yq = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // X.InterfaceC840590WyH
    public final void LIZ(String str, C840600WyI c840600WyI) {
        Set<String> setLJIIIZ = LIZJ.get(str);
        if (setLJIIIZ != null) {
            LruCache<String, Set<String>> lruCache = LIZIZ;
            Set<String> set = lruCache.get(c840600WyI.LIZIZ);
            if (set != null) {
                setLJIIIZ = C15442062u.LJIIIZ(set, setLJIIIZ);
            }
            lruCache.put(c840600WyI.LIZIZ, setLJIIIZ);
        }
    }
}
