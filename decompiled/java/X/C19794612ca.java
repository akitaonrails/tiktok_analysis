package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.12ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19794612ca {
    public final TreeMap<Integer, C19795612ck> LIZ = new TreeMap<>();
    public final TreeMap<Integer, C19795612ck> LIZIZ = new TreeMap<>();

    public final void LIZ(C19795712cl c19795712cl, final C19780912aN c19780912aN) {
        int iLJIIIIZZ;
        C19796012co c19796012co = new C19796012co(c19780912aN) { // from class: X.12cX
            public final C19780912aN LLILLJJLI;

            {
                this.LLILLJJLI = c19780912aN;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.C19796012co, X.InterfaceC19797112cz
            public final InterfaceC19797112cz LJIIJ(String str, C19795712cl c19795712cl2, List<InterfaceC19797112cz> list) {
                Object obj;
                switch (str.hashCode()) {
                    case 21624207:
                        if (str.equals("getEventName")) {
                            C19796312cr.LJ(0, "getEventName", list);
                            return new C19797512d3(this.LLILLJJLI.LIZIZ.LIZ);
                        }
                        break;
                    case 45521504:
                        if (str.equals("getTimestamp")) {
                            C19796312cr.LJ(0, "getTimestamp", list);
                            return new C19816212g4(Double.valueOf(this.LLILLJJLI.LIZIZ.LIZIZ));
                        }
                        break;
                    case 146575578:
                        if (str.equals("getParamValue")) {
                            C19796312cr.LJ(1, "getParamValue", list);
                            String strLJFF = c19795712cl2.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                            C19795812cm c19795812cm = this.LLILLJJLI.LIZIZ;
                            if (((HashMap) c19795812cm.LIZJ).containsKey(strLJFF)) {
                                obj = ((HashMap) c19795812cm.LIZJ).get(strLJFF);
                            } else {
                                obj = null;
                            }
                            return C19793712cR.LIZIZ(obj);
                        }
                        break;
                    case 700587132:
                        if (str.equals("getParams")) {
                            C19796312cr.LJ(0, "getParams", list);
                            Map<String, Object> map = this.LLILLJJLI.LIZIZ.LIZJ;
                            C19796012co c19796012co2 = new C19796012co();
                            HashMap map2 = (HashMap) map;
                            for (String str2 : map2.keySet()) {
                                c19796012co2.LJIIJJI(str2, C19793712cR.LIZIZ(map2.get(str2)));
                            }
                            return c19796012co2;
                        }
                        break;
                    case 920706790:
                        if (str.equals("setParamValue")) {
                            C19796312cr.LJ(2, "setParamValue", list);
                            String strLJFF2 = c19795712cl2.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                            InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712cl2.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                            C19795812cm c19795812cm2 = this.LLILLJJLI.LIZIZ;
                            Object objLIZJ = C19796312cr.LIZJ(interfaceC19797112czLIZIZ);
                            if (objLIZJ == null) {
                                ((HashMap) c19795812cm2.LIZJ).remove(strLJFF2);
                                return interfaceC19797112czLIZIZ;
                            }
                            ((HashMap) c19795812cm2.LIZJ).put(strLJFF2, C19795812cm.LIZ(((HashMap) c19795812cm2.LIZJ).get(strLJFF2), strLJFF2, objLIZJ));
                            return interfaceC19797112czLIZIZ;
                        }
                        break;
                    case 1570616835:
                        if (str.equals("setEventName")) {
                            C19796312cr.LJ(1, "setEventName", list);
                            InterfaceC19797112cz interfaceC19797112czLIZIZ2 = c19795712cl2.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                            if (!InterfaceC19797112cz.LJIILIIL.equals(interfaceC19797112czLIZIZ2) && !InterfaceC19797112cz.LJIILJJIL.equals(interfaceC19797112czLIZIZ2)) {
                                this.LLILLJJLI.LIZIZ.LIZ = interfaceC19797112czLIZIZ2.LJFF();
                                return new C19797512d3(interfaceC19797112czLIZIZ2.LJFF());
                            }
                            throw new IllegalArgumentException("Illegal event name");
                        }
                        break;
                }
                return super.LJIIJ(str, c19795712cl2, list);
            }
        };
        for (Integer num : this.LIZ.keySet()) {
            C19795812cm c19795812cm = (C19795812cm) c19780912aN.LIZIZ.clone();
            InterfaceC19797112cz interfaceC19797112czLIZ = this.LIZ.get(num).LIZ(c19795712cl, Collections.singletonList(c19796012co));
            if (!(interfaceC19797112czLIZ instanceof C19816212g4) || (iLJIIIIZZ = C19796312cr.LJIIIIZZ(interfaceC19797112czLIZ.LJ().doubleValue())) == 2 || iLJIIIIZZ == -1) {
                c19780912aN.LIZIZ = c19795812cm;
            }
        }
        Iterator<Integer> it2 = this.LIZIZ.keySet().iterator();
        while (it2.hasNext()) {
            InterfaceC19797112cz interfaceC19797112czLIZ2 = this.LIZIZ.get(it2.next()).LIZ(c19795712cl, Collections.singletonList(c19796012co));
            if (interfaceC19797112czLIZ2 instanceof C19816212g4) {
                C19796312cr.LJIIIIZZ(interfaceC19797112czLIZ2.LJ().doubleValue());
            }
        }
    }
}
