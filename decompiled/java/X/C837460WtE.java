package X;

import android.content.Context;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0WtE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837460WtE {
    public final InterfaceC837510WtJ LIZ;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0WtH] */
    public C837460WtE(final Context context) {
        final ?? r3 = new InterfaceC837520WtK(context) { // from class: X.0WtH
            public final Object LIZ;

            {
                this.LIZ = context;
            }

            @Override // X.InterfaceC837510WtJ
            public final Object a() {
                return this.LIZ;
            }
        };
        final C837400Wt8 c837400Wt8 = C837410Wt9.LIZ;
        final InterfaceC837510WtJ interfaceC837510WtJ = c837400Wt8 instanceof C837450WtD ? c837400Wt8 : new InterfaceC837510WtJ(c837400Wt8) { // from class: X.0WtD
            public static final Object LIZJ = new Object();
            public volatile InterfaceC837510WtJ LIZ;
            public volatile Object LIZIZ = LIZJ;

            {
                this.LIZ = c837400Wt8;
            }

            @Override // X.InterfaceC837510WtJ
            public final Object a() {
                Object objA;
                Object obj = this.LIZIZ;
                Object obj2 = LIZJ;
                if (obj != obj2) {
                    return obj;
                }
                synchronized (this) {
                    try {
                        objA = this.LIZIZ;
                        if (objA == obj2) {
                            objA = this.LIZ.a();
                            Object obj3 = this.LIZIZ;
                            if (obj3 != obj2 && obj3 != objA) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                            }
                            this.LIZIZ = objA;
                            this.LIZ = null;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return objA;
            }
        };
        final InterfaceC837520WtK interfaceC837520WtK = new InterfaceC837520WtK(r3, interfaceC837510WtJ) { // from class: X.0WtG
            public final InterfaceC837510WtJ LIZ;
            public final InterfaceC837510WtJ LIZIZ;

            {
                this.LIZ = r3;
                this.LIZIZ = interfaceC837510WtJ;
            }

            @Override // X.InterfaceC837510WtJ
            public final /* bridge */ /* synthetic */ Object a() {
                return new C2461509kj((Context) this.LIZ.a(), (C2461309kh) this.LIZIZ.a());
            }
        };
        final InterfaceC837510WtJ interfaceC837510WtJ2 = interfaceC837520WtK instanceof C837450WtD ? interfaceC837520WtK : new InterfaceC837510WtJ(interfaceC837520WtK) { // from class: X.0WtD
            public static final Object LIZJ = new Object();
            public volatile InterfaceC837510WtJ LIZ;
            public volatile Object LIZIZ = LIZJ;

            {
                this.LIZ = interfaceC837520WtK;
            }

            @Override // X.InterfaceC837510WtJ
            public final Object a() {
                Object objA;
                Object obj = this.LIZIZ;
                Object obj2 = LIZJ;
                if (obj != obj2) {
                    return obj;
                }
                synchronized (this) {
                    try {
                        objA = this.LIZIZ;
                        if (objA == obj2) {
                            objA = this.LIZ.a();
                            Object obj3 = this.LIZIZ;
                            if (obj3 != obj2 && obj3 != objA) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                            }
                            this.LIZIZ = objA;
                            this.LIZ = null;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return objA;
            }
        };
        final InterfaceC837520WtK interfaceC837520WtK2 = new InterfaceC837520WtK(interfaceC837510WtJ2) { // from class: X.0WtC
            public final InterfaceC837510WtJ LIZ;

            {
                this.LIZ = interfaceC837510WtJ2;
            }

            @Override // X.InterfaceC837510WtJ
            public final /* bridge */ /* synthetic */ Object a() {
                return new InterfaceC812720VuQ((C2461509kj) this.LIZ.a()) { // from class: X.0Wsr
                    public final C2461509kj LIZ;

                    {
                        this.LIZ = c2461509kj;
                    }

                    /* JADX WARN: Type inference failed for: r6v0, types: [X.0Wss] */
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // X.InterfaceC812720VuQ
                    public final C835510Wq5 LIZ(final C812780VuW c812780VuW) {
                        final C2461509kj c2461509kj = this.LIZ;
                        if (c2461509kj.LIZJ == null) {
                            return C835460Wq0.LIZLLL(new C812900Vui(-2, null));
                        }
                        try {
                            final byte[] bArrDecode = Base64.decode(c812780VuW.LIZ, 10);
                            final Long l = c812780VuW.LIZIZ;
                            c2461509kj.LIZ.LIZ("requestIntegrityToken(%s)", c812780VuW);
                            final C835520Wq6 c835520Wq6 = new C835520Wq6();
                            final C837260Wsu c837260Wsu = c2461509kj.LIZJ;
                            final ?? r6 = new AbstractRunnableC837330Wt1(c835520Wq6) { // from class: X.0Wss
                                /* JADX WARN: Type inference failed for: r4v1, types: [X.0Wt4, android.os.IInterface] */
                                @Override // X.AbstractRunnableC837330Wt1
                                public final void LIZIZ() {
                                    try {
                                        C2461509kj c2461509kj2 = c2461509kj;
                                        c2461509kj2.LIZJ.LJIIL.p0(C2461509kj.LIZ(c2461509kj2, bArrDecode, l), new BinderC837350Wt3(c2461509kj, c835520Wq6));
                                    } catch (RemoteException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C2461309kh c2461309kh = c2461509kj.LIZ;
                                        Object[] objArr = {c812780VuW};
                                        if (Log.isLoggable("PlayCore", 6)) {
                                            C2461309kh.LIZIZ(c2461309kh.LIZ, "requestIntegrityToken(%s)", objArr);
                                        } else {
                                            c2461309kh.getClass();
                                        }
                                        c835520Wq6.LIZJ(new C812900Vui(-100, e));
                                    }
                                }

                                @Override // X.AbstractRunnableC837330Wt1
                                public final void LIZ(Exception exc) {
                                    if (exc instanceof C837380Wt6) {
                                        super.LIZ(new C812900Vui(-9, exc));
                                    } else {
                                        super.LIZ(exc);
                                    }
                                }
                            };
                            synchronized (c837260Wsu.LJFF) {
                                try {
                                    ((HashSet) c837260Wsu.LJ).add(c835520Wq6);
                                    c835520Wq6.LIZ.LIZIZ((InterfaceC834580Woa<TResult>) new InterfaceC834580Woa() { // from class: X.0Wt2
                                        @Override // X.InterfaceC834580Woa
                                        public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                                            C837260Wsu c837260Wsu2 = c837260Wsu;
                                            C835520Wq6 c835520Wq62 = c835520Wq6;
                                            synchronized (c837260Wsu2.LJFF) {
                                                try {
                                                    ((HashSet) c837260Wsu2.LJ).remove(c835520Wq62);
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    throw th;
                                                }
                                            }
                                        }
                                    });
                                } finally {
                                }
                            }
                            synchronized (c837260Wsu.LJFF) {
                                try {
                                    if (c837260Wsu.LJIIJ.getAndIncrement() > 0) {
                                        C2461309kh c2461309kh = c837260Wsu.LIZIZ;
                                        Object[] objArr = new Object[0];
                                        if (Log.isLoggable("PlayCore", 3)) {
                                            C2461309kh.LIZIZ(c2461309kh.LIZ, "Already connected to the service.", objArr);
                                        } else {
                                            c2461309kh.getClass();
                                        }
                                    }
                                } finally {
                                }
                            }
                            C786410Ut5.LJJZZIII(c837260Wsu.LIZ(), new AbstractRunnableC837330Wt1(c835520Wq6) { // from class: X.0Wst
                                @Override // X.AbstractRunnableC837330Wt1
                                public final void LIZIZ() {
                                    C837260Wsu c837260Wsu2 = c837260Wsu;
                                    AbstractRunnableC837330Wt1 abstractRunnableC837330Wt1 = r6;
                                    if (c837260Wsu2.LJIIL != null || c837260Wsu2.LJI) {
                                        if (!c837260Wsu2.LJI) {
                                            abstractRunnableC837330Wt1.run();
                                            return;
                                        } else {
                                            c837260Wsu2.LIZIZ.LIZ("Waiting to bind to the service.", new Object[0]);
                                            ((ArrayList) c837260Wsu2.LIZLLL).add(abstractRunnableC837330Wt1);
                                            return;
                                        }
                                    }
                                    c837260Wsu2.LIZIZ.LIZ("Initiate binding to the service.", new Object[0]);
                                    ((ArrayList) c837260Wsu2.LIZLLL).add(abstractRunnableC837330Wt1);
                                    ServiceConnectionC837280Wsw serviceConnectionC837280Wsw = new ServiceConnectionC837280Wsw(c837260Wsu2);
                                    c837260Wsu2.LJIIJJI = serviceConnectionC837280Wsw;
                                    c837260Wsu2.LJI = true;
                                    if (C2204961BRm.LJJJJ(c837260Wsu2.LIZ, c837260Wsu2.LJII, serviceConnectionC837280Wsw, 1, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57Xuyd1hfi1NeOKtVrNKDfHNuBy5aNBw=", new String[]{"016a9"}))) {
                                        return;
                                    }
                                    c837260Wsu2.LIZIZ.LIZ("Failed to bind to the service.", new Object[0]);
                                    c837260Wsu2.LJI = false;
                                    Iterator it2 = ((ArrayList) c837260Wsu2.LIZLLL).iterator();
                                    while (it2.hasNext()) {
                                        ((AbstractRunnableC837330Wt1) it2.next()).LIZ(new RuntimeException() { // from class: X.0Wt6
                                        });
                                    }
                                    ((ArrayList) c837260Wsu2.LIZLLL).clear();
                                }
                            });
                            return c835520Wq6.LIZ;
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return C835460Wq0.LIZLLL(new C812900Vui(-13, e));
                        }
                    }
                };
            }
        };
        this.LIZ = interfaceC837520WtK2 instanceof C837450WtD ? interfaceC837520WtK2 : new InterfaceC837510WtJ(interfaceC837520WtK2) { // from class: X.0WtD
            public static final Object LIZJ = new Object();
            public volatile InterfaceC837510WtJ LIZ;
            public volatile Object LIZIZ = LIZJ;

            {
                this.LIZ = interfaceC837520WtK2;
            }

            @Override // X.InterfaceC837510WtJ
            public final Object a() {
                Object objA;
                Object obj = this.LIZIZ;
                Object obj2 = LIZJ;
                if (obj != obj2) {
                    return obj;
                }
                synchronized (this) {
                    try {
                        objA = this.LIZIZ;
                        if (objA == obj2) {
                            objA = this.LIZ.a();
                            Object obj3 = this.LIZIZ;
                            if (obj3 != obj2 && obj3 != objA) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                            }
                            this.LIZIZ = objA;
                            this.LIZ = null;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return objA;
            }
        };
    }
}
