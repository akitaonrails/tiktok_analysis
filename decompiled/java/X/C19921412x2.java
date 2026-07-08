package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.12x2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19921412x2 {
    public static final C19921412x2 LIZJ = new C19921412x2();
    public final ConcurrentMap<Class<?>, InterfaceC19924912xb<?>> LIZIZ = new ConcurrentHashMap();
    public final C19915212w2 LIZ = new C19915212w2();

    public final <T> InterfaceC19924912xb<T> LIZ(Class<T> cls) {
        C19922012x8.LIZ(cls, "messageType");
        InterfaceC19924912xb<T> interfaceC19924912xbLJJII = (InterfaceC19924912xb) ((ConcurrentHashMap) this.LIZIZ).get(cls);
        if (interfaceC19924912xbLJJII == null) {
            C19915212w2 c19915212w2 = this.LIZ;
            c19915212w2.getClass();
            Class<?> cls2 = C19928512yB.LIZ;
            if (!AbstractC19924712xZ.class.isAssignableFrom(cls)) {
                Class<?> cls3 = C19915512w5.LIZ;
                Class<?> cls4 = C19928512yB.LIZ;
                if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
            InterfaceC19921712x5 interfaceC19921712x5LIZIZ = c19915212w2.LIZ.LIZIZ(cls);
            if (interfaceC19921712x5LIZIZ.LIZIZ()) {
                Class<?> cls5 = C19915512w5.LIZ;
                if (AbstractC19924712xZ.class.isAssignableFrom(cls)) {
                    final C19927812y4 c19927812y4 = C19928512yB.LIZJ;
                    final C19928412yA c19928412yA = C19921512x3.LIZ;
                    final InterfaceC19925612xi interfaceC19925612xiLIZ = interfaceC19921712x5LIZIZ.LIZ();
                    interfaceC19924912xbLJJII = new InterfaceC19924912xb<T>(c19927812y4, c19928412yA, interfaceC19925612xiLIZ) { // from class: X.12y8
                        public final InterfaceC19925612xi LIZ;
                        public final AbstractC19929412yK<?, ?> LIZIZ;
                        public final boolean LIZJ;
                        public final AbstractC19929512yL<?> LIZLLL;

                        @Override // X.InterfaceC19924912xb
                        public final T newInstance() {
                            InterfaceC19925612xi interfaceC19925612xi = this.LIZ;
                            return interfaceC19925612xi instanceof AbstractC19924712xZ ? (T) ((AbstractC19924712xZ) interfaceC19925612xi).newMutableInstance() : (T) interfaceC19925612xi.newBuilderForType().buildPartial();
                        }

                        @Override // X.InterfaceC19924912xb
                        public final int LIZIZ(T t) {
                            int iHashCode = this.LIZIZ.LJI(t).hashCode();
                            if (this.LIZJ) {
                                return (iHashCode * 53) + this.LIZLLL.LIZJ(t).hashCode();
                            }
                            return iHashCode;
                        }

                        @Override // X.InterfaceC19924912xb
                        public final boolean LIZLLL(T t) {
                            return this.LIZLLL.LIZJ(t).LJIILLIIL();
                        }

                        @Override // X.InterfaceC19924912xb
                        public final void LJI(T t) {
                            this.LIZIZ.LJIIIZ(t);
                            this.LIZLLL.LJFF(t);
                        }

                        @Override // X.InterfaceC19924912xb
                        public final int LJII(T t) {
                            AbstractC19929412yK<?, ?> abstractC19929412yK = this.LIZIZ;
                            int iLJIIIIZZ = abstractC19929412yK.LJIIIIZZ(abstractC19929412yK.LJI(t));
                            if (this.LIZJ) {
                                return iLJIIIIZZ + this.LIZLLL.LIZJ(t).LJIIIZ();
                            }
                            return iLJIIIIZZ;
                        }

                        @Override // X.InterfaceC19924912xb
                        public final void LIZ(T t, T t2) {
                            AbstractC19929412yK<?, ?> abstractC19929412yK = this.LIZIZ;
                            Class<?> cls6 = C19928512yB.LIZ;
                            abstractC19929412yK.LJIILJJIL(t, abstractC19929412yK.LJIIJ(abstractC19929412yK.LJI(t), abstractC19929412yK.LJI(t2)));
                            if (this.LIZJ) {
                                C19928512yB.LJIIJJI(this.LIZLLL, t, t2);
                            }
                        }

                        @Override // X.InterfaceC19924912xb
                        public final boolean LIZJ(T t, T t2) {
                            if (!this.LIZIZ.LJI(t).equals(this.LIZIZ.LJI(t2))) {
                                return false;
                            }
                            if (this.LIZJ) {
                                return this.LIZLLL.LIZJ(t).equals(this.LIZLLL.LIZJ(t2));
                            }
                            return true;
                        }

                        @Override // X.InterfaceC19924912xb
                        public final void LJ(T t, InterfaceC19361110or interfaceC19361110or) {
                            Iterator itLJIJI = this.LIZLLL.LIZJ(t).LJIJI();
                            while (itLJIJI.hasNext()) {
                                Map.Entry entry = (Map.Entry) itLJIJI.next();
                                InterfaceC19930212yS interfaceC19930212yS = (InterfaceC19930212yS) entry.getKey();
                                if (interfaceC19930212yS.LJJJIL() == AnonymousClass1332.MESSAGE && !interfaceC19930212yS.LJJLJ() && !interfaceC19930212yS.isPacked()) {
                                    if (entry instanceof C19926012xm) {
                                        ((C19929012yG) interfaceC19361110or).LJIILJJIL(interfaceC19930212yS.getNumber(), ((C19926012xm) entry).LL.getValue().LIZJ());
                                    } else {
                                        ((C19929012yG) interfaceC19361110or).LJIILJJIL(interfaceC19930212yS.getNumber(), entry.getValue());
                                    }
                                } else {
                                    throw new IllegalStateException("Found invalid MessageSet item.");
                                }
                            }
                            AbstractC19929412yK<?, ?> abstractC19929412yK = this.LIZIZ;
                            abstractC19929412yK.LJIIZILJ(abstractC19929412yK.LJI(t), interfaceC19361110or);
                        }

                        {
                            this.LIZIZ = c19927812y4;
                            this.LIZJ = c19928412yA.LJ(interfaceC19925612xiLIZ);
                            this.LIZLLL = c19928412yA;
                            this.LIZ = interfaceC19925612xiLIZ;
                        }

                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // X.InterfaceC19924912xb
                        public final void LJIIIIZZ(T t, InterfaceC19929112yH interfaceC19929112yH, C19926312xp c19926312xp) {
                            AbstractC19929412yK<?, ?> abstractC19929412yK = this.LIZIZ;
                            AbstractC19929512yL<?> abstractC19929512yL = this.LIZLLL;
                            Object objLJFF = abstractC19929412yK.LJFF(t);
                            C19928612yC c19928612yCLIZLLL = abstractC19929512yL.LIZLLL(t);
                            while (interfaceC19929112yH.LJIJ() != Integer.MAX_VALUE && LJIIIZ(interfaceC19929112yH, c19926312xp, abstractC19929512yL, c19928612yCLIZLLL, abstractC19929412yK, objLJFF)) {
                                try {
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    abstractC19929412yK.LJIILIIL(t, (Object) objLJFF);
                                    throw th;
                                }
                            }
                            abstractC19929412yK.LJIILIIL(t, (Object) objLJFF);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x00d1 A[EDGE_INSN: B:61:0x00d1->B:35:0x00d1 BREAK  A[LOOP:1: B:21:0x007f->B:66:0x007f], SYNTHETIC] */
                        @Override // X.InterfaceC19924912xb
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LJFF(T r23, byte[] r24, int r25, int r26, X.C19926712xt r27) throws X.C19926612xs {
                            /*
                                Method dump skipped, instruction units count: 228
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C19928212y8.LJFF(java.lang.Object, byte[], int, int, X.12xt):void");
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final <UT, UB, ET extends InterfaceC19930212yS<ET>> boolean LJIIIZ(InterfaceC19929112yH interfaceC19929112yH, C19926312xp c19926312xp, AbstractC19929512yL<ET> abstractC19929512yL, C19928612yC<ET> c19928612yC, AbstractC19929412yK<UT, UB> abstractC19929412yK, UB ub) throws C19926612xs {
                            int tag = interfaceC19929112yH.getTag();
                            int iLIZ = 0;
                            if (tag != 11) {
                                if ((tag & 7) == 2) {
                                    Object objLIZIZ = abstractC19929512yL.LIZIZ(c19926312xp, this.LIZ, tag >>> 3);
                                    if (objLIZIZ != null) {
                                        abstractC19929512yL.LJII(interfaceC19929112yH, objLIZIZ, c19926312xp, c19928612yC);
                                        return true;
                                    }
                                    return abstractC19929412yK.LJIIJJI(0, interfaceC19929112yH, ub);
                                }
                                return interfaceC19929112yH.LJI();
                            }
                            Object objLIZIZ2 = null;
                            AbstractC19922812xG abstractC19922812xGLJIILL = null;
                            while (interfaceC19929112yH.LJIJ() != Integer.MAX_VALUE) {
                                int tag2 = interfaceC19929112yH.getTag();
                                if (tag2 == 16) {
                                    iLIZ = interfaceC19929112yH.LIZ();
                                    objLIZIZ2 = abstractC19929512yL.LIZIZ(c19926312xp, this.LIZ, iLIZ);
                                } else if (tag2 == 26) {
                                    if (objLIZIZ2 != null) {
                                        abstractC19929512yL.LJII(interfaceC19929112yH, objLIZIZ2, c19926312xp, c19928612yC);
                                    } else {
                                        abstractC19922812xGLJIILL = interfaceC19929112yH.LJIILL();
                                    }
                                } else if (tag2 == 12 || !interfaceC19929112yH.LJI()) {
                                    break;
                                }
                            }
                            if (interfaceC19929112yH.getTag() == 12) {
                                if (abstractC19922812xGLJIILL != null) {
                                    if (objLIZIZ2 != null) {
                                        abstractC19929512yL.LJIIIIZZ(abstractC19922812xGLJIILL, objLIZIZ2, c19926312xp, c19928612yC);
                                    } else {
                                        abstractC19929412yK.LIZLLL(ub, iLIZ, abstractC19922812xGLJIILL);
                                        return true;
                                    }
                                }
                                return true;
                            }
                            throw C19926612xs.LIZ();
                        }
                    };
                } else {
                    final AbstractC19929412yK<?, ?> abstractC19929412yK = C19928512yB.LIZIZ;
                    final AbstractC19929512yL<?> abstractC19929512yL = C19921512x3.LIZIZ;
                    if (abstractC19929512yL != null) {
                        final InterfaceC19925612xi interfaceC19925612xiLIZ2 = interfaceC19921712x5LIZIZ.LIZ();
                        interfaceC19924912xbLJJII = new InterfaceC19924912xb<T>(abstractC19929412yK, abstractC19929512yL, interfaceC19925612xiLIZ2) { // from class: X.12y8
                            public final InterfaceC19925612xi LIZ;
                            public final AbstractC19929412yK<?, ?> LIZIZ;
                            public final boolean LIZJ;
                            public final AbstractC19929512yL<?> LIZLLL;

                            @Override // X.InterfaceC19924912xb
                            public final T newInstance() {
                                InterfaceC19925612xi interfaceC19925612xi = this.LIZ;
                                return interfaceC19925612xi instanceof AbstractC19924712xZ ? (T) ((AbstractC19924712xZ) interfaceC19925612xi).newMutableInstance() : (T) interfaceC19925612xi.newBuilderForType().buildPartial();
                            }

                            @Override // X.InterfaceC19924912xb
                            public final int LIZIZ(T t) {
                                int iHashCode = this.LIZIZ.LJI(t).hashCode();
                                if (this.LIZJ) {
                                    return (iHashCode * 53) + this.LIZLLL.LIZJ(t).hashCode();
                                }
                                return iHashCode;
                            }

                            @Override // X.InterfaceC19924912xb
                            public final boolean LIZLLL(T t) {
                                return this.LIZLLL.LIZJ(t).LJIILLIIL();
                            }

                            @Override // X.InterfaceC19924912xb
                            public final void LJI(T t) {
                                this.LIZIZ.LJIIIZ(t);
                                this.LIZLLL.LJFF(t);
                            }

                            @Override // X.InterfaceC19924912xb
                            public final int LJII(T t) {
                                AbstractC19929412yK<?, ?> abstractC19929412yK2 = this.LIZIZ;
                                int iLJIIIIZZ = abstractC19929412yK2.LJIIIIZZ(abstractC19929412yK2.LJI(t));
                                if (this.LIZJ) {
                                    return iLJIIIIZZ + this.LIZLLL.LIZJ(t).LJIIIZ();
                                }
                                return iLJIIIIZZ;
                            }

                            @Override // X.InterfaceC19924912xb
                            public final void LIZ(T t, T t2) {
                                AbstractC19929412yK<?, ?> abstractC19929412yK2 = this.LIZIZ;
                                Class<?> cls6 = C19928512yB.LIZ;
                                abstractC19929412yK2.LJIILJJIL(t, abstractC19929412yK2.LJIIJ(abstractC19929412yK2.LJI(t), abstractC19929412yK2.LJI(t2)));
                                if (this.LIZJ) {
                                    C19928512yB.LJIIJJI(this.LIZLLL, t, t2);
                                }
                            }

                            @Override // X.InterfaceC19924912xb
                            public final boolean LIZJ(T t, T t2) {
                                if (!this.LIZIZ.LJI(t).equals(this.LIZIZ.LJI(t2))) {
                                    return false;
                                }
                                if (this.LIZJ) {
                                    return this.LIZLLL.LIZJ(t).equals(this.LIZLLL.LIZJ(t2));
                                }
                                return true;
                            }

                            @Override // X.InterfaceC19924912xb
                            public final void LJ(T t, InterfaceC19361110or interfaceC19361110or) {
                                Iterator itLJIJI = this.LIZLLL.LIZJ(t).LJIJI();
                                while (itLJIJI.hasNext()) {
                                    Map.Entry entry = (Map.Entry) itLJIJI.next();
                                    InterfaceC19930212yS interfaceC19930212yS = (InterfaceC19930212yS) entry.getKey();
                                    if (interfaceC19930212yS.LJJJIL() == AnonymousClass1332.MESSAGE && !interfaceC19930212yS.LJJLJ() && !interfaceC19930212yS.isPacked()) {
                                        if (entry instanceof C19926012xm) {
                                            ((C19929012yG) interfaceC19361110or).LJIILJJIL(interfaceC19930212yS.getNumber(), ((C19926012xm) entry).LL.getValue().LIZJ());
                                        } else {
                                            ((C19929012yG) interfaceC19361110or).LJIILJJIL(interfaceC19930212yS.getNumber(), entry.getValue());
                                        }
                                    } else {
                                        throw new IllegalStateException("Found invalid MessageSet item.");
                                    }
                                }
                                AbstractC19929412yK<?, ?> abstractC19929412yK2 = this.LIZIZ;
                                abstractC19929412yK2.LJIIZILJ(abstractC19929412yK2.LJI(t), interfaceC19361110or);
                            }

                            {
                                this.LIZIZ = abstractC19929412yK;
                                this.LIZJ = abstractC19929512yL.LJ(interfaceC19925612xiLIZ2);
                                this.LIZLLL = abstractC19929512yL;
                                this.LIZ = interfaceC19925612xiLIZ2;
                            }

                            /* JADX WARN: Type inference incomplete: some casts might be missing */
                            @Override // X.InterfaceC19924912xb
                            public final void LJIIIIZZ(T t, InterfaceC19929112yH interfaceC19929112yH, C19926312xp c19926312xp) {
                                AbstractC19929412yK<?, ?> abstractC19929412yK2 = this.LIZIZ;
                                AbstractC19929512yL<?> abstractC19929512yL2 = this.LIZLLL;
                                Object objLJFF = abstractC19929412yK2.LJFF(t);
                                C19928612yC c19928612yCLIZLLL = abstractC19929512yL2.LIZLLL(t);
                                while (interfaceC19929112yH.LJIJ() != Integer.MAX_VALUE && LJIIIZ(interfaceC19929112yH, c19926312xp, abstractC19929512yL2, c19928612yCLIZLLL, abstractC19929412yK2, objLJFF)) {
                                    try {
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        abstractC19929412yK2.LJIILIIL(t, (Object) objLJFF);
                                        throw th;
                                    }
                                }
                                abstractC19929412yK2.LJIILIIL(t, (Object) objLJFF);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
                            /* JADX WARN: Removed duplicated region for block: B:61:0x00d1 A[EDGE_INSN: B:61:0x00d1->B:35:0x00d1 BREAK  A[LOOP:1: B:21:0x007f->B:66:0x007f], SYNTHETIC] */
                            @Override // X.InterfaceC19924912xb
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJFF(T r23, byte[] r24, int r25, int r26, X.C19926712xt r27) throws X.C19926612xs {
                                /*
                                    Method dump skipped, instruction units count: 228
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C19928212y8.LJFF(java.lang.Object, byte[], int, int, X.12xt):void");
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final <UT, UB, ET extends InterfaceC19930212yS<ET>> boolean LJIIIZ(InterfaceC19929112yH interfaceC19929112yH, C19926312xp c19926312xp, AbstractC19929512yL<ET> abstractC19929512yL2, C19928612yC<ET> c19928612yC, AbstractC19929412yK<UT, UB> abstractC19929412yK2, UB ub) throws C19926612xs {
                                int tag = interfaceC19929112yH.getTag();
                                int iLIZ = 0;
                                if (tag != 11) {
                                    if ((tag & 7) == 2) {
                                        Object objLIZIZ = abstractC19929512yL2.LIZIZ(c19926312xp, this.LIZ, tag >>> 3);
                                        if (objLIZIZ != null) {
                                            abstractC19929512yL2.LJII(interfaceC19929112yH, objLIZIZ, c19926312xp, c19928612yC);
                                            return true;
                                        }
                                        return abstractC19929412yK2.LJIIJJI(0, interfaceC19929112yH, ub);
                                    }
                                    return interfaceC19929112yH.LJI();
                                }
                                Object objLIZIZ2 = null;
                                AbstractC19922812xG abstractC19922812xGLJIILL = null;
                                while (interfaceC19929112yH.LJIJ() != Integer.MAX_VALUE) {
                                    int tag2 = interfaceC19929112yH.getTag();
                                    if (tag2 == 16) {
                                        iLIZ = interfaceC19929112yH.LIZ();
                                        objLIZIZ2 = abstractC19929512yL2.LIZIZ(c19926312xp, this.LIZ, iLIZ);
                                    } else if (tag2 == 26) {
                                        if (objLIZIZ2 != null) {
                                            abstractC19929512yL2.LJII(interfaceC19929112yH, objLIZIZ2, c19926312xp, c19928612yC);
                                        } else {
                                            abstractC19922812xGLJIILL = interfaceC19929112yH.LJIILL();
                                        }
                                    } else if (tag2 == 12 || !interfaceC19929112yH.LJI()) {
                                        break;
                                    }
                                }
                                if (interfaceC19929112yH.getTag() == 12) {
                                    if (abstractC19922812xGLJIILL != null) {
                                        if (objLIZIZ2 != null) {
                                            abstractC19929512yL2.LJIIIIZZ(abstractC19922812xGLJIILL, objLIZIZ2, c19926312xp, c19928612yC);
                                        } else {
                                            abstractC19929412yK2.LIZLLL(ub, iLIZ, abstractC19922812xGLJIILL);
                                            return true;
                                        }
                                    }
                                    return true;
                                }
                                throw C19926612xs.LIZ();
                            }
                        };
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
            } else {
                Class<?> cls6 = C19915512w5.LIZ;
                AbstractC19929512yL abstractC19929512yL2 = null;
                if (AbstractC19924712xZ.class.isAssignableFrom(cls)) {
                    C19921812x6 c19921812x6 = C19921612x4.LIZIZ;
                    C19921112wz c19921112wz = C19921212x0.LIZIZ;
                    C19927812y4 c19927812y42 = C19928512yB.LIZJ;
                    if (C19907812uq.LIZ[interfaceC19921712x5LIZIZ.LIZJ().ordinal()] != 1) {
                        abstractC19929512yL2 = C19921512x3.LIZ;
                    }
                    interfaceC19924912xbLJJII = C19928312y9.LJJII(interfaceC19921712x5LIZIZ, c19921812x6, c19921112wz, c19927812y42, abstractC19929512yL2, C19915612w6.LIZIZ);
                } else {
                    InterfaceC19921912x7 interfaceC19921912x7 = C19921612x4.LIZ;
                    InterfaceC19931012ya interfaceC19931012ya = C19921212x0.LIZ;
                    AbstractC19929412yK<?, ?> abstractC19929412yK2 = C19928512yB.LIZIZ;
                    if (C19907812uq.LIZ[interfaceC19921712x5LIZIZ.LIZJ().ordinal()] != 1 && (abstractC19929512yL2 = C19921512x3.LIZIZ) == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    interfaceC19924912xbLJJII = C19928312y9.LJJII(interfaceC19921712x5LIZIZ, interfaceC19921912x7, interfaceC19931012ya, abstractC19929412yK2, abstractC19929512yL2, C19915612w6.LIZ);
                }
            }
            InterfaceC19924912xb<T> interfaceC19924912xb = (InterfaceC19924912xb) ((ConcurrentHashMap) this.LIZIZ).putIfAbsent(cls, interfaceC19924912xbLJJII);
            if (interfaceC19924912xb != null) {
                return interfaceC19924912xb;
            }
        }
        return interfaceC19924912xbLJJII;
    }

    public final <T> InterfaceC19924912xb<T> LIZIZ(T t) {
        return LIZ(t.getClass());
    }
}
