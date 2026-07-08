package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0WBH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WBH implements C0WBI {
    public final Set<C0WBF<?>> LIZ;
    public final Set<C0WBF<?>> LIZIZ;
    public final Set<C0WBF<?>> LIZJ;
    public final Set<C0WBF<?>> LIZLLL;
    public final Set<C0WBF<?>> LJ;
    public final Set<Class<?>> LJFF;
    public final C0WBI LJI;

    @Override // X.C0WBI
    public final <T> InterfaceC812380Vts<T> LIZ(C0WBF<T> c0wbf) {
        if (this.LIZIZ.contains(c0wbf)) {
            return this.LJI.LIZ(c0wbf);
        }
        throw new C0WB4(C786410Ut5.j4("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{c0wbf}));
    }

    @Override // X.C0WBI
    public final <T> T LIZIZ(Class<T> cls) {
        if (this.LIZ.contains(C0WBF.LIZ(cls))) {
            T t = (T) this.LJI.LIZIZ(cls);
            if (!cls.equals(InterfaceC795440VIg.class)) {
                return t;
            }
            final Set<Class<?>> set = this.LJFF;
            final InterfaceC795440VIg interfaceC795440VIg = (InterfaceC795440VIg) t;
            return (T) new InterfaceC795440VIg(set, interfaceC795440VIg) { // from class: X.0WBK
                public final Set<Class<?>> LIZ;
                public final InterfaceC795440VIg LIZIZ;

                {
                    this.LIZ = set;
                    this.LIZIZ = interfaceC795440VIg;
                }
            };
        }
        throw new C0WB4(C786410Ut5.j4("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    @Override // X.C0WBI
    public final <T> InterfaceC812380Vts<T> LIZJ(Class<T> cls) {
        return LIZ(C0WBF.LIZ(cls));
    }

    @Override // X.C0WBI
    public final <T> Set<T> LIZLLL(C0WBF<T> c0wbf) {
        if (this.LIZLLL.contains(c0wbf)) {
            return this.LJI.LIZLLL(c0wbf);
        }
        throw new C0WB4(C786410Ut5.j4("Attempting to request an undeclared dependency Set<%s>.", new Object[]{c0wbf}));
    }

    public final Set LJ(Class cls) {
        return LIZLLL(C0WBF.LIZ(cls));
    }

    public C0WBH(C0WBP c0wbp, C818970WAt c818970WAt) {
        boolean z;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C0WBG c0wbg : c0wbp.LIZIZ) {
            int i = c0wbg.LIZJ;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (c0wbg.LIZIZ == 2) {
                    hashSet4.add(c0wbg.LIZ);
                } else {
                    hashSet.add(c0wbg.LIZ);
                }
            } else if (i == 2) {
                hashSet3.add(c0wbg.LIZ);
            } else if (c0wbg.LIZIZ == 2) {
                hashSet5.add(c0wbg.LIZ);
            } else {
                hashSet2.add(c0wbg.LIZ);
            }
        }
        if (!c0wbp.LJFF.isEmpty()) {
            hashSet.add(C0WBF.LIZ(InterfaceC795440VIg.class));
        }
        this.LIZ = Collections.unmodifiableSet(hashSet);
        this.LIZIZ = Collections.unmodifiableSet(hashSet2);
        this.LIZJ = Collections.unmodifiableSet(hashSet3);
        this.LIZLLL = Collections.unmodifiableSet(hashSet4);
        this.LJ = Collections.unmodifiableSet(hashSet5);
        this.LJFF = c0wbp.LJFF;
        this.LJI = c818970WAt;
    }
}
