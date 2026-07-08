package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882890YkJ {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;
    public final Map<String, Object> LIZJ;
    public C0Z0O LIZLLL;
    public boolean LJ;
    public Throwable LJFF;
    public C882890YkJ LJI;

    public final Map<String, Object> LJ() {
        Map<String, Object> map;
        Map<String, Object> mapLJIIZILJ;
        C0Z0O c0z0o = this.LIZLLL;
        return (c0z0o == null || (map = c0z0o.LJ) == null || (mapLJIIZILJ = C2097608Jq.LJIIZILJ(map)) == null) ? C2097608Jq.LJ() : mapLJIIZILJ;
    }

    public /* synthetic */ C882890YkJ(Map map) {
        this(map, "");
    }

    public final void LIZ(Map<String, ? extends Object> map) {
        C0Z0O c0z0o;
        Map<String, Object> map2;
        if (map != null && (c0z0o = this.LIZLLL) != null && (map2 = c0z0o.LJ) != null) {
            map2.putAll(map);
        }
    }

    public final void LIZIZ(Map<String, ? extends Object> map) {
        if (map != null) {
            this.LIZJ.putAll(map);
        }
    }

    public final Object LIZLLL(String str) {
        Object obj = ((LinkedHashMap) this.LIZJ).get(str);
        if (obj == null) {
            return ((LinkedHashMap) this.LIZIZ).get(str);
        }
        return obj;
    }

    public final void LJFF(Throwable th) {
        this.LJ = false;
        this.LJFF = th;
    }

    public C882890YkJ(Map<String, ? extends Object> map, String str) {
        this.LIZ = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZIZ = linkedHashMap;
        this.LIZJ = new LinkedHashMap();
        this.LJ = true;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
    }

    public final void LIZJ(int i, Function1<? super Integer, ? extends Map<String, ? extends Object>> function1) {
        if (i < 2) {
            Map<String, ? extends Object> mapInvoke = function1.invoke(0);
            if (mapInvoke != null) {
                ((LinkedHashMap) this.LIZJ).clear();
                this.LIZJ.putAll(mapInvoke);
            }
            this.LJI = null;
            return;
        }
        Map<String, ? extends Object> mapInvoke2 = function1.invoke(0);
        if (mapInvoke2 != null) {
            ((LinkedHashMap) this.LIZJ).clear();
            this.LIZJ.putAll(mapInvoke2);
        }
        int i2 = 1;
        int i3 = i - 1;
        if (1 <= i3) {
            C882890YkJ c882890YkJ = this;
            while (true) {
                Map<String, Object> map = this.LIZIZ;
                Map<String, ? extends Object> mapInvoke3 = function1.invoke(Integer.valueOf(i2));
                C882890YkJ c882890YkJ2 = new C882890YkJ(map, c882890YkJ.LIZ);
                C0Z0O c0z0o = c882890YkJ.LIZLLL;
                if (c0z0o != null) {
                    c882890YkJ2.LIZLLL = c0z0o;
                }
                Map<String, Object> map2 = c882890YkJ2.LIZJ;
                if (mapInvoke3 == null) {
                    mapInvoke3 = c882890YkJ.LIZJ;
                }
                map2.putAll(mapInvoke3);
                c882890YkJ.LJI = c882890YkJ2;
                if (i2 != i3) {
                    i2++;
                    c882890YkJ = c882890YkJ2;
                } else {
                    return;
                }
            }
        }
    }
}
