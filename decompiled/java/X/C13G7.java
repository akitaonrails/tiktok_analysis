package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13G7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13G7 {
    public static final C13IP LIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.13IP] */
    static {
        final Map mapLJ = C2097608Jq.LJ();
        final Map mapLJ2 = C2097608Jq.LJ();
        final Map mapLJ3 = C2097608Jq.LJ();
        final Map mapLJ4 = C2097608Jq.LJ();
        final Map mapLJ5 = C2097608Jq.LJ();
        LIZ = new AbstractC19984913Hj(mapLJ, mapLJ2, mapLJ3, mapLJ4, mapLJ5) { // from class: X.13IP
            public final Map<C13IQ<?>, C13IR> LIZ;
            public final Map<C13IQ<?>, Map<C13IQ<?>, C13HG<?>>> LIZIZ;
            public final Map<C13IQ<?>, Function1<?, InterfaceC19984413He<?>>> LIZJ;
            public final Map<C13IQ<?>, Map<String, C13HG<?>>> LIZLLL;
            public final Map<C13IQ<?>, Function1<String, InterfaceC19984213Hc<?>>> LJ;
            public final boolean LJFF = false;

            @Override // X.AbstractC19984913Hj
            public final boolean LIZLLL() {
                return this.LJFF;
            }

            @Override // X.AbstractC19984913Hj
            public final void LIZ(C13IU c13iu) {
                for (Map.Entry<C13IQ<?>, C13IR> entry : this.LIZ.entrySet()) {
                    entry.getKey();
                    C13IR value = entry.getValue();
                    if (!(value instanceof C13IS)) {
                        if (value instanceof C13IT) {
                            value.getClass();
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        value.getClass();
                        throw null;
                    }
                }
                for (Map.Entry<C13IQ<?>, Map<C13IQ<?>, C13HG<?>>> entry2 : this.LIZIZ.entrySet()) {
                    entry2.getKey();
                    for (Map.Entry<C13IQ<?>, C13HG<?>> entry3 : entry2.getValue().entrySet()) {
                        c13iu.LIZ(entry3.getKey(), entry3.getValue());
                    }
                }
                for (Map.Entry<C13IQ<?>, Function1<?, InterfaceC19984413He<?>>> entry4 : this.LIZJ.entrySet()) {
                    entry4.getKey();
                    C19719512Dh.LJ(1, entry4.getValue());
                }
                for (Map.Entry<C13IQ<?>, Function1<String, InterfaceC19984213Hc<?>>> entry5 : this.LJ.entrySet()) {
                    entry5.getKey();
                    C19719512Dh.LJ(1, entry5.getValue());
                }
            }

            @Override // X.AbstractC19984913Hj
            public final <T> C13HG<T> LIZIZ(C13IQ<T> c13iq, List<? extends C13HG<?>> list) {
                C13HG<T> c13hgLIZ;
                C13IR c13ir = this.LIZ.get(c13iq);
                if (c13ir != null) {
                    c13hgLIZ = c13ir.LIZ();
                } else {
                    c13hgLIZ = null;
                }
                if (!(c13hgLIZ instanceof C13HG)) {
                    return null;
                }
                return c13hgLIZ;
            }

            @Override // X.AbstractC19984913Hj
            public final InterfaceC19984213Hc LJ(String str, C13IQ c13iq) {
                C13HG<?> c13hg;
                Function1<String, InterfaceC19984213Hc<?>> function1;
                Map<String, C13HG<?>> map = this.LIZLLL.get(c13iq);
                if (map != null) {
                    c13hg = map.get(str);
                } else {
                    c13hg = null;
                }
                if ((c13hg instanceof C13HG) && c13hg != null) {
                    return c13hg;
                }
                Function1<String, InterfaceC19984213Hc<?>> function12 = this.LJ.get(c13iq);
                if (!C19719512Dh.LJFF(1, function12) || (function1 = function12) == null) {
                    return null;
                }
                return function1.invoke(str);
            }

            @Override // X.AbstractC19984913Hj
            public final <T> InterfaceC19984413He<T> LJFF(C13IQ<? super T> c13iq, T t) {
                C13HG<?> c13hg;
                Function1<?, InterfaceC19984413He<?>> function1;
                if (!c13iq.LIZIZ(t)) {
                    return null;
                }
                Map<C13IQ<?>, C13HG<?>> map = this.LIZIZ.get(c13iq);
                if (map != null) {
                    c13hg = map.get(C13LE.LIZ(t.getClass()));
                } else {
                    c13hg = null;
                }
                if ((c13hg instanceof InterfaceC19984413He) && c13hg != null) {
                    return c13hg;
                }
                Function1<?, InterfaceC19984413He<?>> function12 = this.LIZJ.get(c13iq);
                if (!C19719512Dh.LJFF(1, function12) || (function1 = function12) == null) {
                    return null;
                }
                return (InterfaceC19984413He) function1.invoke(t);
            }

            {
                this.LIZ = mapLJ;
                this.LIZIZ = mapLJ2;
                this.LIZJ = mapLJ3;
                this.LIZLLL = mapLJ4;
                this.LJ = mapLJ5;
            }
        };
    }
}
