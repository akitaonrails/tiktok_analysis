package X;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.12v1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19908912v1 {
    public static final C19908912v1 LIZJ = new C19908912v1();
    public final ConcurrentMap LIZIZ = new ConcurrentHashMap();
    public final C19908712uz LIZ = new C19908712uz();

    public final InterfaceC19908112ut LIZ(Class cls) {
        C19909312v5 c19909312v5;
        Charset charset = C19856312mX.LIZ;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZIZ;
            InterfaceC19908112ut interfaceC19908112utLJJ = (InterfaceC19908112ut) concurrentHashMap.get(cls);
            if (interfaceC19908112utLJJ == null) {
                C19908712uz c19908712uz = this.LIZ;
                c19908712uz.getClass();
                AbstractC19907912ur.class.isAssignableFrom(cls);
                InterfaceC19909012v2 interfaceC19909012v2LIZ = c19908712uz.LIZ.LIZ(cls);
                if (!interfaceC19909012v2LIZ.LIZ()) {
                    if (interfaceC19909012v2LIZ.LIZIZ() - 1 != 1) {
                        c19909312v5 = C19909212v4.LIZ;
                    } else {
                        c19909312v5 = null;
                    }
                    interfaceC19908112utLJJ = C19909612v8.LJJ(interfaceC19909012v2LIZ, c19909312v5);
                } else {
                    final InterfaceC19911612vS interfaceC19911612vSZza = interfaceC19909012v2LIZ.zza();
                    interfaceC19908112utLJJ = new InterfaceC19908112ut(interfaceC19911612vSZza) { // from class: X.12vB
                        public final InterfaceC19911612vS LIZ;
                        public final AbstractC19912712vd LIZIZ;
                        public final boolean LIZJ;
                        public final AbstractC19909412v6 LIZLLL;

                        @Override // X.InterfaceC19908112ut
                        public final AbstractC19907912ur LJ() {
                            InterfaceC19911612vS interfaceC19911612vS = this.LIZ;
                            return interfaceC19911612vS instanceof AbstractC19907912ur ? (AbstractC19907912ur) ((AbstractC19907912ur) interfaceC19911612vS).LJIIJ(4) : interfaceC19911612vS.LJJLIIIIJ().LIZJ();
                        }

                        {
                            C19912412va c19912412va = C19909712v9.LIZ;
                            C19909312v5 c19909312v52 = C19909212v4.LIZ;
                            this.LIZIZ = c19912412va;
                            this.LIZJ = interfaceC19911612vSZza instanceof AbstractC19901412to;
                            this.LIZLLL = c19909312v52;
                            this.LIZ = interfaceC19911612vSZza;
                        }

                        @Override // X.InterfaceC19908112ut
                        public final int LIZ(Object obj) {
                            C19910312vF c19910312vF = ((AbstractC19907912ur) obj).zzc;
                            int iLJJ = c19910312vF.LIZLLL;
                            if (iLJJ == -1) {
                                iLJJ = 0;
                                for (int i = 0; i < c19910312vF.LIZ; i++) {
                                    int i2 = c19910312vF.LIZIZ[i] >>> 3;
                                    AbstractC19855612mQ abstractC19855612mQ = (AbstractC19855612mQ) c19910312vF.LIZJ[i];
                                    int iLJJ2 = AbstractC19910412vG.LJJ(8);
                                    int iLJJ3 = AbstractC19910412vG.LJJ(16) + AbstractC19910412vG.LJJ(i2);
                                    int iLJJ4 = AbstractC19910412vG.LJJ(24);
                                    int iZze = abstractC19855612mQ.zze();
                                    iLJJ += iLJJ2 + iLJJ2 + iLJJ3 + iLJJ4 + AbstractC19910412vG.LJJ(iZze) + iZze;
                                }
                                c19910312vF.LIZLLL = iLJJ;
                            }
                            if (this.LIZJ) {
                                C19910712vJ c19910712vJ = ((AbstractC19901412to) obj).zzb.LIZ;
                                int i3 = c19910712vJ.LLILLJJLI;
                                int iLJIIIZ = 0;
                                for (int i4 = 0; i4 < i3; i4++) {
                                    iLJIIIZ += C19909812vA.LJIIIZ(c19910712vJ.LIZLLL(i4));
                                }
                                Iterator it2 = c19910712vJ.LIZIZ().iterator();
                                while (it2.hasNext()) {
                                    iLJIIIZ += C19909812vA.LJIIIZ((Map.Entry) it2.next());
                                }
                                return iLJJ + iLJIIIZ;
                            }
                            return iLJJ;
                        }

                        @Override // X.InterfaceC19908112ut
                        public final int LIZJ(Object obj) {
                            int iHashCode = ((AbstractC19907912ur) obj).zzc.hashCode();
                            if (this.LIZJ) {
                                return (iHashCode * 53) + ((AbstractC19901412to) obj).zzb.LIZ.hashCode();
                            }
                            return iHashCode;
                        }

                        @Override // X.InterfaceC19908112ut
                        public final void LJFF(Object obj) {
                            getClass();
                            C19910312vF c19910312vF = ((AbstractC19907912ur) obj).zzc;
                            if (c19910312vF.LJ) {
                                c19910312vF.LJ = false;
                            }
                            getClass();
                            ((AbstractC19901412to) obj).zzb.LJ();
                        }

                        @Override // X.InterfaceC19908112ut
                        public final boolean LJIIIIZZ(Object obj) {
                            return ((AbstractC19901412to) obj).zzb.LJII();
                        }

                        @Override // X.InterfaceC19908112ut
                        public final boolean LIZIZ(Object obj, Object obj2) {
                            if (!((AbstractC19907912ur) obj).zzc.equals(((AbstractC19907912ur) obj2).zzc)) {
                                return false;
                            }
                            if (this.LIZJ) {
                                return ((AbstractC19901412to) obj).zzb.equals(((AbstractC19901412to) obj2).zzb);
                            }
                            return true;
                        }

                        @Override // X.InterfaceC19908112ut
                        public final void LIZLLL(Object obj, Object obj2) {
                            C19909712v9.LJIILLIIL(obj, obj2);
                            if (this.LIZJ && !((AbstractC19901412to) obj2).zzb.LIZ.isEmpty()) {
                                throw null;
                            }
                        }

                        @Override // X.InterfaceC19908112ut
                        public final void LJI(Object obj, InterfaceC19908312uv interfaceC19908312uv) {
                            Iterator itLIZLLL = ((AbstractC19901412to) obj).zzb.LIZLLL();
                            while (itLIZLLL.hasNext()) {
                                Map.Entry entry = (Map.Entry) itLIZLLL.next();
                                InterfaceC19911512vR interfaceC19911512vR = (InterfaceC19911512vR) entry.getKey();
                                if (interfaceC19911512vR.LIZIZ() == EnumC19938112zj.MESSAGE && !interfaceC19911512vR.LJ() && !interfaceC19911512vR.LIZLLL()) {
                                    if (entry instanceof C19911212vO) {
                                        ((C19909512v7) interfaceC19908312uv).LIZIZ(interfaceC19911512vR.zza(), ((C19911112vN) ((C19911212vO) entry).LL.getValue()).LIZIZ());
                                    } else {
                                        ((C19909512v7) interfaceC19908312uv).LIZIZ(interfaceC19911512vR.zza(), entry.getValue());
                                    }
                                } else {
                                    throw new IllegalStateException("Found invalid MessageSet item.");
                                }
                            }
                            C19910312vF c19910312vF = ((AbstractC19907912ur) obj).zzc;
                            for (int i = 0; i < c19910312vF.LIZ; i++) {
                                ((C19909512v7) interfaceC19908312uv).LIZIZ(c19910312vF.LIZIZ[i] >>> 3, c19910312vF.LIZJ[i]);
                            }
                        }

                        @Override // X.InterfaceC19908112ut
                        public final void LJII(Object obj, byte[] bArr, int i, int i2, C19911712vT c19911712vT) {
                            AbstractC19907912ur abstractC19907912ur = (AbstractC19907912ur) obj;
                            if (abstractC19907912ur.zzc == C19910312vF.LJFF) {
                                abstractC19907912ur.zzc = C19910312vF.LIZIZ();
                            }
                            throw null;
                        }
                    };
                }
                InterfaceC19908112ut interfaceC19908112ut = (InterfaceC19908112ut) concurrentHashMap.putIfAbsent(cls, interfaceC19908112utLJJ);
                if (interfaceC19908112ut != null) {
                    return interfaceC19908112ut;
                }
            }
            return interfaceC19908112utLJJ;
        }
        throw new NullPointerException("messageType");
    }
}
