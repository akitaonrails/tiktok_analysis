package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.12cS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19793812cS {
    public final C19797812d6 LIZ;
    public final C19795712cl LIZIZ;
    public final C19795712cl LIZJ;
    public final C19795112cf LIZLLL;

    public C19793812cS() {
        C19797812d6 c19797812d6 = new C19797812d6();
        this.LIZ = c19797812d6;
        C19795712cl c19795712cl = new C19795712cl(null, c19797812d6);
        this.LIZJ = c19795712cl;
        this.LIZIZ = c19795712cl.LIZLLL();
        final C19795112cf c19795112cf = new C19795112cf();
        this.LIZLLL = c19795112cf;
        c19795712cl.LJI("require", new AbstractC19795912cn(c19795112cf) { // from class: X.12cY
            public final C19795112cf LLILLL;
            public final Map<String, AbstractC19795912cn> LLILZ;

            {
                super("require");
                this.LLILZ = new HashMap();
                this.LLILLL = c19795112cf;
            }

            @Override // X.AbstractC19795912cn
            public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl2, List<InterfaceC19797112cz> list) {
                InterfaceC19797112cz interfaceC19797112cz;
                C19796312cr.LJ(1, "require", list);
                String strLJFF = c19795712cl2.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                if (((HashMap) this.LLILZ).containsKey(strLJFF)) {
                    return (InterfaceC19797112cz) ((HashMap) this.LLILZ).get(strLJFF);
                }
                C19795112cf c19795112cf2 = this.LLILLL;
                if (((HashMap) c19795112cf2.LIZ).containsKey(strLJFF)) {
                    try {
                        interfaceC19797112cz = (InterfaceC19797112cz) ((Callable) ((HashMap) c19795112cf2.LIZ).get(strLJFF)).call();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new IllegalStateException("Failed to create API implementation: " + strLJFF);
                    }
                } else {
                    interfaceC19797112cz = InterfaceC19797112cz.LJIILIIL;
                }
                if (interfaceC19797112cz instanceof AbstractC19795912cn) {
                    ((HashMap) this.LLILZ).put(strLJFF, interfaceC19797112cz);
                }
                return interfaceC19797112cz;
            }
        });
        ((HashMap) c19795112cf.LIZ).put("internal.platform", new Callable() { // from class: X.12cg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("zze@f51.call");
                AbstractC19795912cn abstractC19795912cn = new AbstractC19795912cn() { // from class: X.12ch
                    {
                        ((HashMap) this.LLILLJJLI).put("getVersion", new AbstractC19795912cn() { // from class: X.12ci
                            @Override // X.AbstractC19795912cn
                            public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl2, List<InterfaceC19797112cz> list) {
                                return new C19816212g4(Double.valueOf(0.0d));
                            }
                        });
                    }

                    @Override // X.AbstractC19795912cn
                    public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl2, List<InterfaceC19797112cz> list) {
                        return InterfaceC19797112cz.LJIILIIL;
                    }
                };
                C1C7U.LIZIZ("zze@f51.call");
                return abstractC19795912cn;
            }
        });
        c19795712cl.LJI("runtime.counter", new C19816212g4(Double.valueOf(0.0d)));
    }

    public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, C19792712cH... c19792712cHArr) {
        InterfaceC19797112cz interfaceC19797112czLIZ = InterfaceC19797112cz.LJIILIIL;
        for (C19792712cH c19792712cH : c19792712cHArr) {
            interfaceC19797112czLIZ = C19793712cR.LIZ(c19792712cH);
            C19796312cr.LJI(this.LIZJ);
            if ((interfaceC19797112czLIZ instanceof C19798412dC) || (interfaceC19797112czLIZ instanceof C19795612ck)) {
                interfaceC19797112czLIZ = this.LIZ.LIZ(c19795712cl, interfaceC19797112czLIZ);
            }
        }
        return interfaceC19797112czLIZ;
    }
}
