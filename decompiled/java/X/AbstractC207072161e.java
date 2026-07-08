package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.161e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC207072161e {
    public final String LIZ;
    public final Map<String, C2805016t> LIZIZ = C2097608Jq.LJ();
    public final boolean LIZJ = true;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2785015z());
    public final C01GW LJ = C452501pT.LIZIZ(new C0W63(this));
    public final Set<String> LJFF = new LinkedHashSet();
    public final List<InterfaceC207082161o> LJI = C1697810uHb.LJIIJJI(new InterfaceC207082161o() { // from class: X.161j
    }, new InterfaceC207082161o() { // from class: X.161i
    }, new InterfaceC207082161o() { // from class: X.161l
    }, new InterfaceC207082161o() { // from class: X.161k
    });

    public AbstractC207072161e LJII(InterfaceC1282004zy interfaceC1282004zy) {
        return this;
    }

    public final CopyOnWriteArraySet<InterfaceC1282004zy> LIZ() {
        return (CopyOnWriteArraySet) this.LJ.getValue();
    }

    public Map<String, String> LIZLLL() {
        HashMap map = new HashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZLLL.getValue()).entrySet()) {
            Object key = entry.getKey();
            C207073161f c207073161f = (C207073161f) entry.getValue();
            c207073161f.getClass();
            map.put(key, Intrinsics.LJFF(c207073161f, C207073161f.LIZIZ) ? null : c207073161f.LIZ);
        }
        return map;
    }

    public final void LJIIIIZZ() {
        C20684815ws.LJIILLIIL(this.LIZ, LIZLLL());
    }

    public final void LJIIIZ() {
        Object obj;
        String str = this.LIZ;
        HashMap map = new HashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZLLL.getValue()).entrySet()) {
            C207073161f c207073161f = (C207073161f) entry.getValue();
            c207073161f.getClass();
            if (!Intrinsics.LJFF(c207073161f, C207073161f.LIZIZ) && (obj = c207073161f.LIZ) != null) {
                map.put(entry.getKey(), obj);
            }
        }
        C20684815ws.LJIILLIIL(str, map);
    }

    public Map<String, C2805016t> LIZJ() {
        return this.LIZIZ;
    }

    public AbstractC207072161e(String str) {
        this.LIZ = str;
    }

    public static C13IQ LIZIZ(C19719912Dl c19719912Dl) {
        if (C2213981Bky.LIZIZ.isOffline()) {
            return c19719912Dl;
        }
        return null;
    }

    public static C013M LJ(String str, String str2) {
        final List<String> list;
        final String str3;
        final String str4;
        if (C2213981Bky.LIZIZ.isOffline() && str != null && !Intrinsics.LJFF(str, "{}")) {
            try {
                C207074161g c207074161g = (C207074161g) C7740030o.LIZ().getGson().LJII(str, C207074161g.class);
                if (c207074161g == null) {
                    return null;
                }
                if (Intrinsics.LJFF(str2, "range") && (str3 = c207074161g.LIZIZ) != null && (str4 = c207074161g.LIZJ) != null) {
                    return new C013M(str3, str4) { // from class: X.161m
                        public final Object LIZ;
                        public final Object LIZIZ;

                        {
                            this.LIZ = str3;
                            this.LIZIZ = str4;
                        }
                    };
                }
                if (Intrinsics.LJFF(str2, "enum") && (list = c207074161g.LIZ) != null) {
                    return new C013M(list) { // from class: X.161h
                        public final List<Object> LIZ;

                        {
                            this.LIZ = list;
                        }
                    };
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return null;
    }

    public void LJI(Object obj, String str) {
        String string;
        C207073161f c207073161f;
        if (C2213981Bky.LIZIZ.isOffline() && ((ConcurrentHashMap) this.LIZLLL.getValue()).containsKey(str)) {
            this.LJFF.add(str);
        }
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        if (this.LIZJ) {
            if (string != null) {
                ((ConcurrentHashMap) this.LIZLLL.getValue()).put(str, new C207073161f(string));
            }
        } else {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZLLL.getValue();
            if (string == null) {
                c207073161f = C207073161f.LIZIZ;
            } else {
                c207073161f = new C207073161f(string);
            }
            concurrentHashMap.put(str, c207073161f);
        }
    }
}
