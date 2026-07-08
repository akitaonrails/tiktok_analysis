package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1328860kgW implements InterfaceC1327930kf1 {
    public final C1325710kbR LIZ;
    public final String LIZIZ;
    public final InterfaceC1325690kbP LIZJ;
    public final Object LIZLLL;
    public final EnumC1320950kTl LJ;
    public boolean LJFF;
    public EnumC1331380kka LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final List<InterfaceC1330340kiu> LJIIIZ = new ArrayList();

    @Override // X.InterfaceC1327930kf1
    public final synchronized boolean LIZLLL() {
        return this.LJII;
    }

    @Override // X.InterfaceC1327930kf1
    public final synchronized boolean LJI() {
        return this.LJFF;
    }

    public final void LJIIJ() {
        synchronized (this) {
            if (this.LJIIIIZZ) {
                return;
            }
            this.LJIIIIZZ = true;
            Iterator it2 = new ArrayList(this.LJIIIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1330340kiu) it2.next()).LIZJ();
            }
        }
    }

    @Override // X.InterfaceC1327930kf1
    public final synchronized EnumC1331380kka getPriority() {
        return this.LJI;
    }

    @Override // X.InterfaceC1327930kf1
    public final InterfaceC1325690kbP LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1327930kf1
    public final EnumC1320950kTl LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1327930kf1
    public final Object LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1327930kf1
    public final C1325710kbR LJFF() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1327930kf1
    public final String getId() {
        return this.LIZIZ;
    }

    public static void LJII(List<InterfaceC1330340kiu> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC1330340kiu> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    public static void LJIIIIZZ(List<InterfaceC1330340kiu> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC1330340kiu> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL();
        }
    }

    public static void LJIIIZ(List<InterfaceC1330340kiu> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC1330340kiu> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    @Override // X.InterfaceC1327930kf1
    public final void LJ(C1330860kjk c1330860kjk) {
        boolean z;
        synchronized (this) {
            try {
                ((ArrayList) this.LJIIIZ).add(c1330860kjk);
                z = this.LJIIIIZZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            c1330860kjk.LIZJ();
        }
    }

    public final synchronized List<InterfaceC1330340kiu> LJIIJJI(boolean z) {
        if (z == this.LJII) {
            return null;
        }
        this.LJII = z;
        return new ArrayList(this.LJIIIZ);
    }

    public final synchronized List<InterfaceC1330340kiu> LJIIL(boolean z) {
        if (z == this.LJFF) {
            return null;
        }
        this.LJFF = z;
        return new ArrayList(this.LJIIIZ);
    }

    public final synchronized List<InterfaceC1330340kiu> LJIILIIL(EnumC1331380kka enumC1331380kka) {
        if (enumC1331380kka == this.LJI) {
            return null;
        }
        this.LJI = enumC1331380kka;
        return new ArrayList(this.LJIIIZ);
    }

    public C1328860kgW(C1325710kbR c1325710kbR, String str, InterfaceC1325690kbP interfaceC1325690kbP, Object obj, EnumC1320950kTl enumC1320950kTl, boolean z, boolean z2, EnumC1331380kka enumC1331380kka) {
        this.LIZ = c1325710kbR;
        this.LIZIZ = str;
        this.LIZJ = interfaceC1325690kbP;
        this.LIZLLL = obj;
        this.LJ = enumC1320950kTl;
        this.LJFF = z;
        this.LJI = enumC1331380kka;
        this.LJII = z2;
    }
}
