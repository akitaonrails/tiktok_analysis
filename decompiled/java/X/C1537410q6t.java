package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0q6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537410q6t {
    public static final C01GW<C1537410q6t> LJIIIZ;
    public static final C01GW<Boolean> LJIIJ;
    public static final Object LJIIJJI;
    public boolean LIZ;
    public volatile Application LIZIZ;
    public C1538050q7v LIZLLL;
    public InterfaceC1311300kEC LJ;
    public InterfaceC1529520puA LJFF;
    public C1529410ptz LJII;
    public final Map<String, InterfaceC1537420q6u> LIZJ = new ConcurrentHashMap();
    public final C1535810q4J LJI = new C1535810q4J();
    public final List<Class<?>> LJIIIIZZ = new ArrayList();

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LJIIIZ = C452501pT.LIZ(enumC452301pR, new C1537430q6v());
        LJIIJ = C452501pT.LIZ(enumC452301pR, new C1311660kEm());
        LJIIJJI = new Object();
    }

    public final Application LIZJ() {
        Application application = this.LIZIZ;
        if (application != null) {
            return application;
        }
        return null;
    }

    public final void LIZ(List<? extends Class<?>> list) {
        for (Class<?> cls : list) {
            if (!((ArrayList) this.LJIIIIZZ).contains(cls)) {
                ((ArrayList) this.LJIIIIZZ).add(cls);
            }
        }
    }

    public final void LIZIZ(String str, String str2) {
        C1537440q6w c1537440q6w;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZJ;
        InterfaceC1537420q6u interfaceC1537420q6u = (InterfaceC1537420q6u) concurrentHashMap.get(str);
        if (interfaceC1537420q6u == null || (c1537440q6w = interfaceC1537420q6u.LIZJ()) == null) {
            c1537440q6w = new C1537440q6w();
        }
        concurrentHashMap.put(str2, c1537440q6w);
    }

    public final Object LIZLLL(Class cls, String str) {
        InterfaceC1537420q6u interfaceC1537420q6u = (InterfaceC1537420q6u) ((ConcurrentHashMap) this.LIZJ).get(str);
        if (interfaceC1537420q6u != null) {
            return interfaceC1537420q6u.LIZIZ(cls);
        }
        return null;
    }

    public final void LJ(String str, boolean z) {
        if (z) {
            ((ConcurrentHashMap) this.LIZJ).remove(str);
            return;
        }
        InterfaceC1537420q6u interfaceC1537420q6u = (InterfaceC1537420q6u) ((ConcurrentHashMap) this.LIZJ).get(str);
        if (interfaceC1537420q6u == null) {
            return;
        }
        interfaceC1537420q6u.release();
    }
}
