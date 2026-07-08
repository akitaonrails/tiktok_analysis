package X;

import com.bytedance.creationmodel.framework.ScopeKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1Bok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216321Bok {
    public static final C2216321Bok LIZ = new C2216321Bok();
    public static final Map<String, C2216331Bol> LIZIZ = new HashMap();
    public static final ArrayList<C0W11> LIZJ = new ArrayList<>();
    public static final C19883712qx<String, Class<?>> LIZLLL = new C19883712qx<>();
    public static final Map<Class<?>, Object> LJ = new HashMap();

    public final C2216441Bow LIZ(ScopeKey scopeKey) {
        C2216331Bol c2216331Bol;
        String str = scopeKey.sessionId;
        HashMap map = (HashMap) LIZIZ;
        if (map.containsKey(str)) {
            c2216331Bol = (C2216331Bol) map.get(str);
        } else {
            c2216331Bol = new C2216331Bol(str, C13LP.LLIIII(LIZJ), C2097608Jq.LJIIZILJ(LJ), LIZLLL, new C2216311Boj(this));
            map.put(str, c2216331Bol);
        }
        return c2216331Bol.LIZ(scopeKey.scopeId);
    }
}
