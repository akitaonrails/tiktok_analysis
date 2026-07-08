package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C575640Mhu extends AbstractC575120Mh4<C575770Mi7, C575810MiB> {
    public volatile C09AE LL;
    public volatile boolean LLILLJJLI;

    @Override // X.AbstractC575120Mh4
    public final C575770Mi7 LJI(C1404610meh c1404610meh) {
        Object obj;
        Object next;
        Object next2;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C575160Mh8) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof C575160Mh8)) {
            next = null;
        }
        C575160Mh8 c575160Mh8 = (C575160Mh8) next;
        Iterator<Object> it3 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (next2 instanceof C575630Mht) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        if (next2 instanceof C575630Mht) {
            obj = next2;
        }
        return new C575770Mi7(c575160Mh8, (C575630Mht) obj);
    }

    @Override // X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        this.LLILLJJLI = true;
        C09AE c09ae = this.LL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        ((C1D8A) interfaceC1434410nQl).LIZ(abstractC1404540mea);
        return true;
    }

    @Override // X.AbstractC575120Mh4
    public final void LJII(C1404610meh c1404610meh, C575770Mi7 c575770Mi7, C575130Mh5<C575810MiB> c575130Mh5) {
        C575770Mi7 c575770Mi72 = c575770Mi7;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C575090Mh1) {
                if (next != null) {
                    Map<Class<?>, Function0<InterfaceC575170Mh9<?, ?>>> map = ((C575090Mh1) next).LIZIZ;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C575010Mgt) {
                            if (next2 != null) {
                                InterfaceC569070MTp interfaceC569070MTp = ((C575010Mgt) next2).LIZ;
                                this.LLILLJJLI = false;
                                try {
                                    C575810MiB c575810MiB = (C575810MiB) C23250099c.LJ(C23271099x.INSTANCE, new C575660Mhw(this, c575770Mi72, map, interfaceC569070MTp, null));
                                    if (!this.LLILLJJLI) {
                                        c575130Mh5.LIZ.LIZJ(c575810MiB, false);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    if (!(e instanceof CancellationException)) {
                                        c575130Mh5.LIZ.LJ(-92001, e);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.creative.tangram.workflow.TangramExternalDependency");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.creative.tangram.workflow.TangramRegistries");
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C575770Mi7 r16, java.util.Map<java.lang.Class<?>, ? extends kotlin.jvm.functions.Function0<? extends X.InterfaceC575170Mh9<?, ?>>> r17, X.InterfaceC569070MTp r18, X.InterfaceC1364105Vn<? super X.C575810MiB> r19) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C575640Mhu.LJIIIIZZ(X.0Mi7, java.util.Map, X.0MTp, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC575760Mi6<?> r7, java.util.concurrent.ConcurrentHashMap<X.C575620Mhs, X.InterfaceC575760Mi6<?>> r8, X.InterfaceC569070MTp r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C575710Mi1
            if (r0 == 0) goto L72
            r3 = r10
            X.0Mi1 r3 = (X.C575710Mi1) r3
            int r2 = r3.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r3.LLILZLL = r2
        L12:
            java.lang.Object r5 = r3.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLILZLL
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 == r0) goto L3f
            if (r1 != r4) goto L78
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            if (r7 != 0) goto L30
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r3.LL = r7
            r3.LLILLJJLI = r8
            r3.LLILLL = r9
            r3.LLILZLL = r0
            java.lang.Object r0 = r7.LIZLLL(r9, r3)
            if (r0 != r2) goto L4a
            return r2
        L3f:
            X.0MTp r9 = r3.LLILLL
            java.lang.Object r8 = r3.LLILLJJLI
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            X.0Mi6 r7 = r3.LL
            X.C155000ia.LIZIZ(r5)
        L4a:
            X.0Mhs r0 = r7.getInput()
            X.0Mhs r0 = r0.LIZJ
            if (r0 == 0) goto L80
            X.0Mhs r0 = r7.getInput()
            X.0Mhs r1 = r0.LIZJ
            java.util.Map r0 = X.C19719512Dh.LIZJ(r8)
            java.lang.Object r1 = r0.remove(r1)
            X.0Mi6 r1 = (X.InterfaceC575760Mi6) r1
            r0 = 0
            r3.LL = r0
            r3.LLILLJJLI = r0
            r3.LLILLL = r0
            r3.LLILZLL = r4
            java.lang.Object r0 = r6.LJIIIZ(r1, r8, r9, r3)
            if (r0 != r2) goto L25
            return r2
        L72:
            X.0Mi1 r3 = new X.0Mi1
            r3.<init>(r6, r10)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C575640Mhu.LJIIIZ(X.0Mi6, java.util.concurrent.ConcurrentHashMap, X.0MTp, X.05Vn):java.lang.Object");
    }
}
