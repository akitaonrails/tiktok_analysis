package X;

import android.os.Looper;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794670VFh {
    public static AbstractC794590VEz LIZ(String str, EnumC794690VFj enumC794690VFj, EnumC794730VFn enumC794730VFn, boolean z, InterfaceC794630VFd interfaceC794630VFd, String str2) {
        int i = C794720VFm.LIZ[enumC794730VFn.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            final C794620VFc c794620VFc = new C794620VFc(str, enumC794690VFj, z, interfaceC794630VFd, str2);
            return new AbstractC794590VEz(c794620VFc) { // from class: X.0VFe
                public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
                public final Map<String, Deque<InterfaceC794770VFr>> LJ = new LinkedHashMap();
                public final Map<String, Deque<InterfaceC794710VFl>> LJFF = new LinkedHashMap();
                public C794660VFg LJI;

                @Override // X.InterfaceC807030VlF
                public final C794740VFo LIZJ() {
                    if (!this.LIZLLL.get()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("test");
                        sbLIZ.append(" is start after Trace finish not Trace not being !!!!!, it will be ignore!!!!");
                        C2188811AlT.LIZIZ(sbLIZ);
                        return null;
                    }
                    AbstractC794590VEz.LJI(this.LIZIZ);
                    C794740VFo c794740VFoLIZ = this.LIZ.LIZ();
                    if (c794740VFoLIZ != null) {
                        Deque<InterfaceC794770VFr> linkedList = (Deque) ((LinkedHashMap) this.LJ).get("test");
                        if (linkedList == null) {
                            linkedList = new LinkedList<>();
                            this.LJ.put("test", linkedList);
                        }
                        linkedList.push(c794740VFoLIZ);
                        this.LJI.LIZIZ(c794740VFoLIZ);
                        c794740VFoLIZ.LJIIIZ = System.currentTimeMillis();
                    }
                    return c794740VFoLIZ;
                }

                @Override // X.AbstractC794590VEz, X.InterfaceC807030VlF
                public final void cancel() {
                    if (this.LIZLLL.get()) {
                        this.LIZLLL.set(false);
                        super.cancel();
                        this.LJI.LIZ();
                    }
                }

                @Override // X.InterfaceC807030VlF
                public final void start() {
                    if (this.LIZLLL.get()) {
                        return;
                    }
                    long id = C786410Ut5.u3().getId();
                    this.LIZIZ = id;
                    this.LIZJ = id;
                    C794620VFc c794620VFc2 = this.LIZ;
                    synchronized (c794620VFc2) {
                        c794620VFc2.LIZIZ(System.currentTimeMillis());
                    }
                    C794660VFg c794660VFg = new C794660VFg();
                    this.LJI = c794660VFg;
                    c794660VFg.LIZ = new LinkedList();
                    c794660VFg.LIZIZ = new LinkedHashMap();
                    this.LIZLLL.set(true);
                }

                @Override // X.InterfaceC807030VlF
                public final InterfaceC794710VFl LIZ(String str3) {
                    C794740VFo c794740VFo;
                    C794530VEt c794530VEt;
                    C794620VFc c794620VFc2 = this.LIZ;
                    synchronized (c794620VFc2) {
                        if (c794620VFc2.LJ == null) {
                            if (C794680VFi.LIZ[c794620VFc2.LIZLLL.ordinal()] != 1) {
                                c794530VEt = null;
                            } else {
                                c794530VEt = new C794530VEt(c794620VFc2);
                            }
                            c794620VFc2.LJ = c794530VEt;
                        }
                        C794530VEt c794530VEt2 = c794620VFc2.LJ;
                        c794530VEt2.getClass();
                        c794740VFo = new C794740VFo(str3, "tracer_window_span", c794530VEt2);
                    }
                    return c794740VFo;
                }

                @Override // X.AbstractC794590VEz, X.InterfaceC807030VlF
                public final void LIZLLL(long j) {
                    if (!this.LIZLLL.get()) {
                        return;
                    }
                    this.LIZLLL.set(false);
                    super.LIZLLL(j);
                    this.LJI.LIZ();
                }

                @Override // X.AbstractC794590VEz, X.InterfaceC807030VlF
                public final void LJ(long j) {
                    if (this.LIZLLL.get()) {
                        return;
                    }
                    super.LJ(j);
                    C794660VFg c794660VFg = new C794660VFg();
                    this.LJI = c794660VFg;
                    c794660VFg.LIZ = new LinkedList();
                    c794660VFg.LIZIZ = new LinkedHashMap();
                    this.LIZLLL.set(true);
                }

                @Override // X.InterfaceC807030VlF
                public final void LJFF(InterfaceC794710VFl interfaceC794710VFl) {
                    if (!this.LIZLLL.get()) {
                        if (interfaceC794710VFl != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(interfaceC794710VFl.LIZJ());
                            sbLIZ.append(" is start after Trace finish not Trace not being !!!!!, it will be ignore!!!!");
                            C2188811AlT.LIZIZ(sbLIZ);
                            return;
                        }
                        return;
                    }
                    AbstractC794590VEz.LJI(this.LIZIZ);
                    if (interfaceC794710VFl != null) {
                        String strLIZJ = interfaceC794710VFl.LIZJ();
                        Deque<InterfaceC794710VFl> linkedList = (Deque) ((LinkedHashMap) this.LJFF).get(strLIZJ);
                        if (linkedList == null) {
                            linkedList = new LinkedList<>();
                            this.LJFF.put(strLIZJ, linkedList);
                        }
                        linkedList.push(interfaceC794710VFl);
                    }
                }

                @Override // X.InterfaceC807030VlF
                public final void LIZIZ(String str3, String str4) {
                    if (!this.LIZLLL.get()) {
                        return;
                    }
                    C794620VFc c794620VFc2 = this.LIZ;
                    synchronized (c794620VFc2) {
                        if (!c794620VFc2.LJII && c794620VFc2.LJI) {
                            ((ConcurrentHashMap) c794620VFc2.LJ.LIZIZ).put(str3, str4);
                        }
                    }
                }
            };
        }
        final C794620VFc c794620VFc2 = new C794620VFc(str, enumC794690VFj, z, interfaceC794630VFd, str2);
        return new AbstractC794590VEz(c794620VFc2) { // from class: X.0VFf
            public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
            public final ThreadLocal<Map<String, Deque<InterfaceC794770VFr>>> LJ;
            public C794660VFg LJFF;

            @Override // X.InterfaceC807030VlF
            public final InterfaceC794710VFl LIZ(String str3) {
                return null;
            }

            @Override // X.InterfaceC807030VlF
            public final void LJFF(InterfaceC794710VFl interfaceC794710VFl) {
            }

            @Override // X.InterfaceC807030VlF
            public final C794740VFo LIZJ() {
                if (!this.LIZLLL.get()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("test");
                    sbLIZ.append(" is start after Trace finish not Trace not being !!!!!, it will be ignore!!!!");
                    C2188811AlT.LIZIZ(sbLIZ);
                    return null;
                }
                C794740VFo c794740VFoLIZ = this.LIZ.LIZ();
                if (c794740VFoLIZ != null) {
                    Map<String, Deque<InterfaceC794770VFr>> linkedHashMap = this.LJ.get();
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap<>();
                        this.LJ.set(linkedHashMap);
                    }
                    Deque<InterfaceC794770VFr> linkedList = linkedHashMap.get("test");
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        linkedHashMap.put("test", linkedList);
                    }
                    linkedList.push(c794740VFoLIZ);
                    if (Looper.myLooper() == null || !Looper.getMainLooper().equals(Looper.myLooper())) {
                        InterfaceC794700VFk interfaceC794700VFk = (InterfaceC794700VFk) ((LinkedList) this.LJFF.LIZ).peek();
                        if (interfaceC794700VFk != null || (interfaceC794700VFk = this.LJFF.LIZJ) != null) {
                            c794740VFoLIZ.LIZLLL = interfaceC794700VFk.LJIJI();
                        }
                        c794740VFoLIZ.LJIIIZ = System.currentTimeMillis();
                        return c794740VFoLIZ;
                    }
                    this.LJFF.LIZIZ(c794740VFoLIZ);
                    c794740VFoLIZ.LJIIIZ = System.currentTimeMillis();
                }
                return c794740VFoLIZ;
            }

            @Override // X.AbstractC794590VEz, X.InterfaceC807030VlF
            public final void cancel() {
                if (this.LIZLLL.get()) {
                    this.LIZLLL.set(false);
                    super.cancel();
                    this.LJFF.LIZ();
                }
            }

            @Override // X.InterfaceC807030VlF
            public final void start() {
                if (this.LIZLLL.get()) {
                    return;
                }
                long id = C786410Ut5.u3().getId();
                this.LIZIZ = id;
                this.LIZJ = id;
                C794620VFc c794620VFc3 = this.LIZ;
                synchronized (c794620VFc3) {
                    c794620VFc3.LIZIZ(System.currentTimeMillis());
                }
                C794660VFg c794660VFg = new C794660VFg();
                this.LJFF = c794660VFg;
                c794660VFg.LIZ = new LinkedList();
                c794660VFg.LIZIZ = new LinkedHashMap();
                this.LIZLLL.set(true);
            }

            {
                ThreadLocal<Map<String, Deque<InterfaceC794770VFr>>> threadLocal = new ThreadLocal<>();
                this.LJ = threadLocal;
                threadLocal.set(new LinkedHashMap());
                new ThreadLocal().set(new LinkedHashMap());
            }

            @Override // X.InterfaceC807030VlF
            public final void LIZIZ(String str3, String str4) {
                if (!this.LIZLLL.get()) {
                    return;
                }
                C794620VFc c794620VFc3 = this.LIZ;
                synchronized (c794620VFc3) {
                    if (!c794620VFc3.LJII && c794620VFc3.LJI) {
                        ((ConcurrentHashMap) c794620VFc3.LJ.LIZIZ).put(str3, str4);
                    }
                }
            }
        };
    }
}
