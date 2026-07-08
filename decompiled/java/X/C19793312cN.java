package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.12cN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19793312cN {
    public final C19793812cS LIZ;
    public C19795712cl LIZIZ;
    public final C19780912aN LIZJ;
    public final C19794612ca LIZLLL;

    public C19793312cN() {
        C19793812cS c19793812cS = new C19793812cS();
        this.LIZ = c19793812cS;
        this.LIZIZ = c19793812cS.LIZIZ.LIZLLL();
        this.LIZJ = new C19780912aN();
        this.LIZLLL = new C19794612ca();
        ((HashMap) c19793812cS.LIZLLL.LIZ).put("internal.registerCallback", new Callable() { // from class: X.12cO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("zza@f55.call");
                C19793312cN c19793312cN = this.LL;
                c19793312cN.getClass();
                final C19794612ca c19794612ca = c19793312cN.LIZLLL;
                AbstractC19795912cn abstractC19795912cn = new AbstractC19795912cn(c19794612ca) { // from class: X.12cj
                    public final C19794612ca LLILLL;

                    {
                        super("internal.registerCallback");
                        this.LLILLL = c19794612ca;
                    }

                    @Override // X.AbstractC19795912cn
                    public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                        int iIntValue;
                        TreeMap treeMap;
                        C19796312cr.LJ(3, this.LL, list);
                        c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                        InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                        if (interfaceC19797112czLIZIZ instanceof C19795612ck) {
                            InterfaceC19797112cz interfaceC19797112czLIZIZ2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 2));
                            if (interfaceC19797112czLIZIZ2 instanceof C19796012co) {
                                C19796012co c19796012co = (C19796012co) interfaceC19797112czLIZIZ2;
                                if (c19796012co.LJIIIZ("type")) {
                                    String strLJFF = c19796012co.LJIIIIZZ("type").LJFF();
                                    if (c19796012co.LJIIIZ("priority")) {
                                        iIntValue = C19796312cr.LJIIIIZZ(c19796012co.LJIIIIZZ("priority").LJ().doubleValue());
                                    } else {
                                        iIntValue = LSPassThroughRecordSizeConfig.DEFAULT;
                                    }
                                    C19794612ca c19794612ca2 = this.LLILLL;
                                    c19794612ca2.getClass();
                                    if ("create".equals(strLJFF)) {
                                        treeMap = c19794612ca2.LIZIZ;
                                    } else if ("edit".equals(strLJFF)) {
                                        treeMap = c19794612ca2.LIZ;
                                    } else {
                                        throw new IllegalStateException("Unknown callback type: " + strLJFF);
                                    }
                                    if (treeMap.containsKey(Integer.valueOf(iIntValue))) {
                                        iIntValue = ((Integer) treeMap.lastKey()).intValue() + 1;
                                    }
                                    treeMap.put(Integer.valueOf(iIntValue), interfaceC19797112czLIZIZ);
                                    return InterfaceC19797112cz.LJIILIIL;
                                }
                                throw new IllegalArgumentException("Undefined rule type");
                            }
                            throw new IllegalArgumentException("Invalid callback params");
                        }
                        throw new IllegalArgumentException("Invalid callback type");
                    }
                };
                C1C7U.LIZIZ("zza@f55.call");
                return abstractC19795912cn;
            }
        });
        ((HashMap) c19793812cS.LIZLLL.LIZ).put("internal.eventLogger", new Callable() { // from class: X.12cP
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("zzd@f52.call");
                final C19780912aN c19780912aN = this.LL.LIZJ;
                AbstractC19795912cn abstractC19795912cn = new AbstractC19795912cn(c19780912aN) { // from class: X.12cW
                    public final C19780912aN LLILLL;

                    {
                        super("internal.eventLogger");
                        this.LLILLL = c19780912aN;
                    }

                    @Override // X.AbstractC19795912cn
                    public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                        Map map;
                        Object obj;
                        C19796312cr.LJ(3, this.LL, list);
                        String strLJFF = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                        long jLIZ = (long) C19796312cr.LIZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue());
                        InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 2));
                        if (interfaceC19797112czLIZIZ instanceof C19796012co) {
                            map = C19796312cr.LIZLLL((C19796012co) interfaceC19797112czLIZIZ);
                        } else {
                            map = new HashMap();
                        }
                        C19780912aN c19780912aN2 = this.LLILLL;
                        c19780912aN2.getClass();
                        HashMap map2 = new HashMap();
                        for (String str : map.keySet()) {
                            C19795812cm c19795812cm = c19780912aN2.LIZ;
                            if (((HashMap) c19795812cm.LIZJ).containsKey(str)) {
                                obj = ((HashMap) c19795812cm.LIZJ).get(str);
                            } else {
                                obj = null;
                            }
                            map2.put(str, C19795812cm.LIZ(obj, str, map.get(str)));
                        }
                        ((ArrayList) c19780912aN2.LIZJ).add(new C19795812cm(jLIZ, strLJFF, map2));
                        return InterfaceC19797112cz.LJIILIIL;
                    }
                };
                C1C7U.LIZIZ("zzd@f52.call");
                return abstractC19795912cn;
            }
        });
    }

    public final void LIZ(C19792112cB c19792112cB) {
        try {
            C19795712cl c19795712clLIZLLL = this.LIZ.LIZIZ.LIZLLL();
            this.LIZIZ = c19795712clLIZLLL;
            if (!(this.LIZ.LIZ(c19795712clLIZLLL, (C19792712cH[]) c19792112cB.zzf.toArray(new C19792712cH[0])) instanceof C19797212d0)) {
                for (C19792212cC c19792212cC : c19792112cB.LJJI().zze) {
                    InterfaceC19875012pY<C19792712cH> interfaceC19875012pY = c19792212cC.zzg;
                    String str = c19792212cC.zzf;
                    Iterator<C19792712cH> it2 = interfaceC19875012pY.iterator();
                    while (it2.hasNext()) {
                        InterfaceC19797112cz interfaceC19797112czLIZ = this.LIZ.LIZ(this.LIZIZ, it2.next());
                        if (interfaceC19797112czLIZ instanceof C19796012co) {
                            C19795712cl c19795712cl = this.LIZIZ;
                            if (c19795712cl.LJFF(str)) {
                                InterfaceC19797112cz interfaceC19797112czLIZJ = c19795712cl.LIZJ(str);
                                if (interfaceC19797112czLIZJ instanceof AbstractC19795912cn) {
                                    AbstractC19795912cn abstractC19795912cn = (AbstractC19795912cn) interfaceC19797112czLIZJ;
                                    if (abstractC19795912cn != null) {
                                        abstractC19795912cn.LIZ(this.LIZIZ, Collections.singletonList(interfaceC19797112czLIZ));
                                    }
                                } else {
                                    throw new IllegalStateException("Invalid function name: " + str);
                                }
                            }
                            throw new IllegalStateException("Rule function is undefined: " + str);
                        }
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new C19793612cQ(th);
        }
    }

    public final boolean LIZIZ(C19795812cm c19795812cm) throws C19793612cQ {
        try {
            C19780912aN c19780912aN = this.LIZJ;
            c19780912aN.LIZ = c19795812cm;
            c19780912aN.LIZIZ = (C19795812cm) c19795812cm.clone();
            ((ArrayList) c19780912aN.LIZJ).clear();
            this.LIZ.LIZJ.LJI("runtime.counter", new C19816212g4(Double.valueOf(0.0d)));
            this.LIZLLL.LIZ(this.LIZIZ.LIZLLL(), this.LIZJ);
            C19780912aN c19780912aN2 = this.LIZJ;
            if (!(!c19780912aN2.LIZIZ.equals(c19780912aN2.LIZ))) {
                if (!(!((ArrayList) this.LIZJ.LIZJ).isEmpty())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new C19793612cQ(th);
        }
    }
}
