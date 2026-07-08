package X;

import defpackage.Config;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS82S0210000_31;

/* JADX INFO: renamed from: X.150B, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C150B {
    public final Set<String> LIZ = new LinkedHashSet();
    public final Map<String, Long> LIZIZ = new LinkedHashMap();
    public final Set<String> LIZJ = new LinkedHashSet();
    public final Map<String, C150D> LIZLLL = new LinkedHashMap();
    public final Map<String, Map<String, String>> LJ = new LinkedHashMap();

    public final <T extends C150D> void LIZIZ(InterfaceC1631620sYq<? super Long, ? super T, ? super Map<String, String>, Unit> interfaceC1631620sYq) {
        for (String str : this.LIZ) {
            if (!this.LIZJ.contains(str)) {
                this.LIZJ.add(str);
                Object obj = ((LinkedHashMap) this.LIZIZ).get(str);
                Config.a aVar = (Object) ((LinkedHashMap) this.LIZLLL).get(str);
                if (!(aVar instanceof C150D)) {
                    aVar = null;
                }
                interfaceC1631620sYq.invoke(obj, aVar, ((LinkedHashMap) this.LJ).get(str));
                this.LIZIZ.remove(str);
                this.LIZLLL.remove(str);
                this.LJ.remove(str);
            }
        }
    }

    public void LIZ(String str, AwS82S0210000_31 awS82S0210000_31) {
        if (str != null && str.length() != 0 && !this.LIZJ.contains(str)) {
            this.LIZJ.add(str);
            awS82S0210000_31.invoke(((LinkedHashMap) this.LIZIZ).get(str));
            this.LIZIZ.remove(str);
            this.LIZLLL.remove(str);
            this.LJ.remove(str);
        }
    }

    public final <T extends C150D> void LIZJ(String str, T t, Map<String, String> map, Function0<Unit> function0) {
        if (str != null && str.length() != 0 && !this.LIZ.contains(str)) {
            this.LIZ.add(str);
            this.LIZIZ.put(str, Long.valueOf(System.currentTimeMillis()));
            if (t != null) {
                this.LIZLLL.put(str, t);
            }
            this.LJ.put(str, map);
            function0.invoke();
        }
    }
}
