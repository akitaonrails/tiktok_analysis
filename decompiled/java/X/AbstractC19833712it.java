package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.12it, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19833712it<T> {
    public static final Object LJI = new Object();
    public static volatile C19833512ir LJII = null;
    public static final C19834012iw LJIIIIZZ;
    public static final AtomicInteger LJIIIZ;
    public final C19819912gf LIZ;
    public final String LIZIZ;
    public final Object LIZJ;
    public volatile int LIZLLL = -1;
    public volatile T LJ;
    public final boolean LJFF;

    public abstract T LIZJ(Object obj);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.12ix] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.12iw] */
    static {
        new AtomicReference();
        final ?? r0 = new Object() { // from class: X.12ix
        };
        LJIIIIZZ = new Object(r0) { // from class: X.12iw
        };
        LJIIIZ = new AtomicInteger();
    }

    public final T LIZ() {
        T tLIZLLL;
        if (!this.LJFF) {
            C19834012iw c19834012iw = LJIIIIZZ;
            String str = this.LIZIZ;
            c19834012iw.getClass();
            C19864312np.LJI(str, "flagName must not be null");
        }
        int i = LJIIIZ.get();
        if (this.LIZLLL < i) {
            synchronized (this) {
                try {
                    if (this.LIZLLL < i) {
                        C19833512ir c19833512ir = LJII;
                        AbstractC19852312lt<InterfaceC813010Vut> abstractC19852312ltAbsent = AbstractC19852312lt.absent();
                        String strLIZ = null;
                        if (c19833512ir != null) {
                            abstractC19852312ltAbsent = c19833512ir.LIZIZ.get();
                            if (abstractC19852312ltAbsent.isPresent()) {
                                InterfaceC813010Vut interfaceC813010Vut = abstractC19852312ltAbsent.get();
                                C19819912gf c19819912gf = this.LIZ;
                                strLIZ = interfaceC813010Vut.LIZ(c19819912gf.LIZIZ, c19819912gf.LIZ, c19819912gf.LIZLLL, this.LIZIZ);
                            }
                        }
                        C19864312np.LJIILIIL("Must call PhenotypeFlagInitializer.maybeInit() first", c19833512ir != null);
                        if (!this.LIZ.LJFF ? !((tLIZLLL = LIZLLL(c19833512ir)) != null || (tLIZLLL = LIZIZ(c19833512ir)) != null) : !((tLIZLLL = (T) LIZIZ(c19833512ir)) != null || (tLIZLLL = (T) LIZLLL(c19833512ir)) != null)) {
                            tLIZLLL = (T) this.LIZJ;
                        }
                        if (abstractC19852312ltAbsent.isPresent()) {
                            tLIZLLL = strLIZ == null ? (T) this.LIZJ : LIZJ(strLIZ);
                        }
                        this.LJ = (T) tLIZLLL;
                        this.LIZLLL = i;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJ;
    }

    public final Object LIZIZ(C19833512ir c19833512ir) {
        InterfaceC19882712qn<Context, Boolean> interfaceC19882712qn;
        C19833812iu c19833812iu;
        String strLIZIZ;
        boolean z;
        C19833812iu c19833812iu2;
        C19819912gf c19819912gf = this.LIZ;
        if (!c19819912gf.LJ && ((interfaceC19882712qn = c19819912gf.LJIIIIZZ) == null || interfaceC19882712qn.apply(c19833512ir.LIZ).booleanValue())) {
            Context context = c19833512ir.LIZ;
            synchronized (C19833812iu.class) {
                try {
                    if (C19833812iu.LIZJ == null) {
                        if (C838480Wus.LIZ(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            c19833812iu2 = new C19833812iu();
                        } else {
                            c19833812iu2 = new C19833812iu(context);
                        }
                        C19833812iu.LIZJ = c19833812iu2;
                    }
                    c19833812iu = C19833812iu.LIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C19819912gf c19819912gf2 = this.LIZ;
            if (c19819912gf2.LJ) {
                strLIZIZ = null;
            } else {
                String str = c19819912gf2.LIZJ;
                if (str != null && str.isEmpty()) {
                    strLIZIZ = this.LIZIZ;
                } else {
                    String str2 = this.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            Object objLJIIIIZZ = c19833812iu.LJIIIIZZ(strLIZIZ);
            if (objLJIIIIZZ != null) {
                return LIZJ(objLJIIIIZZ);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0uKJ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C19833512ir r11) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19833712it.LIZLLL(X.12ir):java.lang.Object");
    }

    public AbstractC19833712it(C19819912gf c19819912gf, String str, Object obj) {
        if (c19819912gf.LIZ == null) {
            if (c19819912gf.LIZIZ == null) {
                throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
            }
        } else if (c19819912gf.LIZIZ != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.LIZ = c19819912gf;
        this.LIZIZ = str;
        this.LIZJ = obj;
        this.LJFF = true;
    }
}
