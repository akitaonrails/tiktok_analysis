package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Bol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216331Bol {
    public final String LIZ;
    public final Map<Class<C0FQ0>, C0FQ0> LIZIZ;
    public final List<C0W11> LIZJ;
    public final Map<String, C2216441Bow> LIZLLL;
    public final Map<Class<?>, Object> LJ;
    public final Function1<String, Unit> LJFF;

    public final C2216441Bow LIZ(String str) {
        C2216441Bow c2216441Bow = (C2216441Bow) ((HashMap) this.LIZLLL).get(str);
        if (c2216441Bow != null) {
            return c2216441Bow;
        }
        Map<Class<Object>, Object> mapLIZ = null;
        for (C0W11 c0w11 : this.LIZJ) {
            if (mapLIZ == null) {
                mapLIZ = c0w11.LIZ(this.LIZ, str);
            }
        }
        if (mapLIZ == null) {
            return null;
        }
        C2216441Bow c2216441Bow2 = new C2216441Bow(this, this.LIZ, str, mapLIZ, this.LIZJ, this.LJ);
        ((HashMap) this.LIZLLL).put(str, c2216441Bow2);
        return c2216441Bow2;
    }

    public C2216331Bol(String str, List list, Map map, C19883712qx c19883712qx, C2216311Boj c2216311Boj) {
        this.LIZLLL = new HashMap();
        this.LIZ = str;
        this.LIZIZ = C2097608Jq.LJ();
        this.LIZJ = list;
        this.LJ = map;
        this.LJFF = c2216311Boj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2216331Bol(String str, Map<Class<C0FQ0>, ? extends C0FQ0> map, List<? extends C0W11> list, Map<Class<?>, Object> map2, C19883712qx<String, Class<?>> c19883712qx, Function1<? super String, Unit> function1) {
        this.LIZLLL = new HashMap();
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = list;
        this.LJ = map2;
        this.LJFF = function1;
    }
}
