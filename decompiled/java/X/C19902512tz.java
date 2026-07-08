package X;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.12tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19902512tz {
    public static final C19902512tz LIZJ = new C19902512tz();
    public final ConcurrentMap<Class<?>, InterfaceC19900112tb<?>> LIZIZ = new ConcurrentHashMap();
    public final C19903312u7 LIZ = new C19903312u7();

    public final <T> InterfaceC19900112tb<T> LIZ(Class<T> cls) {
        C19904212uG c19904212uG;
        Charset charset = C19856912md.LIZ;
        if (cls != null) {
            InterfaceC19900112tb<T> interfaceC19900112tbLJIIJ = (InterfaceC19900112tb) ((ConcurrentHashMap) this.LIZIZ).get(cls);
            if (interfaceC19900112tbLJIIJ == null) {
                C19903312u7 c19903312u7 = this.LIZ;
                c19903312u7.getClass();
                AbstractC19899612tW.class.isAssignableFrom(cls);
                InterfaceC19903912uD interfaceC19903912uDLIZIZ = c19903312u7.LIZ.LIZIZ(cls);
                if (interfaceC19903912uDLIZIZ.LIZIZ()) {
                    final InterfaceC19901112tl interfaceC19901112tlZza = interfaceC19903912uDLIZIZ.zza();
                    interfaceC19900112tbLJIIJ = new InterfaceC19900112tb<T>(interfaceC19901112tlZza) { // from class: X.12tw
                        public final InterfaceC19901112tl LIZ;
                        public final AbstractC19905112uP<?, ?> LIZIZ;
                        public final boolean LIZJ;
                        public final AbstractC19904112uF<?> LIZLLL;

                        @Override // X.InterfaceC19900112tb
                        public final AbstractC19899612tW zza() {
                            InterfaceC19901112tl interfaceC19901112tl = this.LIZ;
                            return interfaceC19901112tl instanceof AbstractC19899612tW ? (AbstractC19899612tW) ((AbstractC19899612tW) interfaceC19901112tl).LJIILL(4) : interfaceC19901112tl.LIZJ().LJIIIZ();
                        }

                        {
                            C19905012uO c19905012uO = C19901912tt.LIZ;
                            C19904212uG c19904212uG2 = C19904912uN.LIZ;
                            this.LIZIZ = c19905012uO;
                            this.LIZJ = interfaceC19901112tlZza instanceof AbstractC19900212tc;
                            this.LIZLLL = c19904212uG2;
                            this.LIZ = interfaceC19901112tlZza;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // X.InterfaceC19900112tb
                        public final int LIZ(T t) {
                            getClass();
                            C19902412ty c19902412ty = ((AbstractC19899612tW) t).zzb;
                            int iLJIILLIIL = c19902412ty.LIZLLL;
                            if (iLJIILLIIL == -1) {
                                iLJIILLIIL = 0;
                                for (int i = 0; i < c19902412ty.LIZ; i++) {
                                    iLJIILLIIL += (AbstractC19901712tr.LJIILLIIL(8) << 1) + AbstractC19901712tr.LJIILIIL(2, c19902412ty.LIZIZ[i] >>> 3) + AbstractC19901712tr.LIZIZ(3, (AbstractC19854812mI) c19902412ty.LIZJ[i]);
                                }
                                c19902412ty.LIZLLL = iLJIILLIIL;
                            }
                            if (this.LIZJ) {
                                getClass();
                                C19902112tv<C19902912u3> c19902112tv = ((AbstractC19900212tc) t).zzc;
                                int iLIZLLL = 0;
                                for (int i2 = 0; i2 < c19902112tv.LIZ.LIZLLL(); i2++) {
                                    iLIZLLL += C19902112tv.LIZLLL(c19902112tv.LIZ.LJ(i2));
                                }
                                Iterator<T> it2 = c19902112tv.LIZ.LJFF().iterator();
                                while (it2.hasNext()) {
                                    iLIZLLL += C19902112tv.LIZLLL((Map.Entry) it2.next());
                                }
                                return iLJIILLIIL + iLIZLLL;
                            }
                            return iLJIILLIIL;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC19900112tb
                        public final void LIZIZ(T t) {
                            getClass();
                            C19902412ty c19902412ty = ((AbstractC19899612tW) t).zzb;
                            if (c19902412ty.LJ) {
                                c19902412ty.LJ = false;
                            }
                            getClass();
                            ((AbstractC19900212tc) t).zzc.LJIIJ();
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC19900112tb
                        public final int LIZJ(T t) {
                            getClass();
                            int iHashCode = ((AbstractC19899612tW) t).zzb.hashCode();
                            if (this.LIZJ) {
                                getClass();
                                return (iHashCode * 53) + ((AbstractC19900212tc) t).zzc.hashCode();
                            }
                            return iHashCode;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC19900112tb
                        public final boolean LJ(T t) {
                            getClass();
                            return ((AbstractC19900212tc) t).zzc.LJIIJJI();
                        }

                        @Override // X.InterfaceC19900112tb
                        public final void LIZLLL(Object obj, C19901812ts c19901812ts) {
                            getClass();
                            Iterator<Map.Entry<T, Object>> itLJIIIZ = ((AbstractC19900212tc) obj).zzc.LJIIIZ();
                            while (itLJIIIZ.hasNext()) {
                                Map.Entry entry = (Map.Entry) itLJIIIZ.next();
                                InterfaceC19902712u1 interfaceC19902712u1 = (InterfaceC19902712u1) entry.getKey();
                                if (interfaceC19902712u1.LIZIZ() == C133D.MESSAGE && !interfaceC19902712u1.LJ() && !interfaceC19902712u1.LIZLLL()) {
                                    if (entry instanceof C19900912tj) {
                                        c19901812ts.LIZIZ(interfaceC19902712u1.zza(), ((C19900912tj) entry).LL.getValue().LIZIZ());
                                    } else {
                                        c19901812ts.LIZIZ(interfaceC19902712u1.zza(), entry.getValue());
                                    }
                                } else {
                                    throw new IllegalStateException("Found invalid MessageSet item.");
                                }
                            }
                            getClass();
                            C19902412ty c19902412ty = ((AbstractC19899612tW) obj).zzb;
                            c19902412ty.getClass();
                            c19901812ts.getClass();
                            for (int i = 0; i < c19902412ty.LIZ; i++) {
                                c19901812ts.LIZIZ(c19902412ty.LIZIZ[i] >>> 3, c19902412ty.LIZJ[i]);
                            }
                        }

                        @Override // X.InterfaceC19900112tb
                        public final void LJI(T t, T t2) {
                            C19901912tt.LIZJ(this.LIZIZ, t, t2);
                            if (this.LIZJ) {
                                C19901912tt.LIZIZ(this.LIZLLL, t, t2);
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC19900112tb
                        public final boolean LJII(T t, T t2) {
                            getClass();
                            C19902412ty c19902412ty = ((AbstractC19899612tW) t).zzb;
                            getClass();
                            if (!c19902412ty.equals(((AbstractC19899612tW) t2).zzb)) {
                                return false;
                            }
                            if (this.LIZJ) {
                                getClass();
                                C19902112tv<C19902912u3> c19902112tv = ((AbstractC19900212tc) t).zzc;
                                getClass();
                                return c19902112tv.equals(((AbstractC19900212tc) t2).zzc);
                            }
                            return true;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
                        /* JADX WARN: Removed duplicated region for block: B:59:0x008a A[EDGE_INSN: B:59:0x008a->B:30:0x008a BREAK  A[LOOP:1: B:17:0x004f->B:62:0x004f], SYNTHETIC] */
                        @Override // X.InterfaceC19900112tb
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LJFF(T r16, byte[] r17, int r18, int r19, X.C19903812uC r20) throws X.C19903212u6 {
                            /*
                                r15 = this;
                                r11 = r18
                                r2 = r16
                                r1 = r2
                                X.12tW r1 = (X.AbstractC19899612tW) r1
                                X.12ty r13 = r1.zzb
                                X.12ty r0 = X.C19902412ty.LJFF
                                if (r13 != r0) goto L14
                                X.12ty r13 = new X.12ty
                                r13.<init>()
                                r1.zzb = r13
                            L14:
                                X.12tc r2 = (X.AbstractC19900212tc) r2
                                r2.LJJI()
                                r8 = 0
                                r7 = r8
                            L1b:
                                r12 = r19
                                if (r11 >= r12) goto La4
                                r14 = r20
                                r10 = r17
                                int r11 = X.C19902312tx.LJIIJJI(r10, r11, r14)
                                int r9 = r14.LIZ
                                r0 = 11
                                r4 = 2
                                if (r9 == r0) goto L4d
                                r0 = r9 & 7
                                if (r0 != r4) goto L48
                                X.12uF<?> r3 = r15.LIZLLL
                                X.12m7 r2 = r14.LIZLLL
                                X.12tl r1 = r15.LIZ
                                int r0 = r9 >>> 3
                                r3.getClass()
                                X.12uh r7 = r2.LIZ(r0, r1)
                                if (r7 != 0) goto L94
                                int r11 = X.C19902312tx.LIZJ(r9, r10, r11, r12, r13, r14)
                                goto L1b
                            L48:
                                int r11 = X.C19902312tx.LIZ(r9, r10, r11, r12, r14)
                                goto L1b
                            L4d:
                                r5 = 0
                                r3 = r8
                            L4f:
                                if (r11 >= r12) goto L8a
                                int r11 = X.C19902312tx.LJIIJJI(r10, r11, r14)
                                int r6 = r14.LIZ
                                int r2 = r6 >>> 3
                                r1 = r6 & 7
                                if (r2 == r4) goto L6b
                                r0 = 3
                                if (r2 != r0) goto L81
                                if (r7 != 0) goto L9c
                                if (r1 != r4) goto L81
                                int r11 = X.C19902312tx.LJII(r10, r11, r14)
                                java.lang.Object r3 = r14.LIZJ
                                goto L4f
                            L6b:
                                if (r1 != 0) goto L81
                                int r11 = X.C19902312tx.LJIIJJI(r10, r11, r14)
                                int r5 = r14.LIZ
                                X.12uF<?> r2 = r15.LIZLLL
                                X.12m7 r1 = r14.LIZLLL
                                X.12tl r0 = r15.LIZ
                                r2.getClass()
                                X.12uh r7 = r1.LIZ(r5, r0)
                                goto L4f
                            L81:
                                r0 = 12
                                if (r6 == r0) goto L8a
                                int r11 = X.C19902312tx.LIZ(r6, r10, r11, r12, r14)
                                goto L4f
                            L8a:
                                if (r3 == 0) goto L1b
                                int r0 = r5 << 3
                                r0 = r0 | 2
                                r13.LIZJ(r0, r3)
                                goto L1b
                            L94:
                                X.12tz r0 = X.C19902512tz.LIZJ
                                java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
                                r0.<init>()
                                throw r0
                            L9c:
                                X.12tz r0 = X.C19902512tz.LIZJ
                                java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
                                r0.<init>()
                                throw r0
                            La4:
                                if (r11 != r12) goto La7
                                return
                            La7:
                                X.12u6 r0 = X.C19903212u6.LIZJ()
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C19902212tw.LJFF(java.lang.Object, byte[], int, int, X.12uC):void");
                        }
                    };
                } else {
                    if (C19903012u4.LIZ[interfaceC19903912uDLIZIZ.LIZ().ordinal()] != 1) {
                        c19904212uG = C19904912uN.LIZ;
                    } else {
                        c19904212uG = null;
                    }
                    interfaceC19900112tbLJIIJ = C19902012tu.LJIIJ(interfaceC19903912uDLIZIZ, c19904212uG);
                }
                InterfaceC19900112tb<T> interfaceC19900112tb = (InterfaceC19900112tb) ((ConcurrentHashMap) this.LIZIZ).putIfAbsent(cls, interfaceC19900112tbLJIIJ);
                if (interfaceC19900112tb != null) {
                    return interfaceC19900112tb;
                }
            }
            return interfaceC19900112tbLJIIJ;
        }
        throw new NullPointerException("messageType");
    }
}
